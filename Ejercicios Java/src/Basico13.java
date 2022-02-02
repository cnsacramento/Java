import java.util.Scanner;

/**
 * @author Christian Novo Sacramento
 */
/*
Ejercicio 6. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
*/
public class Basico13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int velocidad_km_h;
        int velocidad_m_s;

        //Se pide la velocidad
        System.out.println("¿Cuántos km/h quieres pasar m/s?");
        velocidad_km_h = sc.nextInt();

        //Se hace la conversión
        //1 metro son 1000 km y 1 hora son 3600 segundos
        velocidad_m_s = (velocidad_km_h * 1000) / 3600;

        //Se muestra el resultado de la conversión
        System.out.println(velocidad_km_h + " km/h son: " + velocidad_m_s + " m/s.");
    }
}
