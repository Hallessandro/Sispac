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
        <title>Registrar Frequência</title>
    </head>
    <body>
        <div class="container-fluid">
            <div class="row-fluid">
                <div>
                    <form method="post" action="frequenciaServlet">
                        <legend>Registrar Frequência</legend>
                        <label for="nome_professor">Nome do Professor</label><input type="text" name="nome_professor">
                        <label for="matricula_professor">Matrícula do Professor</label><input type="number" name="matricula-professor">
                        <label for="data">Data</label><input type="date" name="data">
                        <label for="num_sala"></label><select name="num_sala">
                            <option value="A101">A101</option>
                            <option value="A102">A102</option>
                            <option value="A103">A103</option>
                            <option value="A104">A104</option>
                            <option value="A105">A105</option>
                        </select>
                        <label for="horario"></label><select name="horario">
                            <option value="1M">1M</option>
                            <option value="2M">2M</option>
                            <option value="3M">3M</option>
                        </select>
                        
                        <input type="submit" value="Registrar">
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
