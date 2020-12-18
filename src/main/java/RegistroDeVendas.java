public class RegistroDeVendas {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico livroFisico = new LivroFisico(autor);
        livroFisico.setNome("Test Driven Development");
        livroFisico.setValor(59.90);

        Livro eBook = new EBook(autor);
        eBook.setNome("Test Driven Development");
        eBook.setValor(29.90);

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adiciona(livroFisico);
        carrinhoDeCompras.adiciona(eBook);

        System.out.println("Total: " + carrinhoDeCompras.getTotal());

    }
}
