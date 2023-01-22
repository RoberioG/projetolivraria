package br.com.americanas.polotech.projetolivraria.util;

import br.com.americanas.polotech.projetolivraria.modelos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static br.com.americanas.polotech.projetolivraria.util.OperacaoesLivro.*;
import static br.com.americanas.polotech.projetolivraria.util.OperacoesAlbumDeMusica.cadastrarAlbumMusica;
import static br.com.americanas.polotech.projetolivraria.util.OperacoesBrinquedo.cadastrarBrinquedo;
import static br.com.americanas.polotech.projetolivraria.util.OperacoesFilme.cadastrarFilme;
import static br.com.americanas.polotech.projetolivraria.util.OperacoesJogo.cadastrarJogo;
import static br.com.americanas.polotech.projetolivraria.util.OperacoesProdutos.*;

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
                    listarProdutosTipo(new AlbumMusica());
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
                    apagarProdutoTipo(new AlbumMusica());
                    break;
                case 5:
                    apagarProdutoTipo(new Brinquedo());
                    break;
                case 0:
                    return;
            }
        }while (true);
    }
}
