/*
Programa Java que muestre los números del 1 al 100 utilizando la instrucción while.
*/
/**
 * @author Christian Novo Sacramento
 */
public class Basico34 {
    public static void main(String[] args) {
        
        //Para el bucle while hay que declarar el puntero por fuera
        int i = 1; //Como estandarización se les otorga el nombre de i,j,k
        System.out.println("Los números del 1 al 100 son: ");
        while (i <= 100) { //Mientras i sea menor o igual que 100 ejecuta el bucle
            System.out.print(i + " "); //Se le quita el ln para que surjan en una línea y un espacio para que no salgan juntos
            i++; //Se incrementa la i para poder salir del bucle y que no sea infinito
        }

    }
}
