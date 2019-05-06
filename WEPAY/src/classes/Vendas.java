
package classes;

public class Vendas {
   int codEmpregado;
   String nomeEmpregado;
   String produtoVendido;
   float valorProduto;
   
   public Vendas(int codEmpregado,String nomeEmpregado, String produtoVendido, float valorProduto) {
        this.nomeEmpregado = nomeEmpregado;
        this.produtoVendido = produtoVendido;
        this.valorProduto = valorProduto;   
   }
    
    @Override
    public String toString() {
       return "nome do empregado: "+nomeEmpregado+"\nproduto vendido: "+produtoVendido+"\nvalor: "+valorProduto+"\n\n";
    }
    
}