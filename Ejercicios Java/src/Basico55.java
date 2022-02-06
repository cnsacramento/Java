import java.util.Scanner;

/*
 La serie de fibonacci la forman una serie de números tales que:

El primer término de la serie es el número 1
El segundo término de la serie es el número 1
Los siguientes términos de la serie de fibonacci se obtienen de la suma de los dos anteriores:

1, 1, 2, 3, 5, 8, 13, .....  
*/
/**
 * @author Christian Novo Sacramento
 */
public class Basico55 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("///////////////////////////");
        System.out.println("// SUCESIÓN DE FIBONACCI //");
        System.out.println("///////////////////////////");
        System.out.println("\n¿Hasta qué número quieres la sucesión de Fibonacci?");
        int numeroFinal = sc.nextInt();

        int auxiliar = 0;
        int numero = 1;

        System.out.println("Los números de la sucesión de Fibonacci hasta el " + numeroFinal + " son:");
        String coma = ""; //Primera iteración sin coma
        while (numero <= numeroFinal) {
            System.out.print(coma + numero);
            coma = ", "; //Se le pone coma al resto de iteraciones
            auxiliar = numero - auxiliar; //Se almacena el valor del número anterior
            numero = auxiliar + numero; //Se obtiene el nuevo número. 
        }
    }
}
