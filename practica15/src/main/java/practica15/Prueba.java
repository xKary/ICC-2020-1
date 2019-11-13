package practica15;

import java.util.stream.Stream;
import java.util.List;
import java.util.function.Supplier;

public class Prueba{
  public static void main(String[] args) {
    
    List<String> cadenas = List.of("squeezy", "easy", "", "peasy","lemon");
    Metodos.ordenar(cadenas)
           .forEach(System.out::println);

    List<Integer> lista = List.of(12,3,4,5,89,0,2,-20);
    Metodos.descartar(lista)
           .forEach(System.out::println);

    Metodos.repetir("Hola")
           .limit(10)
           .forEach(System.out::println);
  }
}
