import java.util.Scanner;

/*
Pasar de Decimal a binario sin utilizar arrays
*/
/**
 * @author Christian Novo Sacramento
 */
public class Basico56 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int decimal;
        int convertirAbinario;

        System.out.println("¿Qué número decimal quieres convertir a Binario?");
        decimal = sc.nextInt();
        String binario = "";

        while(decimal / 2 > 0) {
            convertirAbinario = decimal % 2; //Obtiene los restos de la división para formar el binario
            decimal = decimal / 2; //Obtiene el nuevo número a dividir 
            binario = convertirAbinario + binario; //Guarda los restos en orden inverso
        }
        binario = decimal + binario; //Se añade el primer dígito que no coge el bucle
        System.out.println("El número binario es: " + binario);
    }
}
