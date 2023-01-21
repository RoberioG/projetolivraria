package br.com.americanas.polotech.projetolivraria.util;

import br.com.americanas.polotech.projetolivraria.modelos.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static br.com.americanas.polotech.projetolivraria.util.Carrinho.menuCarrinho;
import static br.com.americanas.polotech.projetolivraria.util.OperacaoesLivro.cadastrarLivro;

public class Estoque {

    static Integer gerarId = 0;
    static List<Produto> produtos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void menuEstoque() {
        System.out.println("########### MENU DE ESTOQUE ###########");

        boolean continuar = true;
        do {
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produto");
            System.out.println("3 - Editar produto");
            System.out.println("4 - Apagar produto");
            System.out.println("0 - Sair da aplicação");
            System.out.print("Selecione uma operação acima: ");

            switch (scanner.nextByte()){
                case 1:
                    cadastrarProduto();
                    break;
//                case 2:
//                    listarProdutos();
//                    break;
//                case 3:
//                    editarProduto();
//                    break;
//                case 2:
//                    apagarProduto();
//                    break;
                case 0:
                    return;
            }
        }while (continuar);
    }

    public static void cadastrarProduto() {

        System.out.println("########### CADASTRAR PRODUTO ###########");
        do {

            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Cadastrar Jogo");
            System.out.println("3 - Cadastrar Filmes");
            System.out.println("4 - Cadastrar Album de Música");
            System.out.println("5 - Cadastrar Brinquedo");
            System.out.println("0 - Voltar para menu de estoque");
            System.out.print("Selecione uma operação acima: ");

            switch (scanner.nextByte()){
                case 1:
                    cadastrarLivro(scanner);
                    break;
//                case 2:
//                    cadastrarJogo();
//                    break;
//                case 3:
//                    cadastrarFilme();
//                    break;
//                case 4:
//                    cadastrarAlbumMusica();
//                    break;
//                case 5:
//                    cadastrarBrinquedo();
//                    break;

                case 0:
                    return;
            }

            gerarId++;
        }while (true);
    }


//    private static void listarProdutos() {
//        boolean continuar = true;
//        do {
//            System.out.println("1 - Cadastrar produto");
//            System.out.println("2 - Listar produto");
//            System.out.println("3 - Editar produto");
//            System.out.println("4 - Apagar produto");
//            System.out.println("0 - Sair da aplicação");
//            System.out.print("Selecione uma operação acima: ");
//
//
//
//            switch (scanner.nextByte()){
//                case 1:
//                    cadastrarProduto();
//                    break;
//                case 2:
//                    listarProdutos();
//                    break;
//                case 3:
//                    editarProduto();
//                    break;
//                case 2:
//                    apagarProduto();
//                    break;
//                case 0:
//                    continuar = false;
//            }
//        }while (continuar);
//    }



}
