/**
 * @author Christian Novo Sacramento
 */
/*
 Escribe un programa Java que realice lo siguiente:
 declarar una variable N de tipo int, una variable A de tipo double 
 y una variable C de tipo char y asigna a cada una un valor. A continuación muestra por pantalla:
El valor de cada variable.
La suma de N + A
La diferencia de A - N
El valor numérico correspondiente al carácter que contiene la variable C.
Si por ejemplo le hemos dado a N el valor 5, a A el valor 4.56 y a C el valor ‘a’, se debe mostrar por pantalla:
Variable N = 5
Variable A = 4.56                                                                                                 
Variable C = a
5 + 4.56 = 9.559999999999999
4.56 - 5 = -0.4400000000000004
Valor numérico del carácter a = 97  
*/
public class Basico01 {
    public static void main(String[] args) throws Exception {
        
        int variableN = 5;
        double variableA = 4.56;
        char variableC = 'a';
        //Si se quisiera la suma en enteros habría que castear(int)variableN
        double suma = variableN + variableA;
        double diferencia = variableA - variableN;
        System.out.println("Los valores de las variables son:\n" 
                + "El valor de la variable N: " + variableN + "\n"
                + "El valor de la variable A: " + variableA + "\n"
                + "El valor de la variable C: " + variableC);

        System.out.println("La suma de N+A es: " + suma);
        System.out.println("La diferencia de A-N es: " + diferencia);
        //Para convertir un char al sistema decimal basta con castear el char desde un short,byte,int,double
        System.out.println("El valor númerico del carácter " + variableC + "= " + (short)variableC);

    }
}
