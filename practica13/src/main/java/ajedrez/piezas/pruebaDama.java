package ajedrez.piezas;
import java.util.List;
/**
 * Programa para probar la lista de jugadas válidas de la pieza Dama
 * @author Prado Oropeza Karina Vianey
*/
public class pruebaDama {
  public static void main(String[] args) {

    Dama damaB = new Dama (Color.BLANCO,new Posicion(7,3));
    Dama damaN = new Dama (Color.NEGRO,new Posicion(0,3));

    List<Posicion> jugadas = damaB.obtenerJugadasLegales();
    System.out.println("--- Jugas dama blanca ---");
    for (Posicion jugada: jugadas) {
      System.out.println("Fila: " + jugada.obtenerFila() + "\t" +
                         "Columna: " + jugada.obtenerColumna() + "\n");
    }
    List<Posicion> jugadasN = damaN.obtenerJugadasLegales();
    System.out.println("--- Jugas dama negra ---");
    for (Posicion jugada: jugadasN) {
      System.out.println("Fila: " + jugada.obtenerFila() + "\t" +
                         "Columna: " + jugada.obtenerColumna() + "\n");
    }

  }
}
