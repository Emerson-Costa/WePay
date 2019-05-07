
package classes;

public class Vendas {
   private int codEmpregado;
   private String nomeEmpregado;
   private String produtoVendido;
   private float valorProduto;
   
   public Vendas(int codEmpregado,String nomeEmpregado, String produtoVendido, float valorProduto) {
        this.nomeEmpregado = nomeEmpregado;
        this.produtoVendido = produtoVendido;
        this.valorProduto = valorProduto;   
   }
    
    @Override
    public String toString() {
       return "nome do empregado: "+nomeEmpregado+"\nproduto vendido: "+produtoVendido+"\nvalor: "+valorProduto+"\n\n";
    }

    public int getCodEmpregado() {
        return codEmpregado;
    }

    public void setCodEmpregado(int codEmpregado) {
        this.codEmpregado = codEmpregado;
    }

    public String getNomeEmpregado() {
        return nomeEmpregado;
    }

    public void setNomeEmpregado(String nomeEmpregado) {
        this.nomeEmpregado = nomeEmpregado;
    }

    public String getProdutoVendido() {
        return produtoVendido;
    }

    public void setProdutoVendido(String produtoVendido) {
        this.produtoVendido = produtoVendido;
    }

    public float getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;
    }
    
}