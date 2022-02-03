import java.util.Scanner;

/**
 * @author Christian Novo Sacramento
 */
/*
El programa lee por teclado tres números enteros y calcula y muestra el mayor de los tres.
*/
public class Basico31 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero1,numero2,numero3;

        //Se solicitan los datos
        System.out.println("#####################");
        System.out.println("# CALCULAR EL MAYOR #");
        System.out.println("#####################");
        System.out.printf("Introduce el número 1: ");
        numero1 = sc.nextInt();
        System.out.printf("Introduce el número 2: ");
        numero2 = sc.nextInt();
        System.out.printf("Introduce el número 3: ");
        numero3 = sc.nextInt();

        //Se halla cuál de los tres es el mayor con un condicional
        if (numero1 > numero2 && numero1 > numero3) { //Halla si número 1 es mayor que los otros
            System.out.println(numero1 + " es mayor que " + numero2 + " y " + numero3);
        }else if(numero2 > numero1 && numero2 > numero3) { //Halla si el mayor es el número 2
            System.out.println(numero2 + " es mayor que " + numero1 + " y " + numero3);
        }else if(numero3 > numero1 && numero3 > numero2) { //Halla si el mayor es el número 3
            System.out.println(numero3 + " es mayor que " + numero1 + " y " + numero2);
        }else if (numero1 == numero2 && numero1 > numero3) { //Halla si numero 1 y número 2 son iguales y mayores que número 3
            System.out.println("Tanto el primer número como el segundo son iguales y mayores que " + numero3);
        }else if (numero1 == numero2 && numero1 < numero3){ //Halla si número 1 y número 2 son iguales y menores que número 3
            System.out.println("Tanto el primer número como el segundo son iguales y menores que " + numero3);
        }else if (numero1 == numero3 && numero1 > numero2) { //Halla si número 1 y número 3 son iguales y mayores que número 2
            System.out.println("Tanto el primer número como el tercero son iguales y mayores que " + numero3);
        }else if (numero1 == numero3 && numero1 < numero2) { //Halla si número 1 y número 3 son iguales y menores que número 2
            System.out.println("Tanto el primer número como el tercero son iguales y menores que " + numero3);
        }else { //La única opción restante es que los tres números sean iguales
            System.out.println("Los tres números son iguales");
        }
            
    }
}
