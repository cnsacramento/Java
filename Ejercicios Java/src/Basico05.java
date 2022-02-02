/*
 Escribe un programa java que declare una variable A de tipo entero y asígnale un valor.
A continuación muestra un mensaje indicando si A es par o impar. 
Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
Si por ejemplo A = 14 la salida será
14 es par
Si fuese por ejemplo A = 15 la salida será:
15 es impar
*/

public class Basico05 {
    
    public static void main(String[] args) {
        
        int a = 4;
        /*Se utiliza un operador ternario
        Dentro de paréntesis se pone la condición
        (En este caso se coge el módulo del número dividido entre 2 porque si es 0 es par y si no es impar)
        Seguido del paréntesis va un interrogante y se pone la primera condición y se separa con ":" de la 
        siguiente condición
        La primera condición sale si es cierto y la segunda si es incorrecto
        */
        System.out.println( (a % 2 == 0) ? a + " es par" : a + " es impar");
    }
}
