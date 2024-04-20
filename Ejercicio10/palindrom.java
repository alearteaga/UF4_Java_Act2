package Ejercicio10;

public class palindrom {
    public static void main(String[] args) {
        String cadena = "alessandrojavaa";
        boolean esPalindromo = esPalindromo(cadena);
        if (esPalindromo) {
            System.out.println("La cadena '" + cadena + "' es un palíndromo.");
        } else {
            System.out.println("La cadena '" + cadena + "' no es un palíndromo.");
        }
    }

    public static boolean esPalindromo(String cadena) {
        int longitud = cadena.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
