import java.util.Scanner;

/*
 Programa que lea números enteros por teclado y para cada número introducido
indique si es positivo o negativo y si es par o impar. 
Se deben realizar tres versiones del programa:
    En la primera versión se utilizará un bucle while. 
    La lectura de números finalizará cuando se introduzca un cero.
    En la segunda versión se utilizará un bucle do .. while. 
    La lectura de números en esta versión también finaliza cuando se introduzca un cero.
    En la tercera versión también se utilizará  un bucle do .. while pero en este caso 
    la lectura de números finaliza cuando se responda ‘N’ ó ‘n’ a la pregunta “Desea introducir más números? (S/N):”
*/
/**
 * @author Christian Novo Sacramento
 */
public class Basico46 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int version = 0;

        while(version < 1 || version > 3 ) { //Comprueba que sea una versión del programa
            System.out.println("Versiones Programa");
            System.out.println("1. Bucle While \n" + "2. Bucle Do While finaliza con 0 \n" 
                    + "3. Bucle Do while termina con letras" );
            System.out.printf("¿Qué versión desea? ");
            version = sc.nextInt();
        }
        int terminar = 1; // Variable que finaliza la versión 1 y 2
        switch (version) { //Realiza la versión escogida
            case 1: System.out.println("\nVersión Bucle While: ");
                int numero;
                while (terminar != 0 ) { //Permanece en búcle hasta que se introduzca 0
                    System.out.println("¿Qué número quieres saber si es positivo o negativo?");
                    numero = sc.nextInt();
                    if (numero < 0) { //Comprueba que sea un número negativo
                        System.out.println(numero + " es un número negativo");
                    }else { //Al no ser negativo tiene que ser positivo
                        System.out.println(numero + " es un número positivo");
                    }
                    //Se pregunta si se desea salir
                    System.out.println("\nSi desea terminar pulse 0. Para continuar cualquier número");
                    terminar = sc.nextInt();
                }
                break;
            case 2: System.out.println("\nVersión Bucle Do While que finaliza con 0: ");
                do{
                    System.out.println("¿Qué número quieres saber si es positivo o negativo?");
                    numero = sc.nextInt();
                    if (numero < 0) { //Comprueba que sea un número negativo
                        System.out.println(numero + " es un número negativo");
                    }else { //Al no ser negativo tiene que ser positivo
                        System.out.println(numero + " es un número positivo");
                    }
                    //Se pregunta si se desea salir
                    System.out.println("\nSi desea terminar pulse 0. Para continuar cualquier número");
                    terminar = sc.nextInt();
                }while(terminar != 0);
                break;
            case 3: System.out.println("\nVersión Bucle Do While que termina con letras: ");
                String continuar;
                do{
                    System.out.println("¿Qué número quieres saber si es positivo o negativo?");
                    numero = sc.nextInt();sc.nextLine(); //Se utiliza el nextLine para limpiar el buffer
                    if (numero < 0) { //Comprueba que sea un número negativo
                        System.out.println(numero + " es un número negativo");
                    }else { //Al no ser negativo tiene que ser positivo
                        System.out.println(numero + " es un número positivo");
                    }
                    //Se pregunta si se desea salir
                    System.out.println("\nSi desea terminar pulse \"n\" y para continuar \"s\" ");
                    continuar = sc.nextLine().toLowerCase(); //Aunque se introduzca en mayúsculas se convierte a minúsculas
                    while(!continuar.equals("n") && !continuar.equals("s")){ //En caso de que no se introduzca ni "n" ni "s" salta un error
                        System.out.println("Error!!!! (Debe responder \"n\" o \"s\"");
                        continuar = sc.nextLine().toLowerCase();
                    }
                } while(!continuar.equals("n")); //Permanece en bucle hasta que se pulse "n"
                break;
        }
        
    }
}
