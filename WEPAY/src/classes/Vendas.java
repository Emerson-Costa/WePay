
package classes;

import java.util.ArrayList;

public class Vendas {
   private int    codEmpregado;
   private Data   dataVenda;
   private String nomeEmpregado;
   private String produtoVendido;
   private float  valorProduto;
   
   public Vendas(int codEmpregado,String nomeEmpregado, String produtoVendido, float valorProduto, int dia, int mes, int ano) {
        dataVenda = new Data(dia, mes, ano);
        this.nomeEmpregado = nomeEmpregado;
        this.produtoVendido = produtoVendido;
        this.valorProduto = valorProduto;   
   }
    
    @Override
    public String toString() {
       return "\ndata de venda: "+dataVenda.toString()+"\nnome do empregado: "+nomeEmpregado+"\nproduto vendido: "+produtoVendido+"\nvalor: "+valorProduto+"\n";
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

    public Data getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Data dataVenda) {
        this.dataVenda = dataVenda;
    }
    
}