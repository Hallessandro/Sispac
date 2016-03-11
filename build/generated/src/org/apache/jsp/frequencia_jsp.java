package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class frequencia_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menu_lateral.jsp");
  }

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
      out.write("        <link rel=\"stylesheet\" href=\"css/frequencia.css\">\n");
      out.write("        <title>Registrar Frequência</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\" id=\"pagina\">\n");
      out.write("            <div class=\"row-fluid\">\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"css/menu.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("        <!-- Sidebar -->\n");
      out.write("        <div id=\"sidebar-wrapper\">\n");
      out.write("            <ul class=\"sidebar-nav\">\n");
      out.write("                <li class=\"sidebar-brand\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        SISPAC\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        Olá ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <br>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"reservar_sala.jsp\">Reservar sala</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"frequencia.jsp\">Registrar frequência</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"emprestimo_material.jsp\">Empréstimo de material</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"novo_usuario.jsp\">Cadastro de usuários</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">Contato</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"index.jsp\">Sair</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <!-- /#sidebar-wrapper -->\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("                \n");
      out.write("                <div class=\"span11\" id=\"conteudo\">\n");
      out.write("                    <form method=\"post\" action=\"frequenciaServlet\">\n");
      out.write("                        <legend>Registrar Frequência</legend>\n");
      out.write("                        <p><label for=\"nome_professor\">Nome do Professor</label><input type=\"text\" name=\"nome_professor\" class=\"input-large\"></p>\n");
      out.write("                        <p><label for=\"matricula_professor\">Matrícula do Professor</label><input type=\"number\" name=\"matricula-professor\"></p>\n");
      out.write("                        <p><label for=\"data\">Data</label><input type=\"date\" name=\"data\"></p>\n");
      out.write("                        <p><label for=\"num_sala\">Sala</label><select name=\"num_sala\">\n");
      out.write("                            <option value=\"A101\">A101</option>\n");
      out.write("                            <option value=\"A102\">A102</option>\n");
      out.write("                            <option value=\"A103\">A103</option>\n");
      out.write("                            <option value=\"A104\">A104</option>\n");
      out.write("                            <option value=\"A105\">A105</option>\n");
      out.write("                        </select></p>\n");
      out.write("                        <p><label for=\"horario\">Horário</label><select name=\"horario\">\n");
      out.write("                            <option value=\"1M\">1M</option>\n");
      out.write("                            <option value=\"2M\">2M</option>\n");
      out.write("                            <option value=\"3M\">3M</option>\n");
      out.write("                        </select></p>\n");
      out.write("                        \n");
      out.write("                        <p><input type=\"submit\" value=\"Registrar\"></p>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
