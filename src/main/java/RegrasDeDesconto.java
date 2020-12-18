public class RegrasDeDesconto {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        Livro livro = new Livro();
        livro.setValor(59.90);

        if(!livro.aplicarDescontoDe(0.3)){
            System.out.println("Desconto não pode ser maior que 30%");
        } else {
            System.out.println("Valor com desconto: " + livro.getValor());
        }

        EBook eBook = new EBook(autor);
        eBook.setValor(29.90);

        if(!eBook.aplicarDescontoDe(0.15)){
            System.out.println("Desconto não pode ser maior que 15%");
        } else {
            System.out.println("Valor com desconto: " + eBook.getValor());
        }
    }

}
