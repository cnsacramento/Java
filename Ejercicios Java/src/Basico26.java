import java.util.Scanner;

/**
 * @author Christian Novo Sacramento
 */
/*
Programa que lea un carácter por teclado y compruebe si es una letra mayúscula
*/
public class Basico26 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char caracter; //Un cáracter se coge con char

        //Se solicita un cáracter
        System.out.println("¿Qué cáracter quieres saber si es mayúscula?");
        //No hay método en el éscaner para char por eso se utiliza next() y charAt(0) que toma el primer carácter
        caracter = sc.next().charAt(0); 

        //Para saber si un cáracter está en mayúsculas se puede comprobar según la tabla ASCII. Mayúculas < minúsculas
        if ( caracter < 'a' ) {
            System.out.println(caracter + " es una mayúscula");
        }else {
            System.out.println(caracter + " no es una mayúcula");
        }
    }
}
