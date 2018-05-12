package com.mockey.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class help_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
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

      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/common/header.jsp", out, false);
      out.write("\r\n\r\n<div id=\"main2\">\r\n    <div id=\"helpTop\" style=\"position:relative;\">\r\n\t    <div class=\"table_of_contents\" >  \r\n\t\t    <h3 style=\"float:right;padding-right:1em;\">Table of Contents</h3>\r\n\t\t    <div style=\"clear:both;\"></div>\r\n\t\t    <ul>\r\n\t\t        <li>&#187; <a href=\"#bigpicture\">Big Picture</a></li>\r\n\t\t        <li>&#187; <a href=\"#storage\">Storage</a></li> \r\n\t\t        <li>&#187; <a href=\"#mockservice\">Mock Service</a></li>\r\n\t\t        <li>&#187; <a href=\"#plan\">Service Plan</a></li>\r\n\t\t        <li>&#187; <a href=\"#scenario\">Mock Service Scenario</a></li>\r\n\t\t        <li>&#187; <a href=\"#twisting\">Twisting</a></li>\r\n\t\t        <li>&#187; <a href=\"#record\">Get Started - Record Stuff</a></li>\r\n\t\t        <li>&#187; <a href=\"#flush_feature\">Flush</a></li>\r\n\t\t        <li>&#187; <a href=\"#export_upload\">Export/Upload</a></li>\r\n\t\t        <li>&#187; <a href=\"#url_injection\">URL Injection</a></li>\r\n\t\t        <li>&#187; <a href=\"#merge_services\">Merge Services</a></li>\r\n\t\t        <li>&#187; <a href=\"#initialization\">Initialization</a></li>\r\n");
      out.write("\t\t        <li>&#187; <a href=\"#good_things_to_test\">Good Things to Test</a></li>\r\n\t\t        <li>&#187; <a href=\"#url_recommendations\">URL Config Recommendations</a></li>\t        \r\n\t\t        <li>&#187; <a href=\"#robots\">Robots</a></li>  \r\n\t\t        <li>&#187; <a href=\"#service_eval_rules\">Service Request Validation Rules</a></li>\r\n\t\t        <li>&#187; <a href=\"#getting_the_right_scenario\">Getting the Right Scenario</a></li>\r\n\t\t        <li>&#187; <a href=\"#response_schema\">Response JSON Schema</a></li> \r\n\t\t        <li>&#187; <a href=\"#status\">Status</a></li> \r\n\t\t        <li>&#187; <a href=\"#startup\">Start Up Configurations</a></li> \r\n\t\t    </ul>\r\n\t    </div>\r\n\t    <div style=\"\">\r\n\t\t<a href=\"#bigpicture\" name=\"bigpicture\"></a> \r\n\t\t<h2>The Big Picture</h2>\r\n\t\t   <strong>Mockey</strong> is a tool for testing application interactions over http.</p>\r\n\t\t   <p><img src=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" /></p>\r\n\t\t</div>\r\n\t</div>\r\n\t<a href=\"#storage\" name=\"storage\"></a>\r\n\t<div class=\"help_section\">\r\n        <h2>Storage</h2>\r\n        <p>\r\n        Mockey can run as <strong>In Memory Only</strong> or <strong>Writing to File</strong>. If in-memory only, all definitions and settings will be lost upon restart of Mockey. If writing-to-file, then all changes will persist upon a restart. \r\n    \t</p>\r\n    \t<p>\r\n         Storage state is managed by Mockey's 'transient' configuration flag. If transient is 'true' (<a href=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\">transient_state=true</a>), then configuration changes are in-memory <b>only</b> and not persisted to the file system. This is good for people \r\n        or robots who want to play with Mockey settings and not infect any source files that were used to initialized \r\n        Mockey. If the transient flag is 'false', (<a href=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\">transient_state=false</a>), \r\n        then all configuration definitions and changes will be written to the file system.  <b>Note:</b> right after the transient \r\n        setting is turned off (<i>set to false</i>), everything in-memory is written to the file system. \r\n        </p>\r\n        <p class=\"alert_message\" style=\"position:relative;\">\r\n          <img style=\"float:right;\" height=\"30px\" src=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\" />\r\n          <b>Warning:</b> misunderstanding and misuse of this storage configuration (aka <b>transient</b> flag) can result in a huge painful thing. If you're creating services and making changes with the transient setting set to true, then all your work will be lost once you restart Mockey.   \r\n        </p>\r\n        <p>\r\n        Why is <i>transient</i> needed, and why is it a good thing? Creation of data within Mockey is a good thing, and it's especially\r\n        good if you save this data to a source code repository like CVS, Peforce, Git, SVN, etc. But it may not be a great thing to have\r\n        your source code repo flag Mockey files as dirty when all you did was toggle things on or off or changed a desired \r\n        scenario setting. If you are happy with your new data and configuration changes, and you want your source code repot tool to \r\n        flag/find your changes, then be sure the transient setting \r\n        is OFF (set to false). \r\n        </p>\r\n    </div>\r\n    <a href=\"#mockservice\" name=\"mockservice\"></a>\r\n");
      out.write("\t<div class=\"help_section_zebra\">\r\n\t\t<h2>Mock Service</h2>\r\n\t\t<p>\r\n\t\t A mock service can be a proxy to a real service, enabling you to inspect request and response messages\r\n\t\t being exchanged. You can set up Mockey to go through a corporate proxy server (see <a href=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\">Proxy Settings</a>). \r\n\t\t There's support for HTTP and HTTPS interactions (if your proxy server or endpoint service is https). Be sure to check out your service's History\r\n\t\t to inspect and save a past conversation as a Service Scenario.                       \r\n\t    </p>\r\n    </div>\r\n    <a href=\"#plan\" name=\"plan\"></a> \r\n    <div class=\"help_section\">\r\n\t    <h2>Service Plan</h2>\r\n\t    <p>\r\n\t    A service plan is a snap shot of your service and scenario settings. For example, you toggle your service\r\n\t    and scenario settings to represent a Gold Member. Then you toggle your service and scenario settings to \r\n\t    represent a Silver Member. Instead of spending your time toggling back an forth, you would save your settings\r\n\t    for the Gold Member as a \"Gold Member\" plan and Silver Member settings as \"Silver Member\" plan. \r\n\t    <div class=\"info_message sidebarme\"><strong>Note:</strong> Service Plans are not the most reliable things. If you \r\n\t    frequently add and remove scenarios or create and delete services, the service plans get stale and start to\r\n");
      out.write("\t    smell bad. </div>\r\n\t    </p>\r\n\t</div>\r\n\t<a href=\"#scenario\" name=\"scenario\"></a>\r\n    <div class=\"help_section_zebra\">\r\n\t\t<h2>Mock Service Scenario</h2>\r\n\t\t<p>\r\n\t    A mock service can have 0 or more <i>mock service scenario</i> definitions associated with it. \r\n\t    This is handy if you don't want to proxy to a real service and want to explicitly define \r\n\t\tyour mock service's response.      \r\n\t    </p>\r\n\t    <p>\r\n\t    <h3>Match Argument</h3>\r\n\t     Setting your mock service to \r\n\t\t <strong>Static</strong> means your mock service will always return the same mock service scenario, no matter what the request is. <strong>Dynamic</strong> means, Mockey\r\n\t\t  inspects the incoming request message for a specific <b>match argument</b>. If the incoming request message contains this match argument \r\n\t\t  (either <i>string</i> or satisfies the <i>rules</i> for <a href=\"#getting_the_right_scenario\">Getting the Right Scenario</a>), \r\n\t\t  then this service \r\n\t\t  scenario's response message will be the response. If more than one scenario is defined with this matching argument, then the first matched \r\n");
      out.write("\t\t  scenario's response message will be returned. If no scenario is found with a matching argument, a plain text error message will display.\r\n\t\t  You only need to define a match argument per service scenario for <u>dynamic</u> scenarios, and does not apply to static or proxy.\r\n\t    </p>\t    \r\n\t    <p style=\"text-align:center;\"><img src=\"");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("\" /></p>\r\n\t    <a href=\"#beware_of_match\" name=\"beware_of_match\"></a>\r\n\t    <p class=\"alert_message\" style=\"position:relative;\">\r\n\t      <img style=\"float:right;\" height=\"30px\" src=\"");
      if (_jspx_meth_c_url_6(_jspx_page_context))
        return;
      out.write("\" />\r\n          <b>Beware:</b> Let's say you have <i>Scenario A</i> with match argument '123' and <i>Scenario B</i> with match argument 'ABC', and \r\n          an incoming request with value 'ABC123'. Which scenario will be returned, A or B? There's no guarantee on what Mockey will respond \r\n          with. Let's say in addition, you have a <i>Scenario C</i> with match argument 'ABC123' and the incoming request includes the argument\r\n          'ABC123'. Which scenario will be returned, A, B, or C, since all match-arguments are in the request? In this case, <i>Scenario C</i> \r\n          will always be returned because it has the greatest length match argument, 6 characters versus 3 characters. \r\n          <br /><br />\r\n          If you are looking for an exact value, then use rules (see <a href=\"#getting_the_right_scenario\">Getting the Right Scenario</a>) with type 'regex_required' and do not depend\r\n          on a simple text search. \r\n        </p>\r\n\t    <p>\r\n\t    <h3>Tags</h3>\r\n\t    You can add 0 or more tags to a Scenario. Why is this good? Tags can be used for many things, some include but not limited to:\r\n");
      out.write("\t    <ul>\r\n\t    <li>Tag scenarios to let people know what they are designed for, e.g.Android or iOS, mobile or non-mobile, July's Release, etc.</li>\r\n\t    <li>Filter your view, e.g. \"<i>I only want to see Scenarios and Services tagged for testing the August release.</i>\"</li>\r\n\t    </ul>\r\n\t    </p>\r\n\t    <p>\r\n\t    <h3>HTTP Response Status</h3>\r\n\t    By default, all things are set to HTTP 200 (OK) but feel free to change this \r\n\t    if you need to test how your application handles 500, 404, 303s, etc. \r\n\t    </p>\r\n\t    <a href=\"#error_handling\" name=\"error_handling\"></a>\r\n        <h2>Error Handling</h2>\r\n        When you create a <strong>Scenario</strong>, you'll see two checkboxes. Here's what they do:\r\n        <h4>&#187; Service Scenario Error Response</h4>\r\n        <p>\r\n        If a service scenario is flagged as a 'Service Error Response', it will be returned by Mockey if an error occurs \r\n        when calling the service. An error can be caused by a timeout from calling a real service or inability \r\n        to parse data. \r\n");
      out.write("        </p>\r\n        \r\n        <h4>&#187; Universal Error Response</h4>\r\n        <p>\r\n        If a service scenario is flagged as a 'Universal Error Response', it will be returned by Mockey if an error occurs \r\n        when calling a service <i>and</i> a scenario is not defined as a <i>Service Scenario Error Response</i>. The purpose of this \r\n        feature is to provide one place to define a universal error message, without the need to create an error\r\n        scenario for each service. <b>Note:</b> Only one scenario out of all services can be flagged as universal. \r\n        </p>\r\n        <p class=\"alert_message\" style=\"position:relative;\">\r\n          <img style=\"float:right;\" height=\"30px\" src=\"");
      if (_jspx_meth_c_url_7(_jspx_page_context))
        return;
      out.write("\" />\r\n          <b>Warning:</b> use with caution. If you flag a valid looking Scenario as your universal error or \r\n          service error, you'll see valid data, unknowing of the mysteries and real errors \r\n        that are working against you. This can lead to trouble. \r\n        </p>\r\n\t    \r\n    </div>\r\n    <a href=\"#twisting\" name=\"twisting\"></a>\r\n    <div class=\"help_section\">\r\n\t    <h2>Twisting</h2>\r\n\t    <p>\r\n\t    Twisting refers to taking incoming requests from URL/Domain X and mapping them to URL/Domain Y. \r\n\t    <ul>\r\n\t      <li>Twisting is used for services set to <strong>Proxy</strong>, <strong>Static</strong> or <strong>Dynamic</strong></li>\r\n\t    </ul>\r\n\t    <strong>When would I want to use Twisting?</strong> When your client application doesn't\r\n\t        easily allow you to point to different environments or when some requests should be answered by the real\r\n\t        service but other requests need to be answered by your sandbox. \r\n\t        <div class=\"info_message\">\r\n\t            <h4>How Twisting Works</h4>\r\n");
      out.write("\t            <p>\r\n\t            Let's say Mockey receives an incoming request: \r\n\t            <div class=\"code\">http://127.0.0.1:8080/service/http://<b>uat1</b>.mystartup.com/catalog/list</div>\r\n\t            </p>\r\n\t            <p>\r\n\t            And let's say Twisting is on with the following twist configuration:\r\n\t            <div class=\"code\"><strong>\"Make sure everything hits the QA Environment, not UAT\"</strong>\r\n\t\t            <ul style=\"list-style: none;\">\r\n\t\t\t            <li>Here are the find and replace patterns:</li>\r\n\t\t\t            <li>  \r\n\t\t\t\t\t\t\t<table class=\"api\">\r\n\t\t\t\t            <tr><th>Find...</th><th>Replace with...</th></tr>\r\n\t\t\t\t            <tr><td>uat1.mystartup.com</td><td>qa1.mystartup.com</td></tr>\r\n\t\t\t\t            <tr><td>uat2.mystartup.com</td><td>qa1.mystartup.com</td></tr>\r\n\t\t\t\t            <tr><td>qa3.mystartup.com</td><td>qa1.mystartup.com</td></tr>\r\n\t\t\t\t            </table>\r\n\t\t\t\t       </li>\r\n\t\t            </ul>\r\n\t            </div>\r\n\t            <p>\r\n\t            Based on the Twisting configuration above, Mockey will take the incoming request and <i>twist</i> the \r\n");
      out.write("\t            request to the following <b>new</b> URL:\r\n\t            <div class=\"code\">http://127.0.0.1:8080/service/http://<b>qa1</b>.mystartup.com/catalog/list</div>\r\n\t            ..and then proxy that request. \r\n\t            </p>\r\n\t            \r\n\t        </div>\r\n\t    </p>\r\n\t</div>\r\n    <a href=\"#record\" name=\"record\"></a> \r\n\t<div class=\"help_section_zebra\">\r\n\t    <h2>Get Started - Record Stuff</h2>\r\n\t    <p>\r\n\t    Mockey can proxy to a desired URL/service, record it, and create a new\r\n\t\tservice definition for you. Be sure to check the service defintion's\r\n\t\thistory link to inspect the request and response messages.\r\n\t\t\t<div class=\"info_message\">\r\n\t\t\t    <h4>How to Record</h4>\r\n\t\t\t\t<p>\r\n\t\t\t\tFirst, place Mockey's URL in front of the service URL you want to\r\n\t\t\t\trecord, something like this:\r\n\t\t\t\t<div class=\"code\">[mockey_ip]:[port]<b>[/Context Root]/service/</b>[whatever_service_you_want_to_record]</div>\r\n\t\t\t\t</p>\r\n\t\t\t\t<p>\r\n\t\t\t\tSecond, go back to Mockey's menu and click 'All Services'. You should\r\n\t\t\t\tsee some auto generated service definitions. \r\n");
      out.write("\t\t\t\t</p>\r\n\t\t\t\t<p>Third, click on the auto generated 'history' link; you should see your IP address. Click on \r\n\t\t\t\tit to see the request and response transaction(s) you just made.\r\n\t\t\t\t\r\n\t\t\t\t<h4>Examples</h4>\r\n\t\t\t\t<div >\r\n\t\t\t\t<ul id=\"simple\">\r\n\t\t\t\t\t<li>1) <a href=\"");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write('"');
      out.write('>');
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write("</a></li>\r\n\t\t\t\t\t<li>2) <a href=\"");
      if (_jspx_meth_c_out_2(_jspx_page_context))
        return;
      out.write('"');
      out.write('>');
      if (_jspx_meth_c_out_3(_jspx_page_context))
        return;
      out.write("</a></li>\r\n\t\t\t\t</ul>\r\n\t\t\t\t</div>\r\n\t\t\t\t<p>\r\n\t\t\t\tAfter clicking on one of these example links above, click <a href=\"");
      if (_jspx_meth_c_url_8(_jspx_page_context))
        return;
      out.write("\">here</a> to see what just happened.  \r\n\t\t\t\t</p>\r\n\t\t\t</div>\r\n\t\t</p>\r\n\t</div>\r\n\t<a href=\"#flush_feature\" name=\"flush_feature\"></a>\r\n\t<div class=\"help_section\" style=\"position:relative;\">\r\n\t    <h2>Flush</h2>\r\n\t    <div style=\"position:absolute; top: 5px; right: 5px;\"><img src=\"");
      if (_jspx_meth_c_url_9(_jspx_page_context))
        return;
      out.write("\"></div>\r\n\t    <p>\r\n\t    Clicking on the <strong>Flush</strong> menu button will clear out everything, allowing you to start with a clean slate. \r\n\t    </p>\r\n\t</div>\r\n\t<a href=\"#export_upload\" name=\"export_upload\"></a>\r\n\t<div class=\"help_section_zebra\">\r\n\t    <h2>Export/Upload - huh?</h2>\r\n\t    <p>\r\n\t    There isn't a database for this web tool, everything is kept in memory and written to a local file. \r\n\t    After you get everything set up, <strong>export</strong> your configuration\r\n\t    to a <strong>mockservice.xml</strong> file; you can share this file with others if you like.  \r\n\t     </p>\r\n\t</div>\r\n\t<a href=\"#url_injection\" name=\"url_injection\"></a>\r\n\t<div class=\"help_section\">\r\n        <h2>URL Injection</h2>\r\n        <p>\r\n        <strong>When would URL injection be important?</strong> Mockey tries to be smart about things. With an incoming HTTP URL request, \r\n        Mockey will try to see if any Services are defined (or associated) to the incoming HTTP URL request, whether its the <strong>Mock URL</strong>\r\n");
      out.write("        or one of the <strong>Real URL(s)</strong>. If no Service definition is associated with the incoming HTTP URL, then Mockey will do its best\r\n        to proxy the requests.\r\n        <br /><br />\r\n        <strong style=\"color:red;\">TODO: Need logic flow diagram here.</strong>\r\n        <br /><br />\r\n        If you defined many Services and Scenarios to work with a specific environment (e.g. <i>https://<b>qa-3</b>.environment.domains.com/cataglog/product</i>), \r\n        then you're kind of hosed if all requests start coming from another URL (e.g. <i>https://<b>sandbox</b>.environment.domains.com/cataglog/product</i>).\r\n        \r\n        <br /><br />\r\n        URL Injection allows you to quickly tell Mockey how to associate Service definitions associated with one environment\r\n        (e.g. qa3) to another environment (e.g. sandbox).  \r\n        <br />\r\n        <div class=\"info_message\">\r\n       <h3>Example</h3>\r\n       Before injection:\r\n       <p><strong>Service XYZ</strong> has the following real URLs:\r\n      \r\n");
      out.write("                <ul>\r\n                  <li>http://qa1.domain.com/authentication</li>\r\n                  <li>http://qa2.domain.com/authentication</li>\r\n                </ul>\r\n                </p>\r\n                After injecting with match pattern <i>qa1.domain.com</i> and \r\n                replace pattern <i>qa8.domain.com</i>, we get:\r\n                <p>\r\n                <strong>Service XYZ</strong> has the following real URLs:\r\n      \r\n                <ul>\r\n                  <li>http://qa1.domain.com/authentication</li>\r\n                  <li>http://qa2.domain.com/authentication</li>\r\n                  <li>http://qa8.domain.com/authentication</li>\r\n                </ul>\r\n                </p>\r\n        </div>\r\n      \r\n         \r\n        </p>\r\n    </div>\r\n    <a href=\"#merge_services\" name=\"merge_services\"></a>\r\n    <div class=\"help_section_zebra\">\r\n        <h2>Merge Services</h2>\r\n        <p>\r\n         <strong>When would I want to Merge Services?</strong> Whenever you see duplication of Service and/or Scenario definitions. \r\n");
      out.write("         This can happen if you have Scenarios tied to duplicate Service definition (e.g. Service X: <i>http://mystartup.com/authentication</i> and \r\n         Service Y: <i>http://mystartup.com/login</i> - both referring to the same thing). \r\n         <br /><br />\r\n         Merge them! \r\n         <br /><br />Merging will create a new Service definition\r\n         associated to multiple real URLs (e.g. Service X: <i>http://mystartup.com/authentication</i> and \r\n         <i>http://mystartup.com/login</i> ) and combine all unique Scenario definitions into the new Service.\r\n         \r\n         </p>\r\n    </div>\r\n    <a href=\"#initialization\" name=\"initialization\"></a>\r\n    <div class=\"help_section\">\r\n      <h2>Initialization</h2>\r\n      <p>\r\n      There are few ways to initialize Mockey. Here they are:\r\n      <ul>\r\n        <li><b>File upload:</b> use the <a href=\"");
      if (_jspx_meth_c_url_10(_jspx_page_context))
        return;
      out.write("\">Import</a> feature.</li>\r\n        <li><b>File location:</b> file is located on the same server where Mockey is running.</li>\r\n        </ul>\r\n        If you know the path to the file and Mockey has access to it, then you can tell Mockey\r\n        to initialize itself, either pre or post start-up. Here's how:\r\n      \r\n       <div class=\"info_message\">\r\n       <h3>At Startup</h3>\r\n       Let's say this is what you have:\r\n       <div class=\"code code_text\">\r\n       &gt; ls <br />\r\n       &gt; Mockey.jar some_file.xml <b>mock_service_definitions.xml</b><br />\r\n       &gt; java -jar Mockey.jar<br />\r\n       </div>\r\n       By default, Mockey will initialize itself with <b>mock_service_definitions.xml</b>. If the \r\n       file isn't there, it will create a new one and write it out. \r\n\r\n       <!-- TODO: Bring this back.\r\n       Alternatively, you could pass\r\n       it an argument:\r\n       <div class=\"code code_text\">\r\n       &gt; ls <br />\r\n       &gt; Mockey.jar <b>some_file.xml</b> mock_service_definitions.xml<br />\r\n");
      out.write("       &gt; java -jar Mockey.jar -f some_file.xml<br />\r\n       </div>\r\n       Now, Mockey will initialize itself with <b>some_file.xml</b> upon startup <b>but</b> it will\r\n       continue to write itself out to <b>mock_service_definitions.xml</b> after initialization. \r\n\t\t-->\r\n\r\n       For more options,\r\n       try the <span class=\"code_text\">--help</span> argument.\r\n       <div class=\"code code_text\">\r\n       &gt; java -jar Mockey.jar --help\r\n       </div>\r\n       <h3>Post Startup</h3>\r\n       Pass the <span class=\"code_text\">init</span> and <span class=\"code_text\">file</span> arguments to the Home service. <i>File</i> refers\r\n       to a file relative to where the Mockey.jar is located (and Mockey is allowed to read it). \r\n       <div class=\"code code_text\">\r\n       &gt; http://localhost:8080/Mockey/home&amp;action=init&file=some_file.xml <br /><br />\r\n       or <br /><br />\r\n       &gt; http://localhost:8080/Mockey/home?action=init&file=/Users/someuser/Work/some_file.xml <br /><br />\r\n       or (to get a JSON response back instead of HTML)<br /><br />\r\n");
      out.write("       &gt; http://localhost:8080/Mockey/home?action=init<b>&type=json</b>&file=/Users/someuser/Work/some_file.xml\r\n       </div>\r\n       If <span class=\"code_text\">some_file.xml</span> does exist, then Mockey will <a href=\"#flush_feature\">Flush</a>\r\n        it's configurations and initialize itself with <span class=\"code_text\">some_file.xml</span>. For more \r\n        information, see <a href=\"");
      if (_jspx_meth_c_url_11(_jspx_page_context))
        return;
      out.write("\">Configuration API</a>.\r\n        </div>\r\n      </p>\r\n    </div>\r\n    <a href=\"#good_things_to_test\" name=\"good_things_to_test\"></a>\r\n    <div class=\"help_section_zebra\">\r\n\t    <h2>Good Things to Test</h2>\r\n\t    <p>\r\n\t\t    Here's a short list of things Mockey is good for. \r\n\t\t    <ul>\r\n\t\t    <li><i>Connection smarts:</i> Try setting the hang time for 2 minutes, then see if your application's timeout connection setting works. Remember, \r\n\t\t    sometimes the service your application interacts with is slow and may receive a connection but not let go.</li>\r\n\t\t    <li><i>Garbage handling:</i> Be sure to create bad responses (e.g. Mockey responds with the word 'GARBAGE') and see if your application handles this gracefully. </li>\r\n\t\t    </ul>      \r\n\t    </p>\r\n    </div>\r\n    <a href=\"#url_recommendations\" name=\"url_recommendations\"></a>\r\n    <div class=\"help_section\">\r\n\t    <h2>URL Config Recommendations</h2>\r\n\t\t<p>\r\n\t\t    If your application points to 1 or more services like this:\r\n\t\t    <ul>     \r\n\t\t      <li>http://someservice.com/catalog/product</li>\r\n");
      out.write("\t\t      <li>http://someotherservice.com/authentication</li>\r\n\t\t      <li>http://anotherservice.com/?wsdl</li>      \r\n\t\t    </ul>\r\n\t\t    ...you probably have this in a configuration file (not in code, right?). You may want to define a <i>base</i> url parameter, \r\n\t\t    like this:\r\n\t\t    <div class=\"code code_text\">\r\n\t\t\t    <ul>\r\n\t\t\t      <li>DEV_BASE_URL=http://localhost:8090/Mockey/service/</li>      \r\n\t\t\t      <li>SERVICE_URL_1=http://someservice.com/catalog/product</li>\r\n\t\t\t      <li>SERVICE_URL_2=http://someotherservice.com/authentication</li>\r\n\t\t\t      <li>SERVICE_URL_3=http://anotherservice.com/?wsdl</li>      \r\n\t\t\t    </ul>    \r\n\t\t    </div>\r\n\t\t    You then can create URLs by pre-pending the DEV_BASE_URL to your SERVICE_URL definitions. When it comes time to go to production, \r\n\t\t    just define DEV_BASE_URL as an empty string. \r\n\t    </p>\r\n\t</div>\r\n\t<a href=\"#robots\" name=\"robots\"></a>\r\n\t<div class=\"help_section_zebra\">\r\n        <h2>Robots</h2>\r\n        <p>\r\n        Mockey is not only for Humans. Robots can use it too. See <a href=\"service_api\">here</a>.\r\n");
      out.write("        </p>\r\n    </div>\r\n    \r\n    <a href=\"#service_eval_rules\" name=\"service_eval_rules\"></a>\r\n    <div class=\"help_section\">\r\n        <h2>Service Request Validation Rules</h2>\r\n        <p class=\"quote\">\"Hey, am I sending garbage over the wall, or am I meeting the intended service API?\"</p>\r\n\t\t<p>Mockey has some hooks for you to evaluate incoming requests defined in a JSON formatted rules. These rules can be applied to incoming \r\n\t\t\trequest for the validation. </p>\r\n\t\t\r\n\t\t<p>You can apply evaluation rules at a Service level to help flag potential errors (\"<i>Hey, you're missing a required request attribute!</i>\") and it works as follows:\r\n\t\t\t<ul>\r\n\t\t\t\t<li>A request is made to Mockey. </li>\r\n\t\t\t\t<li>Mockey finds the appropriate mock Service. If request validation is <b>enabled</b>, then Mockey will scan\r\n\t\t\t\tthe incoming request with your defined rules. </li>\r\n\t\t\t\t<li>If evaluation errors/issues are found, then they will be logged and viewable in the <a href=\"");
      if (_jspx_meth_c_url_12(_jspx_page_context))
        return;
      out.write("\">History</a> page.</li>\t\r\n\t\t\t</ul>\r\n\t\t</p>\r\n\t\t<p>Here's an example definition: </pre>\r\n<pre class=\"code\" style=\"font-size:0.9em;\">\r\n\t// EXAMPLE\r\n{\r\n    \"parameters\": [\r\n        {\r\n            \"key\": \"ticker\",\r\n            \"desc\": \"A value must be provided with the 'ticker' parameter, and it must contain the letter 'g'. Providing 'GOOG' is valid, but 'FB' will flag an error.\",\r\n            \"value_rule_arg\": \"g\",\r\n            \"value_rule_type\": \"string_required\"\r\n        },\r\n        {\r\n            \"key\": \"date\",\r\n            \"desc\": \"Optional date value, but if provided, must satisfy mm/DD/yyyy format.\",\r\n            \"value_rule_arg\": \"^((1[0-2]|0?[1-9])/(3[01]|[12][0-9]|0?[1-9])/(?:[0-9]{2})?[0-9]{2})?$\",\r\n            \"value_rule_type\": \"regex_optional\"\r\n        }\r\n    ],\r\n    \"headers\": [\r\n        {\r\n            \"key\": \"page_id\",\r\n            \"desc\": \"A page_id value MUST be provided, any non-empty string value.\",\r\n            \"value_rule_arg\": \"\",\r\n            \"value_rule_type\": \"string_required\"\r\n        }\r\n");
      out.write("    ],\r\n    \"body\": [\r\n        {\r\n            \"desc\": \"The text 'username' is required to be present in the POST body.\",\r\n            \"value_rule_arg\": \"username\",\r\n            \"value_rule_type\": \"string_required\"\r\n        }\r\n    ],\r\n    \"url\": [\r\n        {\r\n            \"desc\": \"The value '123' is required to be present in the RESTful URL. For example 'http://127.0.0.1/service/customer/123/invoice'\",\r\n            \"value_rule_arg\": \"\\\\b123\\\\b\",\r\n            \"value_rule_type\": \"regex_required\"\r\n        }\r\n    ]\r\n}\r\n</pre>\r\n\t</div>\r\n\t\t\r\n    <a href=\"#getting_the_right_scenario\" name=\"getting_the_right_scenario\"></a>\r\n    <div class=\"help_section_zebra\">\r\n\t\t<h2>Getting the Right Scenario (for Dynamic Services)</h2>\r\n\t\t<p class=\"quote\">\"I am writing to a RESTful API, where <b>PUT</b> should get scenario 'A' and <b>DELETE</b> should get scenario 'B', but how do I do this?\"</p>\r\n\t\t<p>\r\n\t\tWhen evaluation rules are applied to a Scenario, they are processd only when the Scenario's parent Service is set to <strong>Dynamic</strong>. \r\n");
      out.write("\t\tIf the Service is set to Dynamic, and the Scenario has a simple <i>match</i> argument or evaluation <i>rules</i> defined, then the incoming \r\n\t\trequest will be evaluated. \tIf the request satisfies the Scenario's matching argument or rules, then that Scenario is returned.     \r\n\t\t<br /><br />For example, if you want your request \r\n\t\t<span class=\"code_text\"> http://127.0.0.1:8080/service/customer?customer=111&invoice=222</span> to return Scenario B, \r\n\t\tthen here's an example setup: \r\n\t\t\r\n        <pre class=\"code\" style=\"font-size:0.9em;\">\r\n// EXAMPLE Service A with 'Scenario A' \r\n{\r\n    \"parameters\": [\r\n        {\r\n            \"key\": \"customer\",\r\n            \"value_rule_arg\": \"33\",\r\n            \"value_rule_type\": \"string_required\"\r\n        },\r\n        {\r\n            \"key\": \"invoice\",\r\n            \"value_rule_arg\": \"44\",\r\n            \"value_rule_type\": \"string_required\"\r\n        }\r\n    ]\r\n}\r\n</pre>\r\n<pre class=\"code\" style=\"font-size:0.9em;\">\r\n// EXAMPLE Service A with 'Scenario B'\r\n{\r\n    \"parameters\": [\r\n        {\r\n");
      out.write("            \"key\": \"customer\",\r\n            \"value_rule_arg\": \"111\",\r\n            \"value_rule_type\": \"string_required\"\r\n        },\r\n        {\r\n            \"key\": \"invoice\",\r\n            \"value_rule_arg\": \"222\",\r\n            \"value_rule_type\": \"string_required\"\r\n        }\r\n    ]\r\n}\r\n</pre>\r\n<pre class=\"code\" style=\"font-size:0.9em;\">\r\n// EXAMPLE Service A with 'Scenario C'\r\n{\r\n    \"url\": [\r\n        {\r\n            \"desc\": \"If the value '123' is in the RESTful URL. For example 'http://127.0.0.1/service/customer/123'\",\r\n            \"value_rule_arg\": \"\\\\b123\\\\b\",\r\n            \"value_rule_type\": \"regex_required\"\r\n        }\r\n    ]\r\n}\r\n</pre>\r\n\r\n<h3>Wild card</h3>\r\nThere is limited wildcard support for those who need to evaluate values not necessarily tied to a specific parameter key. \r\nFor example: \r\n\r\n<pre class=\"code\" style=\"font-size:0.9em;\">\r\n// EXAMPLE wild card\r\n{\r\n    \"parameters\": [{\r\n        \"key\": \"*\",\r\n        \"value_rule_arg\": \"^(aaa)$\",\r\n        \"value_rule_type\": \"regex_required\"\r\n    },{\r\n        \"key\": \"*\",\r\n");
      out.write("        \"value_rule_arg\": \"^(bbb)$\",\r\n        \"value_rule_type\": \"regex_required\"\r\n    }]\r\n}\r\n</pre>\r\nThis definition will work for either <span class=\"code_text\">http://127.0.0.1:8080/service/customer?ticker=aaa&customer=bbb</span> or\r\n<span class=\"code_text\">http://127.0.0.1:8080/service/customer?invoice=bbb&channel=aaa</span>. \r\n\r\n\t\t</p>\r\n\t\t<h3>Rules API</h3>\r\n        <p>\r\n\t\t    The JSON rules API supports an array of evaluation rules per group type. The group type supported are:\r\n\t\t    <ul>\r\n\t\t\t\t<li><strong>parameters</strong>: for the purpose of evaluating key value pairs.</li>\r\n\t\t\t\t<li><strong>headers</strong>: for the purpose of evaluating key value pairs.</li>\r\n\t\t\t\t<li><strong>body</strong>: for the purpose of evaluating the existence of specific content contained in a POST body payload.</li>\r\n\t\t\t\t<li><strong>url</strong>: for the purpose of evaluating the existence of specific content related to the incoming request URL, i.e. RESTful URLs containing token identifiers.</li>\r\n\t\t    </ul>\r\n\t    </p>\r\n\t    <h4>Are rules handled with AND or OR?<h4>\r\n");
      out.write("\t    <ul>\r\n\t\t    <li>All rules per TYPE will be treated as 'AND'. For example, all key/value pairs in 'parameters' must exist AND be valid.</li>\r\n\t\t\t<li>All rules between TYPEs will be treated as 'OR'. For example, all key/value pair rules must be TRUE in 'parameters' OR all key/value rules must be true for 'headers'. </li>\r\n\t    </ul>\r\n\t    <p>\r\n\t    Each evaluation rule includes the following:\r\n\t\t\r\n        <table class=\"api\">\r\n        <thead>\r\n        <tr><th>KEY</th><th>DESCRIPTION</th></tr>\r\n          </thead>\r\n        <tbody>\r\n        <tr><td>key</td><td><strong>Required</strong> for rule group type 'headers' and 'parameters'. \r\n        The name of the parameter-key or header-key that needs a non-empty string value. Use <strong>&#42;</strong> for wildcard \r\n        support, meaning you want to apply evaluation rules to values only.   \r\n        \r\n        <br /></br /><strong>Ignored</strong> for rule group type 'body' and 'url'.</td></tr>\r\n        <tr><td>desc</td><td><strong>Optional.</strong> A short description of what you're trying to accomplish. Note: \r\n");
      out.write("        This message will display in the History page if an evaluation issue occurs with a Service (not Scenario) to inform the user that they may be missing request parameters. </td></tr>\r\n        <tr><td>value_rule_arg</td><td>Can be an empty string, character, non-empty string or string representing a regex' value. </td></tr>\r\n        <tr><td>value_rule_type</td><td>Tells Mockey <i>how</i> to evaluate the key-value pair. Valid values are\r\n\t<ul>\r\n\t\t<li><b>string_required</b>: Case insensitive. The string or character must be present in the non-empty-VALUE associated to the parameter (or header) KEY. \r\n\t\t\tYou could use a REGEX here, like <span class=\"code_text\">^(?!\\s*$).+</span>, but for those who just want a simple character or text search, you can use this instead\r\n\t\t\tof dealing with the complexities of regular-<i>confusing?</i>-expressions. \r\n\t\t\tPlease read the <a href=\"#beware_of_match\">beware</a> section before using 'string_required'.\r\n\t\t\t</li>\r\n\t\t<li><b>regex_required</b>: A non-null value must be provided and satisfy the regex' definition ('value_rule_arg')</li>\r\n");
      out.write("\t\t<li><b>regex_optional</b>: Optional, but if non-null, then it must satisfy the regex' definition ('value_rule_arg')</li>\r\n\t\t</ul>\r\n\t\t\r\n\t\t</td></tr>\r\n          </tbody>\r\n        \r\n        </table>\r\n        </p>\r\n        <p>Here's another example. When working with REST API based web services, you may encounter access limitations on the server and/or client side. \r\n        \tHere is one way to map a PUT request to a scenario with a header rule and looking for a specific TOKEN. \r\n<pre class=\"code\" style=\"font-size:0.9em;\">\r\n// EXAMPLE  \r\n{\r\n    \"headers\": [\r\n        {\r\n            \"key\": \"x-http-method-override\",\r\n            \"value_rule_arg\": \"PUT\",\r\n            \"value_rule_type\": \"string_required\"\r\n        }\r\n    ],\r\n    \"url\": [\r\n        {\r\n            \"key\": \"*\",\r\n            \"value_rule_arg\": \"44\",\r\n            \"value_rule_type\": \"string_required\"\r\n        }\r\n    ]\r\n}\r\n</pre>\r\n\t<p>This should work for a Service defined as (/service/customer/{token}), and an incoming request:\r\n\tcurl -X POST -d@text.txt http://localhost:8080/service/customer/44 --header \"x-http-method-override:POST\" \r\n");
      out.write("\t</p>\r\n    <p>\r\n    Need a sample file? Start with a clean Mockey and Import this <a href=\"sample.xml\">file</a>. \r\n    </p>\r\n        \r\n    </div>\r\n    <div class=\"help_section\">\r\n\t    <a href=\"#response_schema\" name=\"response_schema\"></a>\r\n        <h2>Response JSON Schema</h2>\r\n        <p>\r\n        How do you know that your Service Scenarios (those defined in JSON) are in a valid data format? By providing a JSON Schema, \r\n        Mockey will inform you if your Scenarios are invalid and give you insight on why. For more information on JSON Schema, see\r\n        <a href=\"http://json-schema.org/\">http://json-schema.org/</a>. \r\n        \r\n        </p>\r\n    </div>\r\n    <div class=\"help_section_zebra\">\r\n\t    <a href=\"#status\" name=\"status\"></a>\r\n\t    <h2>Status</h2>\r\n\t    <p>\r\n\t    There's a 'status' URL that will give you information on Mockey. See <a href=\"");
      if (_jspx_meth_c_url_13(_jspx_page_context))
        return;
      out.write("\">status</a>. You should \r\n\t    use it if you need to check if Mockey is running, time of start, and location of where it's writing information to. This is \r\n\t    helpful for your continuous integration/testing server.\r\n\t    \r\n\t    </p>\r\n\t</div>\r\n\t<div class=\"help_section_zebra\">\r\n\t    <a href=\"#startup\" name=\"startup\"></a>\r\n\t    <h2>Start Up Configuration</h2>\r\n\t    <p>\r\n\t    There are a few options to configure Mockey on startup. \r\n\t    <h3>Executable Jar</h3>\r\n\t    If you are running the executable jar, check the Help command to see your options:\r\n\t\t    <div class=\"code\">\r\n\t\t    java -jar Mockey.jar --help\r\n\t\t    </div>\r\n\t    For example, if you want your configuration files to be located in a specific directory, then do the following:\r\n\t\t    <div class=\"code\">\r\n\t\t    java -jar Mockey.jar -l /Users/clafonta/Work/Mockey/dist/testme\r\n\t\t    </div>\r\n\t    ..and Mockey will save your files in the 'testme' directory, e.g.:\r\n\t    \r\n\t    <pre>\r\n>tree /Users/clafonta/Work/Mockey/dist/testme/\r\n/Users/clafonta/Work/Mockey/dist/testme/\r\n");
      out.write("|---mock_service_definitions.xml\r\n|___mockey_def_depot\r\n    |____Feeling\r\n         |---Feeling.xml\r\n         |___scenarios\r\n             |--- happy.txt\r\n             |___ happy.xml\r\n\t    </pre>\r\n\t    <h3>Using Tomcat</h3>\r\n\t    If you are using the WAR file, running in a Tomcat instance, then you can set your preferred Mockey repository location, via command line (Unix) as follows:\r\n\t    <div class=\"code\">\r\n\t    export JAVA_OPTS=\"-DmockeyDefinitionsRepoHome=/Users/johnsmith/work_repo\"\r\n\t    </div>\r\n\t    The variable name is '<i>mockeyDefinitionsRepoHome</i>'. Search the web for more information on JAVA_OPS and Tomcat and how to set it in Windows if necessary.\r\n\t    </p>\r\n\t</div>\r\n\t\r\n\t\r\n\t\r\n</div>\t\r\n");
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
    _jspx_th_c_set_0.setValue(new String("Help"));
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
    _jspx_th_c_set_1.setValue(new String("help"));
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
    _jspx_th_c_url_0.setValue("/images/bigpicture.png");
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
    _jspx_th_c_url_1.setValue("/configuration/info");
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
    _jspx_th_c_url_2.setValue("/configuration/info");
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
    _jspx_th_c_url_3.setValue("/images/skull_and_crossbones.png");
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
    _jspx_th_c_url_4.setValue("/proxy/settings");
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
    _jspx_th_c_url_5.setValue("/images/dynamic_response.png");
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
    _jspx_th_c_url_6.setValue("/images/skull_and_crossbones.png");
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
    _jspx_th_c_url_7.setValue("/images/skull_and_crossbones.png");
    int _jspx_eval_c_url_7 = _jspx_th_c_url_7.doStartTag();
    if (_jspx_th_c_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
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
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hintRecordUrl1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent(null);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hintRecordUrl1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent(null);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hintRecordUrl2}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent(null);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hintRecordUrl2}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
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
    _jspx_th_c_url_8.setValue("home");
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
    _jspx_th_c_url_9.setValue("/images/flush.png");
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
    _jspx_th_c_url_10.setValue("/upload");
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
    _jspx_th_c_url_11.setValue("/service_api");
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
    _jspx_th_c_url_12.setValue("/history");
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
    _jspx_th_c_url_13.setValue("/status");
    int _jspx_eval_c_url_13 = _jspx_th_c_url_13.doStartTag();
    if (_jspx_th_c_url_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_13);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_13);
    return false;
  }
}
