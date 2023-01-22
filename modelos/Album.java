package br.com.americanas.polotech.projetolivraria.modelos;

public class Album extends Produto{

    private String artistaOuBanda;
    private String genero;
    private String selos;

    public Album(int id, String nome, Double preco, Integer quantidade, String artistaOuBanda, String genero, String selos) {
        super(id, nome, preco, quantidade);
        this.artistaOuBanda = artistaOuBanda;
        this.genero = genero;
        this.selos = selos;
    }

    public Album() {

    }

    @Override
    public String toString() {
        return "AlbumMusica{" +
                super.toString() +
                ", integrantes='" + artistaOuBanda + '\'' +
                ", genero='" + genero + '\'' +
                ", selos='" + selos + '\'' +
                '}';
    }

    public void setArtistaOuBanda(String artistaOuBanda) {
        this.artistaOuBanda = artistaOuBanda;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setSelos(String selos) {
        this.selos = selos;
    }
}
