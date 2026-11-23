import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número entero (-99999 a 99999):");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo número entero (-99999 a 99999):");
        int num2 = sc.nextInt();

        // Validación de rango de 5 dígitos
        if (num1 < -99999 || num1 > 99999 || num2 < -99999 || num2 > 99999) {
            System.out.println("Error: Los números deben ser enteros de máximo 5 dígitos [-99999...99999].");
            sc.close();
            return;
        }

        System.out.println("Elige operación (+, -, *, ^):");
        char operacion = sc.next().charAt(0);

        switch (operacion) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Resultado: " + ((long) num1 * num2));
                break;
            case '^':
                System.out.println("Resultado: " + Math.pow(num1, num2));
                break;
            default:
                System.out.println("Operación no permitida.");
        }
    }
}