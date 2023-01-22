package br.com.americanas.polotech.projetolivraria.util;

import br.com.americanas.polotech.projetolivraria.modelos.AlbumMusica;
import br.com.americanas.polotech.projetolivraria.modelos.Filme;

import java.util.Scanner;

public class OperacoesFilme {

    protected static void cadastrarFilme(Scanner scanner){

        System.out.print("Digite o titulo do filme: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do filme: ");
        double preco = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite o estudio do filme: ");
        String estudio = scanner.nextLine();
        System.out.print("Digite os diretores do filme: ");
        String diretores = scanner.nextLine();
        System.out.print("Digite o genero do filme: ");
        String genero = scanner.nextLine();
        System.out.print("Digite os produtores do filme: ");
        String produtores = scanner.nextLine();

        Filme filme = new Filme(Estoque.gerarId, nome, preco, estudio, diretores, genero, produtores);
        Estoque.produtos.add(filme);
    }

}
