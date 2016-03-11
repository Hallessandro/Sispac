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
      out.write("        <title>Pagina Inicial</title>\n");
      out.write("        <style>\n");
      out.write("            #div1 {background-color: red;}\n");
      out.write("            #div2 {background-color: green;}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row-fluid\">\n");
      out.write("                <div class=\"span3\" id=\"div1\">\n");
      out.write("                    MENU VAI FICAR AQUI\n");
      out.write("                </div>\n");
      out.write("        \n");
      out.write("                <div class=\"span9\" id=\"div2\">\n");
      out.write("                    <h3>Salas Reservadas do dia</h3>\n");
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
      out.write("        <!-- ACHO QUE SERIA INTERESSANTE NESSA PÁGINA, EXIBIR A LISTA DAS SALAS RESERVADAS NO DIA ATUAL -->\n");
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
