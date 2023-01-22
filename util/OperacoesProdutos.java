package br.com.americanas.polotech.projetolivraria.util;

import br.com.americanas.polotech.projetolivraria.modelos.Produto;

import static br.com.americanas.polotech.projetolivraria.util.Estoque.scanner;

public class OperacoesProdutos {

    //MENU UTILIZADO POR ESTOQUE PARA EXECUTAR OPERAÇÕES
    protected static void menu(String operacao) {

        limparTela();

        System.out.printf("########### %s PRODUTO ###########\n\n", operacao.toUpperCase());
        System.out.printf("1 - %s Livro\n", operacao);
        System.out.printf("2 - %s Jogo\n", operacao);
        System.out.printf("3 - %s Filmes\n", operacao);
        System.out.printf("4 - %s Album de Música\n", operacao);
        System.out.printf("5 - %s Brinquedo\n", operacao);

        if (operacao.equalsIgnoreCase("listar"))
            System.out.println("6 - Listar todos os produtos no estoque");

        System.out.println("0 - Voltar para menu anterior");
        System.out.print("Selecione uma operação acima: ");
    }

    // UTILIZADO POR CADA PRODUTO PARA POPULAR AS INFORMAÇÕES BASICAS A CADA UM
    protected static void popularProduto(Integer id, Produto produto) {

        System.out.println();
        produto.setId(id);
        System.out.printf("Digite o titulo do %s: ", produto.getClass().getSimpleName().toLowerCase());
        produto.setNome(scanner.nextLine());
        System.out.printf("Digite o preço do %s: ", produto.getClass().getSimpleName().toLowerCase());
        produto.setPreco(Double.parseDouble(scanner.nextLine()));
        System.out.printf("Digite a quantidade de %ss que deseja cadastrar: ", produto.getClass().getSimpleName().toLowerCase());
        produto.setQuantidade(Integer.parseInt(scanner.nextLine()));
    }

    protected static void listarProdutosTipo(Produto produtoTipo){
        Estoque.produtos.stream().filter(produtos -> produtos.getClass().equals(produtoTipo.getClass())).toList().forEach(produto -> System.out.println(produto.toString()));
    }

    protected static void editarProdutoTipo(Produto produtoTipo){

        limparTela();
        System.out.printf("########### EDITAR %s ###########\n\n", produtoTipo.getClass().getSimpleName().toUpperCase());

        Produto produtoEditar = encontrarProduto(produtoTipo);

        do {

            System.out.println("1 - Nome");
            System.out.println("2 - Preço");
            System.out.println("3 - Quantidade");
            System.out.println("4 - Todos os campos acima");
            System.out.println("0 - Voltar para menu de categoria de edição");
            System.out.printf("Selecione o campo do %s que deseja editar: ", produtoTipo.getClass().getSimpleName().toLowerCase());

            int op = scanner.nextByte();
            scanner.nextLine();

            switch (op){
                case 1:
                    System.out.printf("Digite o novo titulo do %s: ", produtoTipo.getClass().getSimpleName().toLowerCase());
                    produtoEditar.setNome(scanner.nextLine());
                    break;
                case 2:
                    System.out.printf("Digite o novo preço do %s: ", produtoTipo.getClass().getSimpleName().toLowerCase());
                    produtoEditar.setPreco(Double.parseDouble(scanner.nextLine()));
                    break;
                case 3:
                    System.out.printf("Digite a nova quantidade de %s: ", produtoTipo.getClass().getSimpleName().toLowerCase());
                    produtoEditar.setQuantidade(Integer.parseInt(scanner.nextLine()));
                    break;
                case 4:
                    System.out.printf("Digite o novo titulo do %s: ", produtoTipo.getClass().getSimpleName().toLowerCase());
                    produtoEditar.setNome(scanner.nextLine());
                    System.out.printf("Digite o novo preço do %s: ", produtoTipo.getClass().getSimpleName().toLowerCase());
                    produtoEditar.setPreco(Double.parseDouble(scanner.nextLine()));
                    System.out.printf("Digite a nova quantidade de %s: ", produtoTipo.getClass().getSimpleName().toLowerCase());
                    produtoEditar.setQuantidade(Integer.parseInt(scanner.nextLine()));
                case 0:
                    return;
            }

            System.out.println("Produto editado com sucesso!");
            System.out.println("Precione enter para continuar");
            scanner.nextLine();
            scanner.nextLine();
        }while (true);

    }

    protected static void apagarProdutoTipo(Produto produtoTipo){

        limparTela();
        System.out.printf("########### APAGAR %s ###########\n\n", produtoTipo.getClass().getSimpleName().toUpperCase());

        Produto produtoApagar = encontrarProduto(produtoTipo);
        Estoque.produtos.remove(produtoApagar);
    }

    private static Produto encontrarProduto(Produto produtoTipo) {

        listarProdutosTipo(produtoTipo);
        System.out.printf("\nDigite o ID do %s que deseja apagar: ", produtoTipo.getClass().getSimpleName().toLowerCase());
        int idSelecionado = Integer.parseInt(scanner.nextLine());

        Produto produtoEncontrado = produtoTipo;
        for (Produto produto : Estoque.produtos) {
            if (produto.getId() == idSelecionado){
                produtoEncontrado = produto;
            }
        }
        return produtoEncontrado;
    }

    protected static void limparTela() {
        for (int i = 0; i <= 20; i++){
            System.out.println();
        }
    }
}
