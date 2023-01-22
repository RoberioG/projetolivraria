package br.com.americanas.polotech.projetolivraria.util;

import br.com.americanas.polotech.projetolivraria.modelos.AlbumMusica;
import br.com.americanas.polotech.projetolivraria.modelos.Jogo;

import java.util.Scanner;

public class OperacoesJogo {

    protected static void cadastrarJogo(Scanner scanner){

        System.out.print("Digite o titulo do jogo: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do jogo: ");
        double preco = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite a distribuidora do jogo: ");
        String distribuidora = scanner.nextLine();
        System.out.print("Digite o genero do jogo: ");
        String genero = scanner.nextLine();
        System.out.print("Digite o estudio do jogo: ");
        String estudio = scanner.nextLine();


        Jogo jogo = new Jogo(Estoque.gerarId, nome, preco, distribuidora, genero, estudio);
        Estoque.produtos.add(jogo);
    }

    protected static void listarJogos(){
        Estoque.produtos.stream().filter(produto -> produto.getClass().equals(Jogo.class)).toList().forEach(produto -> System.out.println(produto.toString()));
    }
}
