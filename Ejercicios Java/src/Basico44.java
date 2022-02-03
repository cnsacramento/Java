import java.util.Scanner;

/*
Programa que pida que se introduzcan dos números enteros A y B por teclado 
y muestre los números pares que hay entre A y B. A debe ser menor que B.
 Si no es así se mostrará un mensaje indicándolo y se vuelven a introducir.
*/
/**
 * @author Christian Novo Sacramento
 */
public class Basico44 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numeroA, numeroB;

        //Se solicitan los dos números
        System.out.println("¿Entre qué números quieres saber los pares?");
        System.out.printf("Número A: ");
        numeroA = sc.nextInt();
        System.out.printf("Número B: ");
        numeroB = sc.nextInt();

        while (numeroA > numeroB) { //Corrige que A para que sea menor que B
            System.out.println("ERROR!!! (A debe ser menor que B)");
            System.out.printf("Introduce A: ");
            numeroA = sc.nextInt();
            System.out.printf("Introduce B: ");
            numeroB = sc.nextInt();
        }
        System.out.println("Los números pares entre " + numeroA + " y " + numeroB + " son:");
        for (int i = numeroA; i < numeroB; i++) {  //Genera los números entre A y B
            if (i % 2 == 0) { //Selecciona solamente los números pares
                System.out.print(i + " ");
            }
        }



    }
}
