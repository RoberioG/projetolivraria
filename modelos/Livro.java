package br.com.americanas.polotech.projetolivraria.modelos;

public class Livro extends Produto{

    private String genero;
    private String escritor;
    private String editora;

    public Livro (int id, String nome, Double preco, String genero, String escritor, String editora){
        super(id, nome, preco);
        this.genero = genero;
        this.escritor = escritor;
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{ " +
                super.toString() +
                ", genero='" + genero + '\'' +
                ", escritor='" + escritor + '\'' +
                ", editora='" + editora + '\'' +
                '}';
    }
}
