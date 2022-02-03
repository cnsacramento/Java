import java.util.Scanner;

/**
 * @author Christian Novo Sacramento
 */
/*
Programa que lea dos caracteres y compruebe si son iguales.
*/
public class Basico27 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char caracter1, caracter2;

        //Se solicitan los dos carácteres
        System.out.println("Dime un carácter: ");
        caracter1 = sc.next().charAt(0);
        System.out.println("Dime otro carácter: ");
        caracter2 = sc.next().charAt(0);

        //Se comprueba si son iguales
        if (caracter1 == caracter2) {
            System.out.println("Los carácteres son iguales");
        } else {
            System.out.println("Los carácteres no son iguales");
        }
    }
}
