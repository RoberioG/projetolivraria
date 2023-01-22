package br.com.americanas.polotech.projetolivraria.modelos;

public class Brinquedo extends Produto{

    private String tipo;

    public Brinquedo(int id, String nome, Double preco, String tipo) {
        super(id, nome, preco);
        this.tipo = tipo;
    }

    public Brinquedo() {

    }

    @Override
    public String toString() {
        return "Brinquedo{" +
                super.toString() +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
