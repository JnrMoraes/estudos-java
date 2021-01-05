package produtos;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras extends Livro {

    private double total;
    private List<Produto> produtos;

    public CarrinhoDeCompras(){
        this.produtos = new ArrayList<>();
    }

    public void adiciona(Produto produto){
        this.produtos.add(produto);
    }

    public void remove(Produto posicao){
        this.produtos.remove(posicao);
    }

    public double getTotal() {
        return total;
    }

   public List<Produto> getProdutos(){
        return produtos;
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
