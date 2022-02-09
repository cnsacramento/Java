import java.util.Scanner;

/*
Un número es capicúa si se puede leer igual de derecha a izquierda 
que de izquierda a derecha. Ejemplos de números capicúas: 121, 3003, 1234321, 33, 445544, etc.
*/
/**
 * @author Christian Novo Sacramento
 */
public class Basico60 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("¿Qué número quieres comprobar si es capicúa?");
        numero = sc.nextInt();
    
        int auxiliar = numero;
        int cifra, inverso = 0;
        while (auxiliar > 0) {
            cifra = auxiliar % 10;
            inverso = inverso * 10 + cifra; //Incrementa en 10 el valor del último inverso y suma el nuevo
            auxiliar /= 10; //Se quita la última cifra
        }

        String esCapicua = (numero == inverso) ? "El número es capicúa" : "El número no es capicúa";
        System.out.println(esCapicua);

    }
}
