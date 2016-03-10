<%-- 
    Document   : reserva_sala
    Created on : 10/03/2016, 14:27:57
    Author     : Hallessandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="reservaServlet">
            <legend>Reserva de Sala</legend> 
            
            <p><label for="nome">Nome</label>
                <input type="text" name="nome"></p>
            <p><label for="matricula">Matrícula</label>
                <input type="number" name="matricula"></p>
            <p><label for="data">Data da reserva</label>
                <input type="date" name="data"></p>
            <p><label for="horario">Horário</label>
                <select name="horario">
                    <option value="1M">1M</option>
                    <option value="2M">2M</option>
                    <option value="3M">3M</option>
                </select></p>
            <p><label for="sala">Sala</label>
                <select name="sala">
                    <option value="101">A101</option>
                    <option value="102">A102</option>
                    <option value="103">A103</option>
                </select></p>
          
                <input type="submit" value="Cadastrar">
        </form>
    </body>
</html>
