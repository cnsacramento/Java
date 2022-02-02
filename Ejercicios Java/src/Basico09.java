import java.util.Scanner;

/**
 * @author Christian Novo Sacramento
 */
/*
 * 2. Programa Java que lea un nombre y muestre por pantalla:
 * Buenos dias nombre_introducido
 */
public class Basico09 {
    public static void main(String[] args) {

        // Importamos el Scanner
        Scanner sc = new Scanner(System.in);
        //Declaramos la variable nombre
        String nombre;
        System.out.println("¿Cuál es tú nombre?");
        nombre = sc.nextLine(); //Sirve para leer cadenas de texto
        //Mostramos el mensaje
        System.out.println("Buenos días,tardes,noches " + nombre);
    }
}
