import java.util.Scanner;

/*
 Programa Java para convertir un número entero a números romanos.
El programa pide un número entre 1 y 3999 y calcula su equivalente en números romanos.
 Se utiliza un método llamado convertirANumerosRomanos
 que recibe el número N a convertir de tipo int y 
 devuelve un String con el equivalente en números romanos.
*/
/**
 * @author Christian Novo Sacramento
 */
public class Basico58 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numeroArabigo; //Número que utilizamos a diario
        String numeroRomano;

        
        System.out.println("|||||||||||||||||||||||||||||");
        System.out.println("|| CONVERSOR NÚMERO ROMANO ||");
        System.out.println("|||||||||||||||||||||||||||||");
        System.out.println("\n¿Qué número del 1 al 3999 quieres convertir a Romano?");
        numeroArabigo = sc.nextInt();
        while (numeroArabigo < 1 || numeroArabigo > 3999) { //Corrige que el número se encuentre dentro del rango
            System.out.println("Upss!!! (Debe introducir un número entre 1 y 3999)");
            System.out.printf("Número: ");
            numeroArabigo = sc.nextInt();
        }

        
    }
}
