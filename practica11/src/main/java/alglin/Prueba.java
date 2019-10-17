public class Prueba{
  public static void main(String[] args) {
    Matriz uno = new Matriz(3,4);
    Matriz dos = new Matriz(3,4);
    System.out.println(uno);
    uno.asignarEntrada(2,0,0);
    dos.asignarEntrada(4,0,0);
    uno.asignarEntrada(5,1,0);
    dos.asignarEntrada(5,1,0);
    System.out.println(uno);
    System.out.println(dos);
    System.out.println(uno.sumar(dos));
    System.out.println(uno.escalar(5));
  }
}
