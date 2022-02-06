import java.util.Scanner;

/*
Programa Java que pide un número entero por teclado y 
calcula y muestra el número de cifras que tiene.
Por ejemplo si se introduce el número 54391 
el programa mostrará el mensaje:
El número tiene 5 cifras
*/
/**
 * @author Christian Novo Sacramento
 */
public class Basico49 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("¿Cuál número quieres saber cuántas cifras tiene?");
        numero = sc.nextInt();

        /*Genera un bucle que vaya dividiendo hasta que no pueda más
        el número de veces divido es el número de cifras
        */
        int contadorCifras = 0;
        while (numero != 0) {
            numero = numero / 10;
            contadorCifras++;
        }

        System.out.println("El número tiene: " + contadorCifras + " cifras.");
    }
}
