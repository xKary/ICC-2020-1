import java.util.Scanner;

public class RFC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombreCompleto, nomComp , nombre, nacimiento, apellidoPaterno, apellidoMaterno,rfc, dia,mes, año;
		int separador;
		
		//Pedir datos
		System.out.println("Introduce tu nombre completo:");
		nombreCompleto = scanner.nextLine();
		System.out.println("Introduce tu fecha de nacimiento en formato dd/mm/aaaa:");
		nacimiento = scanner.nextLine();
		
		//Separar nombre y apellidos
		nomComp = nombreCompleto;
		//Nombre
		separador = nombreCompleto.indexOf(" ");
		nombre = nombreCompleto.substring(0,separador);
		nombreCompleto = nombreCompleto.substring(separador+1, nombreCompleto.length());
		//Apellido paterno
		separador = nombreCompleto.indexOf(" ");
		apellidoPaterno = nombreCompleto.substring(0,separador);
		//Apellido materno
		nombreCompleto = nombreCompleto.substring(separador+1,nombreCompleto.length());
		apellidoMaterno = nombreCompleto;

		//Separar la fecha
		//Día
		separador = nacimiento.indexOf("/");
		dia = nacimiento.substring(0,separador);
		//Mes
		nacimiento = nacimiento.substring(separador+1,nacimiento.length());
		separador = nacimiento.indexOf("/");
		mes = nacimiento.substring(0,separador);;
		//Año
		nacimiento =  nacimiento.substring(separador+1, nacimiento.length());
		año = nacimiento.substring(2,nacimiento.length());
		
		//Armar el RFC
		rfc = apellidoPaterno.substring(0,2);
		rfc += apellidoMaterno.substring(0,1);
		rfc += nombre.substring(0,1);
		rfc = rfc.toUpperCase();
		rfc += año + mes + dia;
	  			      
		System.out.println("EL RFC de " + nomComp + " es: " + rfc);	
		
	}

}
