package br.com.americanas.polotech.projetolivraria;

import java.util.Scanner;

import static br.com.americanas.polotech.projetolivraria.util.Carrinho.menuCarrinho;
import static br.com.americanas.polotech.projetolivraria.util.Estoque.menuEstoque;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("########### SISTEMA DE GERENCIAMENTO DA BIBLIOTECA ###########\n");
            System.out.println("1 - Ir para estoque");
            System.out.println("2 - Ir para carrinho");
            System.out.println("0 - Sair da aplicação");
            System.out.print("Selecione uma operação acima: ");

            int op = scanner.nextByte();

            switch (op){
                case 1:
                    menuEstoque();
                    break;
                case 2:
                    menuCarrinho();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida, selecione um valor válido");
                    System.out.println();
            }
        }while (true);

    }
}
