package teste;

import livraria.Autor;
import produtos.EBook;
import produtos.Livro;
import produtos.LivroFisico;
import produtos.MiniLivro;

public class RegrasDeDesconto {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("livraria.Autor");

        Livro livro = new LivroFisico(autor);
        livro.setValor(59.90);

        System.out.println("Valor Atual: " + livro.getValor());

        if (!((LivroFisico) livro).aplicarDescontoDe(0.1)) {
            System.out.println("Desconto em livro Fisico não pode ser maior que 30%");
        } else {
            System.out.println("Valor com desconto em livro Fisico: " + livro.getValor());
        }

        Livro livroEbook = new EBook(autor);
        livroEbook.setValor(29.90);

        System.out.println("Valor Atual Ebook: " + livroEbook.getValor());


        if (!((EBook) livroEbook).aplicarDescontoDe(0.20)) {
            System.out.println("Desconto em Ebook não pode ser maior que 30%");
        } else {
            System.out.println("Valor com desconto em Ebook: " + livroEbook.getValor());

        }

        Livro miniLivro = new MiniLivro(autor);
        miniLivro.setValor(19.90);

        System.out.println("Valor atual do Minilivro: " + miniLivro.getValor());

        if(((MiniLivro) miniLivro).aplicarDescontoDe(0.15)){
            System.out.println("Não há desconto em Minilivros");
        }
    }
}
