package Ejercicio11;

public class vocal_cad {
    public static void main(String[] args) {
        String cadena = "Hola mundo";
        int cantidadVocales = contarVocales(cadena);
        System.out.println("La cantidad de vocales en la cadena '" + cadena + "' es: " + cantidadVocales);
    }

    public static int contarVocales(String cadena) {
        int contador = 0;
        cadena = cadena.toLowerCase(); // Convertir la cadena a minúsculas para facilitar la comparación
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
        return contador;
    }
}
