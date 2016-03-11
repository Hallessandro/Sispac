package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import br.edu.ifrn.sispac.modelo.reservas;
import java.text.SimpleDateFormat;
import java.sql.Date;

public final class pagina_005finicial_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      br.edu.ifrn.sispac.modelo.reservas reservas = null;
      synchronized (session) {
        reservas = (br.edu.ifrn.sispac.modelo.reservas) _jspx_page_context.getAttribute("reservas", PageContext.SESSION_SCOPE);
        if (reservas == null){
          reservas = new br.edu.ifrn.sispac.modelo.reservas();
          _jspx_page_context.setAttribute("reservas", reservas, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      br.edu.ifrn.sispac.dao.ReservaDAO dao = null;
      synchronized (session) {
        dao = (br.edu.ifrn.sispac.dao.ReservaDAO) _jspx_page_context.getAttribute("dao", PageContext.SESSION_SCOPE);
        if (dao == null){
          dao = new br.edu.ifrn.sispac.dao.ReservaDAO();
          _jspx_page_context.setAttribute("dao", dao, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.12.0.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-responsive.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/pagina_inicial.css\">\n");
      out.write("        <title>Pagina Inicial</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
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
      out.write("                    <a href=\"registrar_frequencia.jsp\">Registrar frequência</a>\n");
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
      out.write("        \n");
      out.write("                <div class=\"span11\" id=\"div2\">\n");
      out.write("                    <h3 id=\"titulo\">Salas Reservadas do dia</h3>\n");
      out.write("                    \n");
      out.write("                    <table class=\"table table-condensed table-hover\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Sala</th>\n");
      out.write("                            <th>Horário</th>\n");
      out.write("                            <th>Nome</th>\n");
      out.write("                            <th>Matrícula</th>\n");
      out.write("                        </tr>\n");
      out.write("                    \n");
      out.write("                    ");
 
                    Date data = new Date(System.currentTimeMillis());  
                    //SimpleDateFormat formatarDate = new SimpleDateFormat("dd/MM/yyyy");
                    SimpleDateFormat formatarDate = new SimpleDateFormat("yyyy-MM-dd/");
                    //String dt = formatarDate.format(data);
                    ArrayList<reservas> reservasX = null;
                    reservasX = (ArrayList<reservas>) dao.getReservas(data);
                    
                    for(reservas r: reservasX){ 
      out.write("\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( r.getNum_sala() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( r.getHorario() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( r.getNome_reservou() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( r.getMatricula_reservou() );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                   </table>\n");
      out.write("                </div>\n");
      out.write("        <!-- PARA ISSO, USAR JSTL E EL, NADA DE CÓDIGO JAVA MISTURADO COM HTML --> \n");
      out.write("        <!-- AS CORES ATUALMENTE USADAS NO BACKGROUND, SÃO APENAS PARA VISUALIZAR O TAMANHO DAS DIV'S \n");
      out.write("        PARA SABER SE ESTÃO SEGUINDO O QUE DEVEM DO PADRÃO DO BOOTSTRAP\n");
      out.write("        QUANDO FINALIZADA, REMOVER DA PÁGINA AS CORES DO BACKGROUND -->\n");
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
