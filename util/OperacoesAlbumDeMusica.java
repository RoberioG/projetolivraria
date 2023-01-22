package br.com.americanas.polotech.projetolivraria.util;

import br.com.americanas.polotech.projetolivraria.modelos.AlbumMusica;
import br.com.americanas.polotech.projetolivraria.modelos.Livro;

import java.util.Scanner;

public class OperacoesAlbumDeMusica {

    protected static void cadastrarAlbumMusica(Scanner scanner){

        System.out.print("Digite o titulo do album: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do album: ");
        double preco = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite o artista/banda do album: ");
        String artistaOuBanda = scanner.nextLine();
        System.out.print("Digite o genero do album ");
        String genero = scanner.nextLine();
        System.out.print("Digite os selos do album: ");
        String selos = scanner.nextLine();

        AlbumMusica album = new AlbumMusica(Estoque.gerarId, nome, preco, artistaOuBanda, genero, selos);
        Estoque.produtos.add(album);
    }
}
