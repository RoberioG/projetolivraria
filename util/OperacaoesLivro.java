package br.com.americanas.polotech.projetolivraria.util;

import br.com.americanas.polotech.projetolivraria.modelos.Livro;
import br.com.americanas.polotech.projetolivraria.modelos.Produto;

import java.util.Scanner;

import static br.com.americanas.polotech.projetolivraria.util.OperacoesProdutos.listarProdutosTipo;
import static br.com.americanas.polotech.projetolivraria.util.OperacoesProdutos.popularProduto;


public class OperacaoesLivro{

    static Scanner scanner = new Scanner(System.in);

    //CADASTRO DE LIVROS
    protected static void cadastrarLivro(){
        Livro livro = new Livro();
        popularLivro(Estoque.gerarId, livro);
        Estoque.produtos.add(livro);
    }

    //POPULAR ATRIBUTOS DE UM LIVRO
    private static void popularLivro(Integer id, Livro livro) {

        popularProduto(id, livro);
        System.out.print("Digite o genero do livro: ");
        livro.setGenero(scanner.nextLine());
        System.out.print("Digite o escritor do livro: ");
        livro.setEscritor(scanner.nextLine());
        System.out.print("Digite a editora do livro: ");
        livro.setEditora(scanner.nextLine());
    }

    //EDIÇÃO DE LIVROS
    protected static void editarLivro2(){

        System.out.println("########### EDITAR PRODUTOS ###########");

        listarProdutosTipo(new Livro());
        System.out.print("Digite o ID do livro que deseja editar: ");
        int idSelecionado = Integer.parseInt(scanner.nextLine());

        Livro livroEditar = new Livro();
        for (Produto produto : Estoque.produtos) {
            if (produto.getId() == idSelecionado){
                livroEditar = (Livro) produto;
            }
        }

        do {
            System.out.println("1 - Todos");
            System.out.println("2 - Nome");
            System.out.println("3 - Preço");
            System.out.println("4 - Genero");
            System.out.println("5 - Escritor");
            System.out.println("6 - Editora");
            System.out.println("0 - Voltar para menu de categoria de edição");
            System.out.print("Selecione o campo de livro que deseja editar: ");

            int op = scanner.nextByte();
            scanner.nextLine();

            switch (op){
                case 1:
                    popularLivro(idSelecionado, livroEditar);
                    break;
                case 2:
                    System.out.print("Digite o titulo do livro: ");
                    livroEditar.setNome(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Digite o preço do livro: ");
                    livroEditar.setPreco(Double.parseDouble(scanner.nextLine()));
                    break;
                case 4:
                    System.out.print("Digite o genero do livro: ");
                    livroEditar.setGenero(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Digite o escritor do livro: ");
                    livroEditar.setEscritor(scanner.nextLine());
                    break;
                case 6:
                    System.out.print("Digite a editora do livro: ");
                    livroEditar.setEditora(scanner.nextLine());
                    break;
                case 0:
                    return;
            }
        }while (true);
    }
}
