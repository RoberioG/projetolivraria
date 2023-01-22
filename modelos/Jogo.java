package br.com.americanas.polotech.projetolivraria.modelos;

public class Jogo extends Produto{

    private String distribuidora;
    private String genero;
    private String estudio;

    public Jogo(int id, String nome, Double preco, Integer quantidade, String distribuidora, String genero, String estudio) {
        super(id, nome, preco, quantidade);
        this.distribuidora = distribuidora;
        this.genero = genero;
        this.estudio = estudio;
    }

    public Jogo() {

    }

    @Override
    public String toString() {
        return "Jogo{" +
                super.toString() +
                ", distribuidora='" + distribuidora + '\'' +
                ", genero='" + genero + '\'' +
                ", estudio='" + estudio + '\'' +
                '}';
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
