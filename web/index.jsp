<%-- 
    Document   : index
    Created on : 07/03/2016, 21:50:12
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
        <link rel="stylesheet" href="css/login.css">
        <title>Login</title>
       
    </head>
    <body>
        <div id="wrapper">
            <div class="container-fluid">
                <div class="row-fluid">
                    <div class="span4 login">
                        <form class="form-horizontal" method="post" action="autenticacaoServlet" id="#ajax_form">
                        <div class="campos_login">
                        <br>
                    <div>
                        <img src="img/logo_sispac3.png" class="logo">
                    </div>
                    <div class="campos">
                    <div class="control-group">
                        <br>
                        <label class="control-label" for="matricula">Matrícula</label>
                    <div class="controls">
                        <input type="text" name="matricula" placeholder="Matricula">
                    </div>
                    </div>
                    <div class="control-group">
                            <label class="control-label" for="senha">Senha</label>
                        <div class="controls">
                            <input type="password" name="senha" placeholder="Senha">
                        </div>
                    </div>
                    <div class="control-group">
                        <div class="controls">
                            <button type="submit" class="btn btn-info">Entrar</button>
                        </div>
                    </div>
                </div>
                </div>
                        </form>
                </div>
            </div>
        </div>
    </div>
    </body>
</html>
