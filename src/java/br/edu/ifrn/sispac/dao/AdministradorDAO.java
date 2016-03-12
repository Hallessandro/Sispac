/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sispac.dao;

import br.edu.ifrn.sispac.modelo.Professor;
import br.edu.ifrn.sispac.modelo.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hallessandro
 */
public class AdministradorDAO extends GeralDAO{
    
    private final String INSERT_USUARIO = "insert into tbl_usuario (nome_usuario, matricula_usuario, nv_acesso, senha) values (?,?,?,?);";
    
    private final String INSERT_PROFESSOR = "insert into tbl_professor (matricula_professor,nome_professor, senha) values (?,?,?);";
    
    private final String UPDATE_SENHA = //"SET SQL_SAFE_UPDATES = 0; Desabilita o safe mode"
                                        "update tbl_usuario set senha=? where matricula_usuario=?;";
    
    private final String UPDATE_SENHA_PROFESSOR = //"SET SQL_SAFE_UPDATES = 0; Desabilita o safe mode"
                                        "update tbl_professor set senha=? where matricula_professor=?;";

    
    public void inserirProfessor(Professor p) throws SQLException{
                        executarComando(INSERT_PROFESSOR, p.getMatricula_professor(), p.getNome_professor(), p.getSenha());
                    }
                    
    public void inserirUsuario(Usuario u) throws SQLException{
                        executarComando(INSERT_USUARIO, u.getNome(), u.getMatricula(), u.getNv_acesso(), u.getSenha());
                    }
    public void alterarSenha(Usuario u) throws SQLException{
        executarComando(UPDATE_SENHA, u.getSenha(), u.getMatricula());
    }
    public void alterarSenhaProfessor(Professor p) throws SQLException{
        executarComando(UPDATE_SENHA_PROFESSOR, p.getSenha(), p.getMatricula());
    }
    //FALTA ESCREVER MÉTODOS DE EXCLUIR
    
    public static void main(String[] args) {
        AdministradorDAO dao = new AdministradorDAO();
        //Usuario u = new Usuario();
        //u.setMatricula("123");
        //u.setSenha("4592913");
        
        Professor p = new Professor();
        p.setMatricula("3884");
        p.setSenha("Batman");
        try {
            dao.alterarSenhaProfessor(p);
        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
