import java.util.Scanner;

/*
Numero Binario: 	
1 1 0 1 0 1
Posición que ocupa cada dígito 	
5 4 3 2 1 0

Para pasar el número a decimal se multiplica cada dígito 
binario por 2 elevado a la posición que ocupa.
 La suma de todos los productos es el equivalente en decimal.
Sin array
*/
/**
 * @author Christian Novo Sacramento
 */
public class Basico57 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int binario;
        int conversorDecimal = 0;
        System.out.println("¿Qué número binario quieres convertir a Decimal?");
        binario = sc.nextInt();
        int copiaBinario = binario;
        int contadorCifras = 0;
        while(binario > 0) {
            binario = binario / 10;
            contadorCifras++;
        }
        System.out.println("Número cifras: " + contadorCifras);
        for (int i = contadorCifras; i > 0; i++) {
            conversorDecimal += (copiaBinario / 10) * (int)Math.pow(2, contadorCifras-1);
        }

        
        System.out.println("El número en decimal es: " + conversorDecimal);
    }
}
