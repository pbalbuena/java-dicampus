package concepts;

public class Bucles {
	public static void main(String[] args) {

		int[] numeros = { 1, 2, 3, 4, 5 };

		// Bucle for para imprimir los elementos del array
		System.out.println("Bucle for:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]);
		}

		// Bucle while para imprimir los elementos del array
		System.out.println("\nBucle while:");
		int j = 0;
		while (j < numeros.length) {
			System.out.print(numeros[j]);
			j++;
		}
		
		// Bucle for-each para imprimir los elementos del array
		System.out.println("\nBucle for-each:");
		for (int i : numeros) {
			System.out.print(i);
		}

	}
}
