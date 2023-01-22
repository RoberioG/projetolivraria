package br.com.americanas.polotech.projetolivraria.util;

import br.com.americanas.polotech.projetolivraria.modelos.Jogo;

import java.util.Scanner;

public class OperacoesJogo extends OperacoesProdutos {

    static Scanner scanner = new Scanner(System.in);

    protected static void cadastrarJogo(){

        Jogo jogo = new Jogo();
        popularJogo(Estoque.gerarId, jogo);
        Estoque.produtos.add(jogo);
    }

    private static void popularJogo(Integer id, Jogo jogo) {

        popularProduto(id, jogo);
        System.out.print("Digite a distribuidora do jogo: ");
        jogo.setDistribuidora(scanner.nextLine());
        System.out.print("Digite o genero do jogo: ");
        jogo.setGenero(scanner.nextLine());
        System.out.print("Digite o estudio do jogo: ");
        jogo.setEstudio(scanner.nextLine());
    }

}
