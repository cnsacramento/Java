import java.util.Scanner;

/*
 Programa para codificar o decodificar un texto utilizando el método de cifrado de César. 
Supondremos que el texto solo contiene letras mayúsculas o minúsculas. 
La letras serán las correspondientes al alfabeto inglés (26 caracteres, excluimos la ñ y Ñ).
En este método de cifrado cada letra del texto se sustituye por otra letra que se encuentra N
posiciones adelante en el alfabeto. Se considera que el alfabeto es circular, 
es decir, la letra siguiente a la ‘z’ es la ‘a’.
Por ejemplo, si N es 3, la ‘a’ se transformaría en ‘d’, la ‘b’ en ‘e’, la ‘c’ en ‘f’, etc
*/
/**
 * @author Christian Novo Sacramento
 */
public class Basico59 {

    public static String cifrarTexto (String texto, int posiciones) {
        String alfabeto = "abcdefghijklmnopqrstuvwxyz"; //Almacena el alfabeto para encriptar
        String textoCifrado = "";
        int posicionLetra = 0;
        char letra;
        for (int i = 0; i < texto.length(); i++) { //Bucle que recorre el texto e intercambia letras
            if (texto.charAt(i) ) {

            }
            letra = texto.charAt(i); //Almacena el valor por orden de la letra del texto
            for (int j = 0; j < alfabeto.length(); j++) { //Recorre el alfabeto para hallar la posición de la letra
                if (alfabeto.charAt(j) == letra) {
                    posicionLetra = j; //Obtiene la posición de la letra en el alfabeto
                }
            }
            textoCifrado += alfabeto.charAt(posicionLetra + posiciones);
        }
        return textoCifrado;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String texto = "";//Almacena el texto a cifrar
        String textoCifrado = ""; //Almacena el texto cifrado
        int posiciones = 0;

        System.out.println("¿Qué texto quieres cifrar?");
        texto = sc.nextLine();
        System.out.println("¿Cuántas posiciones deseas desplazar?");
        posiciones = sc.nextInt();

        textoCifrado = cifrarTexto(texto, posiciones);
        System.out.println("El texto cifrado es\n" + textoCifrado);


    }
}
