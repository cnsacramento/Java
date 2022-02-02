import java.util.Scanner;

/**
 * @author
 */
/*
Programa que lea un número entero N de 5 cifras y muestre sus cifras igual que en el ejemplo.
Por ejemplo para un número N = 12345   La salida debe ser:
1
12
123
1234
12345
 */
public class Basico18 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero;

        //Se solicita el número
        System.out.println("Dime un número de 5 cifras");
        numero = sc.nextInt();

        //Se hallan las cifras dividiendo y obteniendo sólo la parte entera
        int cifra1 = numero / 10000; 
        int cifra1a2 = numero / 1000;
        int cifra1a3 = numero / 100;
        int cifra1a4 = numero / 10;

        //Se muestra como un triángulo
        System.out.println("==========");
        System.out.println("ESTRUCTURA");
        System.out.println("==========");
        System.out.println(cifra1);
        System.out.println(cifra1a2);
        System.out.println(cifra1a3);
        System.out.println(cifra1a4);
        System.out.println(numero);

    }
}
