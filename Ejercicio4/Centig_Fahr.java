package Ejercicio4;

import java.util.Scanner;

public class Centig_Fahr {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float a;
        System.out.print("Introduzca ° Centigrados: ");
        a = teclado.nextFloat();
        convertir(a);
        teclado.close();
    }

    public static void convertir(float a) {
        float resultado;
        resultado = (a * 9 / 5) + 32;
        System.out.println(a + " °C son " + resultado + " °F");
    }
}
