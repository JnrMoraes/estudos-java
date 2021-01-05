package teste;

import produtos.GerenciadorDeCupons;

public class ConsultaDeCupons {

    public static void main(String[] args) {
        GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
//        HashSet<String> set = new HashSet<String>();
//        set.add("Não há repetições");
//        set.add("Não há repetições");
//        set.add("Não há repetições");
//        set.add("Não há repetições");
//        set.add("Não há repetições");
//        System.out.println(set.size());

        Double desconto = gerenciador.validarCupom("cab11");

        if(!desconto.isNaN()){
            System.out.println("Cupom de desconto válido");
            System.out.println("Valor " + desconto);
        } else{
            System.out.println("Esse cupom não existe!");
        }

    }
}
