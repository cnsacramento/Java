import java.util.Scanner;

/*
 Qué es un número perfecto?

Un número es perfecto si es igual a la suma de todos 
sus divisores positivos sin incluir el propio número.
Por ejemplo, el número 6 es perfecto. 
El 6 tiene como divisores: 1, 2, 3 y 6 
pero el 6 no se cuenta como divisor para comprobar si es perfecto.
Si sumamos 1 + 2 + 3 = 6 
Los siguientes números perfectos después del 6 son 28, 496, 8128, 33550336, 8589869056. 
El programa pide por teclado un número y muestra si es perfecto o no. 
mediante un bucle for sumaremos los divisores del número. 
Al final si esta suma es igual al número mostraremos el mensaje correspondiente.
*/
/**
 * @author Christian Novo Sacramento
 */
public class Basico53 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero, sumaDivisores = 0;

        System.out.println("?¿?¿?¿?¿?¿?¿?¿?¿?¿?¿?");
        System.out.println("¿? NÚMERO PERFECTO ?¿");
        System.out.println("?¿?¿?¿?¿??¿?¿?¿?¿??¿?");
        System.out.println("\n¿Qué número quieres saber si es perfecto?");
        numero = sc.nextInt();

        for (int i = 1; i < numero - 1; i++) { //Divide el número por sus divisores hasta el valor del número-1
            if (numero % i == 0) {
                sumaDivisores += i; //Almacena la suma de los divisores que dan exacto
            }
        }
        //Se muestra si es un número perfecto o no
        if (sumaDivisores == numero) {
            System.out.println("El " + numero + " es un número perfecto");
        }else {
            System.out.println("El " + numero + " no es un número perfecto");
        }
        
    }
}
