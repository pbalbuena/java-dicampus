package concepts;

import java.util.Scanner;

public class ScannerEjemplo {

	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario desde la consola
		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario que ingrese su nombre
		System.out.print("Por favor, ingrese su nombre: ");

		// Leer el nombre ingresado por el usuario
		String nombre = scanner.nextLine();

		// Solicitar al usuario que ingrese su edad
		System.out.print("Por favor, ingrese su edad: ");

		// Leer la edad ingresada por el usuario
		int edad = scanner.nextInt();

		// Mostrar un mensaje utilizando la información ingresada por el usuario
		System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");

		// Cerrar el objeto Scanner para liberar los recursos
		scanner.close();
	}

}
