package ajedrez.piezas;
import java.util.List;
/**
 * Programa para probar la lista de jugadas válidas de la pieza Dama
 * @author Prado Oropeza Karina Vianey
*/
public class pruebaDama {
  public static void main(String[] args) {
    Tablero tab = Tablero.obtenerInstancia();

    Peon [] negros = new Peon [5];
    Peon [] blancos = new Peon[5];
    Dama damaB = new Dama (Color.BLANCO,new Posicion(7,3));
    Dama damaN = new Dama (Color.NEGRO,new Posicion(0,3));

    negros[0] = new Peon(Color.NEGRO,new Posicion(1,0));
    negros[1] = new Peon(Color.NEGRO,new Posicion(1,1));
    negros[2] = new Peon(Color.NEGRO,new Posicion(1,5));
    negros[3] = new Peon(Color.NEGRO,new Posicion(1,6));
    negros[3] = new Peon(Color.NEGRO,new Posicion(1,7));

    blancos[0] = new Peon(Color.BLANCO,new Posicion(6,0));
    blancos[1] = new Peon(Color.BLANCO,new Posicion(6,1));
    blancos[2] = new Peon(Color.BLANCO,new Posicion(6,5));
    blancos[3] = new Peon(Color.BLANCO,new Posicion(6,6));
    blancos[4] = new Peon(Color.BLANCO,new Posicion(6,7));

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
