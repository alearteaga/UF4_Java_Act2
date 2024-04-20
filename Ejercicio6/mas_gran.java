package Ejercicio6;

import java.util.Scanner;

public class mas_gran {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float numero1, numero2, numero3;
        System.out.print("Introduzca el primer número: ");
        numero1 = teclado.nextFloat();
        System.out.print("Introduzca el segundo número: ");
        numero2 = teclado.nextFloat();
        System.out.print("Introduzca el tercer número: ");
        numero3 = teclado.nextFloat();

        float maximo = encontrarMaximo(numero1, numero2, numero3);
        System.out.println("El número más grande es: " + maximo);

        teclado.close(); // Aqui se cierra el objeto Scanner
    }

    public static float encontrarMaximo(float a, float b, float c) {
        float maximo = a;
        if (b > maximo) {
            maximo = b;
        }
        if (c > maximo) {
            maximo = c;
        }
        return maximo;
    }
}
