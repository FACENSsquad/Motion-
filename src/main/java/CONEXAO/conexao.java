
package CONEXAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexao {
    
    public Connection getConexao(){
        try{
            // Tentar estabelecer conexão

            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bd_motion?serverTimezone=UTC",  // linha de conexão
                "root", // usuario do MySQL
                "" // senha do MySQL
            );
            return conn;
        } 
        catch(Exception e){
            // Se der erro exiba:
            System.out.println("Erro ao conectar"+ e.getMessage());
            return null;
        }
    }
}
