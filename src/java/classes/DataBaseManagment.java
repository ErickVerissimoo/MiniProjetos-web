package classes;

import java.sql.*;

public final class DataBaseManagment {

    public static Connection CriarConexao() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Login", "erick", "erick123");          


            
            if (conexao==null){
            System.err.println("n\tErro de conexão");
                return null;                
            }
            System.out.println("Conexão estabelecida com sucesso!");
            return conexao;
            
        
        
       
    }
    
    public static void setStatement(Connection conexao) throws SQLException, ClassNotFoundException {
        Statement declaracao = conexao.createStatement();
        String sql = """
                     CREATE TABLE IF NOT EXISTS employees(
                     id INT auto_increment primary key,
                     nome varchar(30) not null);
                     """;
        declaracao.execute(sql);
        System.out.println("Declaração inserida com sucesso");
    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        var conexao = CriarConexao();
        setStatement(conexao);
    }
        } 
    
    
