import java.util.Scanner;

/*
 Escribe un programa Java que pida por teclado el valor de un número N y 
 muestre por pantalla todos los números desde 1 hasta N.
  Resuelve este ejercicio de tres formas distintas:
1.      Utilizando la estructura for
2.      Utilizando la estructura while
3.      Utilizando la estructura do .. while  
*/
/**
 * @author Christian Novo Sacramento
 */
public class Basico42 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcion, n;
        //Se solicita hasta que número quiere los bucles
        System.out.println("¿Hasta cúal número quieres los bucles? ");
        n = sc.nextInt();
        if (n < 0) { //Controla que no den números negativos
            System.out.println("ERROR!!! (El número debe ser positivo)");
        }else { //Entra en caso de que sea número positivo
            System.out.println("============");
            System.out.println("|| BUCLES ||");
            System.out.println("============");
            System.out.println("1. Bucle while \n" + "2. Bucle do while \n" + "3. Bucle for \n" + "Opción: ");
            opcion = sc.nextInt(); //Selecciona que bluce se va a utilizar
            if (opcion < 1 || opcion > 3) { //Controla que la opción se encuentre entre las disponibles
                System.out.println("ERROR!!! " + n + " no es una opción" );
            }else { System.out.println(); //Sólo es para separar el resultado
                switch (opcion) { //Selecciona el bucle deseado
                    case 1: System.out.println("Bucle while: ");
                        int i = 1;
                        while (i <= n) {
                            System.out.print(i + " ");
                            i++;
                        }
                        break;
                    case 2: System.out.println("Bucle do while: ");
                        int j = 1; //Los punteros deben ser diferentes al ser locales
                        do{
                            System.out.print(j + " ");
                            j++;
                        }while(j <= n);
                        break;
                    case 3: System.out.println("Bucle for: ");
                        for (int k = 1; k < n; k++) {
                            System.out.print(k + " ");
                        }
                        break;
                }
            }
        }
        
    }
}
