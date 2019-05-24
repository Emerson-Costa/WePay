
package classes;


public class Empregado {
    private String nome;
    private String endereco;
    private int tipo;
    private int id;

    public Empregado(String nome, String endereco, int tipo) {
        this.nome = nome;
        this.endereco = endereco;
        this.tipo = tipo;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nnome:" + nome + "\nendereco: " + endereco + "\ntipo: " + tipo + "\nid: " + id +"\n";
    }
    
    
    
}
