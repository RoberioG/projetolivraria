package br.com.americanas.polotech.projetolivraria.util;

import br.com.americanas.polotech.projetolivraria.modelos.Album;

import java.util.Scanner;

import static br.com.americanas.polotech.projetolivraria.util.OperacoesProdutos.popularProduto;

public class OperacoesAlbumDeMusica {

    static Scanner scanner = new Scanner(System.in);
    protected static void cadastrarAlbum(){

        Album album = new Album();
        popularAlbum(Estoque.gerarId, album);
        Estoque.produtos.add(album);
    }

    private static void popularAlbum(Integer id, Album album) {

        popularProduto(id, album);
        System.out.print("Digite o artista/banda do album: ");
        album.setArtistaOuBanda(scanner.nextLine());
        System.out.print("Digite o genero do album ");
        album.setGenero(scanner.nextLine());
        System.out.print("Digite os selos do album: ");
        album.setSelos(scanner.nextLine());
    }
}
