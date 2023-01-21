package br.com.americanas.polotech.projetolivraria.modelos;

public abstract class Produto {

    protected int id;
    protected String nome;
    protected Double preco;

    public Produto(int id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return  "ID ='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco;
    }
}
