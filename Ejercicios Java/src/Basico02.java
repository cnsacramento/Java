/**
 * @author Christian Novo Sacramento
 */
/*
 Escribe un programa Java que realice lo siguiente: declarar dos variables X e Y de tipo int,
dos variables N y M de tipo double y asigna a cada una un valor. A continuación muestra por pantalla:
El valor de cada variable.
La suma  X + Y
La diferencia  X – Y
El producto  X * Y
El cociente  X / Y
El resto  X % Y
La suma  N + M
La diferencia  N – M
El producto  N * M
El cociente  N / M
El resto  N % M
La suma X + N
El cociente Y / M
El resto Y % M
El doble de cada variable
La suma de todas las variables
El producto de todas las variables
*/
public class Basico02 {
    public static void main(String[] args) {
        /*
        Las variables si son de un mismo tipo se pueden declarar juntas
        separadas por comas
        */
        int x = 4, y = 7;
        //Los decimales se representan con punto
        double n = 3.3,m = 5.2;
        //Aquí se realizan las operaciones de x e y
        System.out.println(x + " + " + y + "= " + (x+y));
        System.out.println(x + " - " + y + "= " + (x-y));
        System.out.println(x + " x " + y + "= " + (x*y));
        System.out.println(x + " / " + y + "= " + (x/y));
        System.out.println(x + " % " + y + "= " + (x%y));
        //Aquí se realizan las operaciones de n y m
        System.out.println(n + " + " + m + "= " + (n+m));
        System.out.println(n + " - " + m + "= " + (n-m));
        System.out.println(n + " x " + m + "= " + (n*m));
        System.out.println(n + " / " + m + "= " + (n/m));
        System.out.println(n + " % " + m + "= " + (n%m));
        //Aquí se realizan las operaciones variadas
        System.out.println(x + " + " + n + "= " + (x+n));
        System.out.println(y + " / " + m + "= " + (y/m));
        System.out.println(y + " % " + m + "= " + (y%m));
        //Aquí se realiza el doble de cada variable
        System.out.println("El doble de " + x + "es: " + (x*2));
        System.out.println("El doble de " + y + "es: " + (y*2));
        System.out.println("El doble de " + n + "es: " + (m*2));
        System.out.println("El doble de " + n + "es: " + (n*2));
        //Aquí se realiza la suma de todas las variables
        System.out.println(x + " + " + y + " + " + n + " + " + m + "= " + (x+y+n+m));
        //Aquí se realiza el producto de todas las variables
        System.out.println(x + " x " + y + " x " + n + " x " + m + "= " + (x*y*n*m));

        //Nota: Si se realiza las operaciones sin castear se coge el superior
    }
}
