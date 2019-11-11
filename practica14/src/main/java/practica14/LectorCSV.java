package practica14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.LinkedList;
/**
 * Clase para leer los datos de un archivo LectorCSV
 * @author Prado Oropeza Karina Vianey
*/
public class LectorCSV {
  /**
   * Método que regresa una lista con todas las lineas del archivo
   * @param ruta -ruta del archivo
   * @return List<String[]> - lista con los datos del archivo
  */
  public static List<String[]> leer (String ruta) throws IOException{
    LinkedList<String[]> separados = new LinkedList<>();
    List<String> lineas = Files.readAllLines(Paths.get(ruta));
    //Separar cada linea del archivo y obtener arreglos
    for (String linea: lineas) {
      separados.add(linea.trim().split(","));
    }
    return separados;
  }

}
