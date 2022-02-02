import java.util.Scanner;

/**
 * @author Christian Novo Sacramento
 */
/*
Programa Java que calcule el área de un triángulo en función de las longitudes
de sus lados (a, b, c), según la siguiente fórmula:  
Area = RaizCuadrada(p*(p-a)*(p-b)*(p-c))
donde p =  (a+b+c)/2
*/
public class Basico16 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double ladoA,ladoB,ladoC;

        //Se solicitan las longitudes de los lados
        System.out.println("¿Cuánto mide el primer lado?");
        ladoA = sc.nextDouble();
        System.out.println("¿Cuánto mide el segundo lado?");
        ladoB = sc.nextDouble();
        System.out.println("¿Cuánto mide el tercer lado?");
        ladoC = sc.nextDouble();

        //Se halla la fórmula del área
        double perimetro = (ladoA + ladoB + ladoC) / 2;
        double area = Math.sqrt(perimetro * (perimetro * ladoA) * (perimetro * ladoB) * (perimetro * ladoC));

        //Se muestra el área
        System.out.println("El área del triángulo es: " + area);

    }
}
