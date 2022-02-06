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

        int contadorCifras = 0; //Almacena la cantidad de cifras
        while (numero != 0) { //Efectua la misma operación hasta que sea 0
            numero = numero / 10; //Se va dividiendo el número entre 10 
            contadorCifras++; //Por cada iteración incrementa 1 la cantidad de cifras
        }
        
        System.out.println("El número tiene: " + contadorCifras + " cifras.");
    }
}
