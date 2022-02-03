import java.util.Scanner;

/**
 * @author Christian Novo Sacramento
 */
/*
 Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, año) y calcule su número de la suerte.
El número de la suerte se calcula sumando el día, mes y año de la fecha de nacimiento
 y a continuación sumando las cifras obtenidas en la suma.
Por ejemplo:
Si la fecha de nacimiento es 12/07/1980 
Calculamos el número de la suerte así: 12+7+1980 = 1999  1+9+9+9 = 28
Número de la suerte: 28
*/
public class Basico20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int dia,mes,anyo; //año se pone como anyo para evitar érrores y facilitar su uso
        int numeroSuerte;

        //Se solicitan los datos
        System.out.println("===================================");
        System.out.println("| Cálculo del número de la suerte |");
        System.out.println("===================================");
        System.out.printf("Introduce el día de tú nacimiento: "); //printf solicita el dato a la derecha de la cadena
        dia = sc.nextInt();
        System.out.printf("Introduce el mes de tú nacimiento: ");
        mes = sc.nextInt();
        System.out.printf("Introcue tú año de nacimiento: ");
        anyo = sc.nextInt();

        //Se hace el cálculo del número de la suerte
        int sumaFechaNacimiento = dia + anyo + mes; //se suma la fecha de nacimiento
        numeroSuerte = (sumaFechaNacimiento/1000) + ( (sumaFechaNacimiento%1000) / 100 ) + ( (sumaFechaNacimiento/10) % 10 ) 
                        + (sumaFechaNacimiento % 10) ;

        //Se muestra el número de la suerte
        System.out.println("********************************");
        System.out.println("* El número de la suerte es: " + numeroSuerte + " *");
        System.out.println("********************************");

    }
}
