import java.util.Scanner;

/**
 * @author Christian Novo Sacramento
 */
/*
Ejercicio 5. Programa que lee por teclado el valor del radio de una circunferencia
 y calcula y muestra por pantalla la longitud y el área de la circunferencia. 
 Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2
*/
public class Basico12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double radio;
        double longitudCircunferencia, areaCircunferencia;

        //Se solicita el valor del radio
        System.out.println("¿Cuál es el valor del radio de la circunferencia?");
        radio = sc.nextDouble();

        //Se halla la longitud y área de la circunferencia
        longitudCircunferencia = 2 * Math.PI * radio; //PI se halla en la clase math de java
        areaCircunferencia = Math.PI * Math.pow(radio, 2); //Math.pow sirve para elevar un número a la potencia que se desea

        //Se muestra el resultado de las operaciones
        System.out.println("Para el valor de la circunferencia con radio: " + radio + "\n" 
                    + "La longitud es: " + longitudCircunferencia + "\n"
                    + "Y el área: " + areaCircunferencia);
    }
}