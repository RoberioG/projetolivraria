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

    public Livro() {
        super();
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

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
