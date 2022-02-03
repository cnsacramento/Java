/*
Programa Java que muestre los números del 100 al 1 utilizando la instrucción do..while.
*/
/**
 * @author Christian Novo Sacramento
 */
public class Basico40 {
    public static void main(String[] args) {
        
        int i = 100;
        do {
            System.out.println(i);
            i--;
        }while(i > 0); //Como el 0 no está incluido coge hasta el 1
    }
}
