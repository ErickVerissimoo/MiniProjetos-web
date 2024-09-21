package testes;
import static servlets.Home.gerar;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import org.junit.jupiter.api.*;

/**
 *
 * @author Erick
 */
public class testeSenha {
    @Test
    public void testeOne(){
        var senha = gerar();
        System.out.print(senha);
    } 
    
}
