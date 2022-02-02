/**
 * @author
 */
/*
 Escribe un programa Java que declare una variable entera N y asígnale un valor.
A continuación escribe las instrucciones que realicen los siguientes:
Incrementar N en 77.
Decrementarla en 3.
Duplicar su valor.
Si por ejemplo N = 1 la salida del programa será:

Valor inicial de N = 1                                                                  
N + 77 = 78                                                                                                       
N - 3 = 75                                                                                                        
N * 2 = 150
*/
public class Basico03 { 
    public static void main(String[] args) {
        
        int n = 3;
        /*
        El final antes del tipoDato sirve para declarar una constante,
        es decir este valor no se puede modificar. Y se escribe en mayúsculas
        el nombre de la variable
        */
        final int INCREMENTO = 77;
        final int DECREMENTO = 3;
        final int doble = 2;
        System.out.println(n + " + " + INCREMENTO + "= " + (n + INCREMENTO));
        System.out.println(n + " - " + DECREMENTO + "= " + (n - DECREMENTO));
        System.out.println(n + " x " + doble + "= " + (n * doble));
    }
}
