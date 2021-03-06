package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import com.mockey.model.*;

public final class serviceInServicePlanFlag_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
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
  private com.mockey.model.Service service;
  private com.mockey.model.ServicePlan servicePlan;

  public com.mockey.model.Service getService() {
    return this.service;
  }

  public void setService(com.mockey.model.Service service) {
    this.service = service;
  }

  public com.mockey.model.ServicePlan getServicePlan() {
    return this.servicePlan;
  }

  public void setServicePlan(com.mockey.model.ServicePlan servicePlan) {
    this.servicePlan = servicePlan;
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    if( getService() != null ) {
      _jspx_page_context.setAttribute("service", getService());
}
    if( getServicePlan() != null ) {
      _jspx_page_context.setAttribute("servicePlan", getServicePlan());
}

    try {
      out.write("\n\n\n\n \n\n\n\n");


if(servicePlan!=null && servicePlan.hasServiceWithMatchingName(service.getServiceName())){
   
   
      out.write("\n    checked\n   ");

}

      out.write("\n\n\n\n\n\n");
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
    }
  }
}
