package ajedrez.piezas;

public class Posicion {

  private int fila;
  private int columna;

  /**
   * Constructor
   * 
   * @param fila
   * @param columna
   */
  public Posicion(int fila, int columna) {
    this.fila = fila;
    this.columna = columna;
  }

  /**
   * Metodo que regresa la fila
   * 
   * @return int -fila de la posicion
   */
  public int obtenerFila() {
    return fila;
  }

  /**
   * Metodo que regresa la columna
   * 
   * @return int -columna de la posicion
   */
  public int obtenerColumna() {
    return columna;
  }

  /**
   * Metodo que determina si dos posiones son iguales
   * 
   * @param obj - objeto con el que se comparara
   * @return boolean -true si son iguales, false en otro caso
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Posicion otra = (Posicion) obj;
    return fila == otra.fila && columna == otra.columna;
  }

}
