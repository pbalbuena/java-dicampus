package main;

import entities.Estudiante;

public class Main {

	public static void main(String[] args) {
		// Creación de objetos Estudiante
		Estudiante estudiante1 = new Estudiante("Juan", 20, "Matemáticas");
		Estudiante estudiante2 = new Estudiante("María", 22, "Física");

		// Mostrar información de los estudiantes
		System.out.println("Información del Estudiante 1:");
		estudiante1.mostrarInformacion();

		System.out.println("\nInformación del Estudiante 2:");
		estudiante2.mostrarInformacion();
	}

}
