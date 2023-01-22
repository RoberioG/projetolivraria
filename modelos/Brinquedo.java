package br.com.americanas.polotech.projetolivraria.modelos;

public class Brinquedo extends Produto{

    private String tipo;

    public Brinquedo(int id, String nome, Double preco, Integer quantidade, String tipo) {
        super(id, nome, preco, quantidade);
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

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
