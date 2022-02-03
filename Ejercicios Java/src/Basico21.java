import java.util.Scanner;

/**
 * @author Christian Novo Sacramento
 */
/*
Programa que calcule el precio de venta de un producto conociendo el precio por unidad (sin IVA) del producto,
 el número de productos vendidos y el porcentaje de IVA aplicado. Los datos anteriores se leerán por teclado. 
*/
public class Basico21 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double precioUnidad, productosVendidos;
        double iva;

        //Se solicitan los datos
        System.out.println("¿Cuánto es el precio por unidad?");
        precioUnidad = sc.nextInt();
        System.out.println("¿Cuál es el número de productos vendidos?");
        productosVendidos = sc.nextInt();
        System.out.println("¿Cuál es el porcentaje del IVA?");
        iva = sc.nextDouble();

        //Se calcula el precio de venta
        double ivaPrecioVenta = (precioUnidad * productosVendidos) * (iva/100);
        double precioVentaConIva = (precioUnidad * productosVendidos) + ivaPrecioVenta;

        //Se muestra el resultado
        System.out.println(); //Para hacer un salto de línea y que no aparezca junto
        System.out.println("FACTURA");
        System.out.println("=======");
        System.out.println("El total del iva aplicado es: " + ivaPrecioVenta);
        System.out.println("El precio total de venta con iva es: " + precioVentaConIva);
    }
}
