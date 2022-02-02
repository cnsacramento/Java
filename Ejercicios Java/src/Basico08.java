
/**
 * @author Christian Novo Sacramento
 */
/*
Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
*/

import java.util.Scanner;
public class Basico08 {
    public static void main(String[] args) {
        //El scanner pertenece a una libreía de java y sirve para leer datos por teclado
        Scanner sc = new Scanner(System.in);
        //Se declaran las variables a usar
        int numero1, numero2;
        //Se pregunta por el valor de las variables y se guardan gracias al éscaner
        System.out.println("¿Cuál es el número 1?");
        numero1 = sc.nextInt(); //El "sc" hace referencia al nombre del éscaner y seguido del punto el tipoDato
        System.out.println("¿Cuál es el número 2?");
        numero2 = sc.nextInt(); //Sirve para leer enteros
        //Se muestran los valores guardados
        System.out.println("El número 1 es: " + numero1 + "\n"
                    + "El número 2 es: " + numero2);
    }
}
