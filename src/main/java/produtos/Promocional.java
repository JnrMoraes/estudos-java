package produtos;

@FunctionalInterface // permite que seja de forma explicita, sendo assim sempre que for implementada os metodos abstratos sejam implementados tbm
public interface Promocional {

     boolean aplicarDescontoDe(double porcentagem);

     //default permite evoluir a interface sem quebrar código existente
     default boolean aplicaDescontoDe10Porcento(){ // requer modulo java8
          return aplicarDescontoDe(0.1);
     }

}
