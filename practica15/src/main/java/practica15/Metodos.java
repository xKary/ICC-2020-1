package practica15;

import java.util.stream.Stream;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Metodos{

  public static Stream<String> ordenar(List<String> list){
    return list.stream()
               .sorted(Comparator.comparingInt(String::length));
  }

  public static Stream<Integer> descartar(List<Integer> list){
    return list.stream()
               .filter(n -> (n >= 0 && n < 10));
  }

  public static Stream<String> repetir(String s){
    return Stream.generate(new Supplier<String>(){
      int i = 0;
      public String get(){
        return s.repeat(i++);
      }
    });
  }



}
