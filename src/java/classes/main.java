/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.*;

/**
 *
 * @author Erick
 */
public class main {

    public static void main(String... args) throws SQLException, ClassNotFoundException {
        var conexao = DataBaseManagment.CriarConexao();
        String nome = "erick";
        String senha = "erick123";
        String sql = "INSERT INTO Login (nome, senha) VALUES (?, ?)";
        PreparedStatement declaracao = conexao.prepareStatement(sql);
        declaracao.setString(1, nome);
        declaracao.setString(2, senha);
        declaracao.execute();
        declaracao.close();
        
        System.out.println("Dados inseridos com sucesso!");
    }
}
