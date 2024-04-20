package Ejercicio7;

public class cadena {
    public static void main(String[] args) {
        System.out.println("La cadena 'hola mundo' tiene una longitud de: " + calcularLongitud("hola mundo"));
    }

    public static int calcularLongitud(String cadena) {
        int longitud = 0;
        char[] caracteres = cadena.toCharArray(); // Convierte la cadena en un arreglo de caracteres
        for (char caracter : caracteres) {
            longitud++; // Incrementa la longitud por cada carácter encontrado
        }
        return longitud;
    }
}
