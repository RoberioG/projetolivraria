package br.com.americanas.polotech.projetolivraria.util;

import br.com.americanas.polotech.projetolivraria.modelos.Filme;

import java.util.Scanner;

import static br.com.americanas.polotech.projetolivraria.util.OperacoesProdutos.popularProduto;

public class OperacoesFilme {

    static Scanner scanner = new Scanner(System.in);

    protected static void cadastrarFilme(){

        Filme filme = new Filme();
        popularFilme(Estoque.gerarId, filme);
        Estoque.produtos.add(filme);
    }

    private static void popularFilme(Integer id, Filme filme) {

        popularProduto(id, filme);
        System.out.print("Digite o estudio do filme: ");
        filme.setEstudio(scanner.nextLine());
        System.out.print("Digite os diretores do filme: ");
        filme.setDiretores(scanner.nextLine());
        System.out.print("Digite o genero do filme: ");
        filme.setGenero(scanner.nextLine());
        System.out.print("Digite os produtores do filme: ");
        filme.setProdutores(scanner.nextLine());
    }

}
