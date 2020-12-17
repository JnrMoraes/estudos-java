import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Random;

public class CalculadoraDeEstoque {
    public static void main(String[] args) {
        double soma = 0;
        int contador = 0;

        Random rand = new Random();
        int upperbound = 100;
        double variante = rand.nextInt(upperbound);

        while (contador < variante) {
            double valorDoLivro = 59.90;
            soma = soma + valorDoLivro;
            contador++;

//            DecimalFormat f = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));

//            System.out.println(" O total em estoque é: " + f.format(soma));

            if (soma < rand.nextInt()) {
                System.out.println("seu estoque esta baixo!, quantidade de livros: " + variante);
            } else if (soma >= 2000) {
                System.out.println("Seu estoque está muito alto!, quantidade de livros: " + variante);
            } else {
                System.out.println("Seu estoque está bom!, quantidade de livros: " + variante);
            }

        }
    }
}
