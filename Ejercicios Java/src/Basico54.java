import java.util.Scanner;

/*
 Dos números enteros positivos A y B son números amigos si la suma de los divisores 
 propios de A es igual a B y la suma de los divisores propios de B es igual a A.

Los divisores propios de un número incluyen la unidad pero no el propio número.

Un ejemplo de números amigos son los números 220 y 284.
Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110.
La suma de los divisores propios de 220 da como resultado 284
Los divisores propios de 284 son 1, 2, 4, 71 y 142.
La suma de los divisores propios de 284 da como resultado 220.
Por lo tanto 220 y 284 son amigos.

Otras parejas de números amigos son:

 1184,   1210
 2620,   2924
 5020,   5564
 6232,   6368
10744, 10856
12285, 14595
17296, 18416

*/
/**
 * @author Christian Novo Sacramento
 */
public class Basico54 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numeroA, numeroB;
        int divisoresA = 0, divisoresB = 0;

        System.out.println("------------------");
        System.out.println("- NÚMEROS AMIGOS -");
        System.out.println("------------------");
        System.out.println("Dime el valor de A: ");
        numeroA = sc.nextInt();
        System.out.println("Dime el valor de B: ");
        numeroB = sc.nextInt();

        for (int i = 1; i < numeroA - 1; i++) { //Se calculan los divisores de A
            if (numeroA % i == 0) {
                divisoresA += i; //Se almacenan los divisores de A
            }
        }
        for (int i = 1; i < numeroA - 1; i++) { //Se calculan los divisores de B
            if (numeroA % i == 0) {
                divisoresB += i; //Se almacena los divisores de B
            }
        }

        /*
        Se comprueba que la suma de los divisores de A sean igual al número b
        Y que los divisores de B sean igual al número A
        */
        if (divisoresA == numeroB && divisoresB == divisoresA) { 
            System.out.println(numeroA + " y " + numeroB + " son números amigos.");
        }else {
            System.out.println(numeroA + " y " + numeroB + " no son números amigos.");
        }
    }
}
