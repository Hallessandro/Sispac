<%-- 
    Document   : menu_lateral
    Created on : 12/02/2016, 18:45:28
    Author     : Hallessandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/menu.css" rel="stylesheet">

    <div id="wrapper">

        <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                    <a href="#">
                        SISPAC
                    </a>
                </li>
                <li>
                    <a href="#">
                        Olá ${usuario.nome}
                    </a>
                </li>
                <br>
                <li>
                    <a href="reservar_sala.jsp">Reservar sala</a>
                </li>
                <li>
                    <a href="frequencia.jsp">Registrar frequência</a>
                </li>
                <li>
                    <a href="emprestimo_material.jsp">Empréstimo de material</a>
                </li>
                <li>
                    <a href="novo_usuario.jsp">Cadastro de usuários</a>
                </li>
                <li>
                    <a href="#">Contato</a>
                </li>
                <li>
                    <a href="index.jsp">Sair</a>
                </li>
            </ul>
        </div>
        <!-- /#sidebar-wrapper -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
