package Ejercicio2;

public class verd_fals {
    public static void main(String[] args) {
        System.out.println("El numero  2 es par? " + esPar(2));
    }

    public static boolean esPar(int num) {
        if ((num % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
    // public static boolean esPar2(int num) { return ((num % 2) == 0); }
}
