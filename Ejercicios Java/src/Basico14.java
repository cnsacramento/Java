import java.util.Scanner;

/**
 * @author Christian Novo Sacramento
 */
/*
 Programa lea la longitud de los catetos de un triángulo rectángulo 
 y calcule la longitud de la hipotenusa según el teorema de Pitágoras.
*/
public class Basico14 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int cateto1, cateto2;
        double hipotenusa;

        //Se solicitan los catetos
        System.out.println("¿Cuál es el primer cateto?");
        cateto1 = sc.nextInt();
        System.out.println("¿Cuál es el segundo cateto?");
        cateto2 = sc.nextInt();

        //La fórmula de pitágoras es: h^2 = c^2 + c^2
        /*
        Al despejar pitágoras hay que hacer la raíz cuadrada
        Y ésta se puede hacer con Math.sqrt
        */
        hipotenusa = Math.sqrt( (Math.pow(cateto1, 2) + (Math.pow(cateto2, 2))) );

        //Mostramos el resultado de la hipotenusa
        System.out.println("El valor de la hipotenusa es: " + hipotenusa);
    }
}
