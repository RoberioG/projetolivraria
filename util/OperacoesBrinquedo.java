package br.com.americanas.polotech.projetolivraria.util;

import br.com.americanas.polotech.projetolivraria.modelos.Brinquedo;

import java.util.Scanner;

import static br.com.americanas.polotech.projetolivraria.util.OperacoesProdutos.popularProduto;

public class OperacoesBrinquedo {

    protected static void cadastrarBrinquedo(Scanner scanner){

        System.out.print("Digite o nome do brinquedo: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do brinquedo: ");
        double preco = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite o tipo do brinquedo: ");
        String tipo = scanner.nextLine();

        Brinquedo brinquedo = new Brinquedo(Estoque.gerarId, nome, preco, 1, tipo);
        Estoque.produtos.add(brinquedo);
    }

    static Scanner scanner = new Scanner(System.in);

    protected static void cadastrarBrinquedo(){

        Brinquedo brinquedo = new Brinquedo();
        popularBrinquedo(Estoque.gerarId, brinquedo);
        Estoque.produtos.add(brinquedo);
    }

    private static void popularBrinquedo(Integer id, Brinquedo brinquedo) {

        popularProduto(id, brinquedo);
        System.out.print("Digite o tipo do brinquedo: ");
        brinquedo.setTipo(scanner.nextLine());
    }
}
