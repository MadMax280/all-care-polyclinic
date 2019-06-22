package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addpatient_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');


String s=(String) session.getAttribute("uid");
    if(s==null){
        response.sendRedirect("login.jsp");
    }


      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Patient Entry Form</title>\n");
      out.write("    </head>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("     function checkAll()\n");
      out.write("{\n");
      out.write("\tvar a=name();\n");
      out.write("\tvar b=address();\n");
      out.write("\tvar c=disease();\n");
      out.write("\tvar d=mobile();\n");
      out.write("\tvar e=date();\n");
      out.write("\tif(a&&b&&d&&e&&c)\n");
      out.write("\t{\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
      out.write("\telse\n");
      out.write("\t{\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("function address()\n");
      out.write("{\n");
      out.write("var a=document.getElementById('address').value;\n");
      out.write("var al=/^[0-9a-zA-Z-,]+(\\s{0,1}[a-zA-Z-, ])*$/;\n");
      out.write("\tif(!a.match(al))\n");
      out.write("\t{\n");
      out.write("\t\talert(\"Some Symbols are not accepted in Address\");\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("\telse\n");
      out.write("\t{\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("function mobile()\n");
      out.write("{\n");
      out.write("var a=document.getElementById('mobile').value;\n");
      out.write("var al=  /^[0-9]+$/;\n");
      out.write("\tif(!a.match(al))\n");
      out.write("\t{\n");
      out.write("\t\talert(\"enter valid mobile no.\");\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("\telse if(a.length<10)\n");
      out.write("\t{\n");
      out.write("\t\talert(\"maxlength 10 numbers\");\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("\telse\n");
      out.write("\t{\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("function name()\n");
      out.write("{\n");
      out.write("\tvar al= /^[a-zA-Z-,]+(\\s{0,1}[a-zA-Z-, ])*$/;\n");
      out.write("\tvar a=document.getElementById('name').value;\n");
      out.write("\tif(!a.match(al))\n");
      out.write("\t{\n");
      out.write("\talert(\"Please Enter Correct Name\");\n");
      out.write("\treturn false;\n");
      out.write("\t}\n");
      out.write("\telse if(a.length<3)\n");
      out.write("\t{\n");
      out.write("\t\talert(\"Minlength of Name is 3 characters.\");\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("\telse\n");
      out.write("\t{\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("function disease()\n");
      out.write("{\n");
      out.write("\tvar al= /^[a-zA-Z-,]+(\\s{0,1}[a-zA-Z-, ])*$/;\n");
      out.write("\tvar a=document.getElementById('disease').value;\n");
      out.write("\tif(!a.match(al))\n");
      out.write("\t{\n");
      out.write("\talert(\"Numbers and Symbols not accepted.\");\n");
      out.write("\treturn false;\n");
      out.write("\t}\n");
      out.write("\telse\n");
      out.write("\t{\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("function date()\n");
      out.write("{\n");
      out.write("\tvar a=document.getElementById('dd').value;\n");
      out.write("\tvar b=document.getElementById('mm').value;\n");
      out.write("\tvar c=document.getElementById('yy').value;\n");
      out.write("\t var al=/^[0-9]+$/;\n");
      out.write("\t if(!a.match(al)|| !b.match(al)|| !c.match(al))\n");
      out.write("\t{\n");
      out.write("\t\talert(\"enter valid date.\");\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("\telse{ var dd=parseInt(a);\n");
      out.write("\t var mm=parseInt(b);\n");
      out.write("     var yy=parseInt(c);\n");
      out.write("\n");
      out.write("\tif (mm < 1 || mm > 12) { // check mm range\n");
      out.write("  alert(\"mm must be between 1 and 12\");\n");
      out.write("  return false;\n");
      out.write(" }\n");
      out.write(" else if (dd < 1 || dd > 31) {\n");
      out.write("  alert(\"Day must be between 1 and 31\");\n");
      out.write("  return false;\n");
      out.write(" }\n");
      out.write(" else if ((mm==4 || mm==6 || mm==9 || mm==11) && dd>=31) {\n");
      out.write("  alert(\"mm \"+mm+\" doesn't have 31 days!\")\n");
      out.write("  return false;\n");
      out.write(" }\n");
      out.write("else if (mm == 2) { // check for february 29th\n");
      out.write("  var isleap = (yy % 4 == 0 && (yy % 100 != 0 || yy % 400 == 0));\n");
      out.write("  if (dd>29 || (dd==29 && !isleap)) {\n");
      out.write("   alert(\"February \" + yy + \" doesn't have \" + dd + \" days!\");\n");
      out.write("   return false;\n");
      out.write("    }\n");
      out.write(" }\n");
      out.write(" return true;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("   // date is valid\n");
      out.write("\n");
      out.write("}\n");
      out.write("   \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("    <body>\n");
      out.write("        <h1>Patient Entry Form!</h1>\n");
      out.write("        <form action=\"StorePatient\" method=\"GET\" onsubmit=\"return checkAll()\">\n");
      out.write("            <pre>\n");
      out.write(" PATIENT NAME: <input type=\"text\" name=\"name\" value=\"\" id=\"name\" required=\"required\"/>\n");
      out.write("      ADDRESS: <input type=\"text\" name=\"address\" value=\"\" id=\"address\" required=\"required\"/>\n");
      out.write("   MOBILE NO.: <input type=\"text\" name=\"mobile\" value=\"\" id=\"mobile\" required=\"required\" maxlength=\"10\"/>\n");
      out.write("       Gender: MALE <input type=\"radio\" name=\"gender\" value=\"Male\" checked=\"checked\"/> FEMALE<input type=\"radio\" name=\"gender\" value=\"Female\" /> OTHER<input type=\"radio\" name=\"gender\" value=\"Other\" />\n");
      out.write("Date Of Birth: <input type=\"text\" name=\"dd\" value=\"\" placeholder=\"dd\" size=\"01\" maxlength=\"2\" id=\"dd\" required=\"required\"/>/<input type=\"text\" name=\"mm\" value=\"\" placeholder=\"mm\" size=\"01\" maxlength=\"2\" id=\"mm\" required=\"required\"/>/<input type=\"text\" name=\"yy\" value=\"\" placeholder=\"yyyy\" id=\"yy\" size=\"02\" maxlength=\"4\" minlength=\"4\" required=\"required\"/>\n");
      out.write("      Disease:<textarea name=\"disease\" rows=\"4\" id=\"disease\" cols=\"20\" required=\"required\"> </textarea>\n");
      out.write("\n");
      out.write("<input type=\"submit\" value=\"SAVE\"/>\n");
      out.write("            </pre>\n");
      out.write("    \n");
      out.write("    </form>\n");
      out.write("         <a href=\"Receptionisthome.jsp\">HOME</a>\n");
      out.write("    </body>\n");
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
