/*
Class do BEAN tem a primeira letra "MAIUCUSLA"   
 */
package BEAN;

/*
Codigo 
Produto
Tipo 
NCM
PONTO DE PEDIDO
*/

public class Produtos {
    
    private int codigo;
    private String produto;
    private String tipo;
    private String ncm; 
    private int ponto_p;
    
    public int getCodigo(){
        return this.codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo; 
    }
    
    public String getProduto(){
        return this.produto;
    }
    public void setProduto( String produto ){
        this.produto = produto;
    };
    
    public String getTipo(){
        return this.tipo; 
    }
    public void setTipo(String tipo){
        this.tipo = tipo; 
    }
    
    public String getNcm(){
        return this.ncm;
    }
    public void setNcm(String ncm){
        this.ncm = ncm; 
    }
    
    public int getPonto_p(){
        return this.ponto_p;
    }
    public void setPonto_p(int ponto_p){
        this.ponto_p = ponto_p; 
    }
}
    
    
