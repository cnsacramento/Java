import java.util.Scanner;

/*
Programa que pida que se introduzcan dos números enteros por teclado y 
muestre los números desde el menor hasta el mayor de los números introducidos.
 Los dos números introducidos deben ser distintos. 
 Si son iguales se mostrará un mensaje indicándolo y se vuelven a introducir.
*/
public class Basico43 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;

        //Se piden los números
        System.out.printf("Dime un número: ");
        numero1 = sc.nextInt();
        System.out.printf("Dime otro número: ");
        numero2 = sc.nextInt();

        if (numero1 == numero2) { //Se comprueba que no sean iguales
            System.out.println("Los números son iguales");
        }else { //Esta sería una forma
            int numeroMenor = Math.min(numero1, numero2); //Halla el menor de los dos
            int numeroMayor = Math.max(numero1, numero2); //Halla el mayor de los dos
            //Se muestra los números del menor al mayor
            System.out.println("Los números entre medios de ambos son: ");
            for (int i = numeroMenor; i <= numeroMayor; i++) {
                System.out.print(i + " ");
            }
            /*otra forma sería: 
            if (numero1 > numero2) {
                int auxiliar = numero2 //Sirve para guardar el valor de 2 y no perderlo
                numero2 = numero1;
                numero1 = auxiliar;
                for(int i = numero1 ; i < numero2 ; i++) {
                    System.out.println(i);
                }
            }
            */
        }
    }
}
