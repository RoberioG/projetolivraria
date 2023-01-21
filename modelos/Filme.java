package br.com.americanas.polotech.projetolivraria.modelos;

public class Filme extends Produto{

    private String estudio;
    private String diretores;
    private String genero;
    private String produtores;

    public Filme(int id, String nome, Double preco, String estudio, String diretores, String genero, String produtores) {
        super(id, nome, preco);
        this.estudio = estudio;
        this.diretores = diretores;
        this.genero = genero;
        this.produtores = produtores;
    }

    @Override
    public String toString() {
        return "Filme{" +
                super.toString() +
                ", estudio='" + estudio + '\'' +
                ", diretores='" + diretores + '\'' +
                ", genero='" + genero + '\'' +
                ", produtores='" + produtores + '\'' +
                '}';
    }
}
