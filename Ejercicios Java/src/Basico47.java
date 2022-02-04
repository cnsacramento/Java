import java.util.Scanner;

/*
Programa Java que convierte millas a kilómetros.
El programa pide que se introduzca una cantidad de millas y 
calcula y muestra su equivalente en Kilómetros. 
El proceso se repite hasta que se introduzca un 0 como valor para las millas.
1 Milla equivale a 1.6093 Kilómetros.
El valor de los KM resultantes se debe mostrar con dos decimales.
*/
/**
 * @author Christian Novo Sacramento
 */
public class Basico47 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double millas;
        double millasAkm;

        //Se solicitan las millas
        int terminar = 1;
        while(terminar != 0) {
            System.out.println("¿Cuántas millas quieres pasar a km?");
            millas = sc.nextDouble();
            millasAkm = millas * 1.6093; //1 milla son 1.6093 Km
            System.out.printf(millas + " millas = %.2f km", millasAkm); 
            /*
            printf modifica el output. % = Indica que se va a poner un valor.
            .2f = Indica que se va a imprimir sólo dos decimales y f = que es tipo double o f
            %n = Indica un salto de linea
            */

            System.out.println("\nSi no desea hacer más conversiones pulse \"0\". De lo contrario pulse cualquier número");
            terminar = sc.nextInt();
        }
    }
}
