package br.com.americanas.polotech.projetolivraria.util;

import br.com.americanas.polotech.projetolivraria.modelos.AlbumMusica;
import br.com.americanas.polotech.projetolivraria.modelos.Brinquedo;

import java.util.Scanner;

public class OperacoesBrinquedo {

    protected static void cadastrarBrinquedo(Scanner scanner){

        System.out.print("Digite o nome do brinquedo: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do brinquedo: ");
        double preco = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite o tipo do brinquedo: ");
        String tipo = scanner.nextLine();

        Brinquedo brinquedo = new Brinquedo(Estoque.gerarId, nome, preco, tipo);
        Estoque.produtos.add(brinquedo);
    }

    protected static void listarBrinquedos(){
        Estoque.produtos.stream().filter(produto -> produto.getClass().equals(Brinquedo.class)).toList().forEach(produto -> System.out.println(produto.toString()));
    }
}
