public class RegistroDeVendas {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico livroFisico = new LivroFisico(autor);
        livroFisico.setNome("Test Driven Development");
        livroFisico.setValor(59.90);

        if(livroFisico.aplicaDescontoDe10Porcento()){
            System.out.println("Valor agora é: " + livroFisico.getValor());
        }

        EBook eBook = new EBook(autor);
        eBook.setNome("Test Driven Development");
        eBook.setValor(29.90);

        CarrinhoDeCompras carinho = new CarrinhoDeCompras();
        carinho.adiciona( livroFisico);
        carinho.adiciona(eBook);

        System.out.println("Total: " + carinho.getTotal());

    }
}
