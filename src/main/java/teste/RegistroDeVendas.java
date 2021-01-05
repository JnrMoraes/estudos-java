package teste;

import livraria.Autor;
import produtos.CarrinhoDeCompras;
import produtos.EBook;
import produtos.LivroFisico;
import produtos.Produto;

import java.util.List;

public class RegistroDeVendas {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico livroFisico = new LivroFisico(autor);
        livroFisico.setNome("Test Driven Development Fisico");
        livroFisico.setValor(59.90);

        if(livroFisico.aplicaDescontoDe10Porcento()){
            System.out.println("Valor agora é: " + livroFisico.getValor());
        }

        EBook eBook = new EBook(autor);
        eBook.setNome("Test Driven Development Ebook");
        eBook.setValor(29.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona( livroFisico);
        carrinho.adiciona(eBook);

        System.out.println("Total: " + carrinho.getTotal());

        List<Produto> produtos = carrinho.getProdutos();
//        for  (int i = 0; i <= produtos.length; i++) { // Irá  dar uma Exeption para o tamanho ser igual
//            try {
//                Produto produto = produtos[i];
//                if (produto != null) {
//                    System.out.println(produto.getValor());
//                }
//
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("Deu exception no indece : " + i);
//                e.printStackTrace();
//
//            } catch (NullPointerException e){
//                System.out.println("Array não foi instanciado");
//            }
//        }
//
//        System.out.println("Fui executado!");

        for (Produto produto :  produtos){ // enhanced for ajuda a não dar Exception com tamanho de um array
            if(produto != null){
                System.out.println(produto.getValor());
            }
        }

    }
}
