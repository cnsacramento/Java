import java.util.Scanner;

/**
 * @author Christian Novo Sacramento
 */
/*
Escribe un programa Java que lee un número entero por teclado y obtiene 
y muestra por pantalla el doble y el triple de ese número.
*/
public class Basico10 {
    public static void main(String[] args) {
        //Se declara el éscaner
        Scanner sc = new Scanner(System.in);
        //Se declara la variable número
        int numero;
        //Se pide el número
        System.out.println("¿De qué número quieres conocer el doble y triple");
        numero = sc.nextInt();
        //Se declara las variables que contienen el doble y triple
        int doble = numero * 2, triple = numero * 3;
        //Se muestra el doble y triple del número
        System.out.println("El doble de " + numero +" es: " + doble + "\n"
                    + "El triple de " + numero + " es: " + triple);
    }
}
