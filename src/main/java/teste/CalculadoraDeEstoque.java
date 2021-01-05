package teste;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Random;

public class CalculadoraDeEstoque {

    public static void main(String[] args) {

        final double valorLivro = 29.90;

        int livroJava = 60;
        double livroTDD = 59.90;

//        double soma = livroJava + livroTDD;
        double soma = 0;

        int contador = 0;

        Random random = new Random();
        int variante = random.nextInt(100);

        while (contador < variante){
            soma = soma + valorLivro;
            contador++;
        }

        DecimalFormat f = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));
        System.out.println("Quantidade contada: "+contador);
        System.out.println("Valor total R$: "+ f.format(soma));

        if (soma < 1000) {
            System.out.println("Seu estoque esta baixo !");

        } else if( soma >= 2000){
            System.out.println("Seu estoque esta alto");

        } else {
            System.out.println("Se estoque está bom !");
        }

    }
}

