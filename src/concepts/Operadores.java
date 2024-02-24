package concepts;

public class Operadores {
    public static void main(String[] args) {
        // Operadores aritméticos
        int a = 10;
        int b = 5;
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo: " + (a % b));

        // Operadores de comparación
        System.out.println("a igual a b? " + (a == b));
        System.out.println("a mayor que b? " + (a > b));
        System.out.println("a menor que b? " + (a < b));
        System.out.println("a diferente de b? " + (a != b));

        // Operadores lógicos
        boolean x = true;
        boolean y = false;
        System.out.println("x AND y: " + (x && y));
        System.out.println("x OR y: " + (x || y));
        System.out.println("NOT x: " + (!x));
    }
}
