package concepts;

public class Metodo {

	public static void main(String[] args) {
		// Llamada al método sumar
		int resultado = sumar(5, 3);
		System.out.println("El resultado de la suma es: " + resultado);
	}

	// Definición de un método que suma dos números enteros
	public static int sumar(int num1, int num2) {
		return num1 + num2;
	}
}
