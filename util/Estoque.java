package br.com.americanas.polotech.projetolivraria.util;

import br.com.americanas.polotech.projetolivraria.modelos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static br.com.americanas.polotech.projetolivraria.util.OperacaoesLivro.*;
import static br.com.americanas.polotech.projetolivraria.util.OperacoesAlbumDeMusica.cadastrarAlbumMusica;
import static br.com.americanas.polotech.projetolivraria.util.OperacoesAlbumDeMusica.listarAlbumMusicas;
import static br.com.americanas.polotech.projetolivraria.util.OperacoesBrinquedo.cadastrarBrinquedo;
import static br.com.americanas.polotech.projetolivraria.util.OperacoesBrinquedo.listarBrinquedos;
import static br.com.americanas.polotech.projetolivraria.util.OperacoesFilme.cadastrarFilme;
import static br.com.americanas.polotech.projetolivraria.util.OperacoesFilme.listarFilmes;
import static br.com.americanas.polotech.projetolivraria.util.OperacoesJogo.cadastrarJogo;
import static br.com.americanas.polotech.projetolivraria.util.OperacoesJogo.listarJogos;

public class Estoque {

    static Integer gerarId = 6;
    static List<Produto> produtos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void menuEstoque() {


        Livro livro = new Livro(1, "A Culpa é das Estrelas", 20.50, "Conto", "Jhon Green", "Intriseca");
        produtos.add(livro);

        Filme filme = new Filme(2, "Harry Potter", 25.00, "Warnerbros", "Diretores", "Fantasia", "Produtores");
        produtos.add(filme);

        Jogo jogo = new Jogo(3, "God of War", 90.0, "Sony", "Aventura", "Santa Monica");
        produtos.add(jogo);

        AlbumMusica album = new AlbumMusica(4, "Blurryface", 50.35, "Twenty One Pilots", "Vários Generos", "Todos");
        produtos.add(album);

        Brinquedo brinquedo = new Brinquedo(5, "Bola", 20.0, "Esportivo");
        produtos.add(brinquedo);


        System.out.println("########### MENU DE ESTOQUE ###########");
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
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    editarProduto();
                    break;
                case 4:
                    apagarProduto();
                    break;
                case 0:
                    return;
            }
        }while (true);
    }


    public static void cadastrarProduto() {

        System.out.println("########### CADASTRAR PRODUTOS ###########");
        do {

            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Cadastrar Jogo");
            System.out.println("3 - Cadastrar Filmes");
            System.out.println("4 - Cadastrar Album de Música");
            System.out.println("5 - Cadastrar Brinquedo");
            System.out.println("0 - Voltar para menu de estoque");
            System.out.print("Selecione uma operação acima: ");

            int op = scanner.nextByte();
            scanner.nextLine();

            switch (op){
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    cadastrarJogo(scanner);
                    break;
                case 3:
                    cadastrarFilme(scanner);
                    break;
                case 4:
                    cadastrarAlbumMusica(scanner);
                    break;
                case 5:
                    cadastrarBrinquedo(scanner);
                    break;
                case 0:
                    return;
            }
            gerarId++;
        }while (true);
    }


    private static void listarProdutos() {

        System.out.println("########### LISTAR PRODUTOS ###########");
        do {
            System.out.println("1 - Listagem todos os produtos do estoque em estoque");
            System.out.println("2 - Listar Livros");
            System.out.println("3 - Listar Filmes");
            System.out.println("4 - Listar Jogos");
            System.out.println("5 - Listar Albums de Musica");
            System.out.println("6 - Listar Brinquedos");
            System.out.println("0 - Voltar para menu de estoque");
            System.out.print("Selecione uma operação acima: ");

            switch (scanner.nextByte()){
                case 1:
                    produtos.forEach(produto -> System.out.println(produto.toString()));
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    listarFilmes();
                    break;
                case 4:
                    listarJogos();
                    break;
                case 5:
                    listarAlbumMusicas();
                    break;
                case 6:
                    listarBrinquedos();
                    break;
                case 0:
                    return;
            }
            System.out.println("Precione enter para continuar");
            scanner.nextLine();
            scanner.nextLine();
        }while (true);
    }

    private static void editarProduto() {

        System.out.println("########### EDITAR PRODUTOS ###########");
        do {
            System.out.println("1 - Livro");
            System.out.println("2 - Jogo");
            System.out.println("3 - Filmes");
            System.out.println("4 - Album de Música");
            System.out.println("5 - Brinquedo");
            System.out.println("0 - Voltar para menu de estoque");
            System.out.print("Selecione uma categoria acima para editar: ");

            int op = scanner.nextByte();
            scanner.nextLine();

            switch (op){
                case 1:
                    editarLivro();
                    break;
//                case 2:
//                    editarJogo(scanner);
//                    break;
//                case 3:
//                    editarFilme(scanner);
//                    break;
//                case 4:
//                    editarAlbumMusica(scanner);
//                    break;
//                case 5:
//                    editarBrinquedo(scanner);
//                    break;
                case 0:
                    return;
            }

        }while (true);
    }

    private static void apagarProduto() {

        System.out.println("########### APAGAR PRODUTO ###########");
        do {
            System.out.println("1 - Livro");
            System.out.println("2 - Jogo");
            System.out.println("3 - Filmes");
            System.out.println("4 - Album de Música");
            System.out.println("5 - Brinquedo");
            System.out.println("0 - Voltar para menu de estoque");
            System.out.print("Selecione uma categoria acima para editar: ");

            int op = scanner.nextByte();
            scanner.nextLine();

            switch (op){
                case 1:
                    apagarLivro();
                    break;
//                case 2:
//                    editarJogo(scanner);
//                    break;
//                case 3:
//                    editarFilme(scanner);
//                    break;
//                case 4:
//                    editarAlbumMusica(scanner);
//                    break;
//                case 5:
//                    editarBrinquedo(scanner);
//                    break;
                case 0:
                    return;
            }

        }while (true);
    }


}
