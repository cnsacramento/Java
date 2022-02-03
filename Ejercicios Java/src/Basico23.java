import java.util.Scanner;

/**
 * @author Christian Novo Sacramento
 */
/*
Programa que lee una temperatura en grados centígrados y 
nos calcula y muestra por pantalla su valor equivalente en grados Reamur y Kelvin.
Las fórmulas para realizar la conversión de grados centígrados a grados Kelvin y Reamur son las siguientes:
ºC/100 = ºR/80= (ºK-273)/100
*/
public class Basico23 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double centigrados;

        //Se le solicitan los centígrados
        System.out.println("¿Cuántos grados centígrados quieres en Reamur y Kelvin?");
        centigrados = sc.nextDouble();

        //Se hallan los grados Reamur y kelvin
        //Primero hay que hayar los Reamur
        double reamur = (centigrados * 80) / 100; //La división de una fracción se multiplican los números en cruz
        double kelvin = centigrados + 273.15;

        //Se muestran lso reamur y kelven
        System.out.println(centigrados + " grados centígrados son: " + reamur + " grados reamur.");
        System.out.println(centigrados + " grados centígrados son: " + kelvin + " grados kelvin.");
        System.out.println();
        System.out.printf("\n%.2f ºC equivalen a %.2f ºR y a %.2f ºK \n", centigrados, reamur, kelvin);
    }
}
