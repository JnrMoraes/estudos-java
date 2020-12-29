public class MiniLivro extends Livro implements Promocional {

    public MiniLivro(Autor autor) {
        super(autor);
    }
    
    public boolean aplicarDescontoDe(double porcentagem) {
        System.out.println("Mini Livro não tem desconto!");
        return false;
    }
}
