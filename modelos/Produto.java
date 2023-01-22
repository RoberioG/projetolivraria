package br.com.americanas.polotech.projetolivraria.modelos;

public abstract class Produto {

    protected Integer id;
    protected String nome;
    protected Double preco;

    public Produto(Integer id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto() {

    }

    @Override
    public String toString() {
        return  "ID ='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
