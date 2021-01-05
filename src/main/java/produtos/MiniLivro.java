package produtos;

import livraria.Autor;

public class MiniLivro extends Livro implements Promocional {

    public MiniLivro(Autor autor) {
        super(autor);
    }
    
    public boolean aplicarDescontoDe(double porcentagem) {
        System.out.println("Mini produtos.Livro não tem desconto!");
        return false;
    }


    @Override
    public int compareTo(Produto outroProduto) {
        if(this.getValor() < outroProduto.getValor()){
            return -1;
        }
        if(this.getValor() > outroProduto.getValor()){
            return 1;
        }
        return 0;
    }
}
