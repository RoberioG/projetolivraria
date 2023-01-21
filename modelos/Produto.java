package br.com.americanas.polotech.projetolivraria.modelos;

public abstract class Produto {

    protected String id;
    protected String nome;
    protected Float preco;

    public Produto(String id, String nome, Float preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                ", preco=" + preco;
    }
}
