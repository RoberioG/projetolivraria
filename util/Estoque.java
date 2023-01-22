package br.com.americanas.polotech.projetolivraria.util;

import br.com.americanas.polotech.projetolivraria.modelos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static br.com.americanas.polotech.projetolivraria.util.OperacaoesLivro.*;
import static br.com.americanas.polotech.projetolivraria.util.OperacoesAlbumDeMusica.cadastrarAlbum;
import static br.com.americanas.polotech.projetolivraria.util.OperacoesBrinquedo.cadastrarBrinquedo;
import static br.com.americanas.polotech.projetolivraria.util.OperacoesFilme.cadastrarFilme;
import static br.com.americanas.polotech.projetolivraria.util.OperacoesJogo.cadastrarJogo;
import static br.com.americanas.polotech.projetolivraria.util.OperacoesProdutos.*;

public class Estoque {

    static Integer gerarId = 9;
    static List<Produto> produtos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void menuEstoque() {

        popularEstoque();

        do {

            limparTela();

            System.out.println("########### MENU DE ESTOQUE ###########\n");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produto");
            System.out.println("3 - Editar produto");
            System.out.println("4 - Apagar produto");
            System.out.println("0 - Voltar para menu anterior");
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

        do {
            menu("Cadastrar");

            int op = scanner.nextByte();
            scanner.nextLine();

            switch (op){
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    cadastrarJogo();
                    break;
                case 3:
                    cadastrarFilme();
                    break;
                case 4:
                    cadastrarAlbum();
                    break;
                case 5:
                    cadastrarBrinquedo();
                    break;
                case 0:
                    return;
            }
            gerarId++;

            System.out.println("Produto cadastrado com sucesso!");
            System.out.println("Precione enter para continuar");
            scanner.nextLine();
            scanner.nextLine();

        }while (true);
    }


    private static void listarProdutos() {


        do {
            menu("Listar");

            switch (scanner.nextByte()){

                case 1:
                    listarProdutosTipo(new Livro());
                    break;
                case 2:
                    listarProdutosTipo(new Jogo());
                    break;
                case 3:
                    listarProdutosTipo(new Filme());
                    break;
                case 4:
                    listarProdutosTipo(new Album());
                    break;
                case 5:
                    listarProdutosTipo(new Brinquedo());
                    break;
                case 6:
                    produtos.forEach(produto -> System.out.println(produto.toString()));
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

        do {
            menu("Editar");

            int op = scanner.nextByte();
            scanner.nextLine();

            switch (op){
                case 1:
//                    editarLivro2();
                    editarProdutoTipo(new Livro());
                    break;
                case 2:
                    editarProdutoTipo(new Jogo());
                    break;
                case 3:
                    editarProdutoTipo(new Filme());
                    break;
                case 4:
                    editarProdutoTipo(new Album());
                    break;
                case 5:
                    editarProdutoTipo(new Brinquedo());
                    break;
                case 0:
                    return;
            }

        }while (true);
    }

    private static void apagarProduto() {

        do {
            menu("Apagar");

            int op = scanner.nextByte();
            scanner.nextLine();

            switch (op){
                case 1:
                    apagarProdutoTipo(new Livro());
                    break;
                case 2:
                    apagarProdutoTipo(new Jogo());
                    break;
                case 3:
                    apagarProdutoTipo(new Filme());
                    break;
                case 4:
                    apagarProdutoTipo(new Album());
                    break;
                case 5:
                    apagarProdutoTipo(new Brinquedo());
                    break;
                case 0:
                    return;
            }

            System.out.println("Produto excluido com sucesso!");
            System.out.println("Precione enter para continuar");
            scanner.nextLine();
            scanner.nextLine();
        }while (true);
    }


    private static void popularEstoque() {
        Livro livro1 = new Livro(1, "A Culpa é das Estrelas", 20.50, 9, "Romance", "Jhon Green", "Intriseca");
        produtos.add(livro1);
        Livro livro2 = new Livro(2, "Batman - A Piada Mortal", 49.99, 20, "Quadrinho", "Greg Cox", "Camelot Editora");
        produtos.add(livro2);
        Livro livro3 = new Livro(3, "Medo Clássico - Vol. 1", 40.99, 3, "Terror", "H.P. Lovecraft", "Darkside");
        produtos.add(livro3);

        Filme filme1 = new Filme(4, "Harry Potter e A Camara Secreta", 25.00, 6, "Warnerbros", "Diretores", "Fantasia", "Produtores");
        produtos.add(filme1);
        Filme filme2 = new Filme(5, "Interestelar", 45.00, 3, "Warnerbros", "Christopher Nolan", " Ficção científica, Drama", "Jonathan Nolan, Christopher Nolan");
        produtos.add(filme2);

        Jogo jogo = new Jogo(6, "God of War", 90.0, 8, "Sony", "Aventura", "Santa Monica");
        produtos.add(jogo);

        Album album = new Album(7, "Blurryface", 50.35, 1, "Twenty One Pilots", "Vários Generos", "Todos");
        produtos.add(album);

        Brinquedo brinquedo = new Brinquedo(8, "Bola", 20.0, 20, "Esportivo");
        produtos.add(brinquedo);
    }

}
