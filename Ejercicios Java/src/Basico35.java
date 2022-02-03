/*
Programa Java que muestre los números del 1 al 100 utilizando la instrucción do..while.
*/
/**
 * @author Christian Novo Sacramento
 */
public class Basico35 {
    public static void main(String[] args) {
        
        int i = 1; //Los bubles do while necesitan declarar el puntero por fuera
        do{ //El problema de los do while es que se ejecutan mínimmo 1 vez aunque no se cumpla la condición
            System.out.println(i);
            i++;
        }while(i <= 100);
    }
}
