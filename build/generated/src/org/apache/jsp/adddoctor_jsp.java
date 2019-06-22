package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adddoctor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Doctor Entry Form</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Doctor Entry Form!</h1>\n");
      out.write("        <form action=\"StoreDoctor\" method=\"POST\" enctype=\"multipart/form-data\" >\n");
      out.write("            <pre>\n");
      out.write("Doctor Name:<input type=\"text\" name=\"name\" value=\"\" />\n");
      out.write("Qualification:<textarea row=\"5\" name=\"qualification\"/></textarea>\n");
      out.write("\n");
      out.write("Specialization:<textarea row=\"5\" name=\"specialization\"/></textarea>\n");
      out.write("Experience:<input type=\"text\" name=\"experience\" value=\"\" />\n");
      out.write("Member Type:<select name=\"type\">\n");
      out.write("<option>Permanent</option>\n");
      out.write("<option>Visiting</option>\n");
      out.write("<option>Trainee</option>\n");
      out.write("</select>\n");
      out.write("Password:<input type=\"text\" name=\"password\" value=\"\" />\n");
      out.write("Upload Image:<input type=\"file\" name=\"image\" value=\"\" />\n");
      out.write("    \n");
      out.write("    <input type=\"submit\" value=\"Save\" />\n");
      out.write("            </pre>\n");
      out.write("    \n");
      out.write("    </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
