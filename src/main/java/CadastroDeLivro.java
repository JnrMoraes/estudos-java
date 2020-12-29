public class CadastroDeLivro {

    public static void main(String[] args) {

        Autor autorLivroFisico = new Autor();
        autorLivroFisico.setNome("Monteiro Lobato");
        autorLivroFisico.setEmail("ja.morri@gmail.com");
        autorLivroFisico.setCpf("123.345.567-00");

        Livro livro = new LivroFisico(autorLivroFisico);
        livro.setNome("Sitio do Pica-Pau amarelo");
        livro.setDescricao(" Reinações de Narizinho");
        livro.setValor(29.90);
        livro.setIsbn("32-345-56778-32");
        ((LivroFisico) livro).aplicarDescontoDe(0.20);

        Autor autorEbook = new Autor();
        autorEbook.setNome("Adam Rutherford");
        autorEbook.setEmail("adam.rutherford@gmail.com");
        autorEbook.setCpf("Não Brasileiro");

        Livro livroEbook1 = new EBook(autorEbook);
        livroEbook1.setNome("O livro dos Humanos");
        livroEbook1.setDescricao("Como os homens se parecem com os animais");
        livroEbook1.setValor(79.90);
        livroEbook1.setIsbn("12-123-12345-12");
        ((EBook) livroEbook1).aplicarDescontoDe(0.10);

        Autor autorMinilivro = new Autor();
        autorMinilivro.setNome("Fernando Monterio");
        autorMinilivro.setEmail("monteiro.fernando@gmail.com");
        autorMinilivro.setCpf("123.321.123-12");

        Livro livroMiniLivro = new MiniLivro(autorMinilivro);
        livroMiniLivro.setNome("Como montar mini livros");
        livroMiniLivro.setDescricao("Aprenda a montar um mini livro em 1 hora");
        livroMiniLivro.setValor(9.90);
        livroMiniLivro.setIsbn("32-345-56778-32");
        ((MiniLivro) livroMiniLivro).aplicarDescontoDe(0.15);

        System.out.println("\nLivros cadastrados são\n");
        livro.mostrarDetalhes();
        livroEbook1.mostrarDetalhes();
        livroMiniLivro.mostrarDetalhes();
    }
}
