import java.util.Scanner;

/*
Programa que lea dos números enteros positivos N y M y muestre los múltiplos de N que hay desde 1 hasta M. 
Por ejemplo si N = 4 y M = 500 el programa mostrará los múltiplos de 4 desde 1 hasta 500.
El valor de N deberá ser menor que el valor de M. Si no se introducen valores válidos para N o M
se mostrará el mensaje correspondiente y se vuelven a pedir.
*/
/**
 * @author Christian Novo Sacramento
 */
public class Basico45 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n, m;

        //Se piden n y m
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@ MÚLTIPLOS DE N a M @");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
        System.out.printf("Valor de N: ");
        n = sc.nextInt();
        System.out.printf("Valor de M: ");
        m = sc.nextInt();


        while (n > m) { //Corrige n en caso de que sea mayor que m
            System.out.println("ERROR!!! (N tiene que ser menor que M)");
            System.out.printf("introduce N: ");
            n = sc.nextInt();
            System.out.printf("Introduce M: ");
            m = sc.nextInt();
        }

        System.out.println("Los múltiplos de N hasta M son: ");
        for (int i = 0; i <= m; i++) { 
            System.out.println(n + " * " + i + " = " + i*n); //Va múltiplicando N por i hasta que llega a M
        }
    }
}
