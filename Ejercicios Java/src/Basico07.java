/**
 * @author Christian Novo Sacramento
 */
/*
 Escribe un programa java que declare una variable C de tipo entero y asígnale un valor.
A continuación muestra un mensaje indicando si el valor de C es positivo o negativo,
si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100. 
Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
Si por ejemplo C = 55 la salida será

55 es positivo
55 es impar
55 es múltiplo de 5                                                                                               
55 no es múltiplo de 10                                                                                           
55 es menor que 100
*/
public class Basico07 {
    
    public static void main(String[] args) {
        
        int c = 55;
        System.out.println( (c >= 0) ? c + " es positivo": c + " es negativo");
        System.out.println( (c % 2 == 0) ? c + " es par" : c + " es impar");
        //Para saber si un número es múltiplo de otro basta con hallar si al dividirlo el resto es 0
        System.out.println( (c % 5 == 0) ? c + " es múltiplo de 5" : c + " no es múltiplo de 5");
        System.out.println( (c % 10 == 0) ? c + " es múltiplo de 10" : c + " no es múltiplo de 10");
        //Para no tener que estar referenciando a c en cada condicional se puede poner por fuera de la condición
        //Para la condición no hace falta paréntesis Java toma todo lo que haya antes del "?"
        System.out.println( c + (c > 100 ? " es mayor que 100" : " es menor que 100"));
    }
}
