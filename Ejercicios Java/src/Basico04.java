
/**
 * @author Christian Novo Sacramento
 */
/*
 Programa java que declare cuatro variables enteras A, B, C y D y asígnale un valor a cada una. A continuación realiza las instrucciones necesarias para que:
B tome el valor de C
C tome el valor de A
A tome el valor de D
D tome el valor de B
Si por ejemplo A = 1, B = 2, C = 3 y D = 4 el programa debe mostrar:

Valores iniciales
A = 1
B = 2
C = 3
D = 4
Valores finales
B toma el valor de C -> B = 3                                                                                     
C toma el valor de A -> C = 1
A toma el valor de D -> A = 4
D toma el valor de B -> D = 2                                                                                     
*/
public class Basico04 {
    
    public static void main(String[] args) {
        
        int a = 2, b = 5, c = 7, d = 1;
        //Lo que hace "\n" es hacer un salto de línea
        System.out.println("Los valores iniciales son:\n" 
                + "a = " + a + "\n" + "b = " + b + "\n"
                + "c = " + c + "\n" + "d = " + d);

        //Como se va a perder el valor de "b" creamos un auxiliar para guardar su valor inicial
        int auxiliar = b;
        //No hace falta separar sentencias con el "enter" se pueden juntar separando por ";"
        b = c; c = a; a = d; d = auxiliar; //Se coge el auxiliar, porque b perdío su valor por el de "c"
        System.out.println(); //Este sout es sólo para separar las sentencias
        System.out.println("Los valores cambiados son:\n" 
                + "a con valor de d = " + a + "\n" + "b con valor de c = " + b + "\n"
                + "c con valor de a = " + c + "\n" + "d con valor de b = " + d);
    }
}
