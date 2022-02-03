import java.util.Scanner;

/**
 * @author Christian Novo Sacramento
 */
/*
Programa java que lea dos caracteres por teclado y compruebe si los dos son letras minúsculas
*/
public class Basico28 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char caracter1, caracter2;

        //Se solicitan los carácteres
        System.out.println("Dime un carácter:");
        caracter1 = sc.next().charAt(0);
        System.out.println("Dime otro carácter:");
        caracter2 = sc.next().charAt(0);

        //Se comprueba si ambos son minúculas con las tablas ASCII
        /*
        if (caracter1 >= 'a' && caracter2 >= 'a') {
            System.out.println("Los dos son minúsculas");
        }else if (caracter1 >= 'a' && caracter2 <= 'a') {
            System.out.println("El primer carácter es minúsculas pero el segundo no");
        }else if (caracter1 <= 'a' && caracter2 >= 'a') {
            System.out.println("El primer carácter no es minúculas y el segundo si");
        }else {
            System.out.println("Ninguno de los dos son minúsculas");
        }
        */
        System.out.println( (Character.isLowerCase(caracter1) ? "El carácter es minúsculas" : "El carácter es mayúsculas") );

        //También se puede hacer susituyendo la condición por Character.isLowerCase(caracter1)
    }
}
