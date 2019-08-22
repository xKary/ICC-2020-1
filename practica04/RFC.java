import java.util.Scanner;

public class RFC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombreCompleto,nombre,nacimiento,apellidoPaterno,apellidoMaterno,rfc,dia,mes,año;
		int separador;

		//Pedir datos
		System.out.println("Introduce tu nombre completo:");
		nombreCompleto = scanner.nextLine();
		System.out.println("Introduce tu fecha de nacimiento en formato dd/mm/aaaa:");
		nacimiento = scanner.nextLine();

		//Separar nombre y apellidos
		//Nombre
		separador = nombreCompleto.indexOf(" ");
		nombre = nombreCompleto.substring(0,separador);
		//Apellido paterno
		apellidoPaterno = nombreCompleto.substring(separador + 1,nombreCompleto.lastIndexOf(" "));
		//Apellido materno
		separador = nombreCompleto.lastIndexOf(" ");
		apellidoMaterno = nombreCompleto.substring(separador + 1,nombreCompleto.length());

		//Separar la fecha
		dia = nacimiento.substring(0,2);
		mes = nacimiento.substring(3,5);
		año = nacimiento.substring(8,nacimiento.length());

		//Armar el RFC
		rfc = apellidoPaterno.substring(0,2);
		rfc += apellidoMaterno.charAt(0);
		rfc += nombre.charAt(0);
		rfc = rfc.toUpperCase();
		rfc += año + mes + dia;

		System.out.println("EL RFC de " + nombreCompleto + " es: " + rfc);

	}

}
