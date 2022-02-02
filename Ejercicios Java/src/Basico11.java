import java.util.Scanner;

/**
 * @author Christian Novo Sacramento
 */
/*
Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:
F = 32 + ( 9 * C / 5)
*/
public class Basico11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //Se inicializa centigrados para que no tenga conflicto con la fórmula
        double centigrados = 0;
        //Se declara la fórmula de centígrados a Fahrenheit
        double centigradosAfarenheit = 32 + (9 * centigrados / 5);
        System.out.println("¿Cuántos grados centígrados quieres pasar a Fahrenheit?");
        centigrados = sc.nextInt(); //Se cogen los centígrados sustituyendo el 0 inicial
        //Se muestra el resultado
        System.out.println(centigrados + " grados centígrados son: " + centigradosAfarenheit 
                + " grados Farenheit");
    }
}
