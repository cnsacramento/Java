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

    public static String descifrarTexto(String texto, int posiciones) {
        String alfabeto = "abcdefghijklmnopqrstuvwxyz"; // Almacena el alfabeto para encriptar
        String textoDescifrado = "";
        int posicionLetra = 0;
        char letra;
        for (int i = 0; i < texto.length(); i++) { // Bucle que recorre el texto e intercambia letras
            if (texto.charAt(i) < 'A' || texto.charAt(i) > 'z') { // En caso de que no sea un carácter distinto a una letra lo sustituye
                textoDescifrado += " "; // Sustituir por lo que se quiera modificar. En este caso un espacio
            } else { // Si el carácter es una letra se ejecuta lo siguiente
                letra = texto.charAt(i); // Almacena el valor por orden de la letra del texto
                for (int j = 0; j < alfabeto.length(); j++) { // Recorre el alfabeto para hallar la posición de la letra
                    if (alfabeto.charAt(j) == letra) {
                        posicionLetra = j; // Obtiene la posición de la letra en el alfabeto
                    }
                }
                if (posicionLetra - posiciones < 0) { // En caso de que quede menor a 0 empieza desde el final
                    textoDescifrado += alfabeto.charAt( alfabeto.length() - (posiciones - posicionLetra) );
                } else { // En caso de que no sobrepase la longitud del alfabeto se hace el
                         // desplazamiento
                    textoDescifrado += alfabeto.charAt(posicionLetra - posiciones);
                }
            }
        }
        return textoDescifrado;
    }


    public static String cifrarTexto(String texto, int posiciones) {
        String alfabeto = "abcdefghijklmnopqrstuvwxyz"; // Almacena el alfabeto para encriptar
        String textoCifrado = "";
        int posicionLetra = 0;
        char letra;
        for (int i = 0; i < texto.length(); i++) { // Bucle que recorre el texto e intercambia letras
            if (texto.charAt(i) < 'A' || texto.charAt(i) > 'z') { // En caso de que no sea un carácter distinto a una letra lo sustituye
                textoCifrado += ""; // Sustituir por lo que se quiera modificar. En este caso nada
            } else { // Si el carácter es una letra se ejecuta lo siguiente
                letra = texto.charAt(i); // Almacena el valor por orden de la letra del texto
                for (int j = 0; j < alfabeto.length(); j++) { // Recorre el alfabeto para hallar la posición de la letra
                    if (alfabeto.charAt(j) == letra) {
                        posicionLetra = j; // Obtiene la posición de la letra en el alfabeto
                    }
                }
                if (posicionLetra + posiciones > alfabeto.length()) { // En caso de que sobrepase la longitud del alfabeto empieza desde cero
                    textoCifrado += alfabeto.charAt((posicionLetra + posiciones) - alfabeto.length());
                } else { // En caso de que no sobrepase la longitud del alfabeto se hace el
                         // desplazamiento
                    textoCifrado += alfabeto.charAt(posicionLetra + posiciones);
                }
            }
        }
        return textoCifrado;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String texto = "";// Almacena el texto a cifrar
        String textoCifrado = ""; // Almacena el texto cifrado
        String textoDescifrado = ""; //Almacena el texto Descifrado
        int posiciones = 0;
        String opcion;

        System.out.println("#######################");
        System.out.println("# PROGRAMA DE CIFRADO #");
        System.out.println("#######################");

        System.out.printf("Pulsa (C) cifrar o (D) descifrar: ");
        opcion = sc.nextLine().toLowerCase(); //Recoge la opcion 
        while(!opcion.equals("c") && !opcion.equals("d")) { //En caso de que no se introduzca la letra correcta manda fallo
            System.out.println("ERROR!!! (Debes introducir \"C\" O  \"D\" )");
            opcion = sc.nextLine().toLowerCase();
        }
        switch (opcion) {
            case "c":
                System.out.println("¿Qué texto quieres cifrar?");
                texto = sc.nextLine();
                System.out.println("¿Cuántas posiciones deseas desplazar?");
                posiciones = sc.nextInt();
                textoCifrado = cifrarTexto(texto, posiciones);
                System.out.println("El texto cifrado es:\n" + textoCifrado);
                break;
            case "d": 
                System.out.println("¿Qué texto deseas descifrar?");
                texto = sc.nextLine();
                System.out.println("¿Cuántas posiciones son?");
                posiciones = sc.nextInt();
                textoDescifrado = descifrarTexto(texto, posiciones);
                System.out.println("El texto descifrado es:\n" + textoDescifrado);
                break;
        }
    }
}
