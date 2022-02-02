import java.util.Scanner;

/**
 * @author Christian Novo Sacramento
 */
/*
 Programa que tome como dato de entrada un número que corresponde a la longitud del radio una esfera
 y nos calcula y escribe el volumen de la esfera que se corresponden con dicho radio.
La fórmula para calcular el volumen de la esfera es
v = (4/3)*PI*r^3
*/
public class Basico15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double longitudRadio;
        double volumenEsfera;

        //Se solicitan los datos
        System.out.println("¿Cuál es la longitud del radio?");
        longitudRadio = sc.nextDouble();

        //Se aplica la fórmula del volumen "v = (4/3)*PI*r^3"
        volumenEsfera = (4/3) * Math.PI * Math.pow(longitudRadio, 3);

        //Se muestra el volumen de la esfera
        System.out.println("El volumen de la esfera es: " + volumenEsfera);
    }
}
