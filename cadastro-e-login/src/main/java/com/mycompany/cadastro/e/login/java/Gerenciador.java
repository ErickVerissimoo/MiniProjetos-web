/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro.e.login.java;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
/**
 *
 * @author Erick
 */
@WebServlet("/Gerenciador")
public class Gerenciador extends HttpServlet {
  
static{
     try{
          
        Class.forName("com.mysql.cj.jdbc.Driver");
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
}
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         resp.sendRedirect("index.jsp");
     
    }

    /**
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     * @throws UsuarioNaoCadastrado
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        try(Connection conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Cadastro", "erick", "erick123")){
            if(conexao != null){
                System.out.println("Sucesso");
            }else{
                System.out.println("erro");
            }
            String sql = "Insert into usuarios (nome, email, senha) values(?, ?, ?);";
            
            PreparedStatement declaracao = conexao.prepareStatement(sql);
            String nome = req.getParameter("nome");
            String email = req.getParameter("Email");
            String senha = req.getParameter("Password");
            declaracao.setString(1, nome);
            declaracao.setString(2, email);
            declaracao.setString(3, senha);
            int linhas = declaracao.executeUpdate();
            System.out.println("Linhas afetadas:" + linhas);
            resp.sendRedirect("index.jsp");
        }catch(SQLException e){
            e.printStackTrace();
        }
              if ("Post".equalsIgnoreCase(req.getMethod()) && req.getParameter("email") != null && req.getParameter("password") != null) {
        String email = req.getParameter("email");
        String senha = req.getParameter("password");
        try(Connection conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Cadastro", "erick", "erick123")){
       PreparedStatement declaracao = conexao.prepareStatement("select email, senha from usuarios where email = ? and senha= ?;");
       declaracao.setString(1, email);
       declaracao.setString(2, senha);
       ResultSet resquisicao = declaracao.executeQuery();
           if (resquisicao.next()) {
                System.out.println("Usuário Cadastrado");
                resp.sendRedirect("index.jsp");
            } else {
              
               resp.sendRedirect("Cadastro.jsp");
               throw new UsuarioNaoCadastrado("Usuario não cadastrado");
           }
        } catch(SQLException excecao){
            excecao.printStackTrace();
        }
           }
    }
    
    
}
