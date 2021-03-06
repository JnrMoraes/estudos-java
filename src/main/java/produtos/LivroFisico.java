package produtos;

import livraria.Autor;

public class LivroFisico extends Livro implements Promocional {

    public LivroFisico(Autor autor) {
        super(autor);
    }

    public double getTaxaImpressao(){
        return this.getValor() * 0.05 ;
    }

    @Override
    public boolean aplicarDescontoDe(double porcentagem){
        if(porcentagem > 0.30){
            System.out.println("Valoresa acima de 30% não são aceitos");
            return false;
        } else {
            double desconto = getValor() * porcentagem;
            setValor(getValor() - desconto);
            System.out.println("Aplicado desconto no livro fisico");
            return true;
        }
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
