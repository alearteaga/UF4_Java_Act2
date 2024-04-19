import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = scanner.nextInt();

        int resultado = sumarNumeros(numero1, numero2);
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + resultado);

        scanner.close();
    }

    public static int sumarNumeros(int num1, int num2) {
        return num1 + num2;
    }
}
