package Ejercicio8;

public class invertido {
    public static void main(String[] args) {
        String cadenaOriginal = "hola mundo";
        String cadenaInvertida = invertirCadena(cadenaOriginal);
        System.out.println("La cadena original es: " + cadenaOriginal);
        System.out.println("La cadena invertida es: " + cadenaInvertida);
    }

    public static String invertirCadena(String cadena) {
        char[] caracteres = cadena.toCharArray(); // Convierte la cadena en un arreglo de caracteres
        int longitud = cadena.length();
        char[] invertida = new char[longitud];
        for (int i = 0; i < longitud; i++) {
            invertida[i] = caracteres[longitud - 1 - i]; // Asigna los caracteres en orden inverso
        }
        return new String(invertida); // Convierte el arreglo de caracteres de nuevo a una cadena
    }
}
