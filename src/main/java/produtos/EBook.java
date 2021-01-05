package produtos;

import livraria.Autor;

public class EBook extends Livro implements Promocional {

    private String waterMark;

    public EBook(Autor autor ) {
        super(autor);
    }

    @Override
    public boolean aplicarDescontoDe(double porcentagem){
        if(porcentagem > 0.15){
            return false;
        }
        System.out.println("Aplicado desconto");
        double desconto =  getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
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
