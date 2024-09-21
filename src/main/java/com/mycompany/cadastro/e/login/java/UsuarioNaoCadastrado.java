/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro.e.login.java;

import java.sql.SQLException;

/**
 *
 * @author Erick
 */
public class UsuarioNaoCadastrado extends SQLException {
    public UsuarioNaoCadastrado(String msg){
        super(msg);
    }
    public UsuarioNaoCadastrado(String msg, Throwable cause){
        super(msg, cause);
    }
}
