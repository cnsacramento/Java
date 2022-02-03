import java.util.Scanner;

/**
 * @author Christian Novo Sacramento
 */
/*
 Programa que lea dos variables enteras N y m y le quite a N sus m últimas cifras. 
Por ejemplo, si N = 123456 y m = 2 el nuevo valor de N será 1234.
*/
public class Basico22 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n, m;

        //Se solicita n y m
        System.out.println("Dime un número: ");
        n = sc.nextInt();
        System.out.println("¿Cuántas cifras quieres quitarle?");
        m = sc.nextInt();

        //Se le quitan las cifras a n
        n /= Math.pow(10, m);

        //Se muestra el resultado
        System.out.println("El nuevo valor de n es: " + n);
    }
}
