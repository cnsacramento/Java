import java.util.Scanner;

/*
 Programa Java que lee una temperatura expresada 
 en grados centígrados y la convierte a grados kelvin. 
El proceso de leer grados centígrados se debe repetir
 mientras que se responda ‘S’ a la pregunta: Repetir proceso? (S/N)
Para hacer la conversión de grados Centígrados a grados Kelvin hay que utilizar la fórmula:
ºK = ºC + 273

*/
/**
 * @author Christian Novo Sacramento
 */
public class Basico50 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double gCentigrados, gKelvin;

        String repetir = "";
        while(!repetir.equals("N")) {
            System.out.println("¿Cuántos grados centígrados quieres convertir a Kelvin?");
            gCentigrados = sc.nextDouble();sc.nextLine();
            gKelvin = gCentigrados + 273; //Convierte centígrados a kelvin
            System.out.println(gCentigrados + " grados centígrados son: " + gKelvin + " grados kelvin");
            System.out.println("Repetir proceso? (S/N)"); 
            repetir = sc.nextLine().toUpperCase(); //Convierte la letra que se otorgue a mayúscula
            while(!repetir.equals("S") && !repetir.equals("N")) { //Manda un mensaje de error si no se pone "S" o "N" para corregirlo
                System.out.println("ERROR!!! (Debe marcar \"s\"  o  \"n\")");
                repetir = sc.nextLine().toUpperCase();
            }
        }
    }
}
