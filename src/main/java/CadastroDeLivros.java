public class CadastroDeLivros {
    public static void main(String[] args) {


        Autor autor = new Autor();
        autor.setNome("Rodrigo Turin");
        autor.setEmail("rodrigo.turini@gmail.com");
        autor.setCpf("300100200-32");

        Livro livro = new Livro(autor);
        livro.setNome("Java 8"); ;
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90);
        livro.setIsbn("979-987-6543-3-2");
        livro.mostrarDetalhes();

        Autor autor2 = new Autor();
        autor2.setNome("Paulo Siqueira");
        autor2.setEmail("siqueira.paulo@gmail.com");
        autor2.setCpf("123.432.456-32");

        Livro livro2 = new Livro(autor2);
        livro2.setNome("Logica de programação");
        livro2.setDescricao("Crie seus primeiros programas");
        livro2.setValor(39.60);
        livro2.setIsbn("123-23-456-45-0");
        livro2.mostrarDetalhes();

        System.out.println("Valor original R$ " + livro.getValor());
        System.out.println("Valor original R$ " + livro2.getValor());

        livro.aplicarDescontoDe(0.1);

        System.out.println("R$ " + livro.getValor());


        EBook eBook = new EBook();
        eBook.setNome("Java 8 Pratico");

        System.out.println(eBook.getNome());

    }

}
