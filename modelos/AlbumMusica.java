package br.com.americanas.polotech.projetolivraria.modelos;

public class AlbumMusica extends Produto{

    private String artistaOuBanda;
    private String genero;
    private String selos;

    public AlbumMusica(int id, String nome, Double preco, String artistaOuBanda, String genero, String selos) {
        super(id, nome, preco);
        this.artistaOuBanda = artistaOuBanda;
        this.genero = genero;
        this.selos = selos;
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
}
