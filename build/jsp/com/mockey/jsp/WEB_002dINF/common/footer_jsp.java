package com.mockey.jsp.WEB_002dINF.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/tags/version.tag");
  }

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
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

      out.write("\n\n\n<div id=\"footer\">\n  <p class=\"tiny\" style=\"padding-bottom:2em;\" >\n  <span class=\"code_text\"> Version: ");
      if (_jspx_meth_mockey$1tag_version_0(_jspx_page_context))
        return;
      out.write(" |  </span>  \n  For more information, see <a href=\"https://github.com/clafonta/Mockey\">https://github.com/clafonta/Mockey</a></p>\n</div>\n<div id=\"poorStartMessage\" style=\"font-size:0.8em;position:fixed; bottom:10px; right:5px; color:green;\">Oh dang. You need to click the browser's refresh button or enable JavaScript.</div>\n\n</div>\n</body>\n</html>");
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
}
