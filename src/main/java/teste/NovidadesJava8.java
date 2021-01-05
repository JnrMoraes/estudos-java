package teste;

import livraria.Autor;
import produtos.Livro;
import produtos.LivroFisico;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

public class NovidadesJava8 {

    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        Livro javaoo = new LivroFisico(autor);
        javaoo.setNome("Java O.O.");

        Livro java8 = new LivroFisico(autor);
        java8.setNome("Java 8 Prático");

        Livro ruby = new LivroFisico(autor);
        ruby.setNome("Livro Ruby");

        List<Livro> livros = Arrays.asList(java8, javaoo, ruby);

       livros.sort(comparing(Livro::getNome)
       );


//        for (Livro livro : livros){
//            System.out.println(livro.getNome());
//        }

        livros.forEach(l-> System.out.println(l.getNome())); // expressão lambda

        System.out.println("-=-=-=-=-=-=-=-==-");

//        Stream<Livro> stream = livros.stream();

        livros.stream()
                .filter(l -> l.getNome().contains("Java"))
                .forEach(l -> System.out.println(l.getNome()));

    }
}
