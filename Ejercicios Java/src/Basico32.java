import java.util.Scanner;

/*
Programa que lea por teclado tres números enteros H, M, S correspondientes a hora, minutos y segundos respectivamente,
 y comprueba si la hora que indican es una hora válida.

Supondremos que se leemos una hora en modo 24 Horas, es decir,
 el valor válido para las horas será mayor o igual que cero y menor que 24.

El valor válido para los minutos y segundos estará comprendido entre 0 y 59 ambos incluidos
*/
/**
 * @author Christian Novo Sacramento
 */
public class Basico32 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int horas, minutos , segundos;

        //Solicitamos las horas, minutos y segundos
        System.out.printf("Dame la hora: ");
        horas = sc.nextInt();
        System.out.printf("Dame los minutos: ");
        minutos = sc.nextInt();
        System.out.printf("Dame los segundos: ");
        segundos = sc.nextInt();

        //Se crean los condicionales
        if (horas >= 0 && horas <= 24 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) { //Comprueba que todos los parámetros sean correctos
            System.out.println("El formato es correcto");
        }
        if (horas >= 0 && horas <= 24 && minutos >= 0 && minutos <= 59 && segundos < 0 || segundos > 59) { //Comprueba que los segundos sean incorrectos
            System.out.println("ERROR!!! (El formato de los segundos es incorrecto)");
        }
        if (horas >= 0 && horas <= 24 && minutos < 0 || minutos > 59 && segundos >= 0 && segundos <= 59) { //Comprueba si son los minutos incorrectos
            System.out.println("ERROR!!! (El formato de los minutos es incorrecto)");
        }
        if (horas >= 0 && horas <= 24 && minutos < 0 || minutos > 59 && segundos >= 0 && segundos <= 59) { //Comprueba si las horas son incorrectas
            System.out.println("ERROR!!! (EL formato de las horas es incorrecto");
        }

    }
}
