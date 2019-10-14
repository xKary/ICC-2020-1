public class Cadena {
  private char[] chars;
    /**
     * Contructor por omisión
    */
    public Cadena(){
      chars = new char[0];
    }
    /**
     * Constructor que crear una cadena con los caracteres del arreglo, que es el parametro
     * @param char[] cadena
     */
    public Cadena(char[] cadena){
      chars = new char[cadena.length];
      for (int i = 0; i < chars.length ; i++ ) {
        chars[i] = cadena[i];
      }
    }
    /**
     * Metodo para remplazar un caracter por Contructor
     * @param char old - caracter a remplazar
     * @param char nue - caracter por el que se va a remplazar
    */
    public Cadena replace(char old, char neu){
      char[] nuevo = new char[chars.length];
      for (int i = 0;i < nuevo.length ; i++ ) {
        nuevo[i] = (chars[i] == old)? neu: chars[i];
      }
      return new Cadena(nuevo);
    }
    /**
     * Metodo que regresa la longitud de la cadenaE
     * @return int - longitud cadena
    */
    public int longitud(){
      return chars.length;
    }
    /**
     * Metodo que regresa el indice en donde se encuentra el caracter que se recibio como parametro
     * @param char cara - caracter a buscar
     * @return int - el indece del caracter si se encuentra en el arreglo, -1 en otro caso
    */
    public int indexOf(char cara){
      boolean encontrado = false;
      int i = 0;
      while(i < chars.length && !encontrado){
        if (chars[i] == cara) {
          encontrado = true;
        }
        i++;
      }
      return (encontrado)? i-1: -1;
    }

    public int indexOf(String cadena){
      boolean encontrado = false;
      boolean cadenaEn = true;
      int i = 0;
      while(i < chars.length && !encontrado){
        if (chars[i] == cadena.charAt(i)) {
          int e = i;
          while (e < cadena.length() && cadenaEn) {
            if (chars[e] != cadena.charAt(e)) {
              cadenaEn = false;
            }
            e++;
          }
          encontrado = cadenaEn;
        }
        i++;
      }
      return (encontrado)? i-1: -1;
    }
    /**
     * Metodo que regresa el indice en que se encuentra el caracter pasado como parametro
     * @param int index - indice en el que se desea saber que caracter hay
     * @return char - caracter que se encuentra en la posicion index
    */
    public char charAt(int index){
      char caracter = ' ';
      if (index >= 0 && index < chars.length) {
         caracter = chars[index];
      }
      return caracter;
    }
    /**
     * Metodo que regresa la Cadena al reves
     * @return Cadena - objeto de tipo Cadena que es la reversa
    */
    public Cadena reverse(){
      char[] reversa = new char[chars.length];
      for (int i = 0, j = chars.length-1; i < chars.length && j >= 0 ; i++, j-- ) {
        reversa[j] = chars[i];
      }
      return  new Cadena(reversa);
    }
    /**
     * Metodo que determina si dos Cadenas son iguales
     * @return boolean - true si son iguales, false en otro caso
    */
    public boolean equals(Cadena c){
      boolean iguales = true;
      int i = 0;
      if(chars.length == c.chars.length){
        while( i < chars.length && iguales){
          if (chars[i] != c.chars[i]) {
            iguales = false;
          }
          i++;
        }
      }else
        iguales = false;
      return iguales;
    }
    /**
     * Metodo que determina si una Cadena es esPalindromo
     * @return boolean - true si es Palindromo, false en otro caso
    */
    public boolean esPalindromo(){
      return equals(reverse());
    }
    /**
     * Metodo que regresa la representacion del objeto en cadena
     * @return String - elementos el atributo chars en cadena
    */
    public String toString(){
      String cadena = new String();
      for (int i = 0; i < chars.length ; i++ ) {
        cadena += chars[i];
      }
      return cadena;
    }
}
