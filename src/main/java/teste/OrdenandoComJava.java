package teste;

import livraria.Autor;
import produtos.EBook;
import produtos.LivroFisico;
import produtos.Produto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoComJava {

    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        LivroFisico livroFisico = new LivroFisico(autor);
        livroFisico.setNome("Java 8 pratico");
        livroFisico.setValor(59.90);

        EBook eBook = new EBook(autor);
        eBook.setNome("Java 8 pratico Ebook");
        eBook.setValor(29.90);

        List<Produto> produtos = Arrays.asList(livroFisico,eBook);

        Collections.sort(produtos);

        for(Produto produto : produtos){
            System.out.println(produto.getValor());
        }
    }
}
