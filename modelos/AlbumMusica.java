package br.com.americanas.polotech.projetolivraria.modelos;

public class AlbumMusica extends Produto{

    private String integrantes;
    private String genero;
    private String selos;

    public AlbumMusica(int id, String nome, Double preco, String integrantes, String genero, String selos) {
        super(id, nome, preco);
        this.integrantes = integrantes;
        this.genero = genero;
        this.selos = selos;
    }

    @Override
    public String toString() {
        return "AlbumMusica{" +
                super.toString() +
                ", integrantes='" + integrantes + '\'' +
                ", genero='" + genero + '\'' +
                ", selos='" + selos + '\'' +
                '}';
    }
}
