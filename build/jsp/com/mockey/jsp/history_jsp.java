package com.mockey.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class history_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(4);
    _jspx_dependants.add("/WEB-INF/common/header.jsp");
    _jspx_dependants.add("/WEB-INF/common/inc_common_files.jsp");
    _jspx_dependants.add("/WEB-INF/common/message.jsp");
    _jspx_dependants.add("/WEB-INF/tags/version.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mockey_message_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_escapeXml_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_remove_var_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_param_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mockey_history_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mockey_fdate_date_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mockey_slug_text_maxLength_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mockey_service_type_style_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mockey_message_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_escapeXml_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_remove_var_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_var_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mockey_history_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mockey_fdate_date_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mockey_slug_text_maxLength_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mockey_service_type_style_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_mockey_message_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_escapeXml_nobody.release();
    _jspx_tagPool_c_remove_var_scope_nobody.release();
    _jspx_tagPool_c_url_var_value.release();
    _jspx_tagPool_c_param_value_name_nobody.release();
    _jspx_tagPool_mockey_history_value_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_mockey_fdate_date_nobody.release();
    _jspx_tagPool_mockey_slug_text_maxLength_nobody.release();
    _jspx_tagPool_mockey_service_type_style_nobody.release();
    _jspx_tagPool_c_otherwise.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n\n\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write('\n');
      out.write("\n\n\n<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n<title>Mockey - ");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("</title>\n<meta http-equiv=\"content-type\" content=\"text/html; charset=iso-8859-1\">\n<meta http-equiv=\"cache-control\" content=\"none;\">\n<link rel=\"shortcut icon\" href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("\n\n\n\n<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\" media=\"screen, projection\" />\n<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\" />\n<!--  We version the style, just to be sure users don't see the cached version. -->\n<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("?version=");
      if (_jspx_meth_mockey$1tag_version_0(_jspx_page_context))
        return;
      out.write("\" />\n<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\" />\n<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("\" />\n<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_url_6(_jspx_page_context))
        return;
      out.write("\" />\n");

// Only for DEV. This polls every few seconds and will refressh this page's CSS
//<script type="text/javascript" src="<c:url value="/javascript/cssrefresh.js" />"></script>

      out.write("\n<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_7(_jspx_page_context))
        return;
      out.write("\"></script>\n<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_8(_jspx_page_context))
        return;
      out.write("\"></script>\n<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_9(_jspx_page_context))
        return;
      out.write("\"></script>\n<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_10(_jspx_page_context))
        return;
      out.write("\"></script>\n<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_11(_jspx_page_context))
        return;
      out.write("\"></script>\n<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_12(_jspx_page_context))
        return;
      out.write("\"></script>\n<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_13(_jspx_page_context))
        return;
      out.write("\"></script>\n<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_14(_jspx_page_context))
        return;
      out.write("\"></script>\n<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_15(_jspx_page_context))
        return;
      out.write("\"></script>\n<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_16(_jspx_page_context))
        return;
      out.write("\"></script>\n<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_17(_jspx_page_context))
        return;
      out.write("\"></script>\n<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_18(_jspx_page_context))
        return;
      out.write("\"></script>\n<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_19(_jspx_page_context))
        return;
      out.write("\"></script>");
      out.write("\n\n<script language=\"Javascript\">\n<!---\nfunction decision(message, url){\nif(confirm(message)) location.href = url;\n}\n// --->\n\n\n$(document).ready(function() {\n\n    $('#poorStartMessage').hide();\n    $('#container').show();\n    $('input[title!=\"\"]').hint();\n\n\t$('textarea.resizable:not(.processed)').TextAreaResizer();\n\t$('ul.sf-menu').superfish({\n\t\tdelay:       1000,                            // one second delay on mouseout\n\t\tanimation:   {opacity:'show',height:'show'},  // fade-in and slide-down animation\n\t\tspeed:       'fast',                          // faster animation speed\n\t\tautoArrows:  false,                           // disable generation of arrow mark-up\n\t\tdropShadows: true                            // disable drop shadows\n\t});\n\t\n   $('.toggle-header-tools').each( function() {\n        $(this).click( function() {\n          $('#header_tool_wrapper').toggle();\n        });\n     });\n   $('.toggle-header-search').each( function() {\n        $(this).click( function() {\n          $('#header_search_wrapper').toggle();\n");
      out.write("        });\n     });\n\t// \n\t$.getJSON('");
      if (_jspx_meth_c_url_20(_jspx_page_context))
        return;
      out.write("', function(data) {\n\t\tif(data.result.proxy_enabled=='true'){\n\t\t\t$(\"#proxy_unknown\").hide();\n\t       \t$(\"#proxy_on\").show();\n       \t    $(\"#proxy_off\").hide();\n\t     }else {\n\t    \t $(\"#proxy_unknown\").hide();\n\t    \t $(\"#proxy_on\").hide();\n\t    \t $(\"#proxy_off\").show(); \n\t     }\n\t    \n\n\t\tif(data.result.twist_enabled==true){\n            $(\"#twisting_on\").show();\n            $(\"#twisting_off\").hide();\n            \n         }else {\n             $(\"#twisting_on\").hide();\n             $(\"#twisting_off\").show(); \n         }\n        $('#twist-config').show(); \n        \n        if(data.result.transient_state==true){\n            $(\"#transient_unknown\").hide();\n            $(\"#transient_true\").show();\n            $(\"#transient_false\").hide();\n            \n         }else {\n             $(\"#transient_unknown\").hide();\n             $(\"#transient_true\").hide();\n             $(\"#transient_false\").show(); \n         }\n        $('#memory-only-config').show(); \n        \n        if(data.result.filter_view_status=='on'){\n          $(\"#filter-tag-field\").val(data.result.filter_view_arg);\n");
      out.write("        }\n         \n         \n        \n       \n\t});\n\n\t$('#reset-sticky-session').click( function() {\n\t\t$('#reset-session-confirm').dialog({width: 400, height:200, modal: true, resizable:true});\n\t\t$('#reset-session-confirm').dialog('open');\n\t\t$('#reset-session-confirm').dialog({\n            buttons: {\n              \"Reset Sticky Sessions\": function() {\n\t\t\t\t\t$.post('");
      if (_jspx_meth_c_url_21(_jspx_page_context))
        return;
      out.write("' ,function(data){\n\t\t\t            if(data.reset){\n\t\t\t               $('#updated').fadeIn('fast').animate({opacity: 1.0}, 300).fadeOut('fast'); \n\t\t\t             }\n\t\t\t        }, 'json' );      \n\t\t\t\t\t$('#reset-session-confirm').dialog('close');                    \n              }, \n              Cancel: function(){\n                  $('#reset-session-confirm').dialog('close');\n                  \n              }\n            }\n      }); \n      return false;\n    });\n\t$(\"#reset-session-confirm\").dialog({\n        autoOpen: false\n    });\n    \n     $('.transient-onclick').each( function() {\n        $(this).click( function() {\n            var tVal = this.id.split(\"_\")[1];\n            var isTrueSet = (tVal !== 'true');\n           \n            $('#transient-confirm').show();\n            $('#transient-confirm').dialog('open');\n            $('#transient-confirm').dialog({\n                modal: true,\n                resizable: false,\n                buttons: {\n                  \"Go for it.\": function() {\n                    \n");
      out.write("                       $.post('");
      if (_jspx_meth_c_url_22(_jspx_page_context))
        return;
      out.write("' + isTrueSet ,function(data){\n                        if(data.result){\n                           $('#updated').fadeIn('fast').animate({opacity: 1.0}, 300).fadeOut('fast'); \n                           if(data.result.transient_state){\n                              $(\"#transient_true\").show();\n                              $(\"#transient_false\").hide();\n                            }else {\n                              $(\"#transient_true\").hide();\n                              $(\"#transient_false\").show();\n                            }\n                         }\n                    }, 'json' ); \n                    $(this).dialog('close');      \n                                            \n                  }, \n                  Cancel: function(){\n                      $(this).dialog('close');\n                  }\n                }\n          }); \n          return false;\n       });\n       $('#dialog-flush-confirm').dialog(\"destroy\");\n     });\n\t\n\t\n    $(\"#dialog-flush-confirm\").dialog({\n        resizable: false,\n        height:120,\n");
      out.write("        modal: true,\n        autoOpen: false\n    });\n\n\n    \n    $(\"#filter-tag-update-button\").click( function() {\n           var filterTag = $('#filter-tag-field').val();\n           \n           $.post('");
      if (_jspx_meth_c_url_23(_jspx_page_context))
        return;
      out.write("', { action: 'filter_tag_on', tag: filterTag } ,function(data){\n\t\t\t\t\t   //console.log(data);\n\t\t\t\t\t   if(data.success){\n\t\t\t\t\t\t   document.location=\"");
      if (_jspx_meth_c_url_24(_jspx_page_context))
        return;
      out.write("\";\n\t\t\t\t\t    }else {\n\t\t\t\t\t       alert(\"Hmm...\");\n\t\t\t\t\t    }\n\t\t\t\t}, 'json' );\n           \n        });\n\n    $('.filter-tag-item').each( function() {\n        $(this).click( function() {\n            var  filterTag = this.id;\n            $.post('");
      if (_jspx_meth_c_url_25(_jspx_page_context))
        return;
      out.write("', { action: 'filter_tag_on', tag: filterTag } ,function(data){\n                //console.log(data);\n                if(data.success){\n                    document.location=\"");
      if (_jspx_meth_c_url_26(_jspx_page_context))
        return;
      out.write("\";\n                }else {\n                    alert(\"Hmm...\");\n                }\n            }, 'json' );\n        });\n    });\n    \n    $('.clear-tag-button').each( function() {\n       $(this).click( function() {\n           $.post('");
      if (_jspx_meth_c_url_27(_jspx_page_context))
        return;
      out.write("', { action: 'filter_tag_off' } ,function(data){\n\t\t\t\t\t   //console.log(data);\n\t\t\t\t\t   if(data.success){\n\t\t\t\t\t\t   document.location=\"");
      if (_jspx_meth_c_url_28(_jspx_page_context))
        return;
      out.write("\";\n\t\t\t\t\t    }else {\n\t\t\t\t\t       alert(\"Hmm...\");\n\t\t\t\t\t    }\n\t\t\t\t}, 'json' );\n        });\n      });\n    $('#flush').each( function() {\n        $(this).click( function() {\n        \t$('#dialog-flush-confirm').show();\n            $('#dialog-flush-confirm').dialog('open');\n            $('#dialog-flush-confirm').dialog({\n                modal: true,\n                resizable: false,\n                buttons: {\n                  \"Delete everything\": function() {\n                      document.location=\"");
      if (_jspx_meth_c_url_29(_jspx_page_context))
        return;
      out.write("\";                          \n                  }, \n                  Cancel: function(){\n                      $(this).dialog('close');\n                  }\n                }\n          }); \n          return false;\n       });\n       $('#dialog-flush-confirm').dialog(\"destroy\");\n     });\n    \n    $('#search_me').each( function() {\n        $(this).click( function() {\n            var term = $('#search_term').attr('value');\n            document.location=\"");
      if (_jspx_meth_c_url_30(_jspx_page_context))
        return;
      out.write("\" + term;\n          }); \n       \n     });\n     \n     $('#search_term').keypress(function(e) {\n        if(e.which == 13) {\n            var term = $('#search_term').val();\n            document.location=\"");
      if (_jspx_meth_c_url_31(_jspx_page_context))
        return;
      out.write("\" + term;\n        }\n    });\n    \n    $('.toggle-conflict-link').each( function() {\n        $(this).click( function() {\n            var tVal = this.id.split(\"_\")[1];\n            $('#conflict-info_' + tVal).toggle();\n            \n          }); \n       \n     });\n    \n     \n});\n\n\n</script>\n</head>\n<body>\n<div id=\"container\" style=\"display:none;\">\n\n<div id=\"logo\">\n    <!-- <a href=\"");
      if (_jspx_meth_c_url_32(_jspx_page_context))
        return;
      out.write("\" class=\"nav\"><span style=\"vertical-align:middle;font-size:20px; text-shadow: 0px 0px 1px #FF0084;\" class=\"nav\">Mockey</span></a> -->\n    <div style=\"clear:both;\"/>\n\t");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n<span id=\"foo\" class=\"hide\">\n\t");
      if (_jspx_meth_mockey_message_0(_jspx_page_context))
        return;
      out.write("\n</span>\n<span id=\"updated\" class=\"hide\">\n\tUpdated\n</span>\n<span id=\"deleted\" class=\"hide\">\n\tDeleted\n</span>\n");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('	');

	String ua = request.getHeader( "User-Agent" );
	boolean isFirefox = ( ua != null && ua.indexOf( "Firefox/" ) != -1 );
	boolean isMSIE = ( ua != null && ua.indexOf( "MSIE 6.0" ) != -1 );
	response.setHeader( "Vary", "User-Agent" );
	
      out.write('\n');
      out.write('	');
 if( isMSIE ){ 
      out.write("\n\t  <span class=\"alert_message\" style=\"position:absolute; bottom:0; left:0; width:60px; font-size:0.8em;z-index:100;\"><strong>Warning:</strong>This app' isn't designed for <b>Internet Explorer 6.0</b>. You should use another browser.</span>\n\t");
 } 
      out.write("\n\t<div id=\"dialog-flush-confirm\" class=\"hide\" title=\"Flush\"><div style=\"text-align: center;\"><img src=\"");
      if (_jspx_meth_c_url_33(_jspx_page_context))
        return;
      out.write("\"/></div> <br />Are you sure? This will delete everything. You may want to <a href=\"");
      if (_jspx_meth_c_url_34(_jspx_page_context))
        return;
      out.write("\">export your stuff</a> first.</div>\n\t<div id=\"transient-confirm\" class=\"hide\" title=\"Storage Setting\">This will toggle your storage setting. For more information on this, look <a href=\"");
      if (_jspx_meth_c_url_35(_jspx_page_context))
        return;
      out.write("\">here</a></div>\n\t<div id=\"reset-session-confirm\" class=\"hide\" title=\"Reset Session\">Are you sure? This will flush out any sticky cookies that Mockey may have kept due to serving up active-session-based proxy requests.\n\t<p> <i>Does your brain hurt now?</i></p>\n\t</div>\n\t\n\t<div id=\"topnav\" style=\"margin-bottom:0.5em;width:100%;\">\n\t\t<ul class=\"sf-menu\" >\n\t\t\t<li class=\"");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\"><a\n\t\t\t\thref=\"");
      if (_jspx_meth_c_url_36(_jspx_page_context))
        return;
      out.write("\">Start here...<span class=\"sf-sub-indicator\"> &#187;</span></a>\n        <ul>\n\n        <li ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("><a title=\"Service Setup - create new service\"\n        href=\"");
      if (_jspx_meth_c_url_37(_jspx_page_context))
        return;
      out.write("\">Create a Service</a></li>\n\n\n\n        <li ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write(">\n        <a title=\"Merge - combine services\" href=\"");
      if (_jspx_meth_c_url_38(_jspx_page_context))
        return;
      out.write("\"\n        style=\"\">Merge Services</a></li>\n        \n        <li ");
      if (_jspx_meth_c_if_6(_jspx_page_context))
        return;
      out.write(">\n        <a title=\"Real URL injecting\" href=\"");
      if (_jspx_meth_c_url_39(_jspx_page_context))
        return;
      out.write("\"\n        style=\"\">URL Injection</a></li>\n        \n        <li ");
      if (_jspx_meth_c_if_7(_jspx_page_context))
        return;
      out.write(">\n          <a href=\"");
      if (_jspx_meth_c_url_40(_jspx_page_context))
        return;
      out.write("\" >Proxy Settings <b id=\"proxy_off\" style=\"display: none;\">(OFF)</b><b id=\"proxy_on\" style=\"display: none;\">(ON)</b></a>\n        </li>\n        \n        <li><a id=\"flush\" href=\"#\">Flush</a></li>\n        \n        <li><span id=\"reset-sticky-cookie-config\">\n            <a href=\"#\" id=\"reset-sticky-session\" title=\"Reset the sticky cookie session that Mockey may be keeping.\">Reset Session</a></span></li>\n\n        <li  ");
      if (_jspx_meth_c_if_8(_jspx_page_context))
        return;
      out.write(">\n            <a href=\"");
      if (_jspx_meth_c_url_41(_jspx_page_context))
        return;
      out.write("\">Twisting <b id=\"twisting_on\" style=\"display:none;\">(ON)</b><b id=\"twisting_off\" style=\"display:none;\">(OFF)</b></a>\n        </li>\n\n        <li>\n          \n        </li>\n        \n        <li ");
      if (_jspx_meth_c_if_9(_jspx_page_context))
        return;
      out.write(">\n        <a title=\"Image Depot\" href=\"");
      if (_jspx_meth_c_url_42(_jspx_page_context))
        return;
      out.write("\"\n        style=\"\">Image Depot</a></li>   \n        </ul>\n\t\t\t</li>\n\n\n\n\t\t\t<li ");
      if (_jspx_meth_c_if_10(_jspx_page_context))
        return;
      out.write(">\n        <a href=\"");
      if (_jspx_meth_c_url_43(_jspx_page_context))
        return;
      out.write("\">Import/Export</a></li>\n\n      \n\t\t\t<li ");
      if (_jspx_meth_c_if_11(_jspx_page_context))
        return;
      out.write(">\n\t\t\t\t<a href=\"");
      if (_jspx_meth_c_url_44(_jspx_page_context))
        return;
      out.write("\">History <span class=\"sf-sub-indicator\"> &#187;</span></a>\n\t\t\t\t<ul>\n                <li><a id=\"chart\" href=\"");
      if (_jspx_meth_c_url_45(_jspx_page_context))
        return;
      out.write("\"> History Stats</a></li>\n                </ul>\n\t\t\t</li>\n\t\t\t\n\t        <li class=\"");
      if (_jspx_meth_c_if_12(_jspx_page_context))
        return;
      out.write("\">\n\t        <a href=\"");
      if (_jspx_meth_c_url_46(_jspx_page_context))
        return;
      out.write("\">Help  <span class=\"sf-sub-indicator\"> &#187;</span></a>\n\t            <ul>\n                <li ");
      if (_jspx_meth_c_if_13(_jspx_page_context))
        return;
      out.write("><a title=\"Configuration API\"\n                href=\"");
      if (_jspx_meth_c_url_47(_jspx_page_context))
        return;
      out.write("\"><i aria-hidden=\"true\" class=\"icon-cog\"></i>&nbsp;Configuration API</a></li>\n                <li ");
      if (_jspx_meth_c_if_14(_jspx_page_context))
        return;
      out.write("><a title=\"Debug Console\"\n                href=\"");
      if (_jspx_meth_c_url_48(_jspx_page_context))
        return;
      out.write("\"><i aria-hidden=\"true\" class=\"icon-glasses\"></i>&nbsp;Debug Console</a></li>\n                <li ");
      if (_jspx_meth_c_if_15(_jspx_page_context))
        return;
      out.write("><a title=\"View for feature phones\"\n                href=\"");
      if (_jspx_meth_c_url_49(_jspx_page_context))
        return;
      out.write("\"><i aria-hidden=\"true\" class=\"icon-mobile\"></i>&nbsp;Mobile</a></li>\n                <li ><a title=\"JSON Schema Validation\" href=\"");
      if (_jspx_meth_c_url_50(_jspx_page_context))
        return;
      out.write("\">\n                <i aria-hidden=\"true\" class=\"icon-power\"></i>&nbsp;JSON Schema</a></li>\n\t            </ul>\n\t        </li>\n          \n\t\t</ul>\n\n\n\t<div style=\"float:right;\">\n\t   <span style=\"float:right;\"><img style=\"height:30px; \" src=\"");
      if (_jspx_meth_c_url_51(_jspx_page_context))
        return;
      out.write("\" /></span>\n\t   <a href=\"");
      if (_jspx_meth_c_url_52(_jspx_page_context))
        return;
      out.write("\" class=\"logo_link\">Mockey</a>\n\t</div>\n\n  <div style=\"display:inline-block; margin-top:10px;\">\n      <span id=\"memory-only-config\" style=\"display:none; padding-left:10px; margin-top:20px;\">\n        Storage set to:\n        <a href=\"#\" id=\"transient_unknown\"  style=\"display: none;\">___</a>\n        <a href=\"#\" id=\"transient_true\" class=\"transient-onclick response_not\" val=\"true\" style=\"display: none; color:red;\">In Memory Only</a>\n        <a href=\"#\" id=\"transient_false\" class=\"transient-onclick response_not\" val=\"false\" style=\"display: none; color: #10CF33;\">Writing to file</a> \n      </span>\n  </div>\n  \n  <div style=\"clear:both;\"/>\n  </div>\n\n    \n\n\t<div style=\"clear:both;\"/>\n\t\t\n  </div>\n\n     \n\n\n");
      out.write("\n<script>\n$(document).ready(function() {\n\n\n\t\tvar makeExactlyAsTallAsItNeedsToBe = function(textArea) {\n\t\t\tvar content = $(textArea).val() == undefined ? \"\" : $(textArea).val();\n\t\t\tvar numOfRowsOfContent = 1;\n\t\t\ttry { numOfRowsOfContent = content.match(/[^\\n]*\\n[^\\n]*/gi).length; } catch(e) {}\n\t\t\tvar maxSize = 40;\n\t\t\ttextArea.rows = numOfRowsOfContent<maxSize?numOfRowsOfContent+1:maxSize;\n\t\t}\n\t\t$('textarea').each( function() {\n\t\t\tmakeExactlyAsTallAsItNeedsToBe(this);\n\t\t\t$(this).keyup( function(e) {\n\t\t\t\tmakeExactlyAsTallAsItNeedsToBe(this);\n\t\t\t});\n\t\t\t$(this).change( function(e) {\n\t\t\t\tmakeExactlyAsTallAsItNeedsToBe(this);\n\t\t\t});\n\t\t\t$(this).bind( \"reformatted\", function(e) {\n\t\t\t\tmakeExactlyAsTallAsItNeedsToBe(this);\n\t\t\t});\n\t\t});\n\n    $(\".tabs\").tabs();\n\t\t\t\n\t$('#filter-button').button();\n\t\n\t$('.mockeyResponse').each( function() {\n\t\tvar formatButton = $(this).find(\".formatButton\")[0];\n\t\t$(formatButton).click( function() {\n\t\t\tvar contentTextArea = $(this).parent().parent().find(\".responseContent\")[0];\n\t\t\tvar theId = this.id;\n");
      out.write("\t\t\tformatXmlInTextArea(contentTextArea);\n\t\t\treturn false;\n\t\t});\n\t\tvar formatXmlInTextArea = function(textArea) {\n\t\t\tvar unFormatted = $(textArea).val();\n\t\t\tvar formatted = format_xml(unFormatted);\n\t\t\t$(textArea).val(formatted);\n\t\t\t$(textArea).trigger(\"reformatted\");\n\t\t}\n\t});\n\n\t$('.deleteFulfilledRequestLink').each( function() {\n\t\t$(this).click( function() {\n\t\t\tvar requestId = this.id.split(\"_\")[1];\n\t\t\tvar unusedServiceId = -1;\n\t\t\t$.ajax({\n\t\t\t\ttype: \"GET\",\n\t\t\t\turl: \"");
      if (_jspx_meth_c_url_53(_jspx_page_context))
        return;
      out.write("?action=delete&serviceId=\"+unusedServiceId+\"&fulfilledRequestId=\"+requestId\n\t\t\t});\n\t\t\t$('#fulfilledRequest_'+requestId).fadeOut(500, function() {\n\t\t\t\t$('#fulfilledRequest_'+requestId).remove();\n\t\t\t});\n\t\t});\n\t});\n\t\n\t$('.tagFulfilledRequestLink').each( function() {\n\t\t$(this).click( function() {\n\t\t\tvar requestId = this.id.split(\"_\")[1];\n\t\t\tvar unusedServiceId = -1;\n\t\t\t$.ajax({\n\t\t\t\ttype: \"POST\",\n\t\t\t\turl: \"");
      if (_jspx_meth_c_url_54(_jspx_page_context))
        return;
      out.write("?action=tag&fulfilledRequestId=\"+requestId\n\t\t\t});\n\t\t});\n\t});\n\t\n    $('a.tagFulfilledRequestLink').click(function () {\n      $(this).parent().toggleClass(\"selected\");\n      var tagspan= $(this).find(\".tag\")[0];\n      $(tagspan).toggle();\n      var untagspan= $(this).find(\".untag\")[0];\n      $(untagspan).toggle();\n    });\n\n\t$('.viewFulfilledRequestLink_orig').each( function() {\n\t\t$(this).click( function() {\n\t\t\tvar requestId = this.id.split(\"_\")[1];\t\n\t\t    $(this).toggle();\t\t\n\t\t    $('#hideFulfilledRequest_'+requestId).toggle();\n\t\t\t$.ajax({\n\t\t\t\ttype: \"GET\",\n\t\t\t\turl: \"");
      if (_jspx_meth_c_url_55(_jspx_page_context))
        return;
      out.write("?&fulfilledRequestId=\"+requestId,\n\t\t\t\tsuccess: function(html) {\n                  //i want to fade result into these 2 divs...\n                  $('#letmesee_'+requestId).hide().html(html).fadeIn();\n                }\n\t\t\t});\n\t\t});\n\t});\n\n    $('.viewRequestInspectionLink').each( function() {\n        $(this).click( function() {\n            var requestId = this.id.split(\"_\")[1];  \n            $('#viewRequestInspectionBlock_'+requestId).toggle();\n            \n        });\n    });\n    \n\t$('.viewFulfilledRequestLink').each( function() {\n        $(this).click( function() {\n            var requestId = this.id.split(\"_\")[1];  \n            var element = this;\n            var timeoutValue = 50000;\n            $('#spinner_'+requestId).toggle();\n            $(element).toggle(); \n            $.ajax({\n                type: 'GET',\n                dataType: 'json',\n                timeout: timeoutValue, \n                url: '");
      if (_jspx_meth_c_url_56(_jspx_page_context))
        return;
      out.write("?&conversationRecordId='+requestId,\n                success: function(data) {\n                \t\n                        \n                  $('#hideFulfilledRequest_'+requestId).toggle();\n                  $('#spinner_'+requestId).hide();\n                  $('#requestUrl_'+requestId).val(data.requestUrl);\n                  $('#requestParameters_'+requestId).val(data.requestParameters);\n                  $('#requestHeaders_'+requestId).val(data.requestHeaders);\n                  $('#requestCookies_'+requestId).val(data.requestCookies);\n                  $('#requestBody_'+requestId).val(data.requestBody);\n                  $('#responseScenarioName_'+requestId).append(data.responseScenarioName);\n                  $('#responseScenarioTags_'+requestId).append(data.responseScenarioTags);\n                  $('#responseStatus_'+requestId).val(data.responseStatus);\n                  $('#responseHeader_'+requestId).val(data.responseHeader);\n                  $('#responseBody_'+requestId).val(data.responseBody);\n                  $('#responseCookies_'+requestId).val(data.responseCookies);\n");
      out.write("                  $('#letmesee_'+requestId).show(); \n                  \n                },\n                error: function(XMLHttpRequest, textStatus, errorThrown) { \n                \t$('#spinner_'+requestId).hide();\n                \t$(element).show(); \n                    alert(\"Status: \" + textStatus + \". System error or possibly taking longer than \" +timeoutValue/1000 + \" seconds. Check logs for insight.\" ); \n                } \n            });\n        });\n    });\n\n\n\n\t$('.hideFulfilledRequestLink').each( function() {\n\t\t$(this).click( function() {\n\t\t\tvar requestId = this.id.split(\"_\")[1];\t\t\t\n\t\t\t$('#letmesee_'+requestId).fadeOut();\n\t\t\t$('#hideFulfilledRequest_'+requestId).toggle();\n\t\t\t$('#viewFulfilledRequest_'+requestId).toggle();\n\t\t});\n\t});\n\n   \n    $(\"#dialog-clear-history-confirm\").dialog({\n        resizable: false,\n        height:120,\n        modal: true,\n        autoOpen: false\n    });\n        \n    $('.clear_history').each( function() {\n        $(this).click( function() {\n            \n            $('#dialog-clear-history-confirm').dialog('open');\n");
      out.write("                $('#dialog-clear-history-confirm').dialog({\n                    buttons: {\n                      \"Delete history\": function() {\n                         document.location=\"");
      if (_jspx_meth_c_url_57(_jspx_page_context))
        return;
      out.write("\";                              \n                      }, \n                      Cancel: function(){\n                          $(this).dialog('close');\n                      }\n                    }\n              }); \n              return false;\n            });\n        });\n        \n});\n\n</script>\n<div id=\"main\">\n    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/common/inc_scenario_create_dialog.jsp", out, false);
      out.write("\n\n    <h1>History</h1>\n    <p>\n    This is the list of service calls made to Mockey.\n    </p>\n    <div id=\"dialog-clear-history-confirm\" title=\"Delete history\">Are you sure? This will delete all fulfilled requests for all requesting IPs.</div>\n    <form action=\"");
      if (_jspx_meth_c_url_58(_jspx_page_context))
        return;
      out.write("\" method=\"get\">\n    <p>\n    \n    <input type=\"text\" name=\"token\" size=\"80\" placeholder=\"Enter 1 or more space seperated tags to filter the list to only the things with a matching tag.\" class=\"text ui-corner-all ui-widget-content\"/>\n    <button id=\"filter-button\" >Add Filter</button>\n    \n    ");
      if (_jspx_meth_c_if_16(_jspx_page_context))
        return;
      out.write("\n    ");
      if (_jspx_meth_c_if_17(_jspx_page_context))
        return;
      out.write("\n    </p>\n    </form>\n    ");
      if (_jspx_meth_c_if_18(_jspx_page_context))
        return;
      out.write("\n    ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n</div>\n\n\n\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/common/footer.jsp", out, false);
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("pageTitle");
    _jspx_th_c_set_0.setValue(new String("History"));
    _jspx_th_c_set_0.setScope("request");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("currentTab");
    _jspx_th_c_set_1.setValue(new String("history"));
    _jspx_th_c_set_1.setScope("request");
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.pageTitle}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/images/favicon.ico");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("/css/hoverbox.css");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue("/css/superfish.css");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent(null);
    _jspx_th_c_url_3.setValue("/css/style.css");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
    return false;
  }

  private boolean _jspx_meth_mockey$1tag_version_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mockey-tag:version
    org.apache.jsp.tag.web.version_tag _jspx_th_mockey$1tag_version_0 = new org.apache.jsp.tag.web.version_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_mockey$1tag_version_0      );
    }
    _jspx_th_mockey$1tag_version_0.setJspContext(_jspx_page_context);
    _jspx_th_mockey$1tag_version_0.doTag();
    return false;
  }

  private boolean _jspx_meth_c_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_4.setPageContext(_jspx_page_context);
    _jspx_th_c_url_4.setParent(null);
    _jspx_th_c_url_4.setValue("/jquery-ui-1.8.1.custom/css/flick/jquery-ui-1.8.1.custom.css");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
    return false;
  }

  private boolean _jspx_meth_c_url_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_5.setPageContext(_jspx_page_context);
    _jspx_th_c_url_5.setParent(null);
    _jspx_th_c_url_5.setValue("/javascript/fileuploader/fileuploader.css");
    int _jspx_eval_c_url_5 = _jspx_th_c_url_5.doStartTag();
    if (_jspx_th_c_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
    return false;
  }

  private boolean _jspx_meth_c_url_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_6.setPageContext(_jspx_page_context);
    _jspx_th_c_url_6.setParent(null);
    _jspx_th_c_url_6.setValue("/icomoon/style.css");
    int _jspx_eval_c_url_6 = _jspx_th_c_url_6.doStartTag();
    if (_jspx_th_c_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
    return false;
  }

  private boolean _jspx_meth_c_url_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_7.setPageContext(_jspx_page_context);
    _jspx_th_c_url_7.setParent(null);
    _jspx_th_c_url_7.setValue("/javascript/util.js");
    int _jspx_eval_c_url_7 = _jspx_th_c_url_7.doStartTag();
    if (_jspx_th_c_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
    return false;
  }

  private boolean _jspx_meth_c_url_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_8.setPageContext(_jspx_page_context);
    _jspx_th_c_url_8.setParent(null);
    _jspx_th_c_url_8.setValue("/jquery-ui-1.8.1.custom/js/jquery-1.4.2.min.js");
    int _jspx_eval_c_url_8 = _jspx_th_c_url_8.doStartTag();
    if (_jspx_th_c_url_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
    return false;
  }

  private boolean _jspx_meth_c_url_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_9.setPageContext(_jspx_page_context);
    _jspx_th_c_url_9.setParent(null);
    _jspx_th_c_url_9.setValue("/jquery-ui-1.8.1.custom/js/jquery-ui-1.8.1.custom.min.js");
    int _jspx_eval_c_url_9 = _jspx_th_c_url_9.doStartTag();
    if (_jspx_th_c_url_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
    return false;
  }

  private boolean _jspx_meth_c_url_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_10 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_10.setPageContext(_jspx_page_context);
    _jspx_th_c_url_10.setParent(null);
    _jspx_th_c_url_10.setValue("/javascript/jquery-jeditable-min.js");
    int _jspx_eval_c_url_10 = _jspx_th_c_url_10.doStartTag();
    if (_jspx_th_c_url_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
    return false;
  }

  private boolean _jspx_meth_c_url_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_11 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_11.setPageContext(_jspx_page_context);
    _jspx_th_c_url_11.setParent(null);
    _jspx_th_c_url_11.setValue("/javascript/jquery-impromptu.2.7.min.js");
    int _jspx_eval_c_url_11 = _jspx_th_c_url_11.doStartTag();
    if (_jspx_th_c_url_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_11);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_11);
    return false;
  }

  private boolean _jspx_meth_c_url_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_12 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_12.setPageContext(_jspx_page_context);
    _jspx_th_c_url_12.setParent(null);
    _jspx_th_c_url_12.setValue("/javascript/jquery.textarearesizer.compressed.js");
    int _jspx_eval_c_url_12 = _jspx_th_c_url_12.doStartTag();
    if (_jspx_th_c_url_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_12);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_12);
    return false;
  }

  private boolean _jspx_meth_c_url_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_13 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_13.setPageContext(_jspx_page_context);
    _jspx_th_c_url_13.setParent(null);
    _jspx_th_c_url_13.setValue("/javascript/superfish.js");
    int _jspx_eval_c_url_13 = _jspx_th_c_url_13.doStartTag();
    if (_jspx_th_c_url_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_13);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_13);
    return false;
  }

  private boolean _jspx_meth_c_url_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_14 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_14.setPageContext(_jspx_page_context);
    _jspx_th_c_url_14.setParent(null);
    _jspx_th_c_url_14.setValue("/javascript/hoverIntent.js");
    int _jspx_eval_c_url_14 = _jspx_th_c_url_14.doStartTag();
    if (_jspx_th_c_url_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_14);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_14);
    return false;
  }

  private boolean _jspx_meth_c_url_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_15 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_15.setPageContext(_jspx_page_context);
    _jspx_th_c_url_15.setParent(null);
    _jspx_th_c_url_15.setValue("/javascript/jquery.hint.js");
    int _jspx_eval_c_url_15 = _jspx_th_c_url_15.doStartTag();
    if (_jspx_th_c_url_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_15);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_15);
    return false;
  }

  private boolean _jspx_meth_c_url_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_16 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_16.setPageContext(_jspx_page_context);
    _jspx_th_c_url_16.setParent(null);
    _jspx_th_c_url_16.setValue("/javascript/fileuploader/fileuploader.js");
    int _jspx_eval_c_url_16 = _jspx_th_c_url_16.doStartTag();
    if (_jspx_th_c_url_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_16);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_16);
    return false;
  }

  private boolean _jspx_meth_c_url_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_17 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_17.setPageContext(_jspx_page_context);
    _jspx_th_c_url_17.setParent(null);
    _jspx_th_c_url_17.setValue("/javascript/beautify.js");
    int _jspx_eval_c_url_17 = _jspx_th_c_url_17.doStartTag();
    if (_jspx_th_c_url_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_17);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_17);
    return false;
  }

  private boolean _jspx_meth_c_url_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_18 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_18.setPageContext(_jspx_page_context);
    _jspx_th_c_url_18.setParent(null);
    _jspx_th_c_url_18.setValue("/javascript/beautify-html.js");
    int _jspx_eval_c_url_18 = _jspx_th_c_url_18.doStartTag();
    if (_jspx_th_c_url_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_18);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_18);
    return false;
  }

  private boolean _jspx_meth_c_url_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_19 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_19.setPageContext(_jspx_page_context);
    _jspx_th_c_url_19.setParent(null);
    _jspx_th_c_url_19.setValue("/javascript/chart.min.js");
    int _jspx_eval_c_url_19 = _jspx_th_c_url_19.doStartTag();
    if (_jspx_th_c_url_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_19);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_19);
    return false;
  }

  private boolean _jspx_meth_c_url_20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_20 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_20.setPageContext(_jspx_page_context);
    _jspx_th_c_url_20.setParent(null);
    _jspx_th_c_url_20.setValue("/configuration/info");
    int _jspx_eval_c_url_20 = _jspx_th_c_url_20.doStartTag();
    if (_jspx_th_c_url_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_20);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_20);
    return false;
  }

  private boolean _jspx_meth_c_url_21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_21 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_21.setPageContext(_jspx_page_context);
    _jspx_th_c_url_21.setParent(null);
    _jspx_th_c_url_21.setValue("/configuration/reset_sticky_cookie_session");
    int _jspx_eval_c_url_21 = _jspx_th_c_url_21.doStartTag();
    if (_jspx_th_c_url_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_21);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_21);
    return false;
  }

  private boolean _jspx_meth_c_url_22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_22 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_22.setPageContext(_jspx_page_context);
    _jspx_th_c_url_22.setParent(null);
    _jspx_th_c_url_22.setValue("/configuration/info?transient_state=");
    int _jspx_eval_c_url_22 = _jspx_th_c_url_22.doStartTag();
    if (_jspx_th_c_url_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_22);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_22);
    return false;
  }

  private boolean _jspx_meth_c_url_23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_23 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_23.setPageContext(_jspx_page_context);
    _jspx_th_c_url_23.setParent(null);
    _jspx_th_c_url_23.setValue("/taghelp");
    int _jspx_eval_c_url_23 = _jspx_th_c_url_23.doStartTag();
    if (_jspx_th_c_url_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_23);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_23);
    return false;
  }

  private boolean _jspx_meth_c_url_24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_24 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_24.setPageContext(_jspx_page_context);
    _jspx_th_c_url_24.setParent(null);
    _jspx_th_c_url_24.setValue("/home");
    int _jspx_eval_c_url_24 = _jspx_th_c_url_24.doStartTag();
    if (_jspx_th_c_url_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_24);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_24);
    return false;
  }

  private boolean _jspx_meth_c_url_25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_25 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_25.setPageContext(_jspx_page_context);
    _jspx_th_c_url_25.setParent(null);
    _jspx_th_c_url_25.setValue("/taghelp");
    int _jspx_eval_c_url_25 = _jspx_th_c_url_25.doStartTag();
    if (_jspx_th_c_url_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_25);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_25);
    return false;
  }

  private boolean _jspx_meth_c_url_26(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_26 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_26.setPageContext(_jspx_page_context);
    _jspx_th_c_url_26.setParent(null);
    _jspx_th_c_url_26.setValue("/home");
    int _jspx_eval_c_url_26 = _jspx_th_c_url_26.doStartTag();
    if (_jspx_th_c_url_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_26);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_26);
    return false;
  }

  private boolean _jspx_meth_c_url_27(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_27 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_27.setPageContext(_jspx_page_context);
    _jspx_th_c_url_27.setParent(null);
    _jspx_th_c_url_27.setValue("/taghelp");
    int _jspx_eval_c_url_27 = _jspx_th_c_url_27.doStartTag();
    if (_jspx_th_c_url_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_27);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_27);
    return false;
  }

  private boolean _jspx_meth_c_url_28(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_28 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_28.setPageContext(_jspx_page_context);
    _jspx_th_c_url_28.setParent(null);
    _jspx_th_c_url_28.setValue("/home");
    int _jspx_eval_c_url_28 = _jspx_th_c_url_28.doStartTag();
    if (_jspx_th_c_url_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_28);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_28);
    return false;
  }

  private boolean _jspx_meth_c_url_29(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_29 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_29.setPageContext(_jspx_page_context);
    _jspx_th_c_url_29.setParent(null);
    _jspx_th_c_url_29.setValue("/home?action=deleteAllServices");
    int _jspx_eval_c_url_29 = _jspx_th_c_url_29.doStartTag();
    if (_jspx_th_c_url_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_29);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_29);
    return false;
  }

  private boolean _jspx_meth_c_url_30(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_30 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_30.setPageContext(_jspx_page_context);
    _jspx_th_c_url_30.setParent(null);
    _jspx_th_c_url_30.setValue("/search?term=");
    int _jspx_eval_c_url_30 = _jspx_th_c_url_30.doStartTag();
    if (_jspx_th_c_url_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_30);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_30);
    return false;
  }

  private boolean _jspx_meth_c_url_31(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_31 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_31.setPageContext(_jspx_page_context);
    _jspx_th_c_url_31.setParent(null);
    _jspx_th_c_url_31.setValue("/search?term=");
    int _jspx_eval_c_url_31 = _jspx_th_c_url_31.doStartTag();
    if (_jspx_th_c_url_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_31);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_31);
    return false;
  }

  private boolean _jspx_meth_c_url_32(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_32 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_32.setPageContext(_jspx_page_context);
    _jspx_th_c_url_32.setParent(null);
    _jspx_th_c_url_32.setValue("/home");
    int _jspx_eval_c_url_32 = _jspx_th_c_url_32.doStartTag();
    if (_jspx_th_c_url_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_32);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_32);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty successMessages}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t<script type=\"text/javascript\">\n\t\t    $(document).ready(function() {\n\t\t\t$(\"#foo\").fadeIn(1000).fadeTo(3000, 1).fadeOut(1000);\n\t\t});\n\t</script>\n");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty errorMessages}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n    <script type=\"text/javascript\">\n            $(document).ready(function() {\n            $(\"#error-info\").fadeIn(1000).fadeTo(3000, 1).fadeOut(1000); \n        });\n    </script>\n");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_mockey_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mockey:message
    com.mockey.ui.tags.MessageTag _jspx_th_mockey_message_0 = (com.mockey.ui.tags.MessageTag) _jspx_tagPool_mockey_message_nobody.get(com.mockey.ui.tags.MessageTag.class);
    _jspx_th_mockey_message_0.setPageContext(_jspx_page_context);
    _jspx_th_mockey_message_0.setParent(null);
    int _jspx_eval_mockey_message_0 = _jspx_th_mockey_message_0.doStartTag();
    if (_jspx_th_mockey_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mockey_message_nobody.reuse(_jspx_th_mockey_message_0);
      return true;
    }
    _jspx_tagPool_mockey_message_nobody.reuse(_jspx_th_mockey_message_0);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty errorMessages}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t<span  id=\"error-info\" class=\"hide\">\n\t\t");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\n\t</span>\n\t");
        if (_jspx_meth_c_remove_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_forEach_0.setVar("msg");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorMessages}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n\t\t\t");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_out_1.setEscapeXml(false);
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_remove_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_remove_0 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _jspx_tagPool_c_remove_var_scope_nobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    _jspx_th_c_remove_0.setPageContext(_jspx_page_context);
    _jspx_th_c_remove_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_remove_0.setVar("errorMessages");
    _jspx_th_c_remove_0.setScope("session");
    int _jspx_eval_c_remove_0 = _jspx_th_c_remove_0.doStartTag();
    if (_jspx_th_c_remove_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_0);
      return true;
    }
    _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_0);
    return false;
  }

  private boolean _jspx_meth_c_url_33(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_33 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_33.setPageContext(_jspx_page_context);
    _jspx_th_c_url_33.setParent(null);
    _jspx_th_c_url_33.setValue("/images/flush.png");
    int _jspx_eval_c_url_33 = _jspx_th_c_url_33.doStartTag();
    if (_jspx_th_c_url_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_33);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_33);
    return false;
  }

  private boolean _jspx_meth_c_url_34(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_34 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_34.setPageContext(_jspx_page_context);
    _jspx_th_c_url_34.setParent(null);
    _jspx_th_c_url_34.setValue("/export");
    int _jspx_eval_c_url_34 = _jspx_th_c_url_34.doStartTag();
    if (_jspx_th_c_url_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_34);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_34);
    return false;
  }

  private boolean _jspx_meth_c_url_35(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_35 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_35.setPageContext(_jspx_page_context);
    _jspx_th_c_url_35.setParent(null);
    _jspx_th_c_url_35.setValue("/help#storage");
    int _jspx_eval_c_url_35 = _jspx_th_c_url_35.doStartTag();
    if (_jspx_th_c_url_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_35);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_35);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentTab == 'home'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("current");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_url_36(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_36 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_36.setPageContext(_jspx_page_context);
    _jspx_th_c_url_36.setParent(null);
    _jspx_th_c_url_36.setValue("/home");
    int _jspx_eval_c_url_36 = _jspx_th_c_url_36.doStartTag();
    if (_jspx_th_c_url_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_36);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_36);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentTab == 'setup'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("class=\"current\"");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_url_37(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_37 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_37.setPageContext(_jspx_page_context);
    _jspx_th_c_url_37.setParent(null);
    _jspx_th_c_url_37.setValue("/setup");
    int _jspx_eval_c_url_37 = _jspx_th_c_url_37.doStartTag();
    if (_jspx_th_c_url_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_37);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_37);
    return false;
  }

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentTab == 'merge'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("class=\"current\"");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_url_38(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_38 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_38.setPageContext(_jspx_page_context);
    _jspx_th_c_url_38.setParent(null);
    _jspx_th_c_url_38.setValue("/merge");
    int _jspx_eval_c_url_38 = _jspx_th_c_url_38.doStartTag();
    if (_jspx_th_c_url_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_38);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_38);
    return false;
  }

  private boolean _jspx_meth_c_if_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(null);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentTab == 'inject'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("class=\"current\"");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_url_39(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_39 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_39.setPageContext(_jspx_page_context);
    _jspx_th_c_url_39.setParent(null);
    _jspx_th_c_url_39.setValue("/inject");
    int _jspx_eval_c_url_39 = _jspx_th_c_url_39.doStartTag();
    if (_jspx_th_c_url_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_39);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_39);
    return false;
  }

  private boolean _jspx_meth_c_if_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent(null);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentTab == 'proxy'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("class=\"current\"");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_c_url_40(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_40 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_40.setPageContext(_jspx_page_context);
    _jspx_th_c_url_40.setParent(null);
    _jspx_th_c_url_40.setValue("/proxy/settings");
    int _jspx_eval_c_url_40 = _jspx_th_c_url_40.doStartTag();
    if (_jspx_th_c_url_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_40);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_40);
    return false;
  }

  private boolean _jspx_meth_c_if_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent(null);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentTab == 'twisting'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("class=\"current\"");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }

  private boolean _jspx_meth_c_url_41(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_41 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_41.setPageContext(_jspx_page_context);
    _jspx_th_c_url_41.setParent(null);
    _jspx_th_c_url_41.setValue("/twisting/setup");
    int _jspx_eval_c_url_41 = _jspx_th_c_url_41.doStartTag();
    if (_jspx_th_c_url_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_41);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_41);
    return false;
  }

  private boolean _jspx_meth_c_if_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent(null);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentTab == 'filesysteminfo'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("class=\"current\"");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }

  private boolean _jspx_meth_c_url_42(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_42 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_42.setPageContext(_jspx_page_context);
    _jspx_th_c_url_42.setParent(null);
    _jspx_th_c_url_42.setValue("/filesysteminfo");
    int _jspx_eval_c_url_42 = _jspx_th_c_url_42.doStartTag();
    if (_jspx_th_c_url_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_42);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_42);
    return false;
  }

  private boolean _jspx_meth_c_if_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent(null);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentTab == 'upload'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("class=\"current\"");
        int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
    return false;
  }

  private boolean _jspx_meth_c_url_43(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_43 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_43.setPageContext(_jspx_page_context);
    _jspx_th_c_url_43.setParent(null);
    _jspx_th_c_url_43.setValue("/upload");
    int _jspx_eval_c_url_43 = _jspx_th_c_url_43.doStartTag();
    if (_jspx_th_c_url_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_43);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_43);
    return false;
  }

  private boolean _jspx_meth_c_if_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
    _jspx_th_c_if_11.setParent(null);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentTab == 'history'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("class=\"current\"");
        int evalDoAfterBody = _jspx_th_c_if_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
    return false;
  }

  private boolean _jspx_meth_c_url_44(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_44 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_44.setPageContext(_jspx_page_context);
    _jspx_th_c_url_44.setParent(null);
    _jspx_th_c_url_44.setValue("/history");
    int _jspx_eval_c_url_44 = _jspx_th_c_url_44.doStartTag();
    if (_jspx_th_c_url_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_44);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_44);
    return false;
  }

  private boolean _jspx_meth_c_url_45(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_45 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_45.setPageContext(_jspx_page_context);
    _jspx_th_c_url_45.setParent(null);
    _jspx_th_c_url_45.setValue("/servicestatschart");
    int _jspx_eval_c_url_45 = _jspx_th_c_url_45.doStartTag();
    if (_jspx_th_c_url_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_45);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_45);
    return false;
  }

  private boolean _jspx_meth_c_if_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_12.setPageContext(_jspx_page_context);
    _jspx_th_c_if_12.setParent(null);
    _jspx_th_c_if_12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentTab == 'help'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_12 = _jspx_th_c_if_12.doStartTag();
    if (_jspx_eval_c_if_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("current");
        int evalDoAfterBody = _jspx_th_c_if_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
    return false;
  }

  private boolean _jspx_meth_c_url_46(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_46 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_46.setPageContext(_jspx_page_context);
    _jspx_th_c_url_46.setParent(null);
    _jspx_th_c_url_46.setValue("/help");
    int _jspx_eval_c_url_46 = _jspx_th_c_url_46.doStartTag();
    if (_jspx_th_c_url_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_46);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_46);
    return false;
  }

  private boolean _jspx_meth_c_if_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_13.setPageContext(_jspx_page_context);
    _jspx_th_c_if_13.setParent(null);
    _jspx_th_c_if_13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentTab == 'api'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_13 = _jspx_th_c_if_13.doStartTag();
    if (_jspx_eval_c_if_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("class=\"current\"");
        int evalDoAfterBody = _jspx_th_c_if_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
    return false;
  }

  private boolean _jspx_meth_c_url_47(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_47 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_47.setPageContext(_jspx_page_context);
    _jspx_th_c_url_47.setParent(null);
    _jspx_th_c_url_47.setValue("/service_api");
    int _jspx_eval_c_url_47 = _jspx_th_c_url_47.doStartTag();
    if (_jspx_th_c_url_47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_47);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_47);
    return false;
  }

  private boolean _jspx_meth_c_if_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_14.setPageContext(_jspx_page_context);
    _jspx_th_c_if_14.setParent(null);
    _jspx_th_c_if_14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentTab == 'console'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_14 = _jspx_th_c_if_14.doStartTag();
    if (_jspx_eval_c_if_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("class=\"current\"");
        int evalDoAfterBody = _jspx_th_c_if_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
    return false;
  }

  private boolean _jspx_meth_c_url_48(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_48 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_48.setPageContext(_jspx_page_context);
    _jspx_th_c_url_48.setParent(null);
    _jspx_th_c_url_48.setValue("/console");
    int _jspx_eval_c_url_48 = _jspx_th_c_url_48.doStartTag();
    if (_jspx_th_c_url_48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_48);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_48);
    return false;
  }

  private boolean _jspx_meth_c_if_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_15 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_15.setPageContext(_jspx_page_context);
    _jspx_th_c_if_15.setParent(null);
    _jspx_th_c_if_15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentTab == 'console'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_15 = _jspx_th_c_if_15.doStartTag();
    if (_jspx_eval_c_if_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("class=\"current\"");
        int evalDoAfterBody = _jspx_th_c_if_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
    return false;
  }

  private boolean _jspx_meth_c_url_49(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_49 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_49.setPageContext(_jspx_page_context);
    _jspx_th_c_url_49.setParent(null);
    _jspx_th_c_url_49.setValue("/mobi");
    int _jspx_eval_c_url_49 = _jspx_th_c_url_49.doStartTag();
    if (_jspx_th_c_url_49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_49);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_49);
    return false;
  }

  private boolean _jspx_meth_c_url_50(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_50 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_50.setPageContext(_jspx_page_context);
    _jspx_th_c_url_50.setParent(null);
    _jspx_th_c_url_50.setValue("/jsonschemavalidate");
    int _jspx_eval_c_url_50 = _jspx_th_c_url_50.doStartTag();
    if (_jspx_th_c_url_50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_50);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_50);
    return false;
  }

  private boolean _jspx_meth_c_url_51(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_51 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_51.setPageContext(_jspx_page_context);
    _jspx_th_c_url_51.setParent(null);
    _jspx_th_c_url_51.setValue("/images/logo.png");
    int _jspx_eval_c_url_51 = _jspx_th_c_url_51.doStartTag();
    if (_jspx_th_c_url_51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_51);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_51);
    return false;
  }

  private boolean _jspx_meth_c_url_52(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_52 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_52.setPageContext(_jspx_page_context);
    _jspx_th_c_url_52.setParent(null);
    _jspx_th_c_url_52.setValue("/home");
    int _jspx_eval_c_url_52 = _jspx_th_c_url_52.doStartTag();
    if (_jspx_th_c_url_52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_52);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_52);
    return false;
  }

  private boolean _jspx_meth_c_url_53(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_53 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_53.setPageContext(_jspx_page_context);
    _jspx_th_c_url_53.setParent(null);
    _jspx_th_c_url_53.setValue("history");
    int _jspx_eval_c_url_53 = _jspx_th_c_url_53.doStartTag();
    if (_jspx_th_c_url_53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_53);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_53);
    return false;
  }

  private boolean _jspx_meth_c_url_54(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_54 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_54.setPageContext(_jspx_page_context);
    _jspx_th_c_url_54.setParent(null);
    _jspx_th_c_url_54.setValue("history");
    int _jspx_eval_c_url_54 = _jspx_th_c_url_54.doStartTag();
    if (_jspx_th_c_url_54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_54);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_54);
    return false;
  }

  private boolean _jspx_meth_c_url_55(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_55 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_55.setPageContext(_jspx_page_context);
    _jspx_th_c_url_55.setParent(null);
    _jspx_th_c_url_55.setValue("fulfilledrequest");
    int _jspx_eval_c_url_55 = _jspx_th_c_url_55.doStartTag();
    if (_jspx_th_c_url_55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_55);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_55);
    return false;
  }

  private boolean _jspx_meth_c_url_56(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_56 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_56.setPageContext(_jspx_page_context);
    _jspx_th_c_url_56.setParent(null);
    _jspx_th_c_url_56.setValue("/conversation/record");
    int _jspx_eval_c_url_56 = _jspx_th_c_url_56.doStartTag();
    if (_jspx_th_c_url_56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_56);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_56);
    return false;
  }

  private boolean _jspx_meth_c_url_57(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_57 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_57.setPageContext(_jspx_page_context);
    _jspx_th_c_url_57.setParent(null);
    _jspx_th_c_url_57.setValue("/history?action=delete_all");
    int _jspx_eval_c_url_57 = _jspx_th_c_url_57.doStartTag();
    if (_jspx_th_c_url_57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_57);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_57);
    return false;
  }

  private boolean _jspx_meth_c_url_58(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_58 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_58.setPageContext(_jspx_page_context);
    _jspx_th_c_url_58.setParent(null);
    _jspx_th_c_url_58.setValue("/history");
    int _jspx_eval_c_url_58 = _jspx_th_c_url_58.doStartTag();
    if (_jspx_th_c_url_58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_58);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_58);
    return false;
  }

  private boolean _jspx_meth_c_if_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_16 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_16.setPageContext(_jspx_page_context);
    _jspx_th_c_if_16.setParent(null);
    _jspx_th_c_if_16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty requests}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_16 = _jspx_th_c_if_16.doStartTag();
    if (_jspx_eval_c_if_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n      ");
        if (_jspx_meth_c_url_59((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_16, _jspx_page_context))
          return true;
        out.write("\n      <a  class=\"spread clear_history\" href=\"#\">Clear History</a>  \n    ");
        int evalDoAfterBody = _jspx_th_c_if_16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_16);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_16);
    return false;
  }

  private boolean _jspx_meth_c_url_59(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_59 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_59.setPageContext(_jspx_page_context);
    _jspx_th_c_url_59.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_16);
    _jspx_th_c_url_59.setValue("/history");
    _jspx_th_c_url_59.setVar("deleteAllScenarioUrl");
    int _jspx_eval_c_url_59 = _jspx_th_c_url_59.doStartTag();
    if (_jspx_eval_c_url_59 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_59 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_url_59.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_59.doInitBody();
      }
      do {
        out.write("\n         ");
        if (_jspx_meth_c_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_59, _jspx_page_context))
          return true;
        out.write("\n      ");
        int evalDoAfterBody = _jspx_th_c_url_59.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_59 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_url_59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_59);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_59);
    return false;
  }

  private boolean _jspx_meth_c_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_59, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_0 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_0.setPageContext(_jspx_page_context);
    _jspx_th_c_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_59);
    _jspx_th_c_param_0.setName("action");
    _jspx_th_c_param_0.setValue("delete_all");
    int _jspx_eval_c_param_0 = _jspx_th_c_param_0.doStartTag();
    if (_jspx_th_c_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
    return false;
  }

  private boolean _jspx_meth_c_if_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_17 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_17.setPageContext(_jspx_page_context);
    _jspx_th_c_if_17.setParent(null);
    _jspx_th_c_if_17.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty historyFilter.tokens}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_17 = _jspx_th_c_if_17.doStartTag();
    if (_jspx_eval_c_if_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \n       <a class=\"spread\" href=\"");
        if (_jspx_meth_c_url_60((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_17, _jspx_page_context))
          return true;
        out.write("\">Clear Filters</a>\n    ");
        int evalDoAfterBody = _jspx_th_c_if_17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_17);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_17);
    return false;
  }

  private boolean _jspx_meth_c_url_60(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_60 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_60.setPageContext(_jspx_page_context);
    _jspx_th_c_url_60.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_17);
    _jspx_th_c_url_60.setValue("/history?action=remove_all_tokens");
    int _jspx_eval_c_url_60 = _jspx_th_c_url_60.doStartTag();
    if (_jspx_th_c_url_60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_60);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_60);
    return false;
  }

  private boolean _jspx_meth_c_if_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_18 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_18.setPageContext(_jspx_page_context);
    _jspx_th_c_if_18.setParent(null);
    _jspx_th_c_if_18.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty historyFilter.tokens}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_18 = _jspx_th_c_if_18.doStartTag();
    if (_jspx_eval_c_if_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \n    <p class=\"tiny\">You are filtering your history on:<span style=\"float:right;\"><strong>Hint:</strong> Try filtering with <i>bang + term</i>, example: <span class=\"code_text\"><b>!term</b></span></span></p>\n    <div class=\"hint_message\">\n   \n    <p>\n    ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_18, _jspx_page_context))
          return true;
        out.write("\n    </p>\n    \n    </div>\n    ");
        int evalDoAfterBody = _jspx_th_c_if_18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_18);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_18);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_18);
    _jspx_th_c_forEach_1.setVar("token");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${historyFilter.tokens}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${token}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<a id=\"token\" class=\"remove_grey\" title=\"Remove filter token\" href=\"");
          if (_jspx_meth_mockey_history_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\"><i aria-hidden=\"true\" class=\"icon-cancel\"></i></a> \n    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_mockey_history_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mockey:history
    com.mockey.ui.tags.HistoryFilterTag _jspx_th_mockey_history_0 = (com.mockey.ui.tags.HistoryFilterTag) _jspx_tagPool_mockey_history_value_nobody.get(com.mockey.ui.tags.HistoryFilterTag.class);
    _jspx_th_mockey_history_0.setPageContext(_jspx_page_context);
    _jspx_th_mockey_history_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_mockey_history_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${token}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_mockey_history_0 = _jspx_th_mockey_history_0.doStartTag();
    if (_jspx_th_mockey_history_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mockey_history_value_nobody.reuse(_jspx_th_mockey_history_0);
      return true;
    }
    _jspx_tagPool_mockey_history_value_nobody.reuse(_jspx_th_mockey_history_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n        ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n        ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n    ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty requests}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n        \n        \n        \t");
        if (_jspx_meth_c_if_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\n            ");
        if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\n        ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_if_19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_19 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_19.setPageContext(_jspx_page_context);
    _jspx_th_c_if_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_if_19.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:length(requests) > 100}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue());
    int _jspx_eval_c_if_19 = _jspx_th_c_if_19.doStartTag();
    if (_jspx_eval_c_if_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n                <p style=\"font-size:1.2em; color: red;\"><span>Whoa!</span> There are too many records to display them all (<strong>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:length(requests)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
        out.write(" records</strong>). Here are a few... </p>\n            ");
        int evalDoAfterBody = _jspx_th_c_if_19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_19);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_19);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_forEach_2.setVar("request");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requests}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n            \t\n                ");
          if (_jspx_meth_c_if_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n               \n            ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_20 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_20.setPageContext(_jspx_page_context);
    _jspx_th_c_if_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_20.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.count < 101}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_20 = _jspx_th_c_if_20.doStartTag();
    if (_jspx_eval_c_if_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n                <div id=\"fulfilledRequest_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"parentform\" style=\"padding: 0.2em 0.5em; 0.2em 0.5em;\">\n                   ");
        if (_jspx_meth_c_url_61((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("  \n                   <div style=\"text-align:right;  position: relative;font-size:80%;\" class=\"");
        if (_jspx_meth_c_if_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\">\n                     \n                     ");
        if (_jspx_meth_c_if_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\n                     <span id=\"spinner_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" style=\"margin-right:5px; display:none;\"><img src=\"");
        if (_jspx_meth_c_url_62((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\"/> </span>\n                     <a href=\"#\" id=\"viewFulfilledRequest_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"viewFulfilledRequestLink hhButton\" onclick=\"return false;\">view</a>\n                     \n                     <a href=\"#\" id=\"hideFulfilledRequest_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"hideFulfilledRequestLink hhButton\" onclick=\"return false;\" style=\"display:none;\">hide</a>   \n                     <a href=\"#\" id=\"tagFulfilledRequestLink_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"tagFulfilledRequestLink hhButton\" onclick=\"return false;\"><span class=\"tag\" style=\"");
        if (_jspx_meth_c_if_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\">flag</span><span class=\"untag\" style=\"");
        if (_jspx_meth_c_if_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\">unflag</span></a>\n                     <a href=\"#\" id=\"deleteFulfilledRequest_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"deleteFulfilledRequestLink remove_grey\" style=\"margin-left:2em;\"><i aria-hidden=\"true\" class=\"icon-cancel\"></i></a>\t              \n\t               </div>\n\t               <div style=\"width:95%; position:relative; margin-top:-1em;\">\n\t                 \n\t                 <b>When:</b> ");
        if (_jspx_meth_mockey_fdate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write(" <b>From:</b> <a id=\"finfo\" title=\"");
        if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write('"');
        out.write('>');
        if (_jspx_meth_mockey_slug_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("</a>\n\t\t\t\t\t\t (");
        if (_jspx_meth_mockey_service_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write(")\n\t                 <b><a href=\"");
        if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\" title=\"");
        if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write('"');
        out.write('>');
        if (_jspx_meth_mockey_slug_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("</a></b>\n\t                 <div style=\"padding-top:0.2em;\">\n\t                 ");
        if (_jspx_meth_c_if_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\n\t                 <b>Raw Request:</b> ");
        if (_jspx_meth_mockey_slug_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write(" </div>                    \n\t                 <div id=\"letmesee_orig");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n\t                 \n                     </div>\n                     <div id=\"letmesee_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" style=\"display:none;\">\n\t                    \n                        <div style=\"padding: 0.2em 0.4em; margin: 0.2em 0.0em;\">\n\t                        <h2>Request</h2>\n\t                        <div class=\"tabs\">\n\t                                    <ul>\n\t                                        <li><a href=\"#tabs-2_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Parameters</a></li>\n\t                                        <li><a href=\"#tabs-3_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Headers</a></li>\n\t                                        <li><a href=\"#tabs-5_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Cookies</a></li>\n\t                                        <li><a href=\"#tabs-4_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Body</a></li>\n\t                                    </ul>\n\t                                    <div id=\"tabs-2_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"historyTextArea\">\n\t                                    <textarea class=\"noborder_textarea resizable\" id=\"requestParameters_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" name=\"requestParameters\" rows=\"25\" cols=\"50\"></textarea>\n\t                                    </div>\n\t                                    <div id=\"tabs-3_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"historyTextArea\">\n\t                                    <textarea class=\"noborder_textarea resizable\" id=\"requestHeaders_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"  name=\"requestHeaders\" rows=\"25\" cols=\"50\"></textarea>\n\t                                    </div>\n\t                                    <div id=\"tabs-5_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"historyTextArea\">\n                                        <textarea class=\"noborder_textarea resizable\" id=\"requestCookies_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"  name=\"requestCookies\" rows=\"25\" cols=\"50\"></textarea>\n                                        </div>\n\t                                    <div id=\"tabs-4_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"historyTextArea\">\n\t                                    <textarea class=\"noborder_textarea resizable\" id=\"requestBody_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" name=\"requestBody\" rows=\"25\" cols=\"50\"></textarea>\n\t                                    </div>\n\t                        </div>\n                        </div>\n                        <div style=\"padding: 0.2em 0.4em; margin: 0.2em 0.0em;\">\n                        <h2>Response:</h2> \n                        <p>Response scenario name: <span id=\"responseScenarioName_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"> </span> </p>\n                        <p>Response scenario tags: <span id=\"responseScenarioTags_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"> </span> </p>\n                            <div class=\"tabs\">\n                                        <ul>\n                                            <li><a href=\"#resp-tabs-2_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Headers</a></li>\n                                            <li><a href=\"#resp-tabs-5_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Cookies</a></li>\n                                            <li><a href=\"#resp-tabs-3_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Body</a></li>\n                                            <li><a href=\"#resp-tabs-1_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Status</a></li>\n                                        </ul>\n                                        <div id=\"resp-tabs-2_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"historyTextArea\">\n                                           <p style=\"color:red;\">Note: header key values are pipe (\"|\") delimited by Mockey for readability. </p>\n                                           <textarea class=\"noborder_textarea resizable\" id=\"responseHeader_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"  name=\"requestHeader\" rows=\"5\" cols=\"50\"></textarea>\n                                        </div>\n                                        <div id=\"resp-tabs-5_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"historyTextArea\">\n                                           <textarea class=\"noborder_textarea resizable\" id=\"responseCookies_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" name=\"responseCookies\" rows=\"5\" cols=\"50\"></textarea>\n                                        </div>\n                                        <div id=\"resp-tabs-3_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"historyTextArea\">\n                                           <textarea class=\"noborder_textarea resizable\" id=\"responseBody_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" name=\"responseBody\" rows=\"5\" cols=\"50\"></textarea>\n                                        </div>\n                                        <div id=\"resp-tabs-1_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"historyTextArea\">\n                                           <textarea class=\"noborder_textarea resizable\" id=\"responseStatus_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" name=\"responseStatus\" rows=\"5\" cols=\"50\"></textarea>\n                                        </div>\n                                        \n                                        \n                            </div>\n                            <div>\n                            <button id=\"save-as-a-service-scenario_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"save-as-a-service-scenario\">Save me as a scenario</button>\n                            </div>\n                            \n                        </div>\n                     </div>\n                   </div>                   \n                </div>\n                ");
        int evalDoAfterBody = _jspx_th_c_if_20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_20);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_20);
    return false;
  }

  private boolean _jspx_meth_c_url_61(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_61 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_61.setPageContext(_jspx_page_context);
    _jspx_th_c_url_61.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_c_url_61.setValue("/home");
    _jspx_th_c_url_61.setVar("serviceUrl");
    int _jspx_eval_c_url_61 = _jspx_th_c_url_61.doStartTag();
    if (_jspx_eval_c_url_61 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_61 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_2[0]++;
        _jspx_th_c_url_61.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_61.doInitBody();
      }
      do {
        out.write("\n                          ");
        if (_jspx_meth_c_param_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_61, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("                                                                               \n                   ");
        int evalDoAfterBody = _jspx_th_c_url_61.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_61 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_2[0]--;
    }
    if (_jspx_th_c_url_61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_61);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_61);
    return false;
  }

  private boolean _jspx_meth_c_param_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_61, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_1 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_1.setPageContext(_jspx_page_context);
    _jspx_th_c_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_61);
    _jspx_th_c_param_1.setName("serviceId");
    _jspx_th_c_param_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.serviceId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_1 = _jspx_th_c_param_1.doStartTag();
    if (_jspx_th_c_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_1);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_1);
    return false;
  }

  private boolean _jspx_meth_c_if_21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_21 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_21.setPageContext(_jspx_page_context);
    _jspx_th_c_if_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_c_if_21.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.comment ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_21 = _jspx_th_c_if_21.doStartTag();
    if (_jspx_eval_c_if_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_if_21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_21);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_21);
    return false;
  }

  private boolean _jspx_meth_c_if_22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_22 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_22.setPageContext(_jspx_page_context);
    _jspx_th_c_if_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_c_if_22.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty request.requestInspectionResult.resultMessageList}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_22 = _jspx_th_c_if_22.doStartTag();
    if (_jspx_eval_c_if_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n                     <div id=\"viewRequestInspectionBlock_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"alert_message\" style=\"display:none;\">\n                     <ul>\n                      ");
        if (_jspx_meth_c_forEach_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_22, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\n                      </ul>\n                     </div>\n                     <a href=\"#\" id=\"viewRequestInspection_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"viewRequestInspectionLink hhButtonRed\" onclick=\"return false;\">info</a>\n                     ");
        int evalDoAfterBody = _jspx_th_c_if_22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_22);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_22);
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_22, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_22);
    _jspx_th_c_forEach_3.setVar("reqResultMsg");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.requestInspectionResult.resultMessageList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n                        <li>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reqResultMsg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</li>\n                      ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_url_62(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_62 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_62.setPageContext(_jspx_page_context);
    _jspx_th_c_url_62.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_c_url_62.setValue("/images/ajax-loader.gif");
    int _jspx_eval_c_url_62 = _jspx_th_c_url_62.doStartTag();
    if (_jspx_th_c_url_62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_62);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_62);
    return false;
  }

  private boolean _jspx_meth_c_if_23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_23 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_23.setPageContext(_jspx_page_context);
    _jspx_th_c_if_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_c_if_23.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.comment ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_23 = _jspx_th_c_if_23.doStartTag();
    if (_jspx_eval_c_if_23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("display:none;");
        int evalDoAfterBody = _jspx_th_c_if_23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_23);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_23);
    return false;
  }

  private boolean _jspx_meth_c_if_24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_24 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_24.setPageContext(_jspx_page_context);
    _jspx_th_c_if_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_c_if_24.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.comment eq null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_24 = _jspx_th_c_if_24.doStartTag();
    if (_jspx_eval_c_if_24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("display:none;");
        int evalDoAfterBody = _jspx_th_c_if_24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_24);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_24);
    return false;
  }

  private boolean _jspx_meth_mockey_fdate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mockey:fdate
    com.mockey.ui.tags.FriendlyDateTag _jspx_th_mockey_fdate_0 = (com.mockey.ui.tags.FriendlyDateTag) _jspx_tagPool_mockey_fdate_date_nobody.get(com.mockey.ui.tags.FriendlyDateTag.class);
    _jspx_th_mockey_fdate_0.setPageContext(_jspx_page_context);
    _jspx_th_mockey_fdate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_mockey_fdate_0.setDate((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.time}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_mockey_fdate_0 = _jspx_th_mockey_fdate_0.doStartTag();
    if (_jspx_th_mockey_fdate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mockey_fdate_date_nobody.reuse(_jspx_th_mockey_fdate_0);
      return true;
    }
    _jspx_tagPool_mockey_fdate_date_nobody.reuse(_jspx_th_mockey_fdate_0);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.requestorIP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_mockey_slug_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mockey:slug
    com.mockey.ui.tags.SlugTag _jspx_th_mockey_slug_0 = (com.mockey.ui.tags.SlugTag) _jspx_tagPool_mockey_slug_text_maxLength_nobody.get(com.mockey.ui.tags.SlugTag.class);
    _jspx_th_mockey_slug_0.setPageContext(_jspx_page_context);
    _jspx_th_mockey_slug_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_mockey_slug_0.setText((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.requestorIP}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_mockey_slug_0.setMaxLength(25);
    int _jspx_eval_mockey_slug_0 = _jspx_th_mockey_slug_0.doStartTag();
    if (_jspx_th_mockey_slug_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mockey_slug_text_maxLength_nobody.reuse(_jspx_th_mockey_slug_0);
      return true;
    }
    _jspx_tagPool_mockey_slug_text_maxLength_nobody.reuse(_jspx_th_mockey_slug_0);
    return false;
  }

  private boolean _jspx_meth_mockey_service_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mockey:service
    com.mockey.ui.tags.ServiceResponseTypeTag _jspx_th_mockey_service_0 = (com.mockey.ui.tags.ServiceResponseTypeTag) _jspx_tagPool_mockey_service_type_style_nobody.get(com.mockey.ui.tags.ServiceResponseTypeTag.class);
    _jspx_th_mockey_service_0.setPageContext(_jspx_page_context);
    _jspx_th_mockey_service_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_mockey_service_0.setStyle(1);
    _jspx_th_mockey_service_0.setType(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.serviceResponseType}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    int _jspx_eval_mockey_service_0 = _jspx_th_mockey_service_0.doStartTag();
    if (_jspx_th_mockey_service_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mockey_service_type_style_nobody.reuse(_jspx_th_mockey_service_0);
      return true;
    }
    _jspx_tagPool_mockey_service_type_style_nobody.reuse(_jspx_th_mockey_service_0);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${serviceUrl}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.serviceName}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_mockey_slug_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mockey:slug
    com.mockey.ui.tags.SlugTag _jspx_th_mockey_slug_1 = (com.mockey.ui.tags.SlugTag) _jspx_tagPool_mockey_slug_text_maxLength_nobody.get(com.mockey.ui.tags.SlugTag.class);
    _jspx_th_mockey_slug_1.setPageContext(_jspx_page_context);
    _jspx_th_mockey_slug_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_mockey_slug_1.setText((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.serviceName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_mockey_slug_1.setMaxLength(20);
    int _jspx_eval_mockey_slug_1 = _jspx_th_mockey_slug_1.doStartTag();
    if (_jspx_th_mockey_slug_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mockey_slug_text_maxLength_nobody.reuse(_jspx_th_mockey_slug_1);
      return true;
    }
    _jspx_tagPool_mockey_slug_text_maxLength_nobody.reuse(_jspx_th_mockey_slug_1);
    return false;
  }

  private boolean _jspx_meth_c_if_25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_25 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_25.setPageContext(_jspx_page_context);
    _jspx_th_c_if_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_c_if_25.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty request.originalUrlBeforeTwisting }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_25 = _jspx_th_c_if_25.doStartTag();
    if (_jspx_eval_c_if_25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n                     <a href=\"");
        if (_jspx_meth_c_url_63((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_25, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\"><b style=\"color:red;\">TWISTED!</b></a> <b>Original request:</b> <i>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.originalUrlBeforeTwisting}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" </i> \n                     ");
        int evalDoAfterBody = _jspx_th_c_if_25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_25);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_25);
    return false;
  }

  private boolean _jspx_meth_c_url_63(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_25, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_63 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_63.setPageContext(_jspx_page_context);
    _jspx_th_c_url_63.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_25);
    _jspx_th_c_url_63.setValue("/twisting/setup");
    int _jspx_eval_c_url_63 = _jspx_th_c_url_63.doStartTag();
    if (_jspx_th_c_url_63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_63);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_63);
    return false;
  }

  private boolean _jspx_meth_mockey_slug_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mockey:slug
    com.mockey.ui.tags.SlugTag _jspx_th_mockey_slug_2 = (com.mockey.ui.tags.SlugTag) _jspx_tagPool_mockey_slug_text_maxLength_nobody.get(com.mockey.ui.tags.SlugTag.class);
    _jspx_th_mockey_slug_2.setPageContext(_jspx_page_context);
    _jspx_th_mockey_slug_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_mockey_slug_2.setText((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.rawRequest}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_mockey_slug_2.setMaxLength(180);
    int _jspx_eval_mockey_slug_2 = _jspx_th_mockey_slug_2.doStartTag();
    if (_jspx_th_mockey_slug_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mockey_slug_text_maxLength_nobody.reuse(_jspx_th_mockey_slug_2);
      return true;
    }
    _jspx_tagPool_mockey_slug_text_maxLength_nobody.reuse(_jspx_th_mockey_slug_2);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n            <p class=\"info_message\">No history here. It's because no one talks to Mockey or someone just cleared the history. Mockey is feeling unwanted.</p>\n        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
