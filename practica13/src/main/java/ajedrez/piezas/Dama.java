package ajedrez.piezas;
import ajedrez.Tablero;
import java.util.List;
import java.util.LinkedList;

public class Dama extends Pieza {
  public Dama (Color color, Posicion posicion){
    super (color,posicion);
  }
  /**
   * Metodo que regresa una lista con las jugadas validas
   * para la dama
   * @return List<Posicion> -Lista de posiciones validas
  */
  @Override
  public List<Posicion> obtenerJugadasLegales(){
    Tablero tab = Tablero.obtenerInstancia();
    LinkedList<Posicion> jugadas = new LinkedList<>();
    int fila = obtenerPosicion().obtenerFila(),
        columna = obtenerPosicion().obtenerColumna();
    //Moverse hacia el 0
    for (int i = fila - 1; i >= 0 ;i-- ) {
      Pieza aux = tab.obtenerPieza(i,columna);
      if (aux == null) {
        jugadas.add(new Posicion (i, columna));
      }else{
        if (aux.obtenerColor() != obtenerColor()) {
          jugadas.add(new Posicion (i, columna));
        }
      }
    }
    //Moverse hacia el 7
    for (int i = fila + 1; i <= 7 ;i++) {
      Pieza aux = tab.obtenerPieza(i,columna);
      if (aux == null) {
        jugadas.add(new Posicion (i, columna));
      }else{
        if (aux.obtenerColor() != obtenerColor()) {
          jugadas.add(new Posicion (i, columna));
        }
      }
    }
    //Moverse hacia la derecha
    for (int i = columna + 1; i <= 7 ;i++) {
      Pieza aux = tab.obtenerPieza(fila,i);
      if (aux == null) {
        jugadas.add(new Posicion (fila,i));
      }else{
        if (aux.obtenerColor() != obtenerColor()) {
          jugadas.add(new Posicion (fila,i));
        }
        break;
      }
    }
    //Moverse hacia la izquierda
    for (int i = columna - 1; i >= 0 ;i--) {
      Pieza aux = tab.obtenerPieza(fila,i);
      if (aux == null) {
        jugadas.add(new Posicion (fila,i));
      }else{
        if (aux.obtenerColor() != obtenerColor()) {
          jugadas.add(new Posicion (fila,i));
        }
        break;
      }
    }
    //Diagonales
    for (int i = columna - 1,j = fila - 1; j >= 0 && i >= 0; i--,j--) {
      Pieza aux = tab.obtenerPieza(j,i);
      if (aux == null) {
        jugadas.add(new Posicion (j,i));
      }else{
        if (aux.obtenerColor() != obtenerColor()) {
          jugadas.add(new Posicion (j,i));
        }
        break;
      }
    }
    for (int i = fila,j = columna; i <= 7 && j <= 7; i++,j++) {
      Pieza aux = tab.obtenerPieza(j,i);
      if (aux == null) {
        jugadas.add(new Posicion (j,i));
      }else{
        if (aux.obtenerColor() != obtenerColor()) {
          jugadas.add(new Posicion (j,i));
        }
        break;
      }
    }
    for (int i = fila,j = columna; i >= 0 && j <= 7 ; i--,j++) {
      Pieza aux = tab.obtenerPieza(j,i);
      if (aux == null) {
        jugadas.add(new Posicion (j,i));
      }else{
        if (aux.obtenerColor() != obtenerColor()) {
          jugadas.add(new Posicion (j,i));
        }
        break;
      }
    }
    for (int i = columna,j = fila; j <= 7 && i >= 0; j++, i--) {
      Pieza aux = tab.obtenerPieza(j,i);
      if (aux == null) {
        jugadas.add(new Posicion (j,i));
      }else{
        if (aux.obtenerColor() != obtenerColor()) {
          jugadas.add(new Posicion (j,i));
        }
        break;
      }
    }

    return jugadas;
  }
}
