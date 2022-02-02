/**
 * @author Christian Novo Sacramento
 */
/*
 Escribe un programa java que declare una variable B de tipo entero y asígnale un valor. 
 A continuación muestra un mensaje indicando si el valor de B es positivo o negativo.
  Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
Si por ejemplo B = 1 la salida será
1 es positivo
Si fuese por ejemplo B = -1 la salida será:
-1 es negativo
*/
public class Basico06 {
    
    public static void main(String[] args) {
        
        int b = -10;
        System.out.println( (b >= 0) ? b + " es un número positivo": b + " es un número negativo");
    }
}
