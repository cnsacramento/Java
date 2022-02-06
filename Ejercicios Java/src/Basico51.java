import java.util.Scanner;

/*
 Programa Java que lea un número entero N y 
 muestre la tabla de multiplicar de ese número.
 Por ejemplo, si se lee el valor 7 se mostrará por pantalla:
Tabla del 7
--------------
7 * 1  =  7
7 * 2  = 14
7 * 3  = 21
7 * 4  = 28
7 * 5  = 35
7 * 6  = 42
7 * 7  = 49
7 * 8  = 56
7 * 9  = 63
7 * 10 = 70
*/
/**
 * @author Christian Novo Sacramento
 */
public class Basico51 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("¿De qué número quieres la tabla de multiplicar?");
        n = sc.nextInt();
        System.out.println("*****************************");
        System.out.println("* TABLA DE MULTIPLICAR DEL " + n + "*");
        System.out.println("*****************************");
        int i = 1, multiplicacion;
        while (i <= 10) {
            multiplicacion = i * n;
            System.out.println("*         " + n + " x " + i + " = " + multiplicacion + "       *");
            System.out.println("*****************************");
            i++;
        }
    }
}
