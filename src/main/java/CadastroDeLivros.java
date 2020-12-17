public class CadastroDeLivros {
    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.nome = "Java 8";
        livro.descricao = "Novos recursos da linguagem";
        livro.valor = 59.90;
        livro.isbn = "979-987-6543-3-2";

        Autor autor = new Autor();
        autor.nome = "Rodrigo Turin";
        autor.email = "rodrigo.turini@gmail.com";
        autor.cpf = "300100200-32";

        livro.autor = autor;
        livro.mostrarDetalhes();

        Livro livro2 = new Livro();
        livro2.nome = "Logica de programação";
        livro2.descricao = "Crie seus primeiros programas";
        livro2.valor = 39.60;
        livro2.isbn = " 123-23-456-45-0";

//        Autor autor2 = new Autor();
//        autor2.nome = "Paulo Siqueira";
//        autor2.email = "siqueira.paulo@gmail.com";
//        autor2.cpf = "123.432.456-32";
//
//        livro2.autor = autor2;
        livro2.mostrarDetalhes();

        System.out.println("Valor original R$ " + livro.valor);
        System.out.println("Valor original R$ " + livro2.valor);

        livro.aplicarDescontoDe(0.1);

        System.out.println("R$ " + livro.valor);


    }

}
