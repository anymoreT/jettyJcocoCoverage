package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mockey.model.*;
import java.util.*;
import java.text.*;

public final class statusCheckByService_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;

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
  private java.lang.String view;
  private com.mockey.model.Service service;

  public java.lang.String getView() {
    return this.view;
  }

  public void setView(java.lang.String view) {
    this.view = view;
  }

  public com.mockey.model.Service getService() {
    return this.service;
  }

  public void setService(com.mockey.model.Service service) {
    this.service = service;
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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
    if( getView() != null ) {
      _jspx_page_context.setAttribute("view", getView());
}
    if( getService() != null ) {
      _jspx_page_context.setAttribute("service", getService());
}

    try {
      out.write("\n\n\n\n \n\n\n<div class=\"tag_word_group\">\n<span class=\"tag_word_lead\">Last visit:</span>\n");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write(" \n<br />\n<span class=\"tag_word_lead\">Tag(s):</span>\n");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n<p class=\"count-box\">Service ID: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${service.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("</p>  \n</div>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty service.lastVisitSimple}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n<span class=\"tag_word\" id=\"remove-service-last_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${service.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write('_');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${view}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("\"><a href=\"#\" title=\"Delete last visit\" class=\"service-lastvisit-remove remove_grey\" id=\"remove-service-last_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${service.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("\">X</a>\n");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${service.lastVisitSimple}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("</span>\n");
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
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("tagArg");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${service.tagList}", java.lang.Object.class, (PageContext)this.getJspContext(), null));
    _jspx_th_c_forEach_0.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n\t\t<span class=\"tag_word\" id=\"service-tag-id_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${service.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
          out.write('_');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.count}", java.lang.String.class, (PageContext)this.getJspContext(), null));
          out.write('_');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${view}", java.lang.String.class, (PageContext)this.getJspContext(), null));
          out.write("\">\n\t\t\t<a href=\"#\" title=\"Delete tag from this Service\" class=\"service-tag-remove remove_grey\" id=\"remove-service-tag_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${service.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
          out.write('_');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.count}", java.lang.String.class, (PageContext)this.getJspContext(), null));
          out.write("\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tagArg}", java.lang.String.class, (PageContext)this.getJspContext(), null));
          out.write("\">X</a> \n\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tagArg}", java.lang.String.class, (PageContext)this.getJspContext(), null));
          out.write("\n\t\t</span>\t  \n");
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
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
