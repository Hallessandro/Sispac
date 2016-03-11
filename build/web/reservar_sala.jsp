<%-- 
    Document   : reservar_sala
    Created on : 10/03/2016, 22:57:40
    Author     : Hallessandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="js/jquery-1.12.0.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.js"></script>
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/bootstrap-responsive.css">
        <link rel="stylesheet" href="css/pagina_inicial.css">
        <title>Reserva de Sala</title>
        <style>
            #content{background-color: #ddd;}
        </style>
    </head>
    <body>
        <div class="container-fluid">
            <div class="row-fluid">
                <%@ include file="menu_lateral.jsp" %>
                
                <div class="span11" id="content">
                    <form method="post" action="reservaServlet">
                        <legend>Reservar Sala</legend>
                        
                        <p><label for="data">Data</label><input type="date" name="data"></p>
                        <p><label for="nome">Nome</label><input type="text" name="nome"></p>
                        <p><label for="matricula">Matrícula</label><input type="number" name="matricula"></p>
                        <p><label for="num_sala">Sala</label>
                            <select name="num_sala">
                                <option value="101">A101</option>
                                <option value="102">A102</option>
                                <option value="103">A103</option>
                                <option value="104">A104</option>
                                <option value="105">A105</option>
                            </select></p>
                        <p><label for="horario">Horário</label>
                            <select name="horario">
                                <option value="1M">1M</option>
                                <option value="2M">2M</option>
                                <option value="3M">3M</option>
                                <option value="1T">1T</option>
                                <option value="2T">2T</option>
                                <option value="3T">3T</option>
                                <option value="1N">1N</option>
                                <option value="2N">2N</option>
                                <option value="3N">3N</option>
                            </select></p>    
                            
                            <input type="submit" value="Reservar">
                    </form>
                    
                </div>
            </div>
        </div>
        
    </body>
</html>
