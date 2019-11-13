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

    List<String> lineas = Files.readAllLines(Paths.get(ruta));
    LinkedList<String[]> separados = new LinkedList<>();

    //Separar cada linea del archivo y obtener arreglos
    for (String linea: lineas) {
      String[] coor = linea.split(",");

      if (!coor[0].trim().isBlank() && !coor[1].trim().isBlank())
        separados.add(coor);

    }

    //Quitar el primer elemento de separados, ya que son los titulos de las columanas
    separados.remove(0);
    
    return separados;
  }

}
