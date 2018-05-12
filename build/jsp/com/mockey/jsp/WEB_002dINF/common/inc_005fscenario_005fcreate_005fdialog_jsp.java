package com.mockey.jsp.WEB_002dINF.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inc_005fscenario_005fcreate_005fdialog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mockey_slug_text_maxLength_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mockey_slug_text_maxLength_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_mockey_slug_text_maxLength_nobody.release();
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

      out.write("\n\n\n\n<script>\n$(document).ready( function() {\n\t// SCENARIO CREATION JAVASCRIPT\n    $(\"#dialog-create-scenario\").dialog({\n        resizable: true,\n        width:800,\n        modal: true,\n        autoOpen: false\n    });\n    var name = $(\"#scenario_name\"),\n        match = $(\"#scenario_match\"),\n        match_evaluation_rules_flag = $('#scenario_match_evaluation_rules_flag'),\n        responsemsg = $(\"#scenario_response\"),\n        universal_error_scenario = $('#universal_error_scenario'),\n        scenario_response_header = $('#scenario_response_header'),\n        tag = $('#tag'),\n        hang_time = $('#hangtime'),\n        http_response_status_code = $('#http_response_status_code');\n        http_method_type = $('#http_method_type');\n        error_scenario = $('#error_scenario'),\n        allFields = $([]).add(name).add(match).add(match_evaluation_rules_flag).add(http_method_type).add(universal_error_scenario).add(error_scenario).add(responsemsg).add(tag).add(hang_time).add(http_response_status_code).add(scenario_response_header),\n");
      out.write("        tips = $(\".validateTips\");  \n    \n    function updateTips(t) {\n        tips\n            .text(t)\n            .addClass('ui-state-highlight');\n        setTimeout(function() {\n            tips.removeClass('ui-state-highlight', 1500);\n        }, 500);\n    }\n\n    function checkLength(o,n,min,max) {\n\n        if ( o.val().length > max || o.val().length < min ) {\n            o.addClass('ui-state-error');\n            updateTips(\"Length of \" + n + \" must be between \"+min+\" and \"+max+\".\");\n            return false;\n        } else {\n            return true;\n        }\n\n    }\n\n    function checkRegexp(o,regexp,n) {\n\n        if ( !( regexp.test( o.val() ) ) ) {\n            o.addClass('ui-state-error');\n            updateTips(n);\n            return false;\n        } else {\n            return true;\n        }\n\n    }\n    $('#toggleAdvancedScenarioCreateDetails').click ( function() {\n        $.each($('.js-showhide-scenario-create-details'), function() {\n\t\t\t$(this).toggle();\t\n\n\t\t});\t\n        return false;\n    });\n    \n    $('#prettyPrintMyJsonRules').click ( function() {\n");
      out.write("        var txt = $('#scenario_match').val();\n    \tvar pTxt = js_beautify(txt);\n    \t$('#scenario_match').val(pTxt);\n        return false;\n    });\n    \n    $('#prettyPrintMyJson').click ( function() {\n        var txt = $('#scenario_response').val();\n    \tvar pTxt = js_beautify(txt);\n    \t$('#scenario_response').val(pTxt);\n        return false;\n    });\n    \n    $('#prettyPrintMyHtml').click ( function() {\n        var txt = $('#scenario_response').val();\n    \tvar pTxt = style_html(txt);\n    \t$('#scenario_response').val(pTxt);\n        return false;\n    });\n    \n    $('.createScenarioLink').each( function() {\n        $(this).click( function() {\n        \t// Clear tips\n        \t$('#errorInfo').html('');\n            var serviceId = this.id.split(\"_\")[1];\n            // Clear input\n            var serviceName = $('#serviceName_'+serviceId).val();\n            $('#service-name-for-scenario').text(serviceName);\n            $('#scenario_name').val('');\n            $('#scenario_match').val('');\n            $('#scenario_match_evaluation_rules_flag').attr('checked', false),\n");
      out.write("            $('#scenario_response').val(''); \n            $('#scenario_response_header').val('');\n            $('#tag').val(''); \n            $('#hangtime').val(''); \n            $('#http_response_status_code').val('200');\n            $('#universal_error_scenario').attr('checked', false);\n            $('#error_scenario').attr('checked', false);\n            $('#dialog-create-scenario').dialog('open');\n                $('#dialog-create-scenario').dialog({\n                    buttons: {\n                      \"Create scenario\": function() {\n                           var bValid = true;  \n                           allFields.removeClass('ui-state-error');\n                           bValid = bValid && checkLength(name,\"scenario name\",3,1000);\n                           if (bValid) {\n                               $.post('");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("', { scenarioName: name.val(), serviceId: serviceId, tag: $('input[name=tag]').val(), hangTime: $('input[name=hangtime]').val(), \n                                    matchStringArg: match.val(), matchStringArgEvaluationRulesFlag: match_evaluation_rules_flag.is(':checked'),\n                                    responseMessage: responsemsg.val(), responseHeader: scenario_response_header.val(),\n                                    httpResponseStatusCode: http_response_status_code.val(),\n                                    httpMethodType: http_method_type.val(),\n                                    universalErrorScenario: universal_error_scenario.is(':checked'), \n                                    errorScenario: error_scenario.is(':checked')  } ,\n                                    function(data){\n                                        $(this).dialog('close');\n                                        document.location=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("?serviceId=\"+ serviceId;\n                                    }, 'json' );  \n                           }\n                      }, \n                      Cancel: function(){\n                          $(this).dialog('close');\n                      }\n                    }\n              }); \n              \n              return false;\n            });\n        });\n    \n    $('.viewServiceScenarioLink').each( function() {\n        $(this).click( function() {\n            var scenarioId = this.id.split(\"_\")[1];\n            var serviceId = this.id.split(\"_\")[2];\n            $.ajax({\n                type: \"GET\",\n                dataType: 'json',\n                url: \"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("?serviceId=\"+serviceId+\"&scenarioId=\"+scenarioId,\n                success: function(data) {\n                    $('#service-name-for-scenario').text(data.serviceName);\n                    $('#scenario_name').val(data.name);\n                    $('#scenario_match').val(data.match);\n                    $('#scenario_match_evaluation_rules_flag').attr('checked', data.matchRegexFlag);\n                    $('#tag').val(data.tag);\n                    $('#hangtime').val(data.hangtime);\n                    $('#scenario_response_header').val(data.responseHeader);\n                    $('#scenario_response').val(data.response); \n                    $('#error_scenario').attr('checked', data.scenarioErrorFlag);\n                    $('#universal_error_scenario').attr('checked', data.universalScenarioErrorFlag);\n                    $('#http_response_status_code').val(data.httpResponseStatusCode);\n                    $('#http_method_type').val(data.httpMethodType);\n                    $('#dialog-create-scenario').dialog('open');\n");
      out.write("                    $('#dialog-create-scenario').dialog({\n                        buttons: {\n                          \"Update scenario\": function() {\n                          \t   $('#errorInfo').html('');\n                               var bValid = true;  \n                               allFields.removeClass('ui-state-error');\n                               bValid = bValid && checkLength(name,\"scenario name\",3,1000);\n                               if (bValid) {\n                                   \n                                   $.post('");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("', { scenarioName: name.val(), serviceId: serviceId, scenarioId: scenarioId, hangTime: $('input[name=hangtime]').val(), \n                                        tag: $('input[name=tag]').val(), matchStringArg: match.val(), matchStringArgEvaluationRulesFlag: match_evaluation_rules_flag.is(':checked'), \n                                        responseHeader: scenario_response_header.val(), responseMessage: responsemsg.val(),\n                                        universalErrorScenario: universal_error_scenario.is(':checked'), httpResponseStatusCode: http_response_status_code.val(),\n                                        httpMethodType: http_method_type.val(),\n                                        errorScenario: error_scenario.is(':checked')  } ,function(data){\n                                               console.log(\"Saving data: \"+data);\n                                               $('#view-scenario_'+scenarioId+'_' +serviceId).fadeOut(function(){ $(this).text(name.val()).fadeIn() });\n                                               $('#updated').fadeIn('fast').animate({opacity: 1.0}, 300).fadeOut('fast');\n");
      out.write("                                        }, 'json' );  \n                                   return false;\n                               }\n                          }, \n                          \"Close\": function(){\n                              $(this).dialog('close');\n                          }\n                        }\n                  });       \n                }\n            });\n            return false;\n        });\n    });\n    \n    $('.save-as-a-service-scenario').button().click(function() {\n    \t// Clear tips\n        $('#errorInfo').html('');\n        var requestId = this.id.split(\"_\")[1];\n        // 1. Get the recorded conversation.\n        // 2. Populate the form with the data.\n        // 3. Save the scenario.\n        var serviceId; \n        var serviceName;\n        $.ajax({\n            type: 'GET',\n            dataType: 'json',\n            url: '");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("?&conversationRecordId='+requestId,\n            success: function(data) {\n              serviceId = data.serviceId;\n              serviceName = data.serviceName;\n              $('#service-name-for-scenario').text(serviceName);\n              $('#tag').val('');\n              $('#hangtime').val('');\n              $('#scenario_name').val('Give this a name');\n              $('#scenario_match').val('');\n              $('#scenario_response').val(data.responseBody); \n              $('#scenario_response_header').val(data.responseHeader);\n            }\n        });\n        \n        $('#dialog-create-scenario').dialog('open');\n            $('#dialog-create-scenario').dialog({\n                buttons: {\n                  \"Create scenario\": function() {\n                       var bValid = true;  \n                       \n                       allFields.removeClass('ui-state-error');\n                       bValid = bValid && checkLength(name,\"scenario name\",3,1000);\n                       if (bValid) {\n                           $.post('");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("', { \n                                scenarioName: name.val(), \n                                serviceId: serviceId, \n                                tag: $('input[name=tag]').val(), \n                                hangTime: $('input[name=hangtime]').val(), \n                                matchStringArg: match.val(), \n                                matchStringArgEvaluationRulesFlag: match_evaluation_rules_flag.val(), \n                                responseHeader: scenario_response_header.val(), \n                                responseMessage: responsemsg.val(), \n                                universalErrorScenario: universal_error_scenario.val(), \n                                httpResponseStatusCode: http_response_status_code.val(),\n                                httpMethodType: http_method_type.val(),\n                                errorScenario: error_scenario.val()  } ,\n                                function(data){\n                                    $(this).dialog('close');\n                                    document.location=\"");
      if (_jspx_meth_c_url_6(_jspx_page_context))
        return;
      out.write("?serviceId=\"+ serviceId;\n                                }, 'json' );  \n                       }\n                  }, \n                  Cancel: function(){\n                      $(this).dialog('close');\n                  }\n                }\n          }); \n          \n          return false;\n    });\n});\n</script>\n\n<div id=\"dialog-create-scenario\" title=\"Service Scenario\">\n    <div class=\"childform\">\n    <p id=\"errorInfo\" class=\"validateTips\"></p>\n    This scenario belongs to the service called: \n    <p class=\"big help_optional\" id=\"service-name-for-scenario\" style=\"text-align:center; padding: 0; margin: 0;\"></p>\n     \n    \n    <fieldset>\n        <hr />\n        <label for=\"scenario_name\" class=\"field-label-title\">Scenario Name*:</label>\n        <input type=\"text\" name=\"scenario_name\" placeholder=\"Provide a unique and descriptive name.\" id=\"scenario_name\" class=\"text ui-widget-content ui-corner-all\" />\n        <p class=\"field-label-helptxt\">\n        <strong>Required</strong>. Note: Scenarios will be listed alphabetically, so if you're going to use it often, label it accordingly. \n");
      out.write("        </p>\n        <hr />\n        <p>\n        <span style=\"float:right;\">Pretty format: \n        <a href=\"#\" class=\"blue\" id=\"prettyPrintMyHtml\">HTML</a>\n        <a href=\"#\" class=\"blue\" id=\"prettyPrintMyJson\">JSON</a></span>\n        <label for=\"scenario_response\" class=\"field-label-title\">Response Content*:</label>\n        </p>\n        <textarea placeholder=\"Copy/paste your desired response, be it HTML, JSON, XML, or whatever.\" name=\"scenario_response\" id=\"scenario_response\" class=\"text ui-widget-content ui-corner-all resizable\" rows=\"10\"></textarea>\n\t\t\t<p class=\"tinyfieldset info_message\">For information on these input fields, please read the <a href=\"");
      if (_jspx_meth_c_url_7(_jspx_page_context))
        return;
      out.write("\"><strong>Help</strong></a> section.</p>\n\t\t\t<p class=\"power-link tiny\"><a id=\"toggleAdvancedScenarioCreateDetails\" href=\"javascript:void(0)\"><span class=\"js-showhide-scenario-create-details\">Show Advanced</span><span style=\"display:none;\" class=\"js-showhide-scenario-create-details\" >Hide Advanced</span></a></p>\n\t\t\t<div style=\"display:none;\" class=\"js-showhide-scenario-create-details\">  \n\n        \n\t        <hr />\n\t        <p style=\"padding-bottom:25px;\">\n\t\t\t<span style=\"float:right;\">Pretty format: \n\t\t\t<a href=\"#\" class=\"blue\" id=\"prettyPrintMyJsonRules\">JSON</a></span>\n\t\t\t<label for=\"scenario_match\" class=\"field-label-title\">Match Argument:</label>\n\t\t\t</p>\n\t        <textarea  name=\"scenario_match\" id=\"scenario_match\" placeholder=\"Enter a text term for basic search e.g. 'abc' or use evaluation rules. See the help section for more information. \" class=\"text ui-widget-content ui-corner-all resizable\" rows=\"8\">\n\t        </textarea> \n\t        <p class=\"field-label-helptxt\">\n\t        \t<strong class=\"help_optional\">Optional.</strong>\n");
      out.write("\t        \t<input type=\"checkbox\" name=\"scenario_match_evaluation_rules_flag\" id=\"scenario_match_evaluation_rules_flag\"  value=\"true\" ></input> Enable evaluation rules. <br />\n\t        \tCheck the box if you want the match argument to be treated as <a href=\"");
      if (_jspx_meth_c_url_8(_jspx_page_context))
        return;
      out.write("\">evaluation</a> rules. Leaving the box unchecked will\n\t        result in a very basic text search, but please read the <a href=\"");
      if (_jspx_meth_c_url_9(_jspx_page_context))
        return;
      out.write("\">beware</a> section before moving forward.\n\t        </p>\n\t        \n\t        \n\t        <hr />\n\t        <label for=\"tag\" class=\"field-label-title\">Tag(s):</label> \n\t        <input type=\"text\" name=\"tag\" id=\"tag\" class=\"text ui-widget-content ui-corner-all\" placeholder=\"Enter tags here.\" />\n\t        <p class=\"field-label-helptxt\">\n\t        <strong class=\"help_optional\">Optional.</strong> Comma seperated tags. Examples 'release-123', 'qa', 'iphone', 'android'\n\t        </p>\n\t        \n\t        <hr />\n\t        <label for=\"hangtime\" class=\"field-label-title\">Hangtime:</label> \n\t        <input type=\"number\" name=\"hangtime\" id=\"hangtime\" class=\"text ui-widget-content ui-corner-all\" placeholder=\"Enter hangtime here.\" />\n\t        <p class=\"field-label-helptxt\">\n\t        <strong class=\"help_optional\">Optional.</strong> The delay time in milliseconds. Mockey will wait for this long before returning this scenario. If a valid value is provided, then it will override the hang time value\n\t        defined in this Scenario's Service definition. \n");
      out.write("\t        </p>\n\t        \n\t        \n\t        <hr />\n\t        <label for=\"http_response_status_code\" class=\"field-label-title\">HTTP Method Type</label>\n\t        <div style=\"padding:1em 0 1em 0\">\n\t        <select class=\"text ui-widget-content ui-corner-all\" id=\"http_method_type\" name=\"http_method_type\" >\n\t         <option class=\"text ui-widget-content\" value=\"\">&#42;</option>\n\t         <option class=\"text ui-widget-content\" value=\"GET\">GET</option>\n\t         <option class=\"text ui-widget-content\" value=\"PUT\">PUT</option>\n\t         <option class=\"text ui-widget-content\" value=\"POST\">POST</option>\n\t         <option class=\"text ui-widget-content\" value=\"DELETE\">DELETE</option>\n\t        </select>\n\t        </div>\n\t        <p class=\"field-label-helptxt\"> \n\t        <strong class=\"help_optional\">Optional.</strong> This is helpful when you want to ensure your RESTful request (e.g. GET, POST, PUT, DELETE) \n\t        is tied to the right scenario. By default, set to &#42;, which means any HTTP method type will do.\n\t        </p>\n");
      out.write("\t        \n\t        \n\t        <hr />\n\t        <label for=\"http_response_status_code\" class=\"field-label-title\">HTTP Response Status:</label>\n\t        <div style=\"padding:1em 0 1em 0\">\n\t        <select class=\"text ui-widget-content ui-corner-all\" id=\"http_response_status_code\" name=\"http_response_status_code\" >\n\t        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n\t        </select>\n\t        </div>\t \n\t        <p class=\"field-label-helptxt\">\n\t        <strong class=\"help_optional\">Optional.</strong> By default, this will be set to 200. This is helpful when you need to validate how your code handles 500, 302, 404, and more.\n\t        </p>\n\t        \n\t        \n\t        <hr />     \n\t\t    <div>\n\t\t\t    <p style=\"padding-bottom:25px;\">\n\t\t\t    <label for=\"scenario_header_name\" class=\"field-label-title\">HTTP Header Fields:</label>\n\t\t\t    <p>\n\t\t\t    <textarea name=\"scenario_response_header\" id=\"scenario_response_header\" class=\"text ui-widget-content ui-corner-all resizable\" rows=\"5\"></textarea>\n\t\t\t    <p><strong class=\"help_optional\">Optional.</strong> Feel free to leave this empty, but just in case your app needs to parse some header information, this is where you hook it in. \n\t\t\t    </p>\n\t\t\t    <p class=\"field-label-helptxt\">\n\t\t\t    \t<strong>Note:</strong> \n\t\t\t    \tField name and value pairs are pipe '|' delimited. Mockey will parse this input and set things accordingly. Example:\n");
      out.write("\t\t\t    \t<br />\n\t\t\t\t    <span style=\"margin-left:50px;\" class=\"code_text\">Content-Type: text/html; charset=utf-8 <strong>|</strong> Cache-Control: max-age=3600</span><br />... will result in:\n\t\t\t\t    <br />\n\t\t\t\t    <span style=\"margin-left:50px;\" class=\"code_text\">\n\t\t\t\t    Content-Type: text/html;\n\t\t\t\t    </span>\n\t\t\t\t    <span style=\"margin-left:50px;\" class=\"code_text\">\n\t\t\t\t    <br />\n\t\t\t\t    Cache-Control:  max-age=3600\n\t\t\t\t   \t</span>\n\t\t\t\t   \t<br /><br />\n\t\t\t   \t\tFor more information, see: <a href=\"http://en.wikipedia.org/wiki/List_of_HTTP_header_fields\">http://en.wikipedia.org/wiki/List_of_HTTP_header_fields</a>\n\t\t\t   \t</p>\n\t        </div>\n\t        \n\t        \n\t        <hr />\n\t        <div>\n\t        <label class=\"field-label-title\">Error Handling:</label>\n\t        <p style=\"padding-top:5px;\">\n\t                <input type=\"checkbox\" name=\"universal_error_scenario\" id=\"universal_error_scenario\" value=\"true\">Universal Error Response</input>\n\t                <br />\n\t                <input type=\"checkbox\" name=\"error_scenario\" id=\"error_scenario\" value=\"true\">Service Scenario Error Response</input>\n");
      out.write("\t\t\t</p>\t       \n\t\t\t<p class=\"field-label-helptxt\">\n\t\t\t<strong class=\"help_optional\">Optional.</strong> This let's Mockey know what to do when things go wrong. See the <a href=\"");
      if (_jspx_meth_c_url_10(_jspx_page_context))
        return;
      out.write("\">Help</a> section for more insight.\n\t\t\t</p>         \n\t        </div>\n        </div>\n    </fieldset> \n    \n    </div>\n</div>\n");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/scenario");
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
    _jspx_th_c_url_1.setValue("/home");
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
    _jspx_th_c_url_2.setValue("/view/scenario");
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
    _jspx_th_c_url_3.setValue("/scenario");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
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
    _jspx_th_c_url_4.setValue("/conversation/record");
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
    _jspx_th_c_url_5.setValue("/scenario");
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
    _jspx_th_c_url_6.setValue("/home");
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
    _jspx_th_c_url_7.setValue("/help#scenario");
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
    _jspx_th_c_url_8.setValue("/help#evaluation_rules_api");
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
    _jspx_th_c_url_9.setValue("/help#beware_of_match");
    int _jspx_eval_c_url_9 = _jspx_th_c_url_9.doStartTag();
    if (_jspx_th_c_url_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("httpRespCode");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${httpRespCodeList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n\t         <option class=\"text ui-widget-content\" value=\"");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write('"');
          out.write('>');
          if (_jspx_meth_mockey_slug_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</option>\n\t        ");
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
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${httpRespCode.code}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_mockey_slug_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mockey:slug
    com.mockey.ui.tags.SlugTag _jspx_th_mockey_slug_0 = (com.mockey.ui.tags.SlugTag) _jspx_tagPool_mockey_slug_text_maxLength_nobody.get(com.mockey.ui.tags.SlugTag.class);
    _jspx_th_mockey_slug_0.setPageContext(_jspx_page_context);
    _jspx_th_mockey_slug_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_mockey_slug_0.setText((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${httpRespCode.text}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_mockey_slug_0.setMaxLength(90);
    int _jspx_eval_mockey_slug_0 = _jspx_th_mockey_slug_0.doStartTag();
    if (_jspx_th_mockey_slug_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mockey_slug_text_maxLength_nobody.reuse(_jspx_th_mockey_slug_0);
      return true;
    }
    _jspx_tagPool_mockey_slug_text_maxLength_nobody.reuse(_jspx_th_mockey_slug_0);
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
    _jspx_th_c_url_10.setValue("/help#scenario");
    int _jspx_eval_c_url_10 = _jspx_th_c_url_10.doStartTag();
    if (_jspx_th_c_url_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
    return false;
  }
}
