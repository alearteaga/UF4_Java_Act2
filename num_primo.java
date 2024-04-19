import java.util.Scanner;
public class num_primo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();
        System.out.println("¿El número es primo? " 
        + "Respueta:" + esPrimo(numero));
        scanner.close();
    }


    public static boolean esPrimo(int num){
        if  (num == 0 || num == 1 || num == 4) {
            return false;
          }
          for (int x = 2; x < num / 2; x++) {
            // Si es divisible por cualquiera de estos números, no
            // es primo
            if (num % x == 0)
              return false;
          }
          // Si no se pudo dividir por ninguno de los de arriba, sí es primo
             return true;
    }
}