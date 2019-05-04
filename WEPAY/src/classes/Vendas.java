
package classes;

public class Vendas {
   int totalVendas;
   String produtoVendido;

    public Vendas( String produtoVendido) {
        this.produtoVendido = produtoVendido;
        lancarResultadoVendas();
    }

   public void lancarResultadoVendas(){
       totalVendas += totalVendas;
   }

    @Override
    public String toString() {
       return "total vendas: "+totalVendas+"\nproduto vendido: "+produtoVendido;
    }
    
}