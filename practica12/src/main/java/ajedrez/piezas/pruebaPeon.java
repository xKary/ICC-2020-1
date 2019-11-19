package ajedrez.piezas;

import java.util.List;

/**
 * Programa para probar la lista de jugadas válidas de la pieza Peon
 * 
 * @author Prado Oropeza Karina Vianey
 */
public class pruebaPeon {
  public static void main(String[] args) {

    Peon[] negros = new Peon[4];
    Peon[] blancos = new Peon[4];

    negros[0] = new Peon(Color.NEGRO, new Posicion(1, 1));
    negros[1] = new Peon(Color.NEGRO, new Posicion(2, 3));
    negros[2] = new Peon(Color.NEGRO, new Posicion(1, 5));
    negros[3] = new Peon(Color.NEGRO, new Posicion(2, 7));

    blancos[0] = new Peon(Color.BLANCO, new Posicion(6, 1));
    blancos[1] = new Peon(Color.BLANCO, new Posicion(5, 3));
    blancos[2] = new Peon(Color.BLANCO, new Posicion(4, 5));
    blancos[3] = new Peon(Color.BLANCO, new Posicion(6, 7));

    System.out.println("PEONES NEGROS");
    for (Peon peonNegro : negros) {
      // Jugadas validas para cada elemento de negros
      List<Posicion> jugadas = peonNegro.obtenerJugadasLegales();
      // Posicion de peon
      System.out.print("---Jugas para el peon en ");
      System.out.println("(" + peonNegro.obtenerPosicion().obtenerFila() + ","
          + peonNegro.obtenerPosicion().obtenerColumna() + ")--- \n");
      // Mostrar las jugadas
      for (Posicion jugada : jugadas) {
        System.out.println("Fila: " + jugada.obtenerFila() + "\t" + "Columna: " + jugada.obtenerColumna() + "\n");
      }
    }

    System.out.println("PEONES BLANCOS");
    for (Peon peonBlanco : blancos) {
      // Jugadas válidas para cada peon blanco
      List<Posicion> jugadas = peonBlanco.obtenerJugadasLegales();
      // Posicion del peon
      System.out.print("---Jugas para el peon en ");
      System.out.println("(" + peonBlanco.obtenerPosicion().obtenerFila() + ","
          + peonBlanco.obtenerPosicion().obtenerColumna() + ")--- \n");
      // Mostrar jugadas
      for (Posicion jugada : jugadas) {
        System.out.println("Fila: " + jugada.obtenerFila() + "\t" + "Columna: " + jugada.obtenerColumna() + "\n");
      }
    }

  }
}
