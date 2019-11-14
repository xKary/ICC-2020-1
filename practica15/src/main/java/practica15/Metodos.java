package practica15;

import java.util.stream.Stream;
import java.util.List;
import java.util.function.Supplier;
import java.util.Comparator;
/**
 * Clase que utiliza la interfaz Stream
 * @author Karina Prado Oropeza
*/
public class Metodos{
  /**
   * Método que ordena cadenas por su tamaño,
   * del más largo al más corto.
   * @param list - lista con las cadenas a ordenar
   * @return Stream<String> - cadenas ordenadas
  */
  public static Stream<String> ordenar(List<String> list){
    return list.stream()
               .sorted(Comparator.comparingInt(String::length));
  }
  /**
   * Método que descarta todos los elementos
   * menores a cero o mayores a nueve,y regresa un Stream<String>
   * con la representación en español de cada dı́gito
   * @param list - lista con números a verificar
   * @return Stream<String> - representación en español de cada dı́gito
  */
  public static Stream<String> descartar(List<Integer> list){
    //Arreglo con el nombre de los digitos
    String[] numeros = {"cero","uno","dos","tres","cuatro",
                        "cinco","seis","siete","ocho","nueve"};
    return list.stream()
               .filter(n -> (n >= 0 && n < 10))
               .map(n -> numeros[n]);
  }
  /**
   * Método que recibe una cadena s y devuelve un Stream<String>
   * infinito con repeticiones de s
   * @param s - cadena a repetir
   * @return Stream<String> - repeticiones
  */
  public static Stream<String> repetir(String s){
    return Stream.generate(new Supplier<String>(){
      int i = 0;
      public String get(){
        return s.repeat(i++);
      }
    });
  }

}
