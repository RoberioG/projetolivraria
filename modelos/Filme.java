package br.com.americanas.polotech.projetolivraria.modelos;

public class Filme extends Produto{

    private String estudio;
    private String diretores;
    private String genero;
    private String produtores;

    public Filme(int id, String nome, Double preco, Integer quantidade, String estudio, String diretores, String genero, String produtores) {
        super(id, nome, preco, quantidade);
        this.estudio = estudio;
        this.diretores = diretores;
        this.genero = genero;
        this.produtores = produtores;
    }

    public Filme() {

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

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public void setDiretores(String diretores) {
        this.diretores = diretores;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setProdutores(String produtores) {
        this.produtores = produtores;
    }
}
