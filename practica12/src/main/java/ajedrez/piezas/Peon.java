package ajedrez.piezas;

import java.util.List;
import java.util.LinkedList;

public class Peon extends Pieza {

  public Peon(Color color, Posicion posicion) {
    super(color, posicion);
  }

  /**
   * Metodo que regresa una lista con las jugadas válidas para un peon
   * 
   * @return List<Posicion> - Lista de posiciones válidas
   */
  @Override
  public List<Posicion> obtenerJugadasLegales() {
    LinkedList<Posicion> jugadas = new LinkedList<>();
    int fila = obtenerPosicion().obtenerFila(), columna = obtenerPosicion().obtenerColumna();

    if (obtenerColor() == Color.BLANCO) {
      if (fila == 6) {
        jugadas.add(new Posicion(fila - 2, columna));
      }
      if (fila - 1 >= 0) {
        jugadas.add(new Posicion(fila - 1, columna));
        if (columna + 1 <= 7) {
          jugadas.add(new Posicion(fila - 1, columna + 1));
        }
        if (columna - 1 >= 0) {
          jugadas.add(new Posicion(fila - 1, columna - 1));
        }
      }
    }
    if (obtenerColor() == Color.NEGRO) {
      if (fila == 1) {
        jugadas.add(new Posicion(fila + 2, columna));
      }
      if (fila + 1 <= 7) {
        jugadas.add(new Posicion(fila + 1, columna));
        if (columna + 1 <= 7) {
          jugadas.add(new Posicion(fila + 1, columna + 1));
        }
        if (columna - 1 >= 0) {
          jugadas.add(new Posicion(fila + 1, columna - 1));
        }
      }
    }
    return jugadas;
  }
}
