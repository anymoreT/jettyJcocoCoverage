package com.mockey.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(7);
    _jspx_dependants.add("/WEB-INF/common/message.jsp");
    _jspx_dependants.add("/WEB-INF/tags/conflictFlag.tag");
    _jspx_dependants.add("/WEB-INF/tags/statusCheckByService.tag");
    _jspx_dependants.add("/WEB-INF/tags/serviceInServicePlanFlag.tag");
    _jspx_dependants.add("/WEB-INF/tags/statusCheckByServicePlan.tag");
    _jspx_dependants.add("/WEB-INF/tags/editServiceLink.tag");
    _jspx_dependants.add("/WEB-INF/tags/statusCheckByScenario.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mockey_message_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_escapeXml_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_remove_var_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_param_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mockey_service_type_serviceId_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mockey_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mockey_url_value_breakpoint_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items_begin;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mockey_message_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_escapeXml_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_remove_var_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_var_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mockey_service_type_serviceId_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mockey_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_mockey_url_value_breakpoint_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_mockey_message_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_escapeXml_nobody.release();
    _jspx_tagPool_c_remove_var_scope_nobody.release();
    _jspx_tagPool_c_url_var_value.release();
    _jspx_tagPool_c_param_value_name_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_mockey_service_type_serviceId_nobody.release();
    _jspx_tagPool_c_when_test_nobody.release();
    _jspx_tagPool_mockey_url_value_nobody.release();
    _jspx_tagPool_mockey_url_value_breakpoint_nobody.release();
    _jspx_tagPool_c_forEach_varStatus_var_items_begin.release();
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

      out.write("\n\n\n\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/common/header.jsp", out, false);
      out.write("\n<script>\n$(document).ready( function() {\n\t\n\t// When user clicks browser 'back' or 'forward', we\n\t// force a reload to ensure we see up-to-date view\n\twindow.onpopstate = function(e){\n\t   window.location.reload(false); \n\t};\n\t\n\t$('#tabs').tabs().hide();\n\t$('#tabs:not(:first)').hide();\n    $('#tabs:first').fadeIn('slow');\n\t\n    $('.invisible-focusable').addClass(\"invisiblefield\");  \n\t$('.invisible-focusable').focus(function() {  \n        $(this).removeClass(\"invisiblefield\").addClass(\"invisiblefiled-in-focus\");  \n    });  \n\t$('.invisible-focusable').blur(function() {  \n        $(this).removeClass(\"invisiblefiled-in-focus\").addClass(\"invisiblefield\");   \n    });\n    \n    $('.toggle-filter-view').each( function() {\n        $(this).click( function() {\n        \t$('#filter_view_div').toggle();\n        \t$('.filter-toggle-txt').toggle();\n        });\n     });\n     \n     $('.toggle-service-meta-data').each( function() {\n        $(this).click( function() {\n        \t$('.service-meta-data').toggle();\n        });\n     });\n     \n");
      out.write("    \n    $('.manageTagLink').each( function() {\n        $(this).click( function() {             \n            $('#dialog-tag-manage').dialog('open');\n                $('#dialog-tag-manage').dialog({ \n                    buttons: {                      \n                      Cancel: function(){\n                          $(this).dialog('close');\n                      }\n                    }\n              }); \n              // Reset the size.\n              $('#dialog-tag-manage').dialog({height: 350 });\n                \n              return false;\n            });\n        });\n    \n\t$('.createPlanLink').each( function() {\n        $(this).click( function() {      \n            $('#dialog-create-plan').dialog({height: 250, modal: true});       \n            $('#dialog-create-plan').dialog('open');\n                $('#dialog-create-plan').dialog({ \n                    buttons: {\n                      \"Create plan\": function() {\n                           var bValid = true;  \n                           if (bValid) {\n                        \t   var servicePlanName = $('input[name=service_plan_name]').val();  \n");
      out.write("                        \t   var servicePlanTag = $('input[name=service_plan_tag]').val();  \n                        \t   $.post('");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("', { action: 'save_plan', service_plan_name: servicePlanName, service_plan_tag:servicePlanTag } ,function(data){\n                                   if(data.result.success && data.result.planid){\n                                       //$('#updated').fadeIn('fast').animate({opacity: 1.0}, 300).fadeOut('fast'); \n                                       // We redirect here. Because appending HTML would require we append this \n                                       // click function, (which appends to itself, not good). Looping here.\n                                       // We redirect for now. \n                                       $(this).dialog('close');              \n                                       document.location=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\"; \n                                       \n                                    }\n                            }, 'json' );\n                               \n                           }\n                      }, \n                      Cancel: function(){\n                          $(this).dialog('close');\n                      }\n                    }\n              }); \n              return false;\n            });\n        });\n\t\n\t$('.delete-plan').each( function() {\n\t\t$(this).click( function() {\n\t\t\tvar planId = this.id.split(\"_\")[1];\n\t\t\t$('#dialog-delete-service-plan-confirm').dialog({height: 200, modal: true });\n\t\t\t$('#dialog-delete-service-plan-confirm').dialog('open');\n            $('#dialog-delete-service-plan-confirm').dialog({\n                buttons: {\n                  \"Delete Plan\": function() {\n                      // Post the DELETE call.  \n                      $.post('");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("', { action: 'delete_plan', plan_id: planId } ,function(data){\n\t\t\t                   if(data.result.success){\n\t\t\t                       $('#deleted').fadeIn('fast').animate({opacity: 1.0}, 300).fadeOut('fast'); \n\t\t\t                       $('#plan_'+planId).hide();\n\t\t\t                    }\n\t\t\t            }, 'json' );\n                      $(this).dialog('close');                      \n                  }, \n                  Cancel: function(){\n                      $(this).dialog('close');\n                  }\n                }\n          });   \n          return false;\n\t\t});\n\t});\n\n\t$('.set-plan').each( function() {\n\t\t$(this).click( function() {\n\t\t\tvar planId = this.id.split(\"_\")[1];\n\t\t\t$.post('");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("', { action: 'set_plan', plan_id: planId, type: 'redirect' } ,function(data){\n\t\t\t\t  \n\t\t\t\t   if(data.result.success){\n\t\t\t\t       //Send the plan ID to highlight the Services included in the plan.\n\t\t\t\t\t   document.location=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("?plan_id=\"+planId; \n\t\t\t\t    }\n\t\t\t}, 'json' );\n\t\t\t\n\t\t});\n\t});\n\n\n\t$('.save-plan').each( function() {\n        $(this).click( function() {\n            var planId = this.id.split(\"_\")[1];\n            var servicePlanName = $('input[name=servicePlanName_'+planId+']').val();\n\t\t\tvar serviceIds = new Array();\n\t\t\t    $.each($('input:checkbox[name=service_plan_include_checkbox]:checked'), function() {\n\t\t\t    \tserviceIds.push($(this).val());\n\t\t\t       \n\t\t\t    });\n            $.post('");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("', { action: 'save_plan', plan_id: planId, service_plan_name: servicePlanName, type: 'json', 'service_ids[]': serviceIds} ,function(data){\n                  \n                   if(data.result.success){\n                       $('#updated').fadeIn('fast').animate({opacity: 1.0}, 300).fadeOut('fast');\n                    }\n            }, 'json' );\n            return false;\n        });\n    });\n    \n    $('.save-as-default-plan').each( function() {\n        $(this).click( function() {\n            \n            var planId = this.id.split(\"_\")[1];\n            if($(this).hasClass(\"response_green\")) {\n            \t$.post('");
      if (_jspx_meth_c_url_6(_jspx_page_context))
        return;
      out.write("', { action: 'set_as_default_plan', plan_id: 'none', type: 'json'} ,function(data){\n\t                   if(data.result.success){\n\t                       $('#updated').fadeIn('fast').animate({opacity: 1.0}, 300).fadeOut('fast');\n\t                       $('#save-as-default-plan_'+planId).removeClass(\"response_green\").addClass(\"response_not\");\n\t                       $('#not-service-plan_'+planId).show();\n\t                       $('#yes-service-plan_'+planId).hide();\n\t                    }\n\t            }, 'json' );\n\t            return false;\n            }else {\n            \n\t            $.post('");
      if (_jspx_meth_c_url_7(_jspx_page_context))
        return;
      out.write("', { action: 'set_as_default_plan', plan_id: planId, type: 'json'} ,function(data){\n\t            \n\t                   if(data.result.success){\n\t                       $('#updated').fadeIn('fast').animate({opacity: 1.0}, 300).fadeOut('fast');\n\t                       $('.save-as-default-plan').each( function() {\n\t                       \t\t$(this).removeClass(\"response_green\").addClass(\"response_not\");\n\t                       });\n\t                       $('#save-as-default-plan_'+planId).removeClass(\"response_not\").addClass(\"response_green\");\n\t                       $('.not-service-plan').each( function() {\n\t                       \t\t$(this).show();\n\t                       });\n\t                        $('.yes-service-plan').each( function() {\n\t                       \t\t$(this).hide();\n\t                       });\n\t                       $('#not-service-plan_'+planId).hide();\n\t                       $('#yes-service-plan_'+planId).show();\n\t                    }\n\t            }, 'json' );\n\t            return false;\n\t        }\n");
      out.write("            \n            \n        });\n    });\n\n\t\n    $('.tiny_service_delete').each( function() {\n        $(this).click( function() {\n            var serviceId = this.id.split(\"_\")[1];\n            $('#dialog-delete-service-confirm').dialog({modal: true, height: 200 });\n            $('#dialog-delete-service-confirm').dialog('open');\n\t            $('#dialog-delete-service-confirm').dialog({\n\t                \n\t                buttons: {\n\t                  \"Delete service\": function() {\n\t            \t      document.location=\"");
      if (_jspx_meth_c_url_8(_jspx_page_context))
        return;
      out.write("?deleteService=yes&serviceId=\"+ serviceId;\n\t                  }, \n\t                  Cancel: function(){\n\t\t                  $(this).dialog('close');\n\t                  }\n\t                }\n\t          });     \n\t          return false;\n            });\n        });\n    \n     $('.tiny_service_duplicate').each( function() {\n        $(this).click( function() {\n            var serviceId = this.id.split(\"_\")[1];\n            $('#dialog-duplicate-service-confirm').dialog({height: 200, modal: true });\n            $('#dialog-duplicate-service-confirm').dialog('open');\n\t            $('#dialog-duplicate-service-confirm').dialog({\n\t                buttons: {\n\t                  \"Duplicate service\": function() {\n\t            \t      document.location=\"");
      if (_jspx_meth_c_url_9(_jspx_page_context))
        return;
      out.write("?duplicateService=yes&serviceId=\"+ serviceId;\n\t                  }, \n\t                  Cancel: function(){\n\t\t                  $(this).dialog('close');\n\t                  }\n\t                }\n\t          });  \n\t          return false;\n            });\n        });\n\n    \n    \n    $('.deleteScenarioLink').each( function() {\n        $(this).click( function() {\n        \tvar scenarioId = this.id.split(\"_\")[1];\n            var serviceId = this.id.split(\"_\")[2];\n            $('#dialog-delete-scenario-confirm').dialog({height: 200, modal: true });\n            $('#dialog-delete-scenario-confirm').dialog('open');\n                $('#dialog-delete-scenario-confirm').dialog({\n                    buttons: {\n                      \"Delete scenario\": function() {\n                          // Post the DELETE call.  \n                    \t  $.post('");
      if (_jspx_meth_c_url_10(_jspx_page_context))
        return;
      out.write("', {serviceId: serviceId, deleteScenario: 'yes', scenarioId: scenarioId},\n                                  function(data) {}, 'json');\n                          // Hide the info. \n                          $('#service-scenario-info_'+scenarioId + '_'+ serviceId ).hide();\n                          $(this).dialog('close');\n                          $('#deleted').fadeIn('fast').animate({opacity: 1.0}, 300).fadeOut('fast'); \n                          \n                      }, \n                      Cancel: function(){\n                          $(this).dialog('close');\n                      }\n                    }\n              }); \n              return false;\n            });\n        });\n    \n    $('.allresponsetype').each( function() {\n        $(this).click(function(){   \n          var response_type = this.id.split(\"_\")[1]; \t\n          //console.log(\"response type: \"+response_type);\n          $.post('");
      if (_jspx_meth_c_url_11(_jspx_page_context))
        return;
      out.write("', { responseType: response_type, all: true } ,function(data){\n\t\t\t\t\t   //console.log(data);\n\t\t\t\t\t   if(data.result.success){\n\t\t\t\t\t\t   document.location=\"");
      if (_jspx_meth_c_url_12(_jspx_page_context))
        return;
      out.write("\";\n\t\t\t\t\t    }\n\t\t\t\t}, 'json' );\n        });\n     });\n\n    \n    $('.service-view-master-link').each( function() {\n        $(this).click(function(){   \n          var serviceId = this.id.split(\"_\")[1]; \t\n          $(\".parentform\").removeClass(\"parentformselected\");\n    \t  $(\"#parentform_\"+serviceId).addClass(\"parentformselected\");\n    \t  \n    \t  // We push the new URL, to ensure the user returns \n    \t  // to this view and is forced a reload (see 'onpopstate')\n    \t  // when user uses 'back/forward' browser controls. \n    \t  window.history.pushState('page2', document.title, window.location.pathname + '?serviceId='+serviceId);\n    \t  \n        });\n     });\n    \n   $('.service-scenario-tag-remove').each( function() {\n        $(this).click( function() {\n            var scenarioId = this.id.split(\"_\")[1];\n\t\t\tvar serviceId = this.id.split(\"_\")[2];\n\t\t\tvar tagCount= this.id.split(\"_\")[3];\n\t\t\tvar tagId = 'service-scenario-tag-id_'+scenarioId+'_'+serviceId+'_'+tagCount;\n\t\t\tvar filterTag = $('#'+tagId).attr('value');\n            $.post('");
      if (_jspx_meth_c_url_13(_jspx_page_context))
        return;
      out.write("', { action: 'delete_tag_from_scenario', tag: filterTag, scenarioId: scenarioId, serviceId: serviceId } ,function(data){\n\t\t\t\t\t   if(data.success){\n\t\t\t\t\t\t   $('#'+tagId).hide();\n        \t\t\t\t   $('#updated').fadeIn('fast').animate({opacity: 1.0}, 300).fadeOut('fast');\n\t\t\t\t\t    }else {\n\t\t\t\t\t       alert(\"Hmm...\");\n\t\t\t\t\t    }\n\t\t\t\t}, 'json' );\n        \t\n        });\n   });\n    $('.service-plan-tag-remove').each( function() {\n        $(this).click( function() {\n            var servicePlanId = this.id.split(\"_\")[1];\n\t\t\tvar tagCount= this.id.split(\"_\")[2];\n\t\t\tvar tagId = 'service-plan-tag-id_'+servicePlanId+'_'+tagCount;\n\t\t\tvar filterTag = $('#'+tagId).attr('value');\n            $.post('");
      if (_jspx_meth_c_url_14(_jspx_page_context))
        return;
      out.write("', { action: 'delete_tag_from_service_plan', tag: filterTag, servicePlanId: servicePlanId } ,function(data){\n\t\t\t\t\t   if(data.success){\n\t\t\t\t\t\t   $('#'+tagId).hide();\n        \t\t\t\t   $('#updated').fadeIn('fast').animate({opacity: 1.0}, 300).fadeOut('fast');\n\t\t\t\t\t    }else {\n\t\t\t\t\t       alert(\"Hmm...\");\n\t\t\t\t\t    }\n\t\t\t\t}, 'json' );\n        \t\n        });\n   });\n   $('.service-tag-remove').each( function() {\n        $(this).click( function() {\n            var serviceId = this.id.split(\"_\")[1];\n\t\t\tvar tagCount= this.id.split(\"_\")[2];\n\t\t\tvar view= this.id.split(\"_\")[3];\n\t\t\tvar tagId = 'service-tag-id_'+serviceId+'_'+tagCount;\n\t\t\tvar filterTag = $(this).attr('value');\n            $.post('");
      if (_jspx_meth_c_url_15(_jspx_page_context))
        return;
      out.write("', { action: 'delete_tag_from_service', tag: filterTag, serviceId: serviceId } ,function(data){\n\t\t\t\t\t   if(data.success){\n\t\t\t\t\t\t   $('#'+tagId+'_detail').hide();\n\t\t\t\t\t\t   $('#'+tagId+'_master').hide();\n        \t\t\t\t   $('#updated').fadeIn('fast').animate({opacity: 1.0}, 300).fadeOut('fast');\n\t\t\t\t\t    }else {\n\t\t\t\t\t       alert(\"Hmm...\");\n\t\t\t\t\t    }\n\t\t\t\t}, 'json' );\n        \t\n        });\n   });\n       \n   $('.service-lastvisit-remove').each( function() {\n        $(this).click( function() {\n            var serviceId = this.id.split(\"_\")[1];\n            $.post('");
      if (_jspx_meth_c_url_16(_jspx_page_context))
        return;
      out.write("', { action: 'clear_last_visit', serviceId: serviceId } ,function(data){\n\t\t\t\t\t   if(data.success){\n\t\t\t\t\t       $('#remove-service-last_'+serviceId+'_detail').hide();\n\t\t\t\t\t       $('#remove-service-last_'+serviceId+'_master').hide();\n        \t\t\t\t   $('#updated').fadeIn('fast').animate({opacity: 1.0}, 300).fadeOut('fast');\n\t\t\t\t\t    }else {\n\t\t\t\t\t       alert(\"Hmm...\");\n\t\t\t\t\t    }\n\t\t\t\t}, 'json' );\n        \t\n        });\n   });\n   $('.scenario-lastvisit-remove').each( function() {\n        $(this).click( function() {\n            var scenarioId = this.id.split(\"_\")[1];\n            var serviceId = this.id.split(\"_\")[2];\n            $.post('");
      if (_jspx_meth_c_url_17(_jspx_page_context))
        return;
      out.write("', { action: 'clear_last_visit', serviceId: serviceId, scenarioId: scenarioId } ,function(data){\n\t\t\t\t\t   if(data.success){\n\t\t\t\t\t       $('#remove-scenario-last_'+scenarioId+'_'+serviceId).hide();\n        \t\t\t\t   $('#updated').fadeIn('fast').animate({opacity: 1.0}, 300).fadeOut('fast');\n\t\t\t\t\t    }else {\n\t\t\t\t\t       alert(\"Hmm...\");\n\t\t\t\t\t    }\n\t\t\t\t}, 'json' );\n        \t\n        });\n   });\n   $('.service-plan-lastvisit-remove').each( function() {\n        $(this).click( function() {\n            var servicePlanId = this.id.split(\"_\")[1];\n            $.post('");
      if (_jspx_meth_c_url_18(_jspx_page_context))
        return;
      out.write("', { action: 'clear_last_visit', servicePlanId: servicePlanId } ,function(data){\n\t\t\t\t\t   if(data.success){\n\t\t\t\t\t       $('#remove-service-plan-last_'+servicePlanId).hide();\n        \t\t\t\t   $('#updated').fadeIn('fast').animate({opacity: 1.0}, 300).fadeOut('fast');\n\t\t\t\t\t    }else {\n\t\t\t\t\t       alert(\"Hmm...\");\n\t\t\t\t\t    }\n\t\t\t\t}, 'json' );\n        \t\n        });\n   });\n    $('.serviceScenarioResponseTypeLink').each( function() {\n\t\t$(this).click( function() {\n\t\t\tvar scenarioId = this.id.split(\"_\")[1];\n\t\t\tvar serviceId = this.id.split(\"_\")[2];\n\t\t\t\n\t\t\t$.ajax({\n\t\t\t\ttype: \"POST\",\n\t\t\t\turl: \"");
      if (_jspx_meth_c_url_19(_jspx_page_context))
        return;
      out.write("\",\n\t\t\t\tdata:\"scenarioId=\"+scenarioId+\"&serviceId=\"+serviceId\n\t\t\t});\n\t\t\t$(\".scenariosByServiceId-on_\"+serviceId).hide();\n\t\t\t$(\".scenariosByServiceId-off_\"+serviceId).show();\n\t\t\t$(\"#serviceScenarioOFF_\"+scenarioId+\"_\"+serviceId).hide();\n\t\t\t$(\"#serviceScenarioON_\"+scenarioId+\"_\"+serviceId).show();\n\t\t\t$('#updated').fadeIn('fast').animate({opacity: 1.0}, 300).fadeOut('fast');\n\t\t});\n\t});\n    \n    $('.serviceResponseTypeLink').each( function() {\n\t\t$(this).click( function() {\n\t\t\tvar responseType = this.id.split(\"_\")[1];\n\t\t\tvar serviceId = this.id.split(\"_\")[2];\n\t\t\t$.ajax({\n\t\t\t\ttype: \"POST\",\n\t\t\t\turl: \"");
      if (_jspx_meth_c_url_20(_jspx_page_context))
        return;
      out.write("\",\n\t\t\t\tdata:\"serviceResponseType=\"+responseType+\"&serviceId=\"+serviceId\n\t\t\t});\n                 \n\t\t\t$('.serviceResponseType_0_'+serviceId).removeClass(\"response_set\").addClass(\"response_not\");\n\t\t\t$('.serviceResponseType_1_'+serviceId).removeClass(\"response_set\").addClass(\"response_not\");\n\t\t\t$('.serviceResponseType_2_'+serviceId).removeClass(\"response_set\").addClass(\"response_not\");\n\t\t\t\n\t\t\t$('#staticScenario_'+serviceId).removeClass(\"show\").addClass(\"hide\");\n\t\t\t$('#proxyScenario_'+serviceId).removeClass(\"show\").addClass(\"hide\");\n\t\t\t$('#dynamicScenario_'+serviceId).removeClass(\"show\").addClass(\"hide\");\n\t\t\t\n\t\t\tif(responseType == 0){\n\t\t\t\t$('.serviceResponseType_0_'+serviceId).removeClass(\"response_not\").addClass(\"response_set\");\n\t\t\t\t$('#proxyScenario_'+serviceId).addClass(\"show\");\n\t\t\t}else if(responseType == 1){\n\t\t\t\t$('.serviceResponseType_1_'+serviceId).removeClass(\"response_not\").addClass(\"response_set\");\n\t\t\t\t$('#staticScenario_'+serviceId).addClass(\"show\");\n\t\t\t}else if(responseType == 2){\n\t\t\t\t$('.serviceResponseType_2_'+serviceId).removeClass(\"response_not\").addClass(\"response_set\");\n");
      out.write("\t\t\t\t$('#dynamicScenario_'+serviceId).addClass(\"show\");\n\t\t\t}\n\t\t\t$('#updated').fadeIn('fast').animate({opacity: 1.0}, 300).fadeOut('fast');\n\t\t});\n\t});\n\n    $('#dialog').dialog({ autoOpen: false, minHeight: 300, width:700, height:500, modal: true });\n    $('#dialog-delete-service-plan-confirm').dialog({autoOpen: false, height: 150, resizable: false });\n    $('#dialog-delete-scenario-confirm').dialog({autoOpen: false, minHeight: 250, width: 300, height: 120, modal: false, resizable: false });\n    $(\"#dialog-create-plan\").dialog({minHeight: 350, height:350, width: 500,  modal: false, autoOpen: false, resizable: true });\n    $(\"#dialog-delete-service-confirm\").dialog({ resizable: false, height: 120, modal: false, autoOpen: false });\n    $(\"#dialog-duplicate-service-confirm\").dialog({ resizable: false, height: 120, modal: false, autoOpen: false });\n    $(\"#dialog-tag-manage\").dialog({ resizable: false, height: 420, minHeight: 450, modal: true, autoOpen: false });\n    $('.hideServiceScenarioLink').each( function() {\n        $(this).click( function() {\n");
      out.write("           \n        });\n    });\n    $(\"#servicePlanSetMessgeLink\").click( function() {\n    \t$(\"#servicePlanSetMessge\").hide();\n    \treturn false;\n    });\n    \n    $(\"#filter-tag-button\").click( function() {\n           var filterTag = $('#filter-tag').val();\n           $.post('");
      if (_jspx_meth_c_url_21(_jspx_page_context))
        return;
      out.write("', { action: 'filter_tag_on', tag: filterTag } ,function(data){\n\t\t\t\t\t   //console.log(data);\n\t\t\t\t\t   if(data.success){\n\t\t\t\t\t\t   document.location=\"");
      if (_jspx_meth_c_url_22(_jspx_page_context))
        return;
      out.write("\";\n\t\t\t\t\t    }else {\n\t\t\t\t\t       alert(\"Hmm...\");\n\t\t\t\t\t    }\n\t\t\t\t}, 'json' );\n           \n        });\n   \n    $(\"#delete-tag-button\").click( function() {\n    \t   var filterTag = $('#filter-tag').val();\n           $.post('");
      if (_jspx_meth_c_url_23(_jspx_page_context))
        return;
      out.write("', { action: 'delete_tag_from_store', tag: filterTag } ,function(data){\n\t\t\t\t\t   //console.log(data);\n\t\t\t\t\t   if(data.success){\n\t\t\t\t\t\t   document.location=\"");
      if (_jspx_meth_c_url_24(_jspx_page_context))
        return;
      out.write("\";\n\t\t\t\t\t    }else {\n\t\t\t\t\t       alert(\"Hmm...\");\n\t\t\t\t\t    }\n\t\t\t\t}, 'json' );\n        });\n            \n });\n</script>\n    <div id=\"main\">\n\n\t<div id=\"filter_view_div\">\n    \n\t\t<span class=\"basic_label\">Filter services with tags</span> (<span class=\"power-link tiny\"><a href=\"javascript:void(0);\" class=\"manageTagLink \">Tag Helper</a></span>):\n\n\t\t\n\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n\n\t\t<br />\n\t\t\n\t\t<div style=\"margin-top:5px;\">\n\t\t\t  <input type=\"text\" style=\"width:80%;\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${term}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Service name, scenario name, or mock url\" class=\"text ui-corner-all ui-widget-content\" name=\"search_term\" id=\"search_term\">\n\t\t\t  <button class=\"hhButton\" id=\"search_me\" style=\"width: 80px;\">Search</button>\n\t    </div> \n\t\n\t</div>\n\n        ");
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
      out.write("\n        <!-- SERVICE PLAN CREATE DIALOG -->\n        <div id=\"dialog-tag-manage\" title=\"Tag Helper\">\n            <p><strong>WARNING:</strong>\n            This will remove tag(s) from each Service, Scenario, and Service Plan. \n            <input type=\"text\" name=\"filter-tag\" id=\"filter-tag\" placeholder=\"Enter tag(s) here\" class=\" text ui-widget-content ui-corner-all\" />\n            <ul class=\"button-list\">\n            <li><a href=\"javascript:void(0);\" class=\"hhButtonRed\" style=\"color:#FFFFFF;\" id=\"delete-tag-button\">Remove tag(s) from all things.</a></li>\n            </ul>\n            </p>\n        </div>\n        \n        <!-- SERVICE PLAN CREATE DIALOG -->\n        <div id=\"dialog-create-plan\" title=\"Service Plan\">\n            <p>\n            <fieldset>\n                <label for=\"service_plan_name\">Service Plan name</label>\n                <input placeholder=\"Give a descriptive service plan name.\" type=\"text\" name=\"service_plan_name\" id=\"service_plan_name\" class=\"text ui-widget-content ui-corner-all\" />\n                <label for=\"service_plan_tag\" class=\"blur\">Tag(s) - <i>optional</i></label>\n");
      out.write("                <input type=\"text\" name=\"service_plan_tag\" id=\"service_plan_tag\" placeholder=\"Optional tags here.\" class=\"text ui-widget-content ui-corner-all\" />\n            </fieldset> \n            </p>\n        </div>\n        \n        ");
      if (_jspx_meth_c_choose_1(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_if_16(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
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
    _jspx_th_c_set_0.setValue(new String("Home"));
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
    _jspx_th_c_set_1.setValue(new String("home"));
    _jspx_th_c_set_1.setScope("request");
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
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
    _jspx_th_c_url_0.setValue("/plan/setup");
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
    _jspx_th_c_url_2.setValue("/plan/setup");
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
    _jspx_th_c_url_3.setValue("/plan/setup");
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
    _jspx_th_c_url_4.setValue("/home");
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
    _jspx_th_c_url_5.setValue("/plan/setup");
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
    _jspx_th_c_url_6.setValue("/plan/setup");
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
    _jspx_th_c_url_7.setValue("/plan/setup");
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
    _jspx_th_c_url_8.setValue("/setup");
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
    _jspx_th_c_url_9.setValue("/setup");
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
    _jspx_th_c_url_10.setValue("/scenario");
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
    _jspx_th_c_url_11.setValue("/setup");
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
    _jspx_th_c_url_12.setValue("/home");
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
    _jspx_th_c_url_13.setValue("/taghelp");
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
    _jspx_th_c_url_14.setValue("/taghelp");
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
    _jspx_th_c_url_15.setValue("/taghelp");
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
    _jspx_th_c_url_16.setValue("/lastvisithelp");
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
    _jspx_th_c_url_17.setValue("/lastvisithelp");
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
    _jspx_th_c_url_18.setValue("/lastvisithelp");
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
    _jspx_th_c_url_19.setValue("service_scenario");
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
    _jspx_th_c_url_20.setValue("service_scenario");
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
    _jspx_th_c_url_21.setValue("/taghelp");
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
    _jspx_th_c_url_22.setValue("/home");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("filterTagItem");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${filterTagList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n\t\t\t");
          if (_jspx_meth_c_choose_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n\t\t\t<a href=\"javascript:void(0);\" class=\"filter-tag-item tiny ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${toggle_value_class}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${filterTagItem.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${filterTagItem.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n\t\t");
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

  private boolean _jspx_meth_c_choose_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t\t\t");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n\t\t\t\t");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n\t\t\t");
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

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${filterTagItem.state}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t\t\t\t");
        if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n\t\t\t\t");
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

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_set_2.setVar("toggle_value_class");
    _jspx_th_c_set_2.setValue(new String("tag_word_selected"));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
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
        out.write("\n\t\t\t\t\t");
        if (_jspx_meth_c_set_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n\t\t\t\t");
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

  private boolean _jspx_meth_c_set_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_set_3.setVar("toggle_value_class");
    _jspx_th_c_set_3.setValue(new String(""));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
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
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
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

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_forEach_1.setVar("msg");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorMessages}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n\t\t\t");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n\t\t");
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

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_escapeXml_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_out_0.setEscapeXml(false);
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_escapeXml_nobody.reuse(_jspx_th_c_out_0);
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

  private boolean _jspx_meth_c_choose_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent(null);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t        ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n\t        ");
        if (_jspx_meth_c_otherwise_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n        ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty services || !empty plans}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \n\t          ");
        if (_jspx_meth_c_choose_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\n\n\t\t        <div class=\"flex_wrapper\">\n\t\t\t\t\t<div class=\"flex_item\">\n\t\t\t\t\t\t\t<div id=\"tabs\" style=\"display:none;\">\n\t\t\t\t\t\t\t\t<ul>\n\t\t\t\t\t\t\t\t\t<li><a href=\"#tabs-1\" style=\"font-weight:100;\">Services (");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:length(services)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
        out.write(")</a></li>\n\t\t\t\t\t\t\t\t\t<li><a href=\"#tabs-2\" style=\"font-weight:100;\">Plans (");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:length(plans)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
        out.write(")</a></li>\n\t\t\t\t\t\t\t\t</ul>\n\t\t\t\t\t\t\t  \t<div id=\"tabs-1\">\n\t\t\t\t                    <div style=\"text-align:right;\">\n\t\t\t\t\t\t\t\t\t\t<span class=\"power-link tiny\"><a href=\"javascript:void(0);\" class=\"toggle-service-meta-data\"><span class=\"service-meta-data\">Show Service Details</span></a><span class=\"service-meta-data\" style=\"display:none;\"><a href=\"");
        if (_jspx_meth_c_url_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\">Hide Service Details</a></span> </span> |\n\t\t\t\t\t\t\t\t\t\t<span class=\"power-link tiny\"><a href=\"javascript:void(0);\" class=\"createPlanLink\" id=\"createPlanLink\">Create Service Plan</a></span>\n\t\t\t\t                    </div>\n\t\t\t\t\t\t\t  \t  ");
        if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\n\t\t\t\t\t\t\t  \t  <div class=\"info_message tiny service-meta-data\" style=\"display:none;\">\n\t\t\t\t\t\t\t  \t  Click one of the following buttons to set \n\t\t\t\t\t\t\t  \t  response type for <strong>each service</strong>.\n\t\t\t\t\t\t\t\t  <p> \n\t\t\t\t\t\t\t\t\t  <a id=\"allresponsetype_0\" class=\"allresponsetype response_not\" style=\"text-decoration:none;\" href=\"javascript:void(0);\"> Proxy </a>\n\t\t\t\t\t\t\t\t\t  <a id=\"allresponsetype_1\" class=\"allresponsetype response_not\" style=\"text-decoration:none; margin-left:2px;margin-right:2px;\" href=\"javascript:void(0);\"> Static </a>\n\t\t\t\t\t\t\t\t\t  <a id=\"allresponsetype_2\" class=\"allresponsetype response_not\" style=\"text-decoration:none;\" href=\"javascript:void(0);\">Dynamic</a>\n\t\t\t\t\t\t\t\t  </p>\n\t\t\t\t\t\t\t\t  </div>\n\t\t\t\t\t\t\t\t  \n\t\t\t\t\t\t\t\t  <div class=\"\">\n\t\t                            \t");
        if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\n\t\t\t\t\t\t\t\t    \t\n\t\t\t\t\t\t\t\t    </div>\n\t\t\t\t\t\t\t    </div>\n\t\t\t\t\t\t\t    \n\t\t\t\t\t\t\t    <div id=\"tabs-2\">\n\t\t\t\t\t\t\t        \n\t\t\t\t\t\t\t        <div style=\"text-align:right;\">\n\t\t\t\t\t\t\t        <span class=\"power-link tiny\"><a href=\"javascript:void(0);\" class=\"createPlanLink\" id=\"createPlanLink\">Create Service Plan</a></span></div>\n\t\t\t\t\t\t\t\t    <div class=\"scroll\">\n\t\t\t\t\t\t\t\t         ");
        if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\n\t\t\t\t\t\t\t\t\t    <div id=\"plan-list\">\n\t\t\t\t\t\t\t\t\t    ");
        if (_jspx_meth_c_forEach_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\n\t\t\t\t\t\t\t\t\t    <div class=\"tiny\" style=\"padding-top:1em;\" id=\"no-plans-msg\"><a href=\"");
        if (_jspx_meth_c_url_27((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\">What's a plan?</a></div>\n\t\t\t\t                            <div class=\"info_message tiny\">\n\t\t\t\t\t                            <p>To <strong>create a plan</strong>, go to the Services tab, make your settings, and\n\t\t                                        then tab to here to create (or save). </p>\n\t\t                                        <p>To <strong>enable a plan</strong>, click on the <b>Enable Plan</b> link. Note: you \n\t\t                                        will be redirected to the Services tab. </p>\n\t\t                                        <p>\n\t\t                                        To <strong>update a plan</strong>, go to the <b>Services</b> tab, make the \n\t\t                                        necessary updates you need and return here. Clicking <b>Save/Update</b> will \n\t\t                                        update the service plan name and settings. </p>\n\t                                        </div>\n\t\t\t\t\t\t\t\t\t    </div>\n\t\t\t\t\t\t\t\t\t   \n\t\t\t\t\t\t\t    \t</div>\n\t\t\t\t\t\t\t    </div>\n\t\t\t\t\t\t\t</div>\n\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t\t<div class=\"flex_item\">\n\t\t\t\t\t\t\t<div id='service_list_container'>\n\t\t\t\t\t\t\t<div class=\"service_div display\" style=\"");
        if (_jspx_meth_c_if_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        if (_jspx_meth_c_if_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("text-align:center;\">\n\t\t\t\t\t\t\t\n\t\t\t\t\t\t     Nothing here to display. Move along. \n\t\t\t\t\t\t\t\n\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t\t\n\t\t\t\t\t\t\t");
        if (_jspx_meth_c_forEach_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\n                              </div>\n\t\t\t\t\t</div>\n\t\t        </div>\n\t\t        ");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/common/inc_scenario_create_dialog.jsp", out, false);
        out.write("\n\t\t       \n\t\t        <div id=\"dialog\" title=\"Scenerio Preview\">\n                    <p>Details appended here.</p>\n                </div>\n                <div id=\"dialog-delete-service-confirm\" title=\"Delete Service\">\n                    <p>Are you sure you want to delete this Service?</p>\n                </div>\n                 <div id=\"dialog-duplicate-service-confirm\" title=\"Duplicate Service\">\n                    <p>Are you sure you want to duplicate this Service? You'll have a chance to rename it.</p>\n                </div>\n                <div id=\"dialog-delete-scenario-confirm\" title=\"Delete Service Scenario\">\n                    <p>Are you sure you want to delete this Scenario?</p>\n                </div>\n                <div id=\"dialog-delete-service-plan-confirm\" title=\"Delete Service Plan\">\n                    <p>Are you sure you want to delete this Service Plan?</p>\n                </div>\n                \n    </div>\n\t        ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_choose_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_2.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    int _jspx_eval_c_choose_2 = _jspx_th_c_choose_2.doStartTag();
    if (_jspx_eval_c_choose_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t\t\t    ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("\n\t\t\t\t    ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("\n\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty param.serviceId}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t\t\t        \n\t\t\t\t        ");
        if (_jspx_meth_c_set_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("\n\t\t\t\t    ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_set_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_4.setPageContext(_jspx_page_context);
    _jspx_th_c_set_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_c_set_4.setVar("serviceIdToShowByDefault");
    _jspx_th_c_set_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${services[0].id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_4.setScope("request");
    int _jspx_eval_c_set_4 = _jspx_th_c_set_4.doStartTag();
    if (_jspx_th_c_set_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_4);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_4);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t\t\t        ");
        if (_jspx_meth_c_set_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_1, _jspx_page_context))
          return true;
        out.write("\n\t\t\t\t    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }

  private boolean _jspx_meth_c_set_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_5 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_5.setPageContext(_jspx_page_context);
    _jspx_th_c_set_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_1);
    _jspx_th_c_set_5.setVar("serviceIdToShowByDefault");
    _jspx_th_c_set_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.serviceId}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_5.setScope("request");
    int _jspx_eval_c_set_5 = _jspx_th_c_set_5.doStartTag();
    if (_jspx_th_c_set_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_5);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_5);
    return false;
  }

  private boolean _jspx_meth_c_url_25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_25 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_25.setPageContext(_jspx_page_context);
    _jspx_th_c_url_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_url_25.setValue("/home");
    int _jspx_eval_c_url_25 = _jspx_th_c_url_25.doStartTag();
    if (_jspx_th_c_url_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_25);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_25);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty servicePlan}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t\t\t\t\t\t  \t  <div class=\"info_message tiny\" id=\"servicePlanSetMessge\">\n\t\t\t\t\t\t\t  \t  <span style=\"float:right;\">\n\t\t\t\t\t\t\t  \t  <a href=\"javascript:void(0);\" id=\"servicePlanSetMessgeLink\" class=\"remove_grey\" title=\"Hide this message.\" style=\"text-decoration:none;\">Dismiss</a>\n\t\t\t\t\t\t\t  \t  </span>\n\t\t\t\t\t\t\t  \t  Plan that was just set:  \n\t\t\t\t\t\t\t  \t  <h2>\n\t\t\t\t\t\t\t  \t  <strong style=\"display:block; word-wrap: break-word;\" title=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${servicePlan.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${servicePlan.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</strong>\n\t\t\t\t\t\t\t  \t  </h2>\n\t\t\t\t\t\t\t  \t  <span class=\"tiny\">Service Plan Id: ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${servicePlan.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\n\t\t\t\t\t\t\t  \t  </div>\n\t\t\t\t\t\t\t  \t  ");
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

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_forEach_2.setVar("mockservice");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${services}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\t  \n\t\t\t                                <div id=\"parentform_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"parentform ");
          if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\" >\n\t\t\t                                \n\t\t\t\t                            \t");
          if (_jspx_meth_c_url_26((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n\t\t\t\t                             \t\n\t\t\t\t                             \t\n\t\t\t\t                                <span style=\"float:right; display:none;\" class=\"service-meta-data\">\n\t\t\t\t                                \n\t\t\t\t                                <a class=\"tiny_service_delete remove_grey\" id=\"deleteServiceLink_");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\" title=\"Delete this service\" href=\"javascript:void(0);\"><i aria-hidden=\"true\" class=\"icon-cancel\"></i></a>\n\t\t\t\t                                </span>\n\t\t\t\t\t\t\t\t\t\t\t\t\n\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"toggle-buttons\" style=\"margin-bottom:8px;\">\n\n\t\t\t\t                                  <span class=\"toggle_button tiny\">\n\t\t\t\t\t\t\t\t\t\t\t\t\t  ");
          if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n\t\t\t\t\t\t\t\t\t\t\t\t      <a class=\"service-view-master-link\" onclick=\"return true;\" href=\"javascript:void(0);\" id=\"togglevalue_");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\" title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.serviceName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.serviceName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n\t\t\t\t\t\t\t\t\t\t\t\t  </span>\n\t\t\t\t\t\t\t\t\t\t\t\t  ");
          if (_jspx_meth_mockey$1tag_conflictFlag_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n\t\t\t\t\t\t                        </div>\n\t\t\t\t\t\t                        <div class=\"service-meta-data\" style=\"display:none;\">\n\t\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_mockey_service_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_mockey$1tag_statusCheckByService_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\n\t\t\t\t\t\t\t\t\t\t\t\t\t<a class=\"tiny_service_duplicate\" id=\"duplicateServiceLink_");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\" title=\"Duplicate this service\" href=\"javascript:void(0);\">Clone</a>\n\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tiny\" style=\"font-size: 12px;\">\n\t\t\t\t\t\t\t\t\t\t\t\t\tCheck the box to include this service in a \"Save As Plan\".  \n\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"service_plan_include_checkbox\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_mockey$1tag_serviceInServicePlanFlag_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write(" />\n\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t\t\t    \t");
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

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id eq serviceIdToShowByDefault}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("parentformselected");
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

  private boolean _jspx_meth_c_url_26(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_26 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_26.setPageContext(_jspx_page_context);
    _jspx_th_c_url_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_url_26.setValue("/setup");
    _jspx_th_c_url_26.setVar("setupUrl");
    int _jspx_eval_c_url_26 = _jspx_th_c_url_26.doStartTag();
    if (_jspx_eval_c_url_26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_2[0]++;
        _jspx_th_c_url_26.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_26.doInitBody();
      }
      do {
        out.write("\n\t\t\t\t                                \t");
        if (_jspx_meth_c_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_26, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\n\t\t\t\t                             \t");
        int evalDoAfterBody = _jspx_th_c_url_26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_2[0]--;
    }
    if (_jspx_th_c_url_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_26);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_26);
    return false;
  }

  private boolean _jspx_meth_c_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_26, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_0 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_0.setPageContext(_jspx_page_context);
    _jspx_th_c_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_26);
    _jspx_th_c_param_0.setName("serviceId");
    _jspx_th_c_param_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_0 = _jspx_th_c_param_0.doStartTag();
    if (_jspx_th_c_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty mockservice.scenarios}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <span title=\"No scenarios defined for this service.\" class=\"icon-info no-scenario-defined-warning\"> </span>\n\t\t\t\t\t\t\t\t\t\t\t\t\t  ");
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

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_mockey$1tag_conflictFlag_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mockey-tag:conflictFlag
    org.apache.jsp.tag.web.conflictFlag_tag _jspx_th_mockey$1tag_conflictFlag_0 = new org.apache.jsp.tag.web.conflictFlag_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_mockey$1tag_conflictFlag_0      );
    }
    _jspx_th_mockey$1tag_conflictFlag_0.setJspContext(_jspx_page_context);
    _jspx_th_mockey$1tag_conflictFlag_0.setParent(_jspx_th_c_forEach_2);
    _jspx_th_mockey$1tag_conflictFlag_0.setService((com.mockey.model.Service) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice}", com.mockey.model.Service.class, (PageContext)_jspx_page_context, null));
    _jspx_th_mockey$1tag_conflictFlag_0.setConflictInfo((com.mockey.model.ConflictInfo) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${conflictInfo}", com.mockey.model.ConflictInfo.class, (PageContext)_jspx_page_context, null));
    _jspx_th_mockey$1tag_conflictFlag_0.doTag();
    return false;
  }

  private boolean _jspx_meth_mockey_service_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mockey:service
    com.mockey.ui.tags.ServiceResponseTypeTag _jspx_th_mockey_service_0 = (com.mockey.ui.tags.ServiceResponseTypeTag) _jspx_tagPool_mockey_service_type_serviceId_nobody.get(com.mockey.ui.tags.ServiceResponseTypeTag.class);
    _jspx_th_mockey_service_0.setPageContext(_jspx_page_context);
    _jspx_th_mockey_service_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_mockey_service_0.setType(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.serviceResponseType}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_mockey_service_0.setServiceId((java.lang.Long) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.Long.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_mockey_service_0 = _jspx_th_mockey_service_0.doStartTag();
    if (_jspx_th_mockey_service_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mockey_service_type_serviceId_nobody.reuse(_jspx_th_mockey_service_0);
      return true;
    }
    _jspx_tagPool_mockey_service_type_serviceId_nobody.reuse(_jspx_th_mockey_service_0);
    return false;
  }

  private boolean _jspx_meth_mockey$1tag_statusCheckByService_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mockey-tag:statusCheckByService
    org.apache.jsp.tag.web.statusCheckByService_tag _jspx_th_mockey$1tag_statusCheckByService_0 = new org.apache.jsp.tag.web.statusCheckByService_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_mockey$1tag_statusCheckByService_0      );
    }
    _jspx_th_mockey$1tag_statusCheckByService_0.setJspContext(_jspx_page_context);
    _jspx_th_mockey$1tag_statusCheckByService_0.setParent(_jspx_th_c_forEach_2);
    _jspx_th_mockey$1tag_statusCheckByService_0.setService((com.mockey.model.Service) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice}", com.mockey.model.Service.class, (PageContext)_jspx_page_context, null));
    _jspx_th_mockey$1tag_statusCheckByService_0.setView("master");
    _jspx_th_mockey$1tag_statusCheckByService_0.doTag();
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_mockey$1tag_serviceInServicePlanFlag_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mockey-tag:serviceInServicePlanFlag
    org.apache.jsp.tag.web.serviceInServicePlanFlag_tag _jspx_th_mockey$1tag_serviceInServicePlanFlag_0 = new org.apache.jsp.tag.web.serviceInServicePlanFlag_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_mockey$1tag_serviceInServicePlanFlag_0      );
    }
    _jspx_th_mockey$1tag_serviceInServicePlanFlag_0.setJspContext(_jspx_page_context);
    _jspx_th_mockey$1tag_serviceInServicePlanFlag_0.setParent(_jspx_th_c_forEach_2);
    _jspx_th_mockey$1tag_serviceInServicePlanFlag_0.setService((com.mockey.model.Service) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice}", com.mockey.model.Service.class, (PageContext)_jspx_page_context, null));
    _jspx_th_mockey$1tag_serviceInServicePlanFlag_0.setServicePlan((com.mockey.model.ServicePlan) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${servicePlan}", com.mockey.model.ServicePlan.class, (PageContext)_jspx_page_context, null));
    _jspx_th_mockey$1tag_serviceInServicePlanFlag_0.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty plans}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t\t\t\t\t\t\t\t      <div class=\"info_message\" id=\"no-plans-msg\"> No plans here - yet! You should make one. </div>\n\t\t\t\t\t\t\t\t\t    ");
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

  private boolean _jspx_meth_c_forEach_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_forEach_3.setVar("plan");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${plans}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\t  \n\t\t\t                                <div id=\"plan_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${plan.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"parentform\" >\n\t\t\t\t                                <span style=\"float:right;\"><a class=\"delete-plan remove_grey\" id=\"delete-plan_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${plan.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"Delete this plan\" href=\"javascript:void(0);\"><i aria-hidden=\"true\" class=\"icon-cancel\"></i></a></span>\n\t\t\t\t                                \n\t\t\t\t                                <input type=\"text\" style=\"width:90%;\" id=\"servicePlanName_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${plan.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"invisible-focusable invisiblefield\" name=\"servicePlanName_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${plan.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${plan.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></input>\n\t\t\t\t                                ");
          if (_jspx_meth_mockey$1tag_statusCheckByServicePlan_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\n\t\t\t\t                                <div style=\"padding-top:0.6em;\"> \n\t\t\t\t\t                                  \n\t\t\t\t                                  <a id=\"set-plan_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${plan.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"set-plan response_not\" style=\"text-decoration:none;\" href=\"javascript:void(0);\" title=\"Enable this plan\">Enable Plan</a> &nbsp;\n\t\t\t\t                                  <a id=\"save-plan_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${plan.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"save-plan response_not\" style=\"text-decoration:none;\" href=\"javascript:void(0);\" title=\"Save settings as this plan.\">Save As Plan</a>\n\t\t\t\t                                  \n\t\t\t\t                                  <div style=\"padding-top:1em;font-size: 0.8em; align:right;\" class=\"tiny\">\n\t\t\t\t                                  <hr /> \n\t\t\t\t                                  Default plan upon startup?\n\t\t\t\t                                  <a id=\"save-as-default-plan_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${plan.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"save-as-default-plan ");
          if (_jspx_meth_c_choose_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\" style=\"text-decoration:none;\" href=\"javascript:void(0);\" title=\"Set as the default plan upon Mockey startup.\">\n\t\t\t\t                                  <span id=\"not-service-plan_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${plan.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"not-service-plan on_off\" style=\"");
          if (_jspx_meth_c_if_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\">No</span>\n\t\t\t\t                                  <span id=\"yes-service-plan_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${plan.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"yes-service-plan on_off\" style=\"");
          if (_jspx_meth_c_choose_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\">Yes</span>\n\t\t\t\t                                  </a>\n\t\t\t\t                                  </div>\n\t\t\t\t                                </div>\n\t\t\t                                </div>\n\t\t\t\t\t\t\t\t\t    ");
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
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_mockey$1tag_statusCheckByServicePlan_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mockey-tag:statusCheckByServicePlan
    org.apache.jsp.tag.web.statusCheckByServicePlan_tag _jspx_th_mockey$1tag_statusCheckByServicePlan_0 = new org.apache.jsp.tag.web.statusCheckByServicePlan_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_mockey$1tag_statusCheckByServicePlan_0      );
    }
    _jspx_th_mockey$1tag_statusCheckByServicePlan_0.setJspContext(_jspx_page_context);
    _jspx_th_mockey$1tag_statusCheckByServicePlan_0.setParent(_jspx_th_c_forEach_3);
    _jspx_th_mockey$1tag_statusCheckByServicePlan_0.setServicePlan((com.mockey.model.ServicePlan) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${plan}", com.mockey.model.ServicePlan.class, (PageContext)_jspx_page_context, null));
    _jspx_th_mockey$1tag_statusCheckByServicePlan_0.doTag();
    return false;
  }

  private boolean _jspx_meth_c_choose_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_3 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_3.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    int _jspx_eval_c_choose_3 = _jspx_th_c_choose_3.doStartTag();
    if (_jspx_eval_c_choose_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        if (_jspx_meth_c_otherwise_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        int evalDoAfterBody = _jspx_th_c_choose_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_3);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_3);
    return false;
  }

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_3);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${plan.id eq defaultServicePlanId}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("response_green");
        int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_2 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_2.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_3);
    int _jspx_eval_c_otherwise_2 = _jspx_th_c_otherwise_2.doStartTag();
    if (_jspx_eval_c_otherwise_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("response_not");
        int evalDoAfterBody = _jspx_th_c_otherwise_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_2);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_2);
    return false;
  }

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${plan.id eq defaultServicePlanId}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("display:none;");
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

  private boolean _jspx_meth_c_choose_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_4 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_4.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    int _jspx_eval_c_choose_4 = _jspx_th_c_choose_4.doStartTag();
    if (_jspx_eval_c_choose_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_when_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_4, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        if (_jspx_meth_c_otherwise_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_4, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        int evalDoAfterBody = _jspx_th_c_choose_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_4);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_4);
    return false;
  }

  private boolean _jspx_meth_c_when_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test_nobody.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_4.setPageContext(_jspx_page_context);
    _jspx_th_c_when_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_4);
    _jspx_th_c_when_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${plan.id eq defaultServicePlanId}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
    if (_jspx_th_c_when_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test_nobody.reuse(_jspx_th_c_when_4);
      return true;
    }
    _jspx_tagPool_c_when_test_nobody.reuse(_jspx_th_c_when_4);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_3 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_3.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_4);
    int _jspx_eval_c_otherwise_3 = _jspx_th_c_otherwise_3.doStartTag();
    if (_jspx_eval_c_otherwise_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("display:none;");
        int evalDoAfterBody = _jspx_th_c_otherwise_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_3);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_3);
    return false;
  }

  private boolean _jspx_meth_c_url_27(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_27 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_27.setPageContext(_jspx_page_context);
    _jspx_th_c_url_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_url_27.setValue("help#plan");
    int _jspx_eval_c_url_27 = _jspx_th_c_url_27.doStartTag();
    if (_jspx_th_c_url_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_27);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_27);
    return false;
  }

  private boolean _jspx_meth_c_if_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${! empty serviceIdToShowByDefault}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("display:none;");
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

  private boolean _jspx_meth_c_if_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${serviceIdToShowByDefault==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("display:block;");
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

  private boolean _jspx_meth_c_forEach_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_forEach_4.setVar("mockservice");
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${services}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n\t\t\t\t\t\t\t   <div id=\"div_");
          if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("_\" class=\"service_div display\" style=\"");
          if (_jspx_meth_c_if_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\" > \n                               \n\t\t\t\t\t\t\t\t\n                                <div id=\"updateStatus_");
          if (_jspx_meth_c_out_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\" class=\"outputTextArea\"></div>\n                                <div class=\"parentformselected\">\n                                <input type=\"hidden\" name=\"serviceId\" id=\"serviceId_");
          if (_jspx_meth_c_out_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\n                                <input type=\"hidden\" name=\"serviceName\" id=\"serviceName_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.serviceName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\n                                \n                                 <div class=\"service\" width=\"350px;\">\n                                    \n                                   <div class=\"service-label\"><label>Service name:</label> ");
          if (_jspx_meth_mockey$1tag_editServiceLink_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("</div>\n                                   <div class=\"service-value big\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.serviceName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n                                   <div class=\"service-meta-data\" style=\"display:none;\">\n                                   ");
          if (_jspx_meth_mockey$1tag_statusCheckByService_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\n                                   </div>\n                                   <div class=\"service-label border-top\"><label>Mock URL:</label> ");
          if (_jspx_meth_mockey$1tag_editServiceLink_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("</div>\n                                   <div><a class=\"tiny\" href=\"");
          if (_jspx_meth_mockey_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write('"');
          out.write('>');
          if (_jspx_meth_mockey_url_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("</a></div>\n                                   <div class=\"service-def-spacer\"></div>\n                                   \n                                   \n                                   <div class=\"service-meta-data\" style=\"display:none;\">\n\t                                   <div class=\"service-label not-top border-top\">\n\t                                   <label>Real URL(s):</label> ");
          if (_jspx_meth_mockey$1tag_editServiceLink_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\n\t                                   </div>\n\t                                   ");
          if (_jspx_meth_c_forEach_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\n\t\t\t\t\t\t\t\t\t   \n\t                                   ");
          if (_jspx_meth_c_if_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\n                                   </div>\n                                   <div class=\"service-label border-top\"><label>This service is set to:</label>\n                                   \t\n                                   </div>\n                                   <table>\n                                   <tr><td>\n                                   ");
          if (_jspx_meth_mockey_service_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\n                                   </td>\n                                   <td>\n                                   <div class=\"service-value\" style=\"diplay:inline-block;text-transform:uppercase;\">\n\t                                   \t<span class=\"hide");
          if (_jspx_meth_c_if_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\" id=\"dynamicScenario_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Dynamic</span>\n\t\t\t\t\t\t\t\t       \t<span class=\"hide");
          if (_jspx_meth_c_if_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\" id=\"proxyScenario_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Proxy</span>\n\t\t\t\t                       \t<span class=\"hide");
          if (_jspx_meth_c_if_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\" id=\"staticScenario_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Static</span>\n\t                                   </div>\n\t                               </td>\n\t                               </tr>\n\t                               </table>\n                                   \n                                   \n                                   <div class=\"service-label border-top\" style=\"margin-top:1em;\"><label>Select a static scenario (");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:length(mockservice.scenarios)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
          out.write("):</label>\n                                   \t<span style=\"float:right;\" class=\"power-link tiny\"><a href=\"javascript:void(0);\" class=\"createScenarioLink\" id=\"createScenarioLink_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Create Scenario</a></span>\n                                   </div>\n                                   <div id=\"MAIN_CONTAINER\" class=\"\">\n                                   <div id=\"scenario-list_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n\t\t                                ");
          if (_jspx_meth_c_choose_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\n\t                                </div>\n                                   </div>\n                                 </div>\n                                 <div class=\"not-top border-top service-meta-data\" style=\"display:none;padding-top:1em;\">\n\t\t\t                       <strong>Hang time (milliseconds):</strong> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.hangTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          if (_jspx_meth_mockey$1tag_editServiceLink_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\n\t                             </div>\n                              </div>\n                              </div>\n                              ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_if_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id eq serviceIdToShowByDefault}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("display: block;");
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

  private boolean _jspx_meth_c_out_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_c_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_c_out_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_c_out_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
    return false;
  }

  private boolean _jspx_meth_mockey$1tag_editServiceLink_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mockey-tag:editServiceLink
    org.apache.jsp.tag.web.editServiceLink_tag _jspx_th_mockey$1tag_editServiceLink_0 = new org.apache.jsp.tag.web.editServiceLink_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_mockey$1tag_editServiceLink_0      );
    }
    _jspx_th_mockey$1tag_editServiceLink_0.setJspContext(_jspx_page_context);
    _jspx_th_mockey$1tag_editServiceLink_0.setParent(_jspx_th_c_forEach_4);
    _jspx_th_mockey$1tag_editServiceLink_0.setServiceId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_mockey$1tag_editServiceLink_0.doTag();
    return false;
  }

  private boolean _jspx_meth_mockey$1tag_statusCheckByService_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mockey-tag:statusCheckByService
    org.apache.jsp.tag.web.statusCheckByService_tag _jspx_th_mockey$1tag_statusCheckByService_1 = new org.apache.jsp.tag.web.statusCheckByService_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_mockey$1tag_statusCheckByService_1      );
    }
    _jspx_th_mockey$1tag_statusCheckByService_1.setJspContext(_jspx_page_context);
    _jspx_th_mockey$1tag_statusCheckByService_1.setParent(_jspx_th_c_forEach_4);
    _jspx_th_mockey$1tag_statusCheckByService_1.setService((com.mockey.model.Service) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice}", com.mockey.model.Service.class, (PageContext)_jspx_page_context, null));
    _jspx_th_mockey$1tag_statusCheckByService_1.setView("detail");
    _jspx_th_mockey$1tag_statusCheckByService_1.doTag();
    return false;
  }

  private boolean _jspx_meth_mockey$1tag_editServiceLink_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mockey-tag:editServiceLink
    org.apache.jsp.tag.web.editServiceLink_tag _jspx_th_mockey$1tag_editServiceLink_1 = new org.apache.jsp.tag.web.editServiceLink_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_mockey$1tag_editServiceLink_1      );
    }
    _jspx_th_mockey$1tag_editServiceLink_1.setJspContext(_jspx_page_context);
    _jspx_th_mockey$1tag_editServiceLink_1.setParent(_jspx_th_c_forEach_4);
    _jspx_th_mockey$1tag_editServiceLink_1.setServiceId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_mockey$1tag_editServiceLink_1.doTag();
    return false;
  }

  private boolean _jspx_meth_mockey_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mockey:url
    com.mockey.ui.tags.ServiceUrlTag _jspx_th_mockey_url_0 = (com.mockey.ui.tags.ServiceUrlTag) _jspx_tagPool_mockey_url_value_nobody.get(com.mockey.ui.tags.ServiceUrlTag.class);
    _jspx_th_mockey_url_0.setPageContext(_jspx_page_context);
    _jspx_th_mockey_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_mockey_url_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_mockey_url_0 = _jspx_th_mockey_url_0.doStartTag();
    if (_jspx_th_mockey_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mockey_url_value_nobody.reuse(_jspx_th_mockey_url_0);
      return true;
    }
    _jspx_tagPool_mockey_url_value_nobody.reuse(_jspx_th_mockey_url_0);
    return false;
  }

  private boolean _jspx_meth_mockey_url_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mockey:url
    com.mockey.ui.tags.ServiceUrlTag _jspx_th_mockey_url_1 = (com.mockey.ui.tags.ServiceUrlTag) _jspx_tagPool_mockey_url_value_nobody.get(com.mockey.ui.tags.ServiceUrlTag.class);
    _jspx_th_mockey_url_1.setPageContext(_jspx_page_context);
    _jspx_th_mockey_url_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_mockey_url_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_mockey_url_1 = _jspx_th_mockey_url_1.doStartTag();
    if (_jspx_th_mockey_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mockey_url_value_nobody.reuse(_jspx_th_mockey_url_1);
      return true;
    }
    _jspx_tagPool_mockey_url_value_nobody.reuse(_jspx_th_mockey_url_1);
    return false;
  }

  private boolean _jspx_meth_mockey$1tag_editServiceLink_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mockey-tag:editServiceLink
    org.apache.jsp.tag.web.editServiceLink_tag _jspx_th_mockey$1tag_editServiceLink_2 = new org.apache.jsp.tag.web.editServiceLink_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_mockey$1tag_editServiceLink_2      );
    }
    _jspx_th_mockey$1tag_editServiceLink_2.setJspContext(_jspx_page_context);
    _jspx_th_mockey$1tag_editServiceLink_2.setParent(_jspx_th_c_forEach_4);
    _jspx_th_mockey$1tag_editServiceLink_2.setServiceId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_mockey$1tag_editServiceLink_2.doTag();
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_c_forEach_5.setVar("realUrl");
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.realServiceUrls}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_5.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n\t\t\t\t\t\t\t\t\t       <p><a class=\"tiny\" href=\"");
          if (_jspx_meth_mockey_url_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write('"');
          out.write('>');
          if (_jspx_meth_mockey_url_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("</a></p>\n\t\t\t\t\t\t\t\t\t   ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }

  private boolean _jspx_meth_mockey_url_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mockey:url
    com.mockey.ui.tags.ServiceUrlTag _jspx_th_mockey_url_2 = (com.mockey.ui.tags.ServiceUrlTag) _jspx_tagPool_mockey_url_value_nobody.get(com.mockey.ui.tags.ServiceUrlTag.class);
    _jspx_th_mockey_url_2.setPageContext(_jspx_page_context);
    _jspx_th_mockey_url_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    _jspx_th_mockey_url_2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${realUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_mockey_url_2 = _jspx_th_mockey_url_2.doStartTag();
    if (_jspx_th_mockey_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mockey_url_value_nobody.reuse(_jspx_th_mockey_url_2);
      return true;
    }
    _jspx_tagPool_mockey_url_value_nobody.reuse(_jspx_th_mockey_url_2);
    return false;
  }

  private boolean _jspx_meth_mockey_url_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mockey:url
    com.mockey.ui.tags.ServiceUrlTag _jspx_th_mockey_url_3 = (com.mockey.ui.tags.ServiceUrlTag) _jspx_tagPool_mockey_url_value_breakpoint_nobody.get(com.mockey.ui.tags.ServiceUrlTag.class);
    _jspx_th_mockey_url_3.setPageContext(_jspx_page_context);
    _jspx_th_mockey_url_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    _jspx_th_mockey_url_3.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${realUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_mockey_url_3.setBreakpoint(5);
    int _jspx_eval_mockey_url_3 = _jspx_th_mockey_url_3.doStartTag();
    if (_jspx_th_mockey_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mockey_url_value_breakpoint_nobody.reuse(_jspx_th_mockey_url_3);
      return true;
    }
    _jspx_tagPool_mockey_url_value_breakpoint_nobody.reuse(_jspx_th_mockey_url_3);
    return false;
  }

  private boolean _jspx_meth_c_if_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
    _jspx_th_c_if_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty mockservice.realServiceUrls}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t                                   <div class=\"info_message\">No real URLS defined.</div>\n\t                                   ");
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

  private boolean _jspx_meth_mockey_service_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mockey:service
    com.mockey.ui.tags.ServiceResponseTypeTag _jspx_th_mockey_service_1 = (com.mockey.ui.tags.ServiceResponseTypeTag) _jspx_tagPool_mockey_service_type_serviceId_nobody.get(com.mockey.ui.tags.ServiceResponseTypeTag.class);
    _jspx_th_mockey_service_1.setPageContext(_jspx_page_context);
    _jspx_th_mockey_service_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_mockey_service_1.setType(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.serviceResponseType}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_mockey_service_1.setServiceId((java.lang.Long) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.Long.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_mockey_service_1 = _jspx_th_mockey_service_1.doStartTag();
    if (_jspx_th_mockey_service_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mockey_service_type_serviceId_nobody.reuse(_jspx_th_mockey_service_1);
      return true;
    }
    _jspx_tagPool_mockey_service_type_serviceId_nobody.reuse(_jspx_th_mockey_service_1);
    return false;
  }

  private boolean _jspx_meth_c_if_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_12.setPageContext(_jspx_page_context);
    _jspx_th_c_if_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_c_if_12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.serviceResponseType eq 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_12 = _jspx_th_c_if_12.doStartTag();
    if (_jspx_eval_c_if_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" show");
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

  private boolean _jspx_meth_c_if_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_13.setPageContext(_jspx_page_context);
    _jspx_th_c_if_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_c_if_13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.serviceResponseType eq 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_13 = _jspx_th_c_if_13.doStartTag();
    if (_jspx_eval_c_if_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" show");
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

  private boolean _jspx_meth_c_if_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_14.setPageContext(_jspx_page_context);
    _jspx_th_c_if_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_c_if_14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.serviceResponseType eq 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_14 = _jspx_th_c_if_14.doStartTag();
    if (_jspx_eval_c_if_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" show");
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

  private boolean _jspx_meth_c_choose_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_5 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_5.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    int _jspx_eval_c_choose_5 = _jspx_th_c_choose_5.doStartTag();
    if (_jspx_eval_c_choose_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t                                  ");
        if (_jspx_meth_c_when_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_5, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
          return true;
        out.write("\n\t\t                                  ");
        if (_jspx_meth_c_otherwise_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_5, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
          return true;
        out.write("\n\t\t                                ");
        int evalDoAfterBody = _jspx_th_c_choose_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_5);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_5);
    return false;
  }

  private boolean _jspx_meth_c_when_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_5.setPageContext(_jspx_page_context);
    _jspx_th_c_when_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_5);
    _jspx_th_c_when_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty mockservice.scenarios}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_5 = _jspx_th_c_when_5.doStartTag();
    if (_jspx_eval_c_when_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t                                  ");
        if (_jspx_meth_c_forEach_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_5, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
          return true;
        out.write("\n\t\t                                  ");
        int evalDoAfterBody = _jspx_th_c_when_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
    return false;
  }

  private boolean _jspx_meth_c_forEach_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_6.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_5);
    _jspx_th_c_forEach_6.setVar("scenario");
    _jspx_th_c_forEach_6.setBegin(0);
    _jspx_th_c_forEach_6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.scenarios}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_6.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_6 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_6 = _jspx_th_c_forEach_6.doStartTag();
      if (_jspx_eval_c_forEach_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n\t\t                                    <div class=\"service-detail-scenario-list-item\" id=\"service-scenario-info_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${scenario.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('_');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n\t\t\t                                    <span class=\"service-meta-data\" style=\"float:right;padding-top:18px; display:none;\"><a href=\"javascript:void(0);\" id=\"delete-scenario_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${scenario.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('_');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"deleteScenarioLink remove_grey\"><i aria-hidden=\"true\" class=\"icon-cancel\"></i></a> </span>\n\t\t\t                                    <div style=\"padding-top: 0.5em;padding-bottom:0.5em;\">\n\t\t\t                                      ");
          if (_jspx_meth_c_choose_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_6, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
            return true;
          out.write("\n\t\t\t                                      <a href=\"javascript:void(0);\" id=\"serviceScenarioON_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${scenario.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('_');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"scenariosByServiceId-on_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${on_class}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" response_set\" onclick=\"return false;\"><p class=\"on_off\">ON</p></a>\n\t\t\t                                      <a href=\"javascript:void(0);\" id=\"serviceScenarioOFF_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${scenario.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('_');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"serviceScenarioResponseTypeLink scenariosByServiceId-off_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${off_class}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" response_not\" onclick=\"return false;\"><p class=\"on_off\">OFF</p></a>\n\t\t\t                                      <a href=\"javascript:void(0);\" id=\"view-scenario_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${scenario.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('_');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${scenario.scenarioName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"viewServiceScenarioLink\" style=\"padding-left:10px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${scenario.scenarioName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n\t\t\t                                    </div>\n\t\t\t                                    <div class=\"service-meta-data\" style=\"display:none;\">\n\t\t\t                                    ");
          if (_jspx_meth_mockey$1tag_statusCheckByScenario_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_6, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
            return true;
          out.write("\n\t\t\t                                    </div>\n\t\t                                    </div>\n\t\t                                  ");
          int evalDoAfterBody = _jspx_th_c_forEach_6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_6.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items_begin.reuse(_jspx_th_c_forEach_6);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_6 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_6.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_6);
    int _jspx_eval_c_choose_6 = _jspx_th_c_choose_6.doStartTag();
    if (_jspx_eval_c_choose_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t\t                                        ");
        if (_jspx_meth_c_when_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_6, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
          return true;
        out.write("\n\t\t\t                                        ");
        if (_jspx_meth_c_otherwise_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_6, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
          return true;
        out.write("\n\t\t\t                                      ");
        int evalDoAfterBody = _jspx_th_c_choose_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_6);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_6);
    return false;
  }

  private boolean _jspx_meth_c_when_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_6 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_6.setPageContext(_jspx_page_context);
    _jspx_th_c_when_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_6);
    _jspx_th_c_when_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.defaultScenarioId eq scenario.id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_6 = _jspx_th_c_when_6.doStartTag();
    if (_jspx_eval_c_when_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t\t                                          ");
        if (_jspx_meth_c_set_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_6, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
          return true;
        out.write("\n\t\t\t                                          ");
        if (_jspx_meth_c_set_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_6, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
          return true;
        out.write("\n\t\t\t                                        ");
        int evalDoAfterBody = _jspx_th_c_when_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
    return false;
  }

  private boolean _jspx_meth_c_set_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_6 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_6.setPageContext(_jspx_page_context);
    _jspx_th_c_set_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_6);
    _jspx_th_c_set_6.setVar("off_class");
    _jspx_th_c_set_6.setValue(new String("hide"));
    int _jspx_eval_c_set_6 = _jspx_th_c_set_6.doStartTag();
    if (_jspx_th_c_set_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_6);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_6);
    return false;
  }

  private boolean _jspx_meth_c_set_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_7 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_7.setPageContext(_jspx_page_context);
    _jspx_th_c_set_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_6);
    _jspx_th_c_set_7.setVar("on_class");
    _jspx_th_c_set_7.setValue(new String(""));
    int _jspx_eval_c_set_7 = _jspx_th_c_set_7.doStartTag();
    if (_jspx_th_c_set_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_7);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_7);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_4 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_4.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_6);
    int _jspx_eval_c_otherwise_4 = _jspx_th_c_otherwise_4.doStartTag();
    if (_jspx_eval_c_otherwise_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t\t                                          ");
        if (_jspx_meth_c_set_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_4, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
          return true;
        out.write("\n\t\t\t                                          ");
        if (_jspx_meth_c_set_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_4, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
          return true;
        out.write("\n\t\t\t                                        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_4);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_4);
    return false;
  }

  private boolean _jspx_meth_c_set_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_8 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_8.setPageContext(_jspx_page_context);
    _jspx_th_c_set_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_4);
    _jspx_th_c_set_8.setVar("off_class");
    _jspx_th_c_set_8.setValue(new String(""));
    int _jspx_eval_c_set_8 = _jspx_th_c_set_8.doStartTag();
    if (_jspx_th_c_set_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_8);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_8);
    return false;
  }

  private boolean _jspx_meth_c_set_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_9 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_9.setPageContext(_jspx_page_context);
    _jspx_th_c_set_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_4);
    _jspx_th_c_set_9.setVar("on_class");
    _jspx_th_c_set_9.setValue(new String("hide"));
    int _jspx_eval_c_set_9 = _jspx_th_c_set_9.doStartTag();
    if (_jspx_th_c_set_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_9);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_9);
    return false;
  }

  private boolean _jspx_meth_mockey$1tag_statusCheckByScenario_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mockey-tag:statusCheckByScenario
    org.apache.jsp.tag.web.statusCheckByScenario_tag _jspx_th_mockey$1tag_statusCheckByScenario_0 = new org.apache.jsp.tag.web.statusCheckByScenario_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_mockey$1tag_statusCheckByScenario_0      );
    }
    _jspx_th_mockey$1tag_statusCheckByScenario_0.setJspContext(_jspx_page_context);
    _jspx_th_mockey$1tag_statusCheckByScenario_0.setParent(_jspx_th_c_forEach_6);
    _jspx_th_mockey$1tag_statusCheckByScenario_0.setScenario((com.mockey.model.Scenario) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${scenario}", com.mockey.model.Scenario.class, (PageContext)_jspx_page_context, null));
    _jspx_th_mockey$1tag_statusCheckByScenario_0.setService((com.mockey.model.Service) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice}", com.mockey.model.Service.class, (PageContext)_jspx_page_context, null));
    _jspx_th_mockey$1tag_statusCheckByScenario_0.doTag();
    return false;
  }

  private boolean _jspx_meth_c_otherwise_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_5 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_5.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_5);
    int _jspx_eval_c_otherwise_5 = _jspx_th_c_otherwise_5.doStartTag();
    if (_jspx_eval_c_otherwise_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t                                    ");
        if (_jspx_meth_c_url_28((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_5, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
          return true;
        out.write("\n\t\t\t\t\t\t\t\t\t         ");
        if (_jspx_meth_c_url_29((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_5, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
          return true;
        out.write("\n\t\t                                  \t<div class=\"alert_message\"><span>You need to create a scenario before using <strong>Static</strong> or <strong>Dynamic</strong> scenario</span></div>\n\t\t                                  ");
        int evalDoAfterBody = _jspx_th_c_otherwise_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_5);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_5);
    return false;
  }

  private boolean _jspx_meth_c_url_28(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_28 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_28.setPageContext(_jspx_page_context);
    _jspx_th_c_url_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_5);
    _jspx_th_c_url_28.setValue("/scenario");
    _jspx_th_c_url_28.setVar("scenarioUrl");
    int _jspx_eval_c_url_28 = _jspx_th_c_url_28.doStartTag();
    if (_jspx_eval_c_url_28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_28 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_4[0]++;
        _jspx_th_c_url_28.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_28.doInitBody();
      }
      do {
        out.write("\n\t\t\t\t\t\t\t\t\t            ");
        if (_jspx_meth_c_param_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_28, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
          return true;
        out.write("\n\t\t\t\t\t\t\t\t\t        ");
        int evalDoAfterBody = _jspx_th_c_url_28.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_28 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_4[0]--;
    }
    if (_jspx_th_c_url_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_28);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_28);
    return false;
  }

  private boolean _jspx_meth_c_param_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_28, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_1 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_1.setPageContext(_jspx_page_context);
    _jspx_th_c_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_28);
    _jspx_th_c_param_1.setName("serviceId");
    _jspx_th_c_param_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_1 = _jspx_th_c_param_1.doStartTag();
    if (_jspx_th_c_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_1);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_1);
    return false;
  }

  private boolean _jspx_meth_c_url_29(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_29 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_29.setPageContext(_jspx_page_context);
    _jspx_th_c_url_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_5);
    _jspx_th_c_url_29.setValue("/setup");
    _jspx_th_c_url_29.setVar("setupScenarioUrl");
    int _jspx_eval_c_url_29 = _jspx_th_c_url_29.doStartTag();
    if (_jspx_eval_c_url_29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_29 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_4[0]++;
        _jspx_th_c_url_29.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_29.doInitBody();
      }
      do {
        out.write("\n\t\t\t\t\t                                ");
        if (_jspx_meth_c_param_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_29, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
          return true;
        out.write("\n\t\t\t\t\t                                ");
        if (_jspx_meth_c_param_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_29, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
          return true;
        out.write("\n\t\t\t\t\t                             ");
        int evalDoAfterBody = _jspx_th_c_url_29.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_29 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_4[0]--;
    }
    if (_jspx_th_c_url_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_29);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_29);
    return false;
  }

  private boolean _jspx_meth_c_param_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_29, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_2 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_2.setPageContext(_jspx_page_context);
    _jspx_th_c_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_29);
    _jspx_th_c_param_2.setName("serviceId");
    _jspx_th_c_param_2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_2 = _jspx_th_c_param_2.doStartTag();
    if (_jspx_th_c_param_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_2);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_2);
    return false;
  }

  private boolean _jspx_meth_c_param_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_29, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_3 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_3.setPageContext(_jspx_page_context);
    _jspx_th_c_param_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_29);
    _jspx_th_c_param_3.setName("createScenario");
    _jspx_th_c_param_3.setValue("yes");
    int _jspx_eval_c_param_3 = _jspx_th_c_param_3.doStartTag();
    if (_jspx_th_c_param_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_3);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_3);
    return false;
  }

  private boolean _jspx_meth_mockey$1tag_editServiceLink_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mockey-tag:editServiceLink
    org.apache.jsp.tag.web.editServiceLink_tag _jspx_th_mockey$1tag_editServiceLink_3 = new org.apache.jsp.tag.web.editServiceLink_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_mockey$1tag_editServiceLink_3      );
    }
    _jspx_th_mockey$1tag_editServiceLink_3.setJspContext(_jspx_page_context);
    _jspx_th_mockey$1tag_editServiceLink_3.setParent(_jspx_th_c_forEach_4);
    _jspx_th_mockey$1tag_editServiceLink_3.setServiceId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mockservice.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_mockey$1tag_editServiceLink_3.doTag();
    return false;
  }

  private boolean _jspx_meth_c_otherwise_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_6 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_6.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_6 = _jspx_th_c_otherwise_6.doStartTag();
    if (_jspx_eval_c_otherwise_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t          <p class=\"intro_txt\">Hello, this is Mockey. It looks like this is the first time you are using Mockey because \n\t          it's in a clean state. To learn more about Mockey, see the <a href=\"");
        if (_jspx_meth_c_url_30((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_6, _jspx_page_context))
          return true;
        out.write("\">help</a> section. </p> \n\t\t\t  <p class=\"info_message\">There are no mock services defined. You can <a href=\"");
        if (_jspx_meth_c_url_31((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_6, _jspx_page_context))
          return true;
        out.write("\">upload one</a>, <a href=\"");
        if (_jspx_meth_c_url_32((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_6, _jspx_page_context))
          return true;
        out.write("\">create one manually</a> or start <a href=\"");
        if (_jspx_meth_c_url_33((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_6, _jspx_page_context))
          return true;
        out.write("\">recording</a>. \n\t\t\t  If you were expecting to see services, then maybe filtering is on\n\t\t\t  \n\t\t\t   or something went wrong. Checkout the <a href=\"");
        if (_jspx_meth_c_url_34((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_6, _jspx_page_context))
          return true;
        out.write("\">debug output</a>.\n\t\t\t   \n\t\t\t    \n\t\t\t  </p>\n\t\t\t  \n\t\t\t  ");
        if (_jspx_meth_c_if_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_6, _jspx_page_context))
          return true;
        out.write("\n\t\t\t  \n\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_6);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_6);
    return false;
  }

  private boolean _jspx_meth_c_url_30(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_30 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_30.setPageContext(_jspx_page_context);
    _jspx_th_c_url_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_6);
    _jspx_th_c_url_30.setValue("/help");
    int _jspx_eval_c_url_30 = _jspx_th_c_url_30.doStartTag();
    if (_jspx_th_c_url_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_30);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_30);
    return false;
  }

  private boolean _jspx_meth_c_url_31(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_31 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_31.setPageContext(_jspx_page_context);
    _jspx_th_c_url_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_6);
    _jspx_th_c_url_31.setValue("upload");
    int _jspx_eval_c_url_31 = _jspx_th_c_url_31.doStartTag();
    if (_jspx_th_c_url_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_31);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_31);
    return false;
  }

  private boolean _jspx_meth_c_url_32(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_32 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_32.setPageContext(_jspx_page_context);
    _jspx_th_c_url_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_6);
    _jspx_th_c_url_32.setValue("setup");
    int _jspx_eval_c_url_32 = _jspx_th_c_url_32.doStartTag();
    if (_jspx_th_c_url_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_32);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_32);
    return false;
  }

  private boolean _jspx_meth_c_url_33(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_33 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_33.setPageContext(_jspx_page_context);
    _jspx_th_c_url_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_6);
    _jspx_th_c_url_33.setValue("help#record");
    int _jspx_eval_c_url_33 = _jspx_th_c_url_33.doStartTag();
    if (_jspx_th_c_url_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_33);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_33);
    return false;
  }

  private boolean _jspx_meth_c_url_34(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_34 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_34.setPageContext(_jspx_page_context);
    _jspx_th_c_url_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_6);
    _jspx_th_c_url_34.setValue("/console");
    int _jspx_eval_c_url_34 = _jspx_th_c_url_34.doStartTag();
    if (_jspx_th_c_url_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_34);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_34);
    return false;
  }

  private boolean _jspx_meth_c_if_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_15 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_15.setPageContext(_jspx_page_context);
    _jspx_th_c_if_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_6);
    _jspx_th_c_if_15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty filterTag}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_15 = _jspx_th_c_if_15.doStartTag();
    if (_jspx_eval_c_if_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<p class=\"info_message\">Hey! You're filtering on '<strong>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${filterTag}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</strong>' <a style=\"margin-left:40px;\" href=\"javascript:void(0);\" class=\"clear-tag-button\">Clear Filter by Tag(s)</a> </p>");
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

  private boolean _jspx_meth_c_if_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_16 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_16.setPageContext(_jspx_page_context);
    _jspx_th_c_if_16.setParent(null);
    _jspx_th_c_if_16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mode ne 'edit_plan'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_16 = _jspx_th_c_if_16.doStartTag();
    if (_jspx_eval_c_if_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n<script type=\"text/javascript\">$('html').addClass('js');\n\n$(function() {\n\n  $('a','span.toggle_button').click(function() {\n    var serviceId = this.id.split(\"_\")[1];\n    $('div.display','#service_list_container')\n      .stop()\n      .hide()\n      .filter( function() { return this.id.match('div_' + serviceId+'_'); })   \n      .show();    \n    return true; \n  \n  })\n\n});\n\n</script>\n");
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
}
