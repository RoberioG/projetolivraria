package br.com.americanas.polotech.projetolivraria.modelos;

public class Brinquedo extends Produto{

    private String tipo;

    public Brinquedo(String id, String nome, Float preco, String tipo) {
        super(id, nome, preco);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Brinquedo{" +
                super.toString() +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
