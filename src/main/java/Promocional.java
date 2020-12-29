
@FunctionalInterface
public interface Promocional {

     boolean aplicarDescontoDe(double porcentagem);

     default boolean aplicaDescontoDe10Porcento(){ // requer modulo java8
          return aplicarDescontoDe(0.1);
     }

}
