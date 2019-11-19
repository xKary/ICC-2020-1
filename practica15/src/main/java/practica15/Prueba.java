package practica15;

import java.util.stream.Stream;
import java.util.List;

/**
 * Clase que prueba los metodos de la clase Metodos
 * 
 * @author Karina Prado Oropeza
 */
public class Prueba {
       public static void main(String[] args) {

              System.out.println("\nOrdenar palabras por su longitud");
              List<String> cadenas = List.of("squeezy", "easy", "", "peasy", "lemon");
              // utilizar el metodo ordenar, para ordenar "cadenas" y mostrarlo en pantalla
              Metodos.ordenar(cadenas).forEach(System.out::println);

              System.out.println("\nNúmeros entre 0 y 9");
              List<Integer> lista = List.of(12, 3, 4, 5, 89, 0, 2, -20);
              // utilizar el metodo descartar en lista y mostrarlo en pantalla
              Metodos.descartar(lista).forEach(System.out::println);

              System.out.println("\nRepetir una palabra");
              // utilizar el metodo repetir y mostrar el resultado en pantalla
              Metodos.repetir("Hola").limit(10).forEach(System.out::println);

              System.out.println("\nMultiplos de un número (3)");
              // utilizar el metodo multiplos, para obtener 50 multiplos de 3
              Metodos.multiplos(3).forEach(System.out::println);
              ;
       }
}
