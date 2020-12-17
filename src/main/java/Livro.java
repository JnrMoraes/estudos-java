public class Livro<valor> {

    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    void mostrarDetalhes() {

        System.out.println("-- Detalhes do livro --");
        System.out.println("Nome: " +nome);
        System.out.println("Descrição: " +descricao);
        System.out.println("Valor: " +valor);
        System.out.println("ISBN: " +isbn);
        System.out.println("\n");
        if(this.temAutor()){
            autor.mostrarDetalles();
        }

    }

    public void aplicarDescontoDe(double porcentagem){
        this.valor -= this.valor * porcentagem;
    }

    boolean temAutor(){
        return this.autor != null;
    }


}
