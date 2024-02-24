package entities;

//Definición de la clase Estudiante
public class Estudiante {
	// Atributos
	private String nombre;
	private int edad;
	private String asignatura;

	// Constructor
	public Estudiante(String nombre, int edad, String asignatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.asignatura = asignatura;
	}

	// Método para mostrar información del estudiante
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Asignatura: " + asignatura);
	}

	// Métodos GETTERS y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

}