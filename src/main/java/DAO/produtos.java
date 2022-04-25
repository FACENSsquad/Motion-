/*
PRODDUTOS
 */
package DAO;

import CONEXAO.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/*
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
*/
import BEAN.Produtos; 

/*
PRODUTO
TIPO 
NCM
PONTO DE PEDIDO
*/

public class produtos {
 
    private conexao Conexao;
    private Connection conn;
    
    //construtor
    public produtos(){
        this.Conexao = new conexao();
        this.conn = this.Conexao.getConexao();
    };
    
    //
    /*
    public void create(Produtos p){

        PreparedStatement stmt = null;
        
        String sql = "INSERT INTO produtos(tipo, ncm, ponto_p)VALUES(?, ?, ?, ?)";
        
        try{
            stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, p.getProduto());
            stmt.setString(2, p.getTipo());
            stmt.setString(3, p.getNcm());
            stmt.setInt(4, p.getPonto_p());
        }
        catch(SQLException e){
            System.out.print(e);
        }
        
    }
    */    

    //visualizar 
    public List<Produtos> read(){ //lista do tipo produto
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produtos> produtos = new ArrayList<>();
        
        try{
            stmt = this.conn.prepareStatement("SELECT * FROM produtos");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produtos produto = new Produtos();
                
                produto.setCodigo(rs.getInt("codigo"));
                produto.setTipo(rs.getString("produto"));
                produto.setTipo(rs.getString("tipo"));
                produto.setNcm(rs.getString("ncm"));
                produto.setPonto_p(rs.getInt("ponto_p"));
                produtos.add(produto);
                
            }
        }
        catch(SQLException e){
            System.out.print(e);
        }
        
        return produtos; 
    }
    
    
}
