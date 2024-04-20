package Ejercicio9;

public class sum_array {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5 };
        int suma = calcularSuma(numeros);
        System.out.println("La suma de los números en el arreglo es: " + suma);
    }

    public static int calcularSuma(int[] arreglo) {
        int suma = 0;
        for (int numero : arreglo) {
            suma += numero; // Suma cada número del arreglo
        }
        return suma;
    }
}
