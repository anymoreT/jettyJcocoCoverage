/*!
 * jquery.qtip. The jQuery tooltip plugin
 *
 * Copyright (c) 2009 Craig Thompson
 * http://craigsworks.com
 *
 * Licensed under MIT
 * http://www.opensource.org/licenses/mit-license.php
 *
 * Launch  : February 2009
 * Version : 1.0.0-rc3
 * Released: Tuesday 12th May, 2009 - 00:00
 * Debug: jquery.qtip.debug.js
 *
 * fgaliegue@gmail.com:
 * - remove $.browser related code to make it compatible with jQuery 1.9.0
 * - remove ie{6,}Adjust variables entirely
 * - strip comments
 * - some minor code changes
 */
(function ($)
{
    $.fn.qtip = function (options, blanket)
    {
        var i, id, interfaces, opts, obj, command, config, api;

        if (typeof options == 'string') {
            if (typeof $(this).data('qtip') !== 'object')
                $.fn.qtip.log.error.call(self, 1,
                    $.fn.qtip.constants.NO_TOOLTIP_PRESENT, false);

            if (options == 'api')
                return $(this).data('qtip').interfaces[ $(this).data('qtip').current ];
            else if (options == 'interfaces')
                return $(this).data('qtip').interfaces;
        }

        else {
            if (!options) options = {};

            if (typeof options.content !== 'object' || (options.content.jquery
                && options.content.length > 0)) options.content
                = { text: options.content };
            if (typeof options.content.title !== 'object') options.content.title
                = { text: options.content.title };
            if (typeof options.position !== 'object') options.position
                = { corner: options.position };
            if (typeof options.position.corner
                !== 'object') options.position.corner
                = { target: options.position.corner, tooltip: options.position.corner };
            if (typeof options.show !== 'object') options.show
                = { when: options.show };
            if (typeof options.show.when !== 'object') options.show.when
                = { event: options.show.when };
            if (typeof options.show.effect !== 'object') options.show.effect
                = { type: options.show.effect };
            if (typeof options.hide !== 'object') options.hide
                = { when: options.hide };
            if (typeof options.hide.when !== 'object') options.hide.when
                = { event: options.hide.when };
            if (typeof options.hide.effect !== 'object') options.hide.effect
                = { type: options.hide.effect };
            if (typeof options.style !== 'object') options.style
                = { name: options.style };
            options.style = sanitizeStyle(options.style);

            opts = $.extend(true, {}, $.fn.qtip.defaults, options);

            opts.style = buildStyle.call({ options: opts }, opts.style);
            opts.user = $.extend(true, {}, options);
        }
        return $(this).each(function ()
        {
            if (typeof options == 'string') {
                command = options.toLowerCase();
                interfaces = $(this).qtip('interfaces');

                if (typeof interfaces == 'object') {
                    if (blanket === true && command == 'destroy')
                        while (interfaces.length
                            > 0) interfaces[interfaces.length - 1].destroy();

                    else {
                        if (blanket !== true) interfaces = [ $(this).qtip('api')
                        ];

                        for (i = 0; i < interfaces.length; i++) {
                            if (command == 'destroy') interfaces[i].destroy();

                            else if (interfaces[i].status.rendered === true) {
                                if (command == 'show') interfaces[i].show();
                                else if (command
                                    == 'hide') interfaces[i].hide();
                                else if (command
                                    == 'focus') interfaces[i].focus();
                                else if (command
                                    == 'disable') interfaces[i].disable(true);
                                else if (command
                                    == 'enable') interfaces[i].disable(false);
                            }
                        }
                    }
                }
            }

            else {
                config = $.extend(true, {}, opts);
                config.hide.effect.length = opts.hide.effect.length;
                config.show.effect.length = opts.show.effect.length;

                if (config.position.container
                    === false) config.position.container = $(document.body);
                if (config.position.target === false) config.position.target
                    = $(this);
                if (config.show.when.target === false) config.show.when.target
                    = $(this);
                if (config.hide.when.target === false) config.hide.when.target
                    = $(this);

                id = $.fn.qtip.interfaces.length;
                for (i = 0; i < id; i++) {
                    if (typeof $.fn.qtip.interfaces[i] == 'undefined') {
                        id = i;
                        break;
                    }
                }
                obj = new qTip($(this), config, id);

                $.fn.qtip.interfaces[id] = obj;

                if (typeof $(this).data('qtip') == 'object') {
                    if (typeof $(this).attr('qtip') === 'undefined')
                        $(this).data('qtip').current
                            = $(this).data('qtip').interfaces.length;

                    $(this).data('qtip').interfaces.push(obj);
                }

                else $(this).data('qtip', { current: 0, interfaces: [obj] });

                if (config.content.prerender === false && config.show.when.event
                    !== false && config.show.ready !== true) {
                    config.show.when.target.bind(config.show.when.event
                        + '.qtip-' + id + '-create', { qtip: id },
                        function (event)
                        {
                            api = $.fn.qtip.interfaces[ event.data.qtip ];

                            api.options.show.when.target.unbind(api.options.show.when.event
                                + '.qtip-' + event.data.qtip + '-create');
                            api.cache.mouse
                                = { x: event.pageX, y: event.pageY };

                            construct.call(api);
                            api.options.show.when.target.trigger(api.options.show.when.event);
                        });
                }

                else {
                    obj.cache.mouse = {
                        x: config.show.when.target.offset().left,
                        y: config.show.when.target.offset().top
                    };

                    construct.call(obj);
                }
            }
        });
    };

    function qTip(target, options, id)
    {
        var self = this;

        self.id = id;
        self.options = options;
        self.status = {
            animated: false,
            rendered: false,
            disabled: false,
            focused: false
        };
        self.elements = {
            target: target.addClass(self.options.style.classes.target),
            tooltip: null,
            wrapper: null,
            content: null,
            contentWrapper: null,
            title: null,
            button: null,
            tip: null,
            bgiframe: null
        };
        self.cache = {
            mouse: {},
            position: {},
            toggle: 0
        };
        self.timers = {};

        $.extend(self, self.options.api,
            {
                show: function (event)
                {
                    var returned, solo;

                    if (!self.status.rendered)
                        return $.fn.qtip.log.error.call(self, 2,
                            $.fn.qtip.constants.TOOLTIP_NOT_RENDERED, 'show');

                    if (self.elements.tooltip.css('display')
                        !== 'none') return self;

                    self.elements.tooltip.stop(true, false);

                    returned = self.beforeShow.call(self, event);
                    if (returned === false) return self;

                    function afterShow()
                    {
                        if (self.options.position.type
                            !== 'static') self.focus();
                        self.onShow.call(self, event);
                    }
                    self.cache.toggle = 1;

                    if (self.options.position.type !== 'static')
                        self.updatePosition(event,
                            (self.options.show.effect.length > 0));

                    if (typeof self.options.show.solo == 'object') solo
                        = $(self.options.show.solo);
                    else if (self.options.show.solo === true) solo
                        = $('div.qtip').not(self.elements.tooltip);
                    if (solo) solo.each(function ()
                    {
                        if ($(this).qtip('api').status.rendered
                            === true) $(this).qtip('api').hide();
                    });

                    if (typeof self.options.show.effect.type == 'function') {
                        self.options.show.effect.type.call(self.elements.tooltip,
                            self.options.show.effect.length);
                        self.elements.tooltip.queue(function ()
                        {
                            afterShow();
                            $(this).dequeue();
                        });
                    }
                    else {
                        switch (self.options.show.effect.type.toLowerCase()) {
                            case 'fade':
                                self.elements.tooltip.fadeIn(self.options.show.effect.length,
                                    afterShow);
                                break;
                            case 'slide':
                                self.elements.tooltip.slideDown(self.options.show.effect.length,
                                    function ()
                                    {
                                        afterShow();
                                        if (self.options.position.type
                                            !== 'static') self.updatePosition(event,
                                            true);
                                    });
                                break;
                            case 'grow':
                                self.elements.tooltip.show(self.options.show.effect.length,
                                    afterShow);
                                break;
                            default:
                                self.elements.tooltip.show(null, afterShow);
                                break;
                        }
                        self.elements.tooltip.addClass(self.options.style.classes.active);
                    }
                    return $.fn.qtip.log.error.call(self, 1,
                        $.fn.qtip.constants.EVENT_SHOWN, 'show');
                },

                hide: function (event)
                {
                    var returned;

                    if (!self.status.rendered)
                        return $.fn.qtip.log.error.call(self, 2,
                            $.fn.qtip.constants.TOOLTIP_NOT_RENDERED, 'hide');

                    else if (self.elements.tooltip.css('display')
                        === 'none') return self;

                    clearTimeout(self.timers.show);
                    self.elements.tooltip.stop(true, false);

                    returned = self.beforeHide.call(self, event);
                    if (returned === false) return self;

                    function afterHide()
                    {
                        self.onHide.call(self, event);
                    }
                    self.cache.toggle = 0;

                    if (typeof self.options.hide.effect.type == 'function') {
                        self.options.hide.effect.type.call(self.elements.tooltip,
                            self.options.hide.effect.length);
                        self.elements.tooltip.queue(function ()
                        {
                            afterHide();
                            $(this).dequeue();
                        });
                    }
                    else {
                        switch (self.options.hide.effect.type.toLowerCase()) {
                            case 'fade':
                                self.elements.tooltip.fadeOut(self.options.hide.effect.length,
                                    afterHide);
                                break;
                            case 'slide':
                                self.elements.tooltip.slideUp(self.options.hide.effect.length,
                                    afterHide);
                                break;
                            case 'grow':
                                self.elements.tooltip.hide(self.options.hide.effect.length,
                                    afterHide);
                                break;
                            default:
                                self.elements.tooltip.hide(null, afterHide);
                                break;
                        }
                        self.elements.tooltip.removeClass(self.options.style.classes.active);
                    }
                    return $.fn.qtip.log.error.call(self, 1,
                        $.fn.qtip.constants.EVENT_HIDDEN, 'hide');
                },

                updatePosition: function (event, animate)
                {
                    var i, target, tooltip, coords, mapName, imagePos, newPosition, borderAdjust, mouseAdjust, offset, curPosition, returned;

                    if (!self.status.rendered)
                        return $.fn.qtip.log.error.call(self, 2,
                            $.fn.qtip.constants.TOOLTIP_NOT_RENDERED,
                            'updatePosition');

                    else if (self.options.position.type == 'static')
                        return $.fn.qtip.log.error.call(self, 1,
                            $.fn.qtip.constants.CANNOT_POSITION_STATIC,
                            'updatePosition');

                    target = {
                        position: { left: 0, top: 0 },
                        dimensions: { height: 0, width: 0 },
                        corner: self.options.position.corner.target
                    };
                    tooltip = {
                        position: self.getPosition(),
                        dimensions: self.getDimensions(),
                        corner: self.options.position.corner.tooltip
                    };

                    if (self.options.position.target !== 'mouse') {
                        if (self.options.position.target.get(0).nodeName.toLowerCase()
                            == 'area') {
                            coords
                                = self.options.position.target.attr('coords').split(',');
                            for (i = 0; i < coords.length; i++) coords[i]
                                = parseInt(coords[i]);

                            mapName
                                = self.options.position.target.parent('map').attr('name');
                            imagePos = $('img[usemap="#' + mapName
                                + '"]:first').offset();
                            target.position = {
                                left: Math.floor(imagePos.left + coords[0]),
                                top: Math.floor(imagePos.top + coords[1])
                            };

                            switch (self.options.position.target.attr('shape').toLowerCase()) {
                                case 'rect':
                                    target.dimensions = {
                                        width: Math.ceil(Math.abs(coords[2]
                                            - coords[0])),
                                        height: Math.ceil(Math.abs(coords[3]
                                            - coords[1]))
                                    };
                                    break;

                                case 'circle':
                                    target.dimensions = {
                                        width: coords[2] + 1,
                                        height: coords[2] + 1
                                    };
                                    break;

                                case 'poly':
                                    target.dimensions = {
                                        width: coords[0],
                                        height: coords[1]
                                    };

                                    for (i = 0; i < coords.length; i++) {
                                        if (i % 2 == 0) {
                                            if (coords[i]
                                                > target.dimensions.width)
                                                target.dimensions.width
                                                    = coords[i];
                                            if (coords[i] < coords[0])
                                                target.position.left
                                                    = Math.floor(imagePos.left
                                                    + coords[i]);
                                        }
                                        else {
                                            if (coords[i]
                                                > target.dimensions.height)
                                                target.dimensions.height
                                                    = coords[i];
                                            if (coords[i] < coords[1])
                                                target.position.top
                                                    = Math.floor(imagePos.top
                                                    + coords[i]);
                                        }
                                    }
                                    target.dimensions.width
                                        = target.dimensions.width
                                        - (target.position.left
                                        - imagePos.left);
                                    target.dimensions.height
                                        = target.dimensions.height
                                        - (target.position.top - imagePos.top);
                                    break;

                                default:
                                    return $.fn.qtip.log.error.call(self, 4,
                                        $.fn.qtip.constants.INVALID_AREA_SHAPE,
                                        'updatePosition');
                                    break;
                            }
                            target.dimensions.width -= 2;
                            target.dimensions.height -= 2;
                        }

                        else if (self.options.position.target.add(document.body).length
                            === 1) {
                            target.position
                                = { left: $(document).scrollLeft(), top: $(document).scrollTop() };
                            target.dimensions
                                = { height: $(window).height(), width: $(window).width() };
                        }

                        else {
                            if (typeof self.options.position.target.attr('qtip')
                                !== 'undefined')
                                target.position
                                    = self.options.position.target.qtip('api').cache.position;
                            else
                                target.position
                                    = self.options.position.target.offset();

                            target.dimensions = {
                                height: self.options.position.target.outerHeight(),
                                width: self.options.position.target.outerWidth()
                            };
                        }
                        newPosition = $.extend({}, target.position);
                        if (target.corner.search(/right/i) !== -1)
                            newPosition.left += target.dimensions.width;

                        if (target.corner.search(/bottom/i) !== -1)
                            newPosition.top += target.dimensions.height;

                        if (target.corner.search(/((top|bottom)Middle)|center/)
                            !== -1)
                            newPosition.left += (target.dimensions.width / 2);

                        if (target.corner.search(/((left|right)Middle)|center/)
                            !== -1)
                            newPosition.top += (target.dimensions.height / 2);
                    }

                    else {
                        target.position = newPosition
                            = { left: self.cache.mouse.x, top: self.cache.mouse.y };
                        target.dimensions = { height: 1, width: 1 };
                    }
                    if (tooltip.corner.search(/right/i) !== -1)
                        newPosition.left -= tooltip.dimensions.width;

                    if (tooltip.corner.search(/bottom/i) !== -1)
                        newPosition.top -= tooltip.dimensions.height;

                    if (tooltip.corner.search(/((top|bottom)Middle)|center/)
                        !== -1)
                        newPosition.left -= (tooltip.dimensions.width / 2);

                    if (tooltip.corner.search(/((left|right)Middle)|center/)
                        !== -1)
                        newPosition.top -= (tooltip.dimensions.height / 2);

                    if (self.options.style.border.radius > 0) {
                        if (tooltip.corner.search(/Left/) !== -1)
                            newPosition.left
                                -= self.options.style.border.radius;
                        else if (tooltip.corner.search(/Right/) !== -1)
                            newPosition.left
                                += self.options.style.border.radius;

                        if (tooltip.corner.search(/Top/) !== -1)
                            newPosition.top -= self.options.style.border.radius;
                        else if (tooltip.corner.search(/Bottom/) !== -1)
                            newPosition.top += self.options.style.border.radius;
                    }
                    if (self.options.position.adjust.screen === true)
                        newPosition = screenAdjust.call(self, newPosition,
                            target, tooltip);

                    if (self.options.position.target === 'mouse'
                        && self.options.position.adjust.mouse === true) {
                        if (self.options.position.adjust.screen === true
                            && self.elements.tip)
                            mouseAdjust = self.elements.tip.attr('rel');
                        else
                            mouseAdjust = self.options.position.corner.tooltip;

                        newPosition.left += (mouseAdjust.search(/right/i)
                            !== -1) ? -6 : 6;
                        newPosition.top += (mouseAdjust.search(/bottom/i)
                            !== -1) ? -6 : 6;
                    }


                    newPosition.left += self.options.position.adjust.x;
                    newPosition.top += self.options.position.adjust.y;

                    curPosition = self.getPosition();
                    if (newPosition.left != curPosition.left || newPosition.top
                        != curPosition.top) {
                        returned = self.beforePositionUpdate.call(self, event);
                        if (returned === false) return self;

                        self.cache.position = newPosition;

                        if (animate === true) {
                            self.status.animated = true;

                            self.elements.tooltip.animate(newPosition, 200,
                                'swing', function ()
                                {
                                    self.status.animated = false
                                });
                        }

                        else self.elements.tooltip.css(newPosition);

                        self.onPositionUpdate.call(self, event);
                        if (typeof event !== 'undefined' && event.type
                            && event.type !== 'mousemove')
                            $.fn.qtip.log.error.call(self, 1,
                                $.fn.qtip.constants.EVENT_POSITION_UPDATED,
                                'updatePosition');
                    }
                    return self;
                },

                updateWidth: function (newWidth)
                {
                    var hidden;

                    if (!self.status.rendered)
                        return $.fn.qtip.log.error.call(self, 2,
                            $.fn.qtip.constants.TOOLTIP_NOT_RENDERED,
                            'updateWidth');

                    else if (newWidth && typeof newWidth !== 'number')
                        return $.fn.qtip.log.error.call(self, 2,
                            'newWidth must be of type number', 'updateWidth');

                    hidden
                        = self.elements.contentWrapper.siblings().add(self.elements.tip).add(self.elements.button);

                    if (!newWidth) {
                        if (typeof self.options.style.width.value == 'number')
                            newWidth = self.options.style.width.value;

                        else {
                            self.elements.tooltip.css({ width: 'auto' });
                            hidden.hide();

                            newWidth = self.getDimensions().width + 1;

                            if (!self.options.style.width.value) {
                                if (newWidth
                                    > self.options.style.width.max) newWidth
                                    = self.options.style.width.max;
                                if (newWidth
                                    < self.options.style.width.min) newWidth
                                    = self.options.style.width.min
                            }
                        }
                    }
                    if (newWidth % 2 !== 0) newWidth -= 1;

                    self.elements.tooltip.width(newWidth);
                    hidden.show();

                    if (self.options.style.border.radius) {
                        self.elements.tooltip.find('.qtip-betweenCorners').each(function (i)
                        {
                            $(this).width(newWidth
                                - (self.options.style.border.radius * 2));
                        })
                    }
                    return $.fn.qtip.log.error.call(self, 1,
                        $.fn.qtip.constants.EVENT_WIDTH_UPDATED, 'updateWidth');
                },

                updateStyle: function (name)
                {
                    var tip, borders, context, corner, coordinates;

                    if (!self.status.rendered)
                        return $.fn.qtip.log.error.call(self, 2,
                            $.fn.qtip.constants.TOOLTIP_NOT_RENDERED,
                            'updateStyle');

                    else if (typeof name !== 'string'
                        || !$.fn.qtip.styles[name])
                        return $.fn.qtip.log.error.call(self, 2,
                            $.fn.qtip.constants.STYLE_NOT_DEFINED,
                            'updateStyle');

                    self.options.style = buildStyle.call(self,
                        $.fn.qtip.styles[name], self.options.user.style);

                    self.elements.content.css(jQueryStyle(self.options.style));
                    if (self.options.content.title.text !== false)
                        self.elements.title.css(jQueryStyle(self.options.style.title,
                            true));

                    self.elements.contentWrapper.css({ borderColor: self.options.style.border.color });

                    if (self.options.style.tip.corner !== false) {
                        if ($('<canvas>').get(0).getContext) {
                            tip
                                = self.elements.tooltip.find('.qtip-tip canvas:first');
                            context = tip.get(0).getContext('2d');
                            context.clearRect(0, 0, 300, 300);

                            corner = tip.parent('div[rel]:first').attr('rel');
                            coordinates = calculateTip(corner,
                                self.options.style.tip.size.width,
                                self.options.style.tip.size.height);
                            drawTip.call(self, tip, coordinates,
                                self.options.style.tip.color
                                    || self.options.style.border.color);
                        }
                    }
                    if (self.options.style.border.radius > 0) {
                        self.elements.tooltip.find('.qtip-betweenCorners').css({ backgroundColor: self.options.style.border.color });

                        if ($('<canvas>').get(0).getContext) {
                            borders
                                = calculateBorders(self.options.style.border.radius);
                            self.elements.tooltip.find('.qtip-wrapper canvas').each(function ()
                            {
                                context = $(this).get(0).getContext('2d');
                                context.clearRect(0, 0, 300, 300);

                                corner
                                    = $(this).parent('div[rel]:first').attr('rel');
                                drawBorder.call(self, $(this), borders[corner],
                                    self.options.style.border.radius,
                                    self.options.style.border.color);
                            });
                        }
                    }
                    return $.fn.qtip.log.error.call(self, 1,
                        $.fn.qtip.constants.EVENT_STYLE_UPDATED, 'updateStyle');
                },

                updateContent: function (content, reposition)
                {
                    var parsedContent, images, loadedImages;

                    if (!self.status.rendered)
                        return $.fn.qtip.log.error.call(self, 2,
                            $.fn.qtip.constants.TOOLTIP_NOT_RENDERED,
                            'updateContent');

                    else if (!content)
                        return $.fn.qtip.log.error.call(self, 2,
                            $.fn.qtip.constants.NO_CONTENT_PROVIDED,
                            'updateContent');

                    parsedContent = self.beforeContentUpdate.call(self,
                        content);
                    if (typeof parsedContent == 'string') content
                        = parsedContent;
                    else if (parsedContent === false) return;

                    if (content.jquery && content.length > 0)
                        content.clone(true).appendTo(self.elements.content).show();

                    else self.elements.content.html(content);

                    images = self.elements.content.find('img[complete=false]');
                    if (images.length > 0) {
                        loadedImages = 0;
                        images.each(function (i)
                        {
                            $('<img src="' + $(this).attr('src') + '" />')
                                .load(function ()
                                {
                                    if (++loadedImages
                                        == images.length) afterLoad();
                                });
                        });
                    }
                    else afterLoad();

                    function afterLoad()
                    {
                        self.updateWidth();

                        if (reposition !== false) {
                            if (self.options.position.type !== 'static')
                                self.updatePosition(self.elements.tooltip.is(':visible'),
                                    true);

                            if (self.options.style.tip.corner !== false)
                                positionTip.call(self);
                        }
                    }
                    self.onContentUpdate.call(self);
                    return $.fn.qtip.log.error.call(self, 1,
                        $.fn.qtip.constants.EVENT_CONTENT_UPDATED,
                        'loadContent');
                },

                loadContent: function (url, data, method)
                {
                    var returned;

                    if (!self.status.rendered)
                        return $.fn.qtip.log.error.call(self, 2,
                            $.fn.qtip.constants.TOOLTIP_NOT_RENDERED,
                            'loadContent');

                    returned = self.beforeContentLoad.call(self);
                    if (returned === false) return self;

                    if (method == 'post')
                        $.post(url, data, setupContent);
                    else
                        $.get(url, data, setupContent);

                    function setupContent(content)
                    {
                        self.onContentLoad.call(self);
                        $.fn.qtip.log.error.call(self, 1,
                            $.fn.qtip.constants.EVENT_CONTENT_LOADED,
                            'loadContent');

                        self.updateContent(content);
                    }
                    return self;
                },

                updateTitle: function (content)
                {
                    if (!self.status.rendered)
                        return $.fn.qtip.log.error.call(self, 2,
                            $.fn.qtip.constants.TOOLTIP_NOT_RENDERED,
                            'updateTitle');

                    else if (!content)
                        return $.fn.qtip.log.error.call(self, 2,
                            $.fn.qtip.constants.NO_CONTENT_PROVIDED,
                            'updateTitle');

                    returned = self.beforeTitleUpdate.call(self);
                    if (returned === false) return self;

                    if (self.elements.button) self.elements.button
                        = self.elements.button.clone(true);
                    self.elements.title.html(content);
                    if (self.elements.button) self.elements.title.prepend(self.elements.button);

                    self.onTitleUpdate.call(self);
                    return $.fn.qtip.log.error.call(self, 1,
                        $.fn.qtip.constants.EVENT_TITLE_UPDATED, 'updateTitle');
                },

                focus: function (event)
                {
                    var curIndex, newIndex, elemIndex, returned;

                    if (!self.status.rendered)
                        return $.fn.qtip.log.error.call(self, 2,
                            $.fn.qtip.constants.TOOLTIP_NOT_RENDERED, 'focus');

                    else if (self.options.position.type == 'static')
                        return $.fn.qtip.log.error.call(self, 1,
                            $.fn.qtip.constants.CANNOT_FOCUS_STATIC, 'focus');

                    curIndex = parseInt(self.elements.tooltip.css('z-index'));
                    newIndex = 6000 + $('div.qtip[qtip]').length - 1;

                    if (!self.status.focused && curIndex !== newIndex) {
                        returned = self.beforeFocus.call(self, event);
                        if (returned === false) return self;

                        $('div.qtip[qtip]').not(self.elements.tooltip).each(function ()
                        {
                            if ($(this).qtip('api').status.rendered === true) {
                                elemIndex = parseInt($(this).css('z-index'));

                                if (typeof elemIndex == 'number' && elemIndex
                                    > -1)
                                    $(this).css({ zIndex: parseInt($(this).css('z-index'))
                                        - 1 });

                                $(this).qtip('api').status.focused = false;
                            }
                        });

                        self.elements.tooltip.css({ zIndex: newIndex });
                        self.status.focused = true;

                        self.onFocus.call(self, event);
                        $.fn.qtip.log.error.call(self, 1,
                            $.fn.qtip.constants.EVENT_FOCUSED, 'focus');
                    }
                    return self;
                },

                disable: function (state)
                {
                    if (!self.status.rendered)
                        return $.fn.qtip.log.error.call(self, 2,
                            $.fn.qtip.constants.TOOLTIP_NOT_RENDERED,
                            'disable');

                    if (state) {
                        if (!self.status.disabled) {
                            self.status.disabled = true;
                            $.fn.qtip.log.error.call(self, 1,
                                $.fn.qtip.constants.EVENT_DISABLED, 'disable');
                        }

                        else  $.fn.qtip.log.error.call(self, 1,
                            $.fn.qtip.constants.TOOLTIP_ALREADY_DISABLED,
                            'disable');
                    }
                    else {
                        if (self.status.disabled) {
                            self.status.disabled = false;
                            $.fn.qtip.log.error.call(self, 1,
                                $.fn.qtip.constants.EVENT_ENABLED, 'disable');
                        }

                        else $.fn.qtip.log.error.call(self, 1,
                            $.fn.qtip.constants.TOOLTIP_ALREADY_ENABLED,
                            'disable');
                    }
                    return self;
                },

                destroy: function ()
                {
                    var i, returned, interfaces;

                    returned = self.beforeDestroy.call(self);
                    if (returned === false) return self;

                    if (self.status.rendered) {
                        self.options.show.when.target.unbind('mousemove.qtip',
                            self.updatePosition);
                        self.options.show.when.target.unbind('mouseout.qtip',
                            self.hide);
                        self.options.show.when.target.unbind(self.options.show.when.event
                            + '.qtip');
                        self.options.hide.when.target.unbind(self.options.hide.when.event
                            + '.qtip');
                        self.elements.tooltip.unbind(self.options.hide.when.event
                            + '.qtip');
                        self.elements.tooltip.unbind('mouseover.qtip',
                            self.focus);
                        self.elements.tooltip.remove();
                    }

                    else self.options.show.when.target.unbind(self.options.show.when.event
                        + '.qtip-create');

                    if (typeof self.elements.target.data('qtip') == 'object') {
                        interfaces
                            = self.elements.target.data('qtip').interfaces;
                        if (typeof interfaces == 'object' && interfaces.length
                            > 0) {
                            for (i = 0; i < interfaces.length - 1; i++)
                                if (interfaces[i].id
                                    == self.id) interfaces.splice(i, 1)
                        }
                    }
                    delete $.fn.qtip.interfaces[self.id];

                    if (typeof interfaces == 'object' && interfaces.length > 0)
                        self.elements.target.data('qtip').current
                            = interfaces.length - 1;
                    else
                        self.elements.target.removeData('qtip');

                    self.onDestroy.call(self);
                    $.fn.qtip.log.error.call(self, 1,
                        $.fn.qtip.constants.EVENT_DESTROYED, 'destroy');

                    return self.elements.target
                },

                getPosition: function ()
                {
                    var show, offset;

                    if (!self.status.rendered)
                        return $.fn.qtip.log.error.call(self, 2,
                            $.fn.qtip.constants.TOOLTIP_NOT_RENDERED,
                            'getPosition');

                    show = (self.elements.tooltip.css('display') !== 'none')
                        ? false : true;

                    if (show) self.elements.tooltip.css({ visiblity: 'hidden' }).show();
                    offset = self.elements.tooltip.offset();
                    if (show) self.elements.tooltip.css({ visiblity: 'visible' }).hide();

                    return offset;
                },

                getDimensions: function ()
                {
                    var show, dimensions;

                    if (!self.status.rendered)
                        return $.fn.qtip.log.error.call(self, 2,
                            $.fn.qtip.constants.TOOLTIP_NOT_RENDERED,
                            'getDimensions');

                    show = (!self.elements.tooltip.is(':visible')) ? true
                        : false;

                    if (show) self.elements.tooltip.css({ visiblity: 'hidden' }).show();
                    dimensions = {
                        height: self.elements.tooltip.outerHeight(),
                        width: self.elements.tooltip.outerWidth()
                    };
                    if (show) self.elements.tooltip.css({ visiblity: 'visible' }).hide();

                    return dimensions;
                }
            });
    }
    function construct()
    {
        var self, adjust, content, url, data, method, tempLength;
        self = this;

        self.beforeRender.call(self);

        self.status.rendered = true;

        self.elements.tooltip = '<div qtip="' + self.id + '" ' +
            'class="qtip ' + (self.options.style.classes.tooltip
            || self.options.style) + '"' +
            'style="display:none; -moz-border-radius:0; -webkit-border-radius:0; border-radius:0;'
            +
            'position:' + self.options.position.type + ';">' +
            '  <div class="qtip-wrapper" style="position:relative; overflow:hidden; text-align:left;">'
            +
            '    <div class="qtip-contentWrapper" style="overflow:hidden;">' +
            '       <div class="qtip-content '
            + self.options.style.classes.content + '"></div>' +
            '</div></div></div>';

        self.elements.tooltip = $(self.elements.tooltip);
        self.elements.tooltip.appendTo(self.options.position.container);

        self.elements.tooltip.data('qtip', { current: 0, interfaces: [self] });

        self.elements.wrapper = self.elements.tooltip.children('div:first');
        self.elements.contentWrapper
            = self.elements.wrapper.children('div:first').css({ background: self.options.style.background });
        self.elements.content
            = self.elements.contentWrapper.children('div:first').css(jQueryStyle(self.options.style));

        if (self.options.hide.when.event
            == 'unfocus') self.elements.tooltip.attr('unfocus', true);

        if (typeof self.options.style.width.value
            == 'number') self.updateWidth();

        if ($('<canvas>').get(0).getContext) {
            if (self.options.style.border.radius > 0)
                createBorder.call(self);
            else
                self.elements.contentWrapper.css({ border: self.options.style.border.width
                    + 'px solid ' + self.options.style.border.color  });

            if (self.options.style.tip.corner !== false)
                createTip.call(self);
        }

        else {
            self.elements.contentWrapper.css({ border: self.options.style.border.width
                + 'px solid ' + self.options.style.border.color  });

            self.options.style.border.radius = 0;
            self.options.style.tip.corner = false;

            $.fn.qtip.log.error.call(self, 2,
                $.fn.qtip.constants.CANVAS_VML_NOT_SUPPORTED, 'render');
        }
        if ((typeof self.options.content.text == 'string'
            && self.options.content.text.length > 0)
            || (self.options.content.text.jquery
            && self.options.content.text.length > 0))
            content = self.options.content.text;

        else if (typeof self.elements.target.attr('title') == 'string'
            && self.elements.target.attr('title').length > 0) {
            content = self.elements.target.attr('title').replace("\\n",
                '<br />');
            self.elements.target.attr('title', '');
        }

        else if (typeof self.elements.target.attr('alt') == 'string'
            && self.elements.target.attr('alt').length > 0) {
            content = self.elements.target.attr('alt').replace("\\n", '<br />');
            self.elements.target.attr('alt', '');
        }

        else {
            content = ' ';
            $.fn.qtip.log.error.call(self, 1,
                $.fn.qtip.constants.NO_VALID_CONTENT, 'render');
        }
        if (self.options.content.title.text !== false) createTitle.call(self);
        self.updateContent(content);

        assignEvents.call(self);
        if (self.options.show.ready === true) self.show();

        if (self.options.content.url !== false) {
            url = self.options.content.url;
            data = self.options.content.data;
            method = self.options.content.method || 'get';
            self.loadContent(url, data, method);
        }
        self.onRender.call(self);
        $.fn.qtip.log.error.call(self, 1, $.fn.qtip.constants.EVENT_RENDERED,
            'render');
    }
    function createBorder()
    {
        var self, i, width, radius, color, coordinates, containers, size, betweenWidth, betweenCorners, borderTop, borderBottom, borderCoord, sideWidth, vertWidth;
        self = this;

        self.elements.wrapper.find('.qtip-borderBottom, .qtip-borderTop').remove();

        width = self.options.style.border.width;
        radius = self.options.style.border.radius;
        color = self.options.style.border.color || self.options.style.tip.color;

        coordinates = calculateBorders(radius);

        containers = {};
        for (i in coordinates) {
            containers[i] = '<div rel="' + i + '" style="' + ((i.search(/Left/)
                !== -1) ? 'left' : 'right') + ':0; ' +
                'position:absolute; height:' + radius + 'px; width:' + radius
                + 'px; overflow:hidden; line-height:0.1px; font-size:1px">';

            if ($('<canvas>').get(0).getContext)
                containers[i] += '<canvas height="' + radius + '" width="'
                    + radius + '" style="vertical-align: top"></canvas>';


            containers[i] += '</div>';
        }
        betweenWidth = self.getDimensions().width - (Math.max(width, radius)
            * 2);
        betweenCorners = '<div class="qtip-betweenCorners" style="height:'
            + radius + 'px; width:' + betweenWidth + 'px; ' +
            'overflow:hidden; background-color:' + color
            + '; line-height:0.1px; font-size:1px;">';

        borderTop = '<div class="qtip-borderTop" dir="ltr" style="height:'
            + radius + 'px; ' +
            'margin-left:' + radius
            + 'px; line-height:0.1px; font-size:1px; padding:0;">' +
            containers['topLeft'] + containers['topRight'] + betweenCorners;
        self.elements.wrapper.prepend(borderTop);

        borderBottom = '<div class="qtip-borderBottom" dir="ltr" style="height:'
            + radius + 'px; ' +
            'margin-left:' + radius
            + 'px; line-height:0.1px; font-size:1px; padding:0;">' +
            containers['bottomLeft'] + containers['bottomRight']
            + betweenCorners;
        self.elements.wrapper.append(borderBottom);

        if ($('<canvas>').get(0).getContext) {
            self.elements.wrapper.find('canvas').each(function ()
            {
                borderCoord
                    = coordinates[ $(this).parent('[rel]:first').attr('rel') ];
                drawBorder.call(self, $(this), borderCoord, radius, color);
            })
        }

        sideWidth = Math.max(radius, (radius + (width - radius)));
        vertWidth = Math.max(width - radius, 0);
        self.elements.contentWrapper.css({
            border: '0px solid ' + color,
            borderWidth: vertWidth + 'px ' + sideWidth + 'px'
        })
    }
    function drawBorder(canvas, coordinates, radius, color)
    {
        var context = canvas.get(0).getContext('2d');
        context.fillStyle = color;
        context.beginPath();
        context.arc(coordinates[0], coordinates[1], radius, 0, Math.PI * 2,
            false);
        context.fill();
    }
    function createTip(corner)
    {
        var self, color, coordinates, coordsize, path;
        self = this;

        if (self.elements.tip !== null) self.elements.tip.remove();

        color = self.options.style.tip.color || self.options.style.border.color;
        if (self.options.style.tip.corner === false) return;
        else if (!corner) corner = self.options.style.tip.corner;

        coordinates = calculateTip(corner, self.options.style.tip.size.width,
            self.options.style.tip.size.height);

        self.elements.tip = '<div class="' + self.options.style.classes.tip
            + '" dir="ltr" rel="' + corner + '" style="position:absolute; ' +
            'height:' + self.options.style.tip.size.height + 'px; width:'
            + self.options.style.tip.size.width + 'px; ' +
            'margin:0 auto; line-height:0.1px; font-size:1px;">';

        if ($('<canvas>').get(0).getContext)
            self.elements.tip += '<canvas height="'
                + self.options.style.tip.size.height + '" width="'
                + self.options.style.tip.size.width + '"></canvas>';


        self.elements.tooltip.prepend(self.elements.tip + '</div>');

        self.elements.tip = self.elements.tooltip.find('.'
            + self.options.style.classes.tip).eq(0);
        if ($('<canvas>').get(0).getContext)
            drawTip.call(self, self.elements.tip.find('canvas:first'),
                coordinates, color);

        positionTip.call(self, corner);
    }
    function drawTip(canvas, coordinates, color)
    {
        var context = canvas.get(0).getContext('2d');
        context.fillStyle = color;

        context.beginPath();
        context.moveTo(coordinates[0][0], coordinates[0][1]);
        context.lineTo(coordinates[1][0], coordinates[1][1]);
        context.lineTo(coordinates[2][0], coordinates[2][1]);
        context.fill();
    }
    function positionTip(corner)
    {
        var self, paddingCorner, paddingSize, newMargin;
        self = this;

        if (self.options.style.tip.corner === false
            || !self.elements.tip) return;
        if (!corner) corner = self.elements.tip.attr('rel');

        self.elements.tip.css(corner.match(/left|right|top|bottom/)[0], 0);

        if (corner.search(/top|bottom/) !== -1) {
            if (corner.search(/Middle/) !== -1)
                self.elements.tip.css({ left: '50%', marginLeft: -(self.options.style.tip.size.width
                    / 2) });

            else if (corner.search(/Left/) !== -1)
                self.elements.tip.css({ left: self.options.style.border.radius });

            else if (corner.search(/Right/) !== -1)
                self.elements.tip.css({ right: self.options.style.border.radius });

            if (corner.search(/top/) !== -1)
                self.elements.tip.css({ top: 0 });
            else
                self.elements.tip.css({ bottom: 0 });

        }
        else if (corner.search(/left|right/) !== -1) {
            if (corner.search(/Middle/) !== -1)
                self.elements.tip.css({ top: '50%', marginTop: -(self.options.style.tip.size.height
                    / 2) });

            else if (corner.search(/Top/) !== -1)
                self.elements.tip.css({ top: self.options.style.border.radius });

            else if (corner.search(/Bottom/) !== -1)
                self.elements.tip.css({ bottom: self.options.style.border.radius });

            if (corner.search(/left/) !== -1)
                self.elements.tip.css({ left: 0 });
            else
                self.elements.tip.css({ right: 0 });
        }
        paddingCorner = 'padding-' + corner.match(/left|right|top|bottom/)[0];
        paddingSize
            = self.options.style.tip.size[ (paddingCorner.search(/left|right/)
            !== -1) ? 'width' : 'height' ];
        self.elements.tooltip.css('padding', 0);
        self.elements.tooltip.css(paddingCorner, paddingSize);

    }
    function createTitle()
    {
        var self = this;

        if (self.elements.title !== null) self.elements.title.remove();

        self.elements.title = $('<div class="'
            + self.options.style.classes.title + '">')
            .css(jQueryStyle(self.options.style.title, true))
            .css({ zoom: 0 })
            .prependTo(self.elements.contentWrapper);

        if (self.options.content.title.text) self.updateTitle.call(self,
            self.options.content.title.text);

        if (self.options.content.title.button !== false
            && typeof self.options.content.title.button == 'string') {
            self.elements.button = $('<a class="'
                + self.options.style.classes.button
                + '" style="float:right; position: relative"></a>')
                .css(jQueryStyle(self.options.style.button, true))
                .html(self.options.content.title.button)
                .prependTo(self.elements.title)
                .click(function (event)
                {
                    if (!self.status.disabled) self.hide(event)
                });
        }
    }
    function assignEvents()
    {
        var self, showTarget, hideTarget, inactiveEvents;
        self = this;

        showTarget = self.options.show.when.target;
        hideTarget = self.options.hide.when.target;

        if (self.options.hide.fixed) hideTarget
            = hideTarget.add(self.elements.tooltip);

        if (self.options.hide.when.event == 'inactive') {
            inactiveEvents = ['click', 'dblclick', 'mousedown', 'mouseup',
                'mousemove',
                'mouseout', 'mouseenter', 'mouseleave', 'mouseover' ];

            function inactiveMethod(event)
            {
                if (self.status.disabled === true) return;

                clearTimeout(self.timers.inactive);
                self.timers.inactive = setTimeout(function ()
                    {
                        $(inactiveEvents).each(function ()
                        {
                            hideTarget.unbind(this + '.qtip-inactive');
                            self.elements.content.unbind(this
                                + '.qtip-inactive');
                        });

                        self.hide(event);
                    }
                    , self.options.hide.delay);
            }
        }

        else if (self.options.hide.fixed === true) {
            self.elements.tooltip.bind('mouseover.qtip', function ()
            {
                if (self.status.disabled === true) return;

                clearTimeout(self.timers.hide);
            });
        }
        function showMethod(event)
        {
            if (self.status.disabled === true) return;

            if (self.options.hide.when.event == 'inactive') {
                $(inactiveEvents).each(function ()
                {
                    hideTarget.bind(this + '.qtip-inactive', inactiveMethod);
                    self.elements.content.bind(this + '.qtip-inactive',
                        inactiveMethod);
                });

                inactiveMethod();
            }
            clearTimeout(self.timers.show);
            clearTimeout(self.timers.hide);

            self.timers.show = setTimeout(function ()
            {
                self.show(event);
            }, self.options.show.delay);
        }
        function hideMethod(event)
        {
            if (self.status.disabled === true) return;

            if (self.options.hide.fixed === true
                && self.options.hide.when.event.search(/mouse(out|leave)/i)
                !== -1
                && $(event.relatedTarget).parents('div.qtip[qtip]').length
                > 0) {
                event.stopPropagation();
                event.preventDefault();

                clearTimeout(self.timers.hide);
                return false;
            }
            clearTimeout(self.timers.show);
            clearTimeout(self.timers.hide);
            self.elements.tooltip.stop(true, true);

            self.timers.hide = setTimeout(function ()
            {
                self.hide(event);
            }, self.options.hide.delay);
        }
        if ((self.options.show.when.target.add(self.options.hide.when.target).length
            === 1
            && self.options.show.when.event == self.options.hide.when.event
            && self.options.hide.when.event !== 'inactive')
            || self.options.hide.when.event == 'unfocus') {
            self.cache.toggle = 0;
            showTarget.bind(self.options.show.when.event + '.qtip',
                function (event)
                {
                    if (self.cache.toggle == 0) showMethod(event);
                    else hideMethod(event);
                });
        }

        else {
            showTarget.bind(self.options.show.when.event + '.qtip', showMethod);

            if (self.options.hide.when.event !== 'inactive')
                hideTarget.bind(self.options.hide.when.event + '.qtip',
                    hideMethod);
        }
        if (self.options.position.type.search(/(fixed|absolute)/) !== -1)
            self.elements.tooltip.bind('mouseover.qtip', self.focus);

        if (self.options.position.target === 'mouse'
            && self.options.position.type !== 'static') {
            showTarget.bind('mousemove.qtip', function (event)
            {
                self.cache.mouse = { x: event.pageX, y: event.pageY };

                if (self.status.disabled === false
                    && self.options.position.adjust.mouse === true
                    && self.options.position.type !== 'static'
                    && self.elements.tooltip.css('display') !== 'none')
                    self.updatePosition(event);
            });
        }
    }
    function screenAdjust(position, target, tooltip)
    {
        var self, adjustedPosition, adjust, newCorner, overflow, corner;
        self = this;

        if (tooltip.corner == 'center') return target.position;
        adjustedPosition = $.extend({}, position);
        newCorner = { x: false, y: false };

        overflow = {
            left: (adjustedPosition.left < $.fn.qtip.cache.screen.scroll.left),
            right: (adjustedPosition.left + tooltip.dimensions.width + 2
                >= $.fn.qtip.cache.screen.width
                + $.fn.qtip.cache.screen.scroll.left),
            top: (adjustedPosition.top < $.fn.qtip.cache.screen.scroll.top),
            bottom: (adjustedPosition.top + tooltip.dimensions.height + 2
                >= $.fn.qtip.cache.screen.height
                + $.fn.qtip.cache.screen.scroll.top)
        };

        adjust = {
            left: (overflow.left && (tooltip.corner.search(/right/i) != -1
                || (tooltip.corner.search(/right/i) == -1 && !overflow.right))),
            right: (overflow.right && (tooltip.corner.search(/left/i) != -1
                || (tooltip.corner.search(/left/i) == -1 && !overflow.left))),
            top: (overflow.top && tooltip.corner.search(/top/i) == -1),
            bottom: (overflow.bottom && tooltip.corner.search(/bottom/i) == -1)
        };

        if (adjust.left) {
            if (self.options.position.target !== 'mouse')
                adjustedPosition.left = target.position.left
                    + target.dimensions.width;
            else
                adjustedPosition.left = self.cache.mouse.x;

            newCorner.x = 'Left';
        }

        else if (adjust.right) {
            if (self.options.position.target !== 'mouse')
                adjustedPosition.left = target.position.left
                    - tooltip.dimensions.width;
            else
                adjustedPosition.left = self.cache.mouse.x
                    - tooltip.dimensions.width;

            newCorner.x = 'Right';
        }
        if (adjust.top) {
            if (self.options.position.target !== 'mouse')
                adjustedPosition.top = target.position.top
                    + target.dimensions.height;
            else
                adjustedPosition.top = self.cache.mouse.y;

            newCorner.y = 'top';
        }

        else if (adjust.bottom) {
            if (self.options.position.target !== 'mouse')
                adjustedPosition.top = target.position.top
                    - tooltip.dimensions.height;
            else
                adjustedPosition.top = self.cache.mouse.y
                    - tooltip.dimensions.height;

            newCorner.y = 'bottom';
        }
        if (adjustedPosition.left < 0) {
            adjustedPosition.left = position.left;
            newCorner.x = false;
        }
        if (adjustedPosition.top < 0) {
            adjustedPosition.top = position.top;
            newCorner.y = false;
        }
        if (self.options.style.tip.corner !== false) {
            adjustedPosition.corner = new String(tooltip.corner);
            if (newCorner.x !== false) adjustedPosition.corner
                = adjustedPosition.corner.replace(/Left|Right|Middle/,
                newCorner.x);
            if (newCorner.y !== false) adjustedPosition.corner
                = adjustedPosition.corner.replace(/top|bottom/, newCorner.y);

            if (adjustedPosition.corner !== self.elements.tip.attr('rel'))
                createTip.call(self, adjustedPosition.corner);
        }
        return adjustedPosition;
    }
    function jQueryStyle(style, sub)
    {
        var styleObj, i;

        styleObj = $.extend(true, {}, style);
        for (i in styleObj) {
            if (sub === true && i.search(/(tip|classes)/i) !== -1)
                delete styleObj[i];
            else if (!sub && i.search(/(width|border|tip|title|classes|user)/i)
                !== -1)
                delete styleObj[i];
        }
        return styleObj;
    }
    function sanitizeStyle(style)
    {
        if (typeof style.tip !== 'object') style.tip = { corner: style.tip };
        if (typeof style.tip.size !== 'object') style.tip.size
            = { width: style.tip.size, height: style.tip.size };
        if (typeof style.border !== 'object') style.border
            = { width: style.border };
        if (typeof style.width !== 'object') style.width
            = { value: style.width };
        if (typeof style.width.max == 'string') style.width.max
            = parseInt(style.width.max.replace(/([0-9]+)/, "$1"));
        if (typeof style.width.min == 'string') style.width.min
            = parseInt(style.width.min.replace(/([0-9]+)/, "$1"));

        if (typeof style.tip.size.x == 'number') {
            style.tip.size.width = style.tip.size.x;
            delete style.tip.size.x;
        }
        if (typeof style.tip.size.y == 'number') {
            style.tip.size.height = style.tip.size.y;
            delete style.tip.size.y;
        }
        return style;
    }
    function buildStyle()
    {
        var self, i, styleArray, styleExtend, finalStyle;
        self = this;

        styleArray = [true, {}];
        for (i = 0; i < arguments.length; i++)
            styleArray.push(arguments[i]);
        styleExtend = [ $.extend.apply($, styleArray) ];

        while (typeof styleExtend[0].name == 'string') {
            styleExtend.unshift(sanitizeStyle($.fn.qtip.styles[ styleExtend[0].name ]));
        }
        styleExtend.unshift(true,
            {classes: { tooltip: 'qtip-' + (arguments[0].name || 'defaults') }},
            $.fn.qtip.styles.defaults);

        finalStyle = $.extend.apply($, styleExtend);

        if (finalStyle.tip.size.width % 2 > 0) finalStyle.tip.size.width += 1;
        if (finalStyle.tip.size.height % 2 > 0) finalStyle.tip.size.height += 1;

        if (finalStyle.tip.corner === true)
            finalStyle.tip.corner = (self.options.position.corner.tooltip
                === 'center') ? false : self.options.position.corner.tooltip;

        return finalStyle;
    }
    function calculateTip(corner, width, height)
    {
        var tips = {
            bottomRight: [
                [0, 0],
                [width, height],
                [width, 0]
            ],
            bottomLeft: [
                [0, 0],
                [width, 0],
                [0, height]
            ],
            topRight: [
                [0, height],
                [width, 0],
                [width, height]
            ],
            topLeft: [
                [0, 0],
                [0, height],
                [width, height]
            ],
            topMiddle: [
                [0, height],
                [width / 2, 0],
                [width, height]
            ],
            bottomMiddle: [
                [0, 0],
                [width, 0],
                [width / 2, height]
            ],
            rightMiddle: [
                [0, 0],
                [width, height / 2],
                [0, height]
            ],
            leftMiddle: [
                [width, 0],
                [width, height],
                [0, height / 2]
            ]
        };
        tips.leftTop = tips.bottomRight;
        tips.rightTop = tips.bottomLeft;
        tips.leftBottom = tips.topRight;
        tips.rightBottom = tips.topLeft;

        return tips[corner];
    }
    function calculateBorders(radius)
    {
        var borders;

        if ($('<canvas>').get(0).getContext) {
            borders = {
                topLeft: [radius, radius], topRight: [0, radius],
                bottomLeft: [radius, 0], bottomRight: [0, 0]
            };
        }

        return borders;
    }
    function bgiframe()
    {
        var self, html, dimensions;
        self = this;
        dimensions = self.getDimensions();

        html
            = '<iframe class="qtip-bgiframe" frameborder="0" tabindex="-1" src="javascript:false" '
            +
            'style="display:block; position:absolute; z-index:-1; filter:alpha(opacity=\'0\'); border: 1px solid red; '
            +
            'height:' + dimensions.height + 'px; width:' + dimensions.width
            + 'px" />';

        self.elements.bgiframe
            = self.elements.wrapper.prepend(html).children('.qtip-bgiframe:first');
    }
    $(document).ready(function ()
    {
        $.fn.qtip.cache = {
            screen: {
                scroll: { left: $(window).scrollLeft(), top: $(window).scrollTop() },
                width: $(window).width(),
                height: $(window).height()
            }
        };

        var adjustTimer;
        $(window).bind('resize scroll', function (event)
        {
            clearTimeout(adjustTimer);
            adjustTimer = setTimeout(function ()
                {
                    if (event.type === 'scroll')
                        $.fn.qtip.cache.screen.scroll
                            = { left: $(window).scrollLeft(), top: $(window).scrollTop() };
                    else {
                        $.fn.qtip.cache.screen.width = $(window).width();
                        $.fn.qtip.cache.screen.height = $(window).height();
                    }
                    for (i = 0; i < $.fn.qtip.interfaces.length; i++) {
                        var api = $.fn.qtip.interfaces[i];

                        if (api.status.rendered === true
                            && (api.options.position.type !== 'static'
                            || api.options.position.adjust.scroll && event.type
                            === 'scroll'
                            || api.options.position.adjust.resize && event.type
                            === 'resize')) {
                            api.updatePosition(event, true);
                        }
                    }
                }
                , 100);
        });

        $(document).bind('mousedown.qtip', function (event)
        {
            if ($(event.target).parents('div.qtip').length === 0) {
                $('.qtip[unfocus]').each(function ()
                {
                    var api = $(this).qtip("api");

                    if ($(this).is(':visible') && !api.status.disabled
                        && $(event.target).add(api.elements.target).length > 1)
                        api.hide(event);
                })
            }
        })
    });

    $.fn.qtip.interfaces = [];

    $.fn.qtip.log = { error: function ()
    {
        return this;
    } };
    $.fn.qtip.constants = {};

    $.fn.qtip.defaults = {
        content: {
            prerender: false,
            text: false,
            url: false,
            data: null,
            title: {
                text: false,
                button: false
            }
        },
        position: {
            target: false,
            corner: {
                target: 'bottomRight',
                tooltip: 'topLeft'
            },
            adjust: {
                x: 0, y: 0,
                mouse: true,
                screen: false,
                scroll: true,
                resize: true
            },
            type: 'absolute',
            container: false
        },
        show: {
            when: {
                target: false,
                event: 'mouseover'
            },
            effect: {
                type: 'fade',
                length: 100
            },
            delay: 140,
            solo: false,
            ready: false
        },
        hide: {
            when: {
                target: false,
                event: 'mouseout'
            },
            effect: {
                type: 'fade',
                length: 100
            },
            delay: 0,
            fixed: false
        },
        api: {
            beforeRender: function ()
            {
            },
            onRender: function ()
            {
            },
            beforePositionUpdate: function ()
            {
            },
            onPositionUpdate: function ()
            {
            },
            beforeShow: function ()
            {
            },
            onShow: function ()
            {
            },
            beforeHide: function ()
            {
            },
            onHide: function ()
            {
            },
            beforeContentUpdate: function ()
            {
            },
            onContentUpdate: function ()
            {
            },
            beforeContentLoad: function ()
            {
            },
            onContentLoad: function ()
            {
            },
            beforeTitleUpdate: function ()
            {
            },
            onTitleUpdate: function ()
            {
            },
            beforeDestroy: function ()
            {
            },
            onDestroy: function ()
            {
            },
            beforeFocus: function ()
            {
            },
            onFocus: function ()
            {
            }
        }
    };

    $.fn.qtip.styles = {
        defaults: {
            background: 'white',
            color: '#111',
            overflow: 'hidden',
            textAlign: 'left',
            width: {
                min: 0,
                max: 250
            },
            padding: '5px 9px',
            border: {
                width: 1,
                radius: 0,
                color: '#d3d3d3'
            },
            tip: {
                corner: false,
                color: false,
                size: { width: 13, height: 13 },
                opacity: 1
            },
            title: {
                background: '#e1e1e1',
                fontWeight: 'bold',
                padding: '7px 12px'
            },
            button: {
                cursor: 'pointer'
            },
            classes: {
                target: '',
                tip: 'qtip-tip',
                title: 'qtip-title',
                button: 'qtip-button',
                content: 'qtip-content',
                active: 'qtip-active'
            }
        },
        cream: {
            border: {
                width: 3,
                radius: 0,
                color: '#F9E98E'
            },
            title: {
                background: '#F0DE7D',
                color: '#A27D35'
            },
            background: '#FBF7AA',
            color: '#A27D35',

            classes: { tooltip: 'qtip-cream' }
        },
        light: {
            border: {
                width: 3,
                radius: 0,
                color: '#E2E2E2'
            },
            title: {
                background: '#f1f1f1',
                color: '#454545'
            },
            background: 'white',
            color: '#454545',

            classes: { tooltip: 'qtip-light' }
        },
        dark: {
            border: {
                width: 3,
                radius: 0,
                color: '#303030'
            },
            title: {
                background: '#404040',
                color: '#f3f3f3'
            },
            background: '#505050',
            color: '#f3f3f3',

            classes: { tooltip: 'qtip-dark' }
        },
        red: {
            border: {
                width: 3,
                radius: 0,
                color: '#CE6F6F'
            },
            title: {
                background: '#f28279',
                color: '#9C2F2F'
            },
            background: '#F79992',
            color: '#9C2F2F',

            classes: { tooltip: 'qtip-red' }
        },
        green: {
            border: {
                width: 3,
                radius: 0,
                color: '#A9DB66'
            },
            title: {
                background: '#b9db8c',
                color: '#58792E'
            },
            background: '#CDE6AC',
            color: '#58792E',

            classes: { tooltip: 'qtip-green' }
        },
        blue: {
            border: {
                width: 3,
                radius: 0,
                color: '#ADD9ED'
            },
            title: {
                background: '#D0E9F5',
                color: '#5E99BD'
            },
            background: '#E5F6FE',
            color: '#4D9FBF',

            classes: { tooltip: 'qtip-blue' }
        }
    };
})(jQuery);
