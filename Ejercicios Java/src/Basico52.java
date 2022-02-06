import java.util.Scanner;

/*
Programa que lea una serie de números por teclado hasta que se lea un número negativo.
El programa indicará cuántos números acabados en 2 se han leído.
*/
/**
 * @author Christian Novo Sacramento
 */
public class Basico52 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero, contadorNum2 = 0;

        System.out.println("=========================================");
        System.out.println("|| Calculador de números acabados en 2 ||");
        System.out.println("=========================================");
        System.out.println("Escribe cualquier número, para acabar escribe un número negativo");
        System.out.printf("Número: ");
        numero = sc.nextInt();

        while(numero >= 0) {
            System.out.printf("Número: ");
            numero = sc.nextInt();
            if (numero % 10 == 2) {
                contadorNum2++;
            }
        }
        System.out.println("Hay " + contadorNum2 + " números que acaban en 2");
    }
}
