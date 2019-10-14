public class PruebaCadena{
   public static void main(String[] args) {
    Cadena cade1 = new Cadena();
    System.out.println(cade1);
    char[] llena1 = {'a','e','i','o','u'};
    Cadena cade2 = new Cadena(llena1);
    //System.out.println(cade2.indexOf("ei"));
    System.out.println(cade2);
    System.out.println(cade2.longitud());
    char[] llena2 = {'a','e','a','o','a'};
    Cadena cade3 = new Cadena(llena2);
    System.out.println(cade3);
    cade3 = cade3.replace('a','i');
    System.out.println(cade3);
    System.out.println(cade3.indexOf('o'));
    System.out.println(cade2.indexOf('r'));
    System.out.println(cade3.charAt(0));
    System.out.println(cade3.charAt(6));
    cade1.reverse();
    System.out.println(cade1.equals(cade2));
    System.out.println(cade2);
    cade3 = cade3.reverse();
    System.out.println("s" + cade3);
    System.out.println(cade2.esPalindromo());
  }
}
