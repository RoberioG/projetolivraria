package br.com.americanas.polotech.projetolivraria.util;

import br.com.americanas.polotech.projetolivraria.modelos.Livro;

import java.util.Scanner;
import java.util.stream.Collectors;

public class OperacaoesLivro{
    protected static void cadastrarLivro(Scanner scanner){

        System.out.print("Digite o titulo do livro: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do livro: ");
        double preco = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite o genero do livro: ");
        String genero = scanner.nextLine();
        System.out.print("Digite o escritor do livro: ");
        String escritor = scanner.nextLine();
        System.out.print("Digite a editora do livro: ");
        String editora = scanner.nextLine();

        Livro livro = new Livro(Estoque.gerarId, nome,preco, genero, escritor, editora);
        Estoque.produtos.add(livro);

        Estoque.produtos.forEach(produto -> System.out.println(produto.toString()));
        System.out.println();
        System.out.println("EEEEEEEEEEEEEITA");
        System.out.println();
        Estoque.produtos.stream().filter(produto -> produto.getClass().equals(Livro.class)).toList().forEach(produto -> System.out.println(produto.toString()));
    }
}
