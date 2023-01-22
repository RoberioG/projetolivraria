package br.com.americanas.polotech.projetolivraria.util;

import br.com.americanas.polotech.projetolivraria.modelos.Livro;
import br.com.americanas.polotech.projetolivraria.modelos.Produto;

import static br.com.americanas.polotech.projetolivraria.util.Estoque.scanner;

public class OperacoesProdutos {

    protected static void listarProdutosTipo(Produto produtoTipo){
        Estoque.produtos.stream().filter(produtos -> produtos.getClass().equals(produtoTipo.getClass())).toList().forEach(produto -> System.out.println(produto.toString()));
    }

    protected static void apagarProdutoTipo(Produto produtoTipo){

        limparTela();
        System.out.printf("########### APAGAR %s ###########\n\n", produtoTipo.getClass().getSimpleName().toUpperCase());

        listarProdutosTipo(produtoTipo);
        System.out.printf("\nDigite o ID do %s que deseja apagar: ", produtoTipo.getClass().getSimpleName().toLowerCase());
        int idSelecionado = Integer.parseInt(scanner.nextLine());

        Produto produtoApagar = produtoTipo;
        for (Produto produto : Estoque.produtos) {
            if (produto.getId() == idSelecionado){
                produtoApagar = produto;
            }
        }
        Estoque.produtos.remove(produtoApagar);
    }

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

    protected static void limparTela() {
        for (int i = 0; i <= 20; i++){
            System.out.println();
        }
    }
}
