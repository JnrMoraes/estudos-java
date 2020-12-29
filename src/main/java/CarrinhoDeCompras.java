public class CarrinhoDeCompras extends Livro{

    private double total;

    public void adiciona(Produto produto){
        System.out.println("Adicinando: " + produto.toString());

        total += produto.getValor();
    }

    public double getTotal(){
        return total;
    }

}
