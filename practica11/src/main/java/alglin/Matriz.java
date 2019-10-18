package alglin;

/**
 * Representa una matriz de mxn con entradas en los reales.
 *
 */
public class Matriz {

    private double[][] datos;
    private int m, n;

    /**
     * Crea una matriz de mxn donde todas las entradas son cero.
     *
     * @param m el número de filas
     * @param n el número de columnas
     */
    public Matriz(int m, int n) {
      if (m > 0 && n > 0) {
        this.m = m;
        this.n = n;
        datos = new double [m][n];
      }
    }

    /**
     * Regresa la entrada en la i-ésima fila y j-ésima columna de esta matriz.
     *
     * @param i la fila de la entrada deseada
     * @param j la columna de la entrada deseada
     * @return la entrada i,j
     */
    public double obtenerEntrada(int i, int j) {
      if (i >= 0 && i <= m && j >= 0 && j <= n ) {
        return datos[i][j];
      }
      return 0;
    }

    /**
     * Inserta el dato dado en la i-ésima fila y j-ésima columna de esta matriz.
     *
     * @param dato el número que se insertará en esta matriz
     * @param i    la fila donde se insertará <code>dato</code>
     * @param j    la columna donde se insertará <code>dato</code>
     */
    public void asignarEntrada(double dato, int i, int j) {
      if (i <= m && j <= n && j >= 0 && i >= 0) {
        datos[i][j] = dato;
      }
    }

    /**
     * Suma esta matriz con otra. Regresa <code>null</code> si las matrices no tienen las mismas
     * dimensiones.
     *
     * @param otra la otra matriz con la cual se sumará esta
     * @return una matriz nueva que resulta de sumar esta con <code>otra</code>
     */
    public Matriz sumar(Matriz otra) {
      if (m != otra.m || n != otra.n) {
        return null;
      }else{
        Matriz suma = new Matriz(m,n);
        for (int i = 0; i < m ; i++) {
          for (int j = 0; j < n ;j++ ) {
            suma.asignarEntrada(datos[i][j] + otra.obtenerEntrada(i,j),i,j);
          }
        }
        return suma;
      }
    }

    /**
     * Multiplica esta matriz por un escalar.
     *
     * @param c el escalar real
     * @return una matriz nueva que resulta de multiplicar esta por <code>c</code>
     */
    public Matriz escalar(double c) {
      Matriz escalar = new Matriz(m,n);
      for (int i = 0; i < m ; i++) {
        for (int j = 0; j < n ; j++ ) {
          escalar.asignarEntrada(c * datos[i][j],i,j);
        }
      }
      return escalar;
    }

    /**
     * Elimina una fila de esta matriz.
     *
     * @param k la fila a eliminar
     * @return una matriz nueva que resulta de eliminar la k-ésima fila de esta matriz
     */
    public Matriz eliminarFila(int k) {
      Matriz nueva = new Matriz(m-1,n);
      int fila = 0;
      for (int i = 0; i < m ; i++)
        if (i != k) {
          for (int j = 0; j < n ; j++ )
            nueva.asignarEntrada(obtenerEntrada(i,j),fila,j);
          fila++;
        }
      return nueva;
    }

    /**
     * Elimina una columna de esta matriz.
     *
     * @param k la columna a eliminar
     * @return una matriz nueva que resulta de eliminar la k-ésima columna de esta matriz
     */
    public Matriz eliminarColumna(int k) {
      Matriz nueva = new Matriz(m, n-1);
      int columna;
      for (int i = 0; i < m; i++){
          columna = 0;
          for (int j = 0; j < n; j++ ){
            if (j != k) {
              nueva.asignarEntrada(obtenerEntrada(i,j),i,columna);
              columna++;
            }
          }
      }
      return nueva;
    }

    /**
     * Calcula el determinante de esta matriz.
     *
     * @return el determinante de esta matriz
     */
     public double determinante() {
       double determinante = 0;
       if (m == n) {
         if(m == 1) {
           return obtenerEntrada(0, 0);
         }
         for(int i = 0; i < m; i++) {
           double signo = Math.pow(-1, 2 + i);
           Matriz matrizMulti = eliminarFila(0).eliminarColumna(i);
           determinante += signo * obtenerEntrada(0, i) * matrizMulti.determinante();
         }
       }
       return determinante;
     }

    /**
     * Regresa los datos de esta matriz de tal forma que las columnas están separadas por un espacio
     * y las filas están separadas por un salto de línea. Por ejemplo: <br>
     * "2.0 3.0 0.0 1.0 <br>
     * &nbsp;4.0 0.0 9.0 8.0 <br>
     * &nbsp;5.0 7.0 2.0 4.0"
     *
     * @return la representación en <code>String</code> de esta matriz
     */
    @Override
    public String toString() {
      String matriz = new String();
      for (int i = 0; i < m ; i++) {
        for (int j = 0; j < n ;j++ )
          matriz += (j != n-1) ? datos[i][j] + " ": datos[i][j];
        matriz += (i != m-1) ? "\n":"";
      }
      return matriz;
    }

    /**
     * Regresa <code>true</code> si y sólo si <code>obj</code> es una instancia de
     * {@link alglin.Matriz} y las matrices son iguales entrada por entrada.
     *
     * @param obj el objeto a comparar
     * @return <code>true</code> si <code>this</code> y <code>obj</code> son iguales entrada por
     *         entrada
     */
    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (obj == null || getClass() != obj.getClass()) {
        return false;
      }
      Matriz otra = (Matriz) obj;
      if (m != otra.m || n != otra.n) {
        return false;
      }
      for (int i = 0; i < m ; i++) {
        for (int j = 0; j < n ; j++) {
          if (datos [i][j] != otra.datos[i][j]) {
            return false;
          }
        }
      }

      return true;
    }

}
