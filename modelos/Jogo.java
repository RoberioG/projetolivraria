package br.com.americanas.polotech.projetolivraria.modelos;

public class Jogo extends Produto{

    private String distribuidora;
    private String genero;
    private String estudio;

    public Jogo(String id, String nome, Float preco, String distribuidora, String genero, String estudio) {
        super(id, nome, preco);
        this.distribuidora = distribuidora;
        this.genero = genero;
        this.estudio = estudio;
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
}
