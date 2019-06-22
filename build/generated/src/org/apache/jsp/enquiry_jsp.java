package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class enquiry_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<head>\n");
      out.write("<link href=\"https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/style2.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"pictures/logo.png\" rel=\"icon\" type=\"image\" />\n");
      out.write("<header class=\"ccheader\"> <ul id=\"hme\">\n");
      out.write("                            <li id=\"home\"><a href=\"index.jsp\"></a></li>\n");
      out.write("                          </ul>\n");
      out.write("    <h1>Enquiry Form</h1>\n");
      out.write("   \n");
      out.write("</header>\n");
      out.write("</head>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("body,td,th {\n");
      out.write("\tfont-family: Arial, Helvetica, sans-serif;\n");
      out.write("\tfont-size: 20px;\n");
      out.write("}\n");
      out.write("h1{\n");
      out.write("    color:black;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("\t\n");
      out.write("        background-image:url(pictures/medical.jpg);\n");
      out.write("        line-height:25px;\n");
      out.write("        background-size: 1400px 800px;\n");
      out.write("        \n");
      out.write("        background-repeat: no-repeat;\n");
      out.write("        margin:0;\n");
      out.write("\tpadding:0;\n");
      out.write("\n");
      out.write("}\n");
      out.write("a:link {\n");
      out.write("\tcolor: white;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("a:hover {\n");
      out.write("\tcolor: skyblue;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("a:visited {\n");
      out.write("        color:#b5cd60;;\n");
      out.write("\ttext-decoration:none;\n");
      out.write("}\n");
      out.write("a:active {\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("#home {\n");
      out.write("    left: 0px;\n");
      out.write("    width: 50px;\n");
      out.write("    height:50px;\n");
      out.write("    background: url('pictures/home1.png') 0 0;\n");
      out.write("    float:right;  \n");
      out.write("  \n");
      out.write("}\n");
      out.write("#hme li, #hme a {\n");
      out.write("    height: 50px;\n");
      out.write("    display: block; \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<header class=\"ccheader\">\n");
      out.write("    <h1>Enquiry Form</h1>\t\n");
      out.write("</header>\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("    <form method=\"get\" action=\"EnquiryController\" class=\"ccform\">\n");
      out.write("    <div class=\"ccfield-prepend\">\n");
      out.write("        <span class=\"ccform-addon\"><i class=\"fa fa-user fa-2x\"></i></span>\n");
      out.write("        <input class=\"ccformfield\" type=\"text\" name=\"name\" placeholder=\"Full Name\" required>\n");
      out.write("    </div>\n");
      out.write("        <div class=\"ccfield-prepend\">\n");
      out.write("        <span class=\"ccform-addon\"><i class=\"fa fa-home fa-2x\"></i></span>\n");
      out.write("        <input class=\"ccformfield\" type=\"text\" name=\"address\"placeholder=\"Your Address\" required>\n");
      out.write("        </div>\n");
      out.write("    <div class=\"ccfield-prepend\">\n");
      out.write("        <span class=\"ccform-addon\"><i class=\"fa fa-envelope fa-2x\"></i></span>\n");
      out.write("        <input class=\"ccformfield\" type=\"text\" name=\"emailid\"placeholder=\"Email\" required>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"ccfield-prepend\">\n");
      out.write("        <span class=\"ccform-addon\"><i class=\"fa fa-mobile-phone fa-2x\"></i></span>\n");
      out.write("        <input class=\"ccformfield\" type=\"text\" name=\"mobile\" placeholder=\"Phone\" required=\"required\">\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"ccfield-prepend\">\n");
      out.write("        <span class=\"ccform-addon\"><i class=\"fa fa-comment fa-2x\"></i></span>\n");
      out.write("        <textarea class=\"ccformfield\" rows=\"8\" name=\"problem\" placeholder=\"Describe your problem\" required></textarea>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"ccfield-prepend\">\n");
      out.write("        <input class=\"ccbtn\" type=\"submit\" value=\"Submit\">\n");
      out.write("    </div>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("<div class=\"credit\">\n");
      out.write("<p>&nbsp;</p>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write(" ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
