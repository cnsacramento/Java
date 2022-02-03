import java.util.Scanner;

/**
 * @author Christian Novo Sacramento
 */
/*
Programa java que lea un carácter por teclado y compruebe si es un dígito numérico (cifra entre 0 y 9).
*/
public class Basico29 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char digito;

        //Se solicita el dígito númerico
        System.out.println("Dime un dígito:");
        digito = sc.next().charAt(0);

        //Se comprueba si es una cifra entre 0 y 9 con la tabla ASCII
        if (digito >= '0' && digito <= '9') {
            System.out.println(digito + " es un dígito entre 0 y 9");
        }else {
            System.out.println(digito + " no es un dígito entre 0 y 9");
        }

        /* Otra alternativa es utilizando la clase Character
        if (Character.isDigit(digito)) {
            System.out.println(digito + " es un dígito entre 0 y 9")
        }else {
            System.out.println(digito + " no es un dígito entre 0 y 9")
        }
        */
    }
}
