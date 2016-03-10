<%-- 
    Document   : pagina_inicial
    Created on : 07/03/2016, 22:00:48
    Author     : Hallessandro
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="br.edu.ifrn.sispac.modelo.reservas"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="reservas" class="br.edu.ifrn.sispac.modelo.reservas" scope="session"/>
<jsp:useBean id="dao" class="br.edu.ifrn.sispac.dao.ReservaDAO" scope="session"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="js/jquery-1.12.0.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.js"></script>
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/bootstrap-responsive.css">
        <title>Pagina Inicial</title>
        <style>
            #div1 {background-color: red;}
            #div2 {background-color: green;}
        </style>
    </head>
    <body>
        <div class="container-fluid">
            <div class="row-fluid">
                <div class="span3" id="div1">
                    MENU VAI FICAR AQUI
                </div>
        
                <div class="span9" id="div2">
                    <h3>Salas Reservadas</h3>
                    
                    <% 
                    Date data = new Date(System.currentTimeMillis());  
                    SimpleDateFormat formatarDate = new SimpleDateFormat("dd/MM/yyyy"); 
                    //String dt = formatarDate.format(data);
                    ArrayList<reservas> reservas = null;
                    reservas = dao.getReservas(data);
                    %>
                    
                    <h3><%= formatarDate.format(data) %></h3>
                </div>
        <!-- ACHO QUE SERIA INTERESSANTE NESSA PÁGINA, EXIBIR A LISTA DAS SALAS RESERVADAS NO DIA ATUAL -->
        <!-- PARA ISSO, USAR JSTL E EL, NADA DE CÓDIGO JAVA MISTURADO COM HTML --> 
        <!-- AS CORES ATUALMENTE USADAS NO BACKGROUND, SÃO APENAS PARA VISUALIZAR O TAMANHO DAS DIV'S 
        PARA SABER SE ESTÃO SEGUINDO O QUE DEVEM DO PADRÃO DO BOOTSTRAP
        QUANDO FINALIZADA, REMOVER DA PÁGINA AS CORES DO BACKGROUND -->
            </div>
        </div>
    </body>
</html>
