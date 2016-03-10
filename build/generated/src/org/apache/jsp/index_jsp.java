package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.12.0.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-responsive.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/login.css\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        \n");
      out.write("       <script type=\"text/javascript\">\n");
      out.write("            jQuery(document).ready(function(){\n");
      out.write("                jQuery('#ajax_form').submit(function(){\n");
      out.write("                    var dados = jQuery( this ).serialize();\n");
      out.write("                    jQuery.ajax({\n");
      out.write("                        type: \"POST\",\n");
      out.write("                        url: \"teste.jsp\",\n");
      out.write("                        data: dados,\n");
      out.write("                        success: function( data ){\n");
      out.write("                            alert( data );\n");
      out.write("                        }\n");
      out.write("                        });\n");
      out.write("                        return false;\n");
      out.write("                 });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row-fluid\">\n");
      out.write("                    <div class=\"span4 login\">\n");
      out.write("                        <form class=\"form-horizontal\" method=\"post\" action=\"teste.jsp\" id=\"#ajax_form\">\n");
      out.write("                        <div class=\"campos_login\">\n");
      out.write("                        <br>\n");
      out.write("                    <div>\n");
      out.write("                        <img src=\"img/logo_sispac3.png\" class=\"logo\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"campos\">\n");
      out.write("                    <div class=\"control-group\">\n");
      out.write("                        <br>\n");
      out.write("                        <label class=\"control-label\" for=\"matricula\">Matrícula</label>\n");
      out.write("                    <div class=\"controls\">\n");
      out.write("                        <input type=\"text\" name=\"matricula\" placeholder=\"Matricula\">\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"control-group\">\n");
      out.write("                            <label class=\"control-label\" for=\"senha\">Senha</label>\n");
      out.write("                        <div class=\"controls\">\n");
      out.write("                            <input type=\"password\" name=\"senha\" placeholder=\"Senha\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"control-group\">\n");
      out.write("                        <div class=\"controls\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-info\">Entrar</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("                        </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
