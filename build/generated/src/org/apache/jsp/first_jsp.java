package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class first_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<style type=\"text/css\">\n");
      out.write("body,td,th {\n");
      out.write("\tfont-family: Arial, Helvetica, sans-serif;\n");
      out.write("\tfont-size: 20px;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("\tbackground-color: #CCC;\n");
      out.write("}\n");
      out.write("a:link {\n");
      out.write("\tcolor: #333;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("a:hover {\n");
      out.write("\tcolor: #09F;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("a:visited {\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("a:active {\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tposition: relative;\n");
      out.write("\tleft: auto;\n");
      out.write("\tright: 800px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div><a href=\"index.jsp\">Home </a></div>\n");
      out.write("<div ><img src=\"pictures/os_x_yosemite_2-wallpaper-1920x1080.jpg\" width=\"800\" height=\"200\"/>\n");
      out.write("</div>\n");
      out.write("<div>\n");
      out.write("<a href=\"index.jsp\"> Home </a> |<a href=\"services.jsp\"> Services </a> |<a href=\"ourteam.jsp\"> OurTeam </a>| <a href=\"gallery.jsp\"> Gallery </a>| <a href=\"services.jsp\"> Sterlization </a>| <a href=\"aboutus.jsp\">About Us </a> |<a href=\"enquiry.jsp\"> Enquiry </a>|<a href=\"contactus.jsp\"> Contact Us </a>\n");
      out.write("\\</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
