<%-- 
    Document   : frequencia
    Created on : 10/03/2016, 23:35:59
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
        <link rel="stylesheet" href="css/frequencia.css">
        <title>Registrar Frequência</title>
    </head>
    <body>
        <div class="container-fluid">
            <div class="row-fluid">
                <%@ include file="menu_lateral.jsp" %>
                
                <div class="span11">
                    <form method="post" action="frequenciaServlet">
                        <legend>Registrar Frequência</legend>
                        <p><label for="nome_professor">Nome do Professor</label><input type="text" name="nome_professor"></p>
                        <p><label for="matricula_professor">Matrícula do Professor</label><input type="number" name="matricula-professor"></p>
                        <p><label for="data">Data</label><input type="date" name="data"></p>
                        <p><label for="num_sala">Sala</label><select name="num_sala">
                            <option value="A101">A101</option>
                            <option value="A102">A102</option>
                            <option value="A103">A103</option>
                            <option value="A104">A104</option>
                            <option value="A105">A105</option>
                        </select></p>
                        <p><label for="horario">Horário</label><select name="horario">
                            <option value="1M">1M</option>
                            <option value="2M">2M</option>
                            <option value="3M">3M</option>
                        </select></p>
                        
                        <p><input type="submit" value="Registrar"></p>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
