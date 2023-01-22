package br.com.americanas.polotech.projetolivraria.util;

import br.com.americanas.polotech.projetolivraria.modelos.Livro;
import br.com.americanas.polotech.projetolivraria.modelos.Produto;

import java.util.Scanner;

public class OperacaoesLivro{

    static Scanner scanner = new Scanner(System.in);

    //CADASTRO DE LIVROS
    protected static void cadastrarLivro(){
        Livro livro = new Livro();
        popularLivro(Estoque.gerarId, livro);
        Estoque.produtos.add(livro);
    }

    //LISTAGEM DE LIVROS
    protected static void listarLivros(){
        Estoque.produtos.stream().filter(produto -> produto.getClass().equals(Livro.class)).toList().forEach(produto -> System.out.println(produto.toString()));
    }

    //EDIÇÃO DE LIVROS
    protected static void editarLivro(){

        System.out.println("########### EDITAR PRODUTOS ###########");

        listarLivros();
        System.out.print("Digite o ID do livro que deseja editar: ");
        Integer idSelecionado = Integer.parseInt(scanner.nextLine());

        Livro livroEditar = new Livro();
        for (Produto produto : Estoque.produtos) {
            if (produto.getId() == idSelecionado){
                livroEditar = (Livro) produto;
            }
        }


        System.out.println("LIVRO PARA EDITAR >>>" + livroEditar.toString());

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

    protected static void apagarLivro(){
        System.out.println("########### APAGAR LIVRO ###########");

        listarLivros();
        System.out.print("Digite o ID do livro que deseja apagar: ");
        Integer idSelecionado = Integer.parseInt(scanner.nextLine());

        Livro livroApagar = new Livro();
        for (Produto produto : Estoque.produtos) {
            if (produto.getId() == idSelecionado){
                livroApagar = (Livro) produto;
            }
        }
        Estoque.produtos.remove(livroApagar);
    }

    //POPULAR ATRIBUTOS DE UM LIVRO
    private static void popularLivro(Integer id, Livro livro) {

        livro.setId(id);
        System.out.print("Digite o titulo do livro: ");
        livro.setNome(scanner.nextLine());
        System.out.print("Digite o preço do livro: ");
        livro.setPreco(Double.parseDouble(scanner.nextLine()));
        System.out.print("Digite o genero do livro: ");
        livro.setGenero(scanner.nextLine());
        System.out.print("Digite o escritor do livro: ");
        livro.setEscritor(scanner.nextLine());
        System.out.print("Digite a editora do livro: ");
        livro.setEditora(scanner.nextLine());
    }
}
