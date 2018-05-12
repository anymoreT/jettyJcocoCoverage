package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.net.*;
import com.mockey.storage.*;
import com.mockey.model.*;
import com.mockey.ui.*;

public final class availableConfigurationLinks_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items_end;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_param_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }
  private java.lang.String servicePath;
  private java.lang.String serviceName;

  public java.lang.String getServicePath() {
    return this.servicePath;
  }

  public void setServicePath(java.lang.String servicePath) {
    this.servicePath = servicePath;
  }

  public java.lang.String getServiceName() {
    return this.serviceName;
  }

  public void setServiceName(java.lang.String serviceName) {
    this.serviceName = serviceName;
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_forEach_varStatus_var_items_end = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_url_var_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_forEach_varStatus_var_items_end.release();
    _jspx_tagPool_c_url_var_value.release();
    _jspx_tagPool_c_param_value_name_nobody.release();
    _jspx_tagPool_c_url_var_value_nobody.release();
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    _jspInit(config);
    if( getServicePath() != null ) {
      _jspx_page_context.setAttribute("servicePath", getServicePath());
}
    if( getServiceName() != null ) {
      _jspx_page_context.setAttribute("serviceName", getServiceName());
}

    try {
      out.write("\n\n\n\n\n\n\n\n\n\n");

IMockeyStorage store = StorageRegistry.MockeyStorage;
List<ServicePlan> servicePlans = store.getServicePlans();
Service exampleService = null;
for(Service s: store.getServices()) {
    if(s.getScenarios().size() > 0 ) {
        exampleService = s;
        break;
    }
}
servicePlans = Util.orderAlphabeticallyByServicePlanName(servicePlans);
request.setAttribute("servicePlans",servicePlans);
request.setAttribute("exampleService",exampleService);


URL serverURLObj = new URL(request.getScheme(), // http
		request.getServerName(), // host
		request.getServerPort(), // port
        "");
request.setAttribute("baseUrl",serverURLObj.toString());
request.setAttribute("api_setplan_service_name",ServicePlanConfigurationAPI.API_SERVICE_PLAN_CONFIGURATION_NAME);
request.setAttribute("api_conf_service_name",ServiceConfigurationAPI.API_SERVICE_CONFIGURATION_NAME);
request.setAttribute("api_info_service_name",ServiceDefinitionInfoAPI.API_SERVICE_INFO_NAME);



      out.write('\n');
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${serviceName eq api_setplan_service_name}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n<h3>Sample API Calls</h3>\n");
          //  c:choose
          org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
          _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
          _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
          int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
          if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n  ");
              if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
                return;
              out.write("\n  ");
              //  c:otherwise
              org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
              _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
              _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
              int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
              if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n\t\t<table class=\"api\">\n        <tr><th>Service Plan</th><th>Configuration URL</th></tr>\n        \n        ");
                  //  c:forEach
                  org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items_end.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                  _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
                  _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
                  _jspx_th_c_forEach_0.setVar("servicePlan");
                  _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${servicePlans}", java.lang.Object.class, (PageContext)this.getJspContext(), null));
                  _jspx_th_c_forEach_0.setVarStatus("status");
                  _jspx_th_c_forEach_0.setEnd(6);
                  int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
                  try {
                    int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
                    if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\n              <tr>\n                <td valign=\"top\">");
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${servicePlan.name}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                        out.write("</td>\n                <td valign=\"top\" class=\"tiny\">\n                ");
                        //  c:url
                        org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
                        _jspx_th_c_url_1.setPageContext(_jspx_page_context);
                        _jspx_th_c_url_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
                        _jspx_th_c_url_1.setVar("setPlanByIdUrl");
                        _jspx_th_c_url_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${servicePath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                        int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
                        if (_jspx_eval_c_url_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                          if (_jspx_eval_c_url_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                            out = _jspx_page_context.pushBody();
                            _jspx_push_body_count_c_forEach_0[0]++;
                            _jspx_th_c_url_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                            _jspx_th_c_url_1.doInitBody();
                          }
                          do {
                            out.write("\n                    ");
                            //  c:param
                            org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_0 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
                            _jspx_th_c_param_0.setPageContext(_jspx_page_context);
                            _jspx_th_c_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_1);
                            _jspx_th_c_param_0.setName( ServicePlanConfigurationAPI.API_SETPLAN_PARAMETER_ACTION );
                            _jspx_th_c_param_0.setValue("set_plan");
                            int _jspx_eval_c_param_0 = _jspx_th_c_param_0.doStartTag();
                            if (_jspx_th_c_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
                              throw new SkipPageException();
                            }
                            _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
                            out.write("\n                    ");
                            //  c:param
                            org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_1 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
                            _jspx_th_c_param_1.setPageContext(_jspx_page_context);
                            _jspx_th_c_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_1);
                            _jspx_th_c_param_1.setName( ServicePlanConfigurationAPI.API_SETPLAN_PARAMETER_TYPE );
                            _jspx_th_c_param_1.setValue("json");
                            int _jspx_eval_c_param_1 = _jspx_th_c_param_1.doStartTag();
                            if (_jspx_th_c_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_1);
                              throw new SkipPageException();
                            }
                            _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_1);
                            out.write("\n                    ");
                            //  c:param
                            org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_2 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
                            _jspx_th_c_param_2.setPageContext(_jspx_page_context);
                            _jspx_th_c_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_1);
                            _jspx_th_c_param_2.setName( ServicePlanConfigurationAPI.API_SETPLAN_PARAMETER_PLAN_ID );
                            _jspx_th_c_param_2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${servicePlan.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                            int _jspx_eval_c_param_2 = _jspx_th_c_param_2.doStartTag();
                            if (_jspx_th_c_param_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_2);
                              throw new SkipPageException();
                            }
                            _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_2);
                            out.write("\n                ");
                            int evalDoAfterBody = _jspx_th_c_url_1.doAfterBody();
                            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                          } while (true);
                          if (_jspx_eval_c_url_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                            out = _jspx_page_context.popBody();
                            _jspx_push_body_count_c_forEach_0[0]--;
                        }
                        if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_1);
                          throw new SkipPageException();
                        }
                        _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_1);
                        out.write("\n                ");
                        //  c:url
                        org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
                        _jspx_th_c_url_2.setPageContext(_jspx_page_context);
                        _jspx_th_c_url_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
                        _jspx_th_c_url_2.setVar("setPlanByNameUrl");
                        _jspx_th_c_url_2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${servicePath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                        int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
                        if (_jspx_eval_c_url_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                          if (_jspx_eval_c_url_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                            out = _jspx_page_context.pushBody();
                            _jspx_push_body_count_c_forEach_0[0]++;
                            _jspx_th_c_url_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                            _jspx_th_c_url_2.doInitBody();
                          }
                          do {
                            out.write("\n                    ");
                            //  c:param
                            org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_3 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
                            _jspx_th_c_param_3.setPageContext(_jspx_page_context);
                            _jspx_th_c_param_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_2);
                            _jspx_th_c_param_3.setName( ServicePlanConfigurationAPI.API_SETPLAN_PARAMETER_ACTION );
                            _jspx_th_c_param_3.setValue("set_plan");
                            int _jspx_eval_c_param_3 = _jspx_th_c_param_3.doStartTag();
                            if (_jspx_th_c_param_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_3);
                              throw new SkipPageException();
                            }
                            _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_3);
                            out.write("\n                    ");
                            //  c:param
                            org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_4 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
                            _jspx_th_c_param_4.setPageContext(_jspx_page_context);
                            _jspx_th_c_param_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_2);
                            _jspx_th_c_param_4.setName( ServicePlanConfigurationAPI.API_SETPLAN_PARAMETER_TYPE );
                            _jspx_th_c_param_4.setValue("json");
                            int _jspx_eval_c_param_4 = _jspx_th_c_param_4.doStartTag();
                            if (_jspx_th_c_param_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_4);
                              throw new SkipPageException();
                            }
                            _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_4);
                            out.write("\n                    ");
                            //  c:param
                            org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_5 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
                            _jspx_th_c_param_5.setPageContext(_jspx_page_context);
                            _jspx_th_c_param_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_2);
                            _jspx_th_c_param_5.setName( ServicePlanConfigurationAPI.API_SET_SAVE_OR_UPDATE_PARAMETER_PLAN_NAME );
                            _jspx_th_c_param_5.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${servicePlan.name}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                            int _jspx_eval_c_param_5 = _jspx_th_c_param_5.doStartTag();
                            if (_jspx_th_c_param_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_5);
                              throw new SkipPageException();
                            }
                            _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_5);
                            out.write("  \n                ");
                            int evalDoAfterBody = _jspx_th_c_url_2.doAfterBody();
                            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                          } while (true);
                          if (_jspx_eval_c_url_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                            out = _jspx_page_context.popBody();
                            _jspx_push_body_count_c_forEach_0[0]--;
                        }
                        if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_2);
                          throw new SkipPageException();
                        }
                        _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_2);
                        out.write("\n                <a href=\"");
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${baseUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${setPlanByIdUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                        out.write('"');
                        out.write('>');
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${baseUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${setPlanByIdUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                        out.write("</a> OR <br/>\n                <a href=\"");
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${baseUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${setPlanByNameUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                        out.write('"');
                        out.write('>');
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${baseUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${setPlanByNameUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                        out.write("</a>\n                </td>\n              </tr>\n              \n        ");
                        int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      throw new SkipPageException();
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_c_forEach_0.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_c_forEach_0.doFinally();
                    _jspx_tagPool_c_forEach_varStatus_var_items_end.reuse(_jspx_th_c_forEach_0);
                  }
                  out.write("\n        </table>\n    ");
                  int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
                throw new SkipPageException();
              }
              _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
              out.write('\n');
              int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
            throw new SkipPageException();
          }
          _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
          out.write("   \n");
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write('\n');
      out.write('\n');
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_1.setPageContext(_jspx_page_context);
      _jspx_th_c_if_1.setParent(null);
      _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${serviceName eq api_conf_service_name}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n<h3>Sample API Calls</h3>\n");
          //  c:choose
          org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
          _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
          _jspx_th_c_choose_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
          int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
          if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n  ");
              if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
                return;
              out.write("\n  ");
              //  c:otherwise
              org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
              _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
              _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
              int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
              if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n        <table class=\"api\">\n        <tr><th>Service Scenario</th><th>Configuration URL</th></tr>\n             ");
                  //  c:forEach
                  org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items_end.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                  _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
                  _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_1);
                  _jspx_th_c_forEach_1.setVar("exampleScenario");
                  _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${exampleService.scenarios}", java.lang.Object.class, (PageContext)this.getJspContext(), null));
                  _jspx_th_c_forEach_1.setVarStatus("status");
                  _jspx_th_c_forEach_1.setEnd(6);
                  int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
                  try {
                    int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
                    if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\n              <tr>\n                <td valign=\"top\">");
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${exampleScenario.scenarioName}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                        out.write("</td>\n                <td valign=\"top\" class=\"tiny\">\n                ");
                        //  c:url
                        org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
                        _jspx_th_c_url_3.setPageContext(_jspx_page_context);
                        _jspx_th_c_url_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
                        _jspx_th_c_url_3.setVar("setServiceScenarioByIdUrl");
                        _jspx_th_c_url_3.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${servicePath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                        int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
                        if (_jspx_eval_c_url_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                          if (_jspx_eval_c_url_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                            out = _jspx_page_context.pushBody();
                            _jspx_push_body_count_c_forEach_1[0]++;
                            _jspx_th_c_url_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                            _jspx_th_c_url_3.doInitBody();
                          }
                          do {
                            out.write("\n                    ");
                            //  c:param
                            org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_6 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
                            _jspx_th_c_param_6.setPageContext(_jspx_page_context);
                            _jspx_th_c_param_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_3);
                            _jspx_th_c_param_6.setName( ServiceConfigurationAPI.API_SERVICE_ID );
                            _jspx_th_c_param_6.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${exampleService.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                            int _jspx_eval_c_param_6 = _jspx_th_c_param_6.doStartTag();
                            if (_jspx_th_c_param_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_6);
                              throw new SkipPageException();
                            }
                            _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_6);
                            out.write("\n                    ");
                            //  c:param
                            org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_7 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
                            _jspx_th_c_param_7.setPageContext(_jspx_page_context);
                            _jspx_th_c_param_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_3);
                            _jspx_th_c_param_7.setName( ServiceConfigurationAPI.API_SERVICE_SCENARIO_ID );
                            _jspx_th_c_param_7.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${exampleScenario.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                            int _jspx_eval_c_param_7 = _jspx_th_c_param_7.doStartTag();
                            if (_jspx_th_c_param_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_7);
                              throw new SkipPageException();
                            }
                            _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_7);
                            out.write("\n                ");
                            int evalDoAfterBody = _jspx_th_c_url_3.doAfterBody();
                            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                          } while (true);
                          if (_jspx_eval_c_url_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                            out = _jspx_page_context.popBody();
                            _jspx_push_body_count_c_forEach_1[0]--;
                        }
                        if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_3);
                          throw new SkipPageException();
                        }
                        _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_3);
                        out.write("\n                ");
                        //  c:url
                        org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
                        _jspx_th_c_url_4.setPageContext(_jspx_page_context);
                        _jspx_th_c_url_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
                        _jspx_th_c_url_4.setVar("setServiceScenarioByNameUrl");
                        _jspx_th_c_url_4.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${servicePath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                        int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
                        if (_jspx_eval_c_url_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                          if (_jspx_eval_c_url_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                            out = _jspx_page_context.pushBody();
                            _jspx_push_body_count_c_forEach_1[0]++;
                            _jspx_th_c_url_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                            _jspx_th_c_url_4.doInitBody();
                          }
                          do {
                            out.write("\n                    ");
                            //  c:param
                            org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_8 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
                            _jspx_th_c_param_8.setPageContext(_jspx_page_context);
                            _jspx_th_c_param_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_4);
                            _jspx_th_c_param_8.setName( ServiceConfigurationAPI.API_SERVICE_NAME );
                            _jspx_th_c_param_8.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${exampleService.serviceName}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                            int _jspx_eval_c_param_8 = _jspx_th_c_param_8.doStartTag();
                            if (_jspx_th_c_param_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_8);
                              throw new SkipPageException();
                            }
                            _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_8);
                            out.write("\n                    ");
                            //  c:param
                            org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_9 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
                            _jspx_th_c_param_9.setPageContext(_jspx_page_context);
                            _jspx_th_c_param_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_4);
                            _jspx_th_c_param_9.setName( ServiceConfigurationAPI.API_SERVICE_SCENARIO_NAME );
                            _jspx_th_c_param_9.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${exampleScenario.scenarioName}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                            int _jspx_eval_c_param_9 = _jspx_th_c_param_9.doStartTag();
                            if (_jspx_th_c_param_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_9);
                              throw new SkipPageException();
                            }
                            _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_9);
                            out.write("\n                ");
                            int evalDoAfterBody = _jspx_th_c_url_4.doAfterBody();
                            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                          } while (true);
                          if (_jspx_eval_c_url_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                            out = _jspx_page_context.popBody();
                            _jspx_push_body_count_c_forEach_1[0]--;
                        }
                        if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_4);
                          throw new SkipPageException();
                        }
                        _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_4);
                        out.write("\n                 \n                <a href=\"");
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${baseUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${setServiceScenarioByNameUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                        out.write('"');
                        out.write('>');
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${baseUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${setServiceScenarioByNameUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                        out.write("</a> OR <br/>\n                <a href=\"");
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${baseUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${setServiceScenarioByIdUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                        out.write('"');
                        out.write('>');
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${baseUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${setServiceScenarioByIdUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                        out.write("</a>\n                </td>\n              </tr>\n             ");
                        int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      throw new SkipPageException();
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_c_forEach_1.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_c_forEach_1.doFinally();
                    _jspx_tagPool_c_forEach_varStatus_var_items_end.reuse(_jspx_th_c_forEach_1);
                  }
                  out.write("\n\n        </table>\n    ");
                  int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
                throw new SkipPageException();
              }
              _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
              out.write('\n');
              int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
            throw new SkipPageException();
          }
          _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
          out.write("   \n");
          int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      out.write('\n');
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_2.setPageContext(_jspx_page_context);
      _jspx_th_c_if_2.setParent(null);
      _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${serviceName eq api_info_service_name}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n<h3>Sample API Request(s)</h3>\n");
          if (_jspx_meth_c_url_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
            return;
          out.write("\n<table class=\"api\">\n<tr><td><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${baseUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${setDefintionsUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${baseUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${setDefintionsUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
          out.write("</a></td></tr>\n");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_if_3.setPageContext(_jspx_page_context);
          _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
          _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${exampleService != null}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
          int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
          if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write('\n');
              //  c:url
              org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
              _jspx_th_c_url_6.setPageContext(_jspx_page_context);
              _jspx_th_c_url_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
              _jspx_th_c_url_6.setVar("setDefintionsByIdUrl");
              _jspx_th_c_url_6.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${servicePath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
              int _jspx_eval_c_url_6 = _jspx_th_c_url_6.doStartTag();
              if (_jspx_eval_c_url_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_c_url_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_c_url_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_c_url_6.doInitBody();
                }
                do {
                  out.write("\n    ");
                  //  c:param
                  org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_10 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
                  _jspx_th_c_param_10.setPageContext(_jspx_page_context);
                  _jspx_th_c_param_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_6);
                  _jspx_th_c_param_10.setName( ServiceConfigurationAPI.API_SERVICE_ID );
                  _jspx_th_c_param_10.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${exampleService.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                  int _jspx_eval_c_param_10 = _jspx_th_c_param_10.doStartTag();
                  if (_jspx_th_c_param_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_10);
                    throw new SkipPageException();
                  }
                  _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_10);
                  out.write('\n');
                  int evalDoAfterBody = _jspx_th_c_url_6.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_c_url_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_c_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_6);
                throw new SkipPageException();
              }
              _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_6);
              out.write('\n');
              //  c:url
              org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
              _jspx_th_c_url_7.setPageContext(_jspx_page_context);
              _jspx_th_c_url_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
              _jspx_th_c_url_7.setVar("setDefintionsByNameUrl");
              _jspx_th_c_url_7.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${servicePath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
              int _jspx_eval_c_url_7 = _jspx_th_c_url_7.doStartTag();
              if (_jspx_eval_c_url_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_c_url_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_c_url_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_c_url_7.doInitBody();
                }
                do {
                  out.write("\n    ");
                  //  c:param
                  org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_11 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
                  _jspx_th_c_param_11.setPageContext(_jspx_page_context);
                  _jspx_th_c_param_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_7);
                  _jspx_th_c_param_11.setName( ServiceConfigurationAPI.API_SERVICE_NAME );
                  _jspx_th_c_param_11.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${exampleService.serviceName}", java.lang.String.class, (PageContext)this.getJspContext(), null));
                  int _jspx_eval_c_param_11 = _jspx_th_c_param_11.doStartTag();
                  if (_jspx_th_c_param_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_11);
                    throw new SkipPageException();
                  }
                  _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_11);
                  out.write('\n');
                  int evalDoAfterBody = _jspx_th_c_url_7.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_c_url_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_c_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_7);
                throw new SkipPageException();
              }
              _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_7);
              out.write("\n<tr><td><a href=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${baseUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${setDefintionsByIdUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
              out.write('"');
              out.write('>');
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${baseUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${setDefintionsByIdUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
              out.write("</a></td></tr>\n<tr><td><a href=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${baseUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${setDefintionsByNameUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
              out.write('"');
              out.write('>');
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${baseUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${setDefintionsByNameUrl}", java.lang.String.class, (PageContext)this.getJspContext(), null));
              out.write("</a></td></tr>\n\n");
              int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
            throw new SkipPageException();
          }
          _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
          out.write("\n</table> \n\n");
          int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      out.write('\n');
      out.write('\n');
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty servicePlans}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n  <div class=\"info_message\">\n  <strong>No Service Plans defined</strong>, so there's nothing you can do with this configuration API - <i>yet</i>. Create a \n  Service Plan first (see <a href=\"");
        if (_jspx_meth_c_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\">here</a> and then hit the <b>Plans</b> tab), and come back here. \n  </div>\n  ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_url_0.setValue("/home");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty exampleService}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n  <div class=\"info_message\">\n  <strong>No Service with a scenario is defined</strong>, so there's nothing you can do with this configuration API - <i>yet</i>. Create a \n  Service Scenario and then come back here. \n  </div>\n  ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_url_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_5.setPageContext(_jspx_page_context);
    _jspx_th_c_url_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_url_5.setVar("setDefintionsUrl");
    _jspx_th_c_url_5.setValue("/definitions");
    int _jspx_eval_c_url_5 = _jspx_th_c_url_5.doStartTag();
    if (_jspx_th_c_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_5);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_5);
    return false;
  }
}
