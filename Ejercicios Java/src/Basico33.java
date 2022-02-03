import java.util.Scanner;

/*
Programa que lea una variable entera mes y compruebe si el valor corresponde a un mes de 30 días,
 de 31 o de 28. Supondremos que febrero tiene 28 días. Se mostrará además el nombre del mes.
  Se debe comprobar que el valor introducido esté comprendido entre 1 y 12.
*/
/**
 * @author Christian Novo Sacramento
 */
public class Basico33 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int mes;

        //Se solicita el mes
        System.out.printf("Introduzca el número del mes: ");
        mes = sc.nextInt();

        //Se comprueba que el número sea correcto
        if (mes < 0 || mes > 12) {
            System.out.println("ERROR!!! (El número del mes es incorrecto)");
        }else{
            //Como hay que mostrar el nombre del mes se puede hacer uso de un switch
            switch(mes) {
                case 1: System.out.print("El mes es: enero y "); //Se le quita el ln para que se junte con la cantidad de días
                    break; //Los break sirven para que no de lugar la siguiente instrucción
                case 2: System.out.print("El mes es: febrero y "); 
                    break;
                case 3: System.out.print("El mes es: marzo y ");
                    break;
                case 4:System.out.print("El mes es: abril y ");
                 break;
                case 5: System.out.print("El mes es: mayo y ");
                    break;
                case 6: System.out.print("El mes es: junio y ");
                    break;
                case 7: System.out.print("El mes es: julio y ");
                    break;
                case 8: System.out.print("El mes es: agosto y ");
                    break;
                case 9: System.out.print("El mes es: septiembre y ");
                    break;
                case 10:System.out.print("El mes es: octubre y ");
                    break;
                case 11: System.out.print("El mes es: noviembre y ");
                    break;
                case 12: System.out.print("El mes es: diciembre y ");
                    break;
                //Normalmente aquí va un default pero como se quito la opción que induce a error no hace falta
            }
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { //Los meses con 30 días son abril, junio, septiembre y noviembre
                System.out.println(" es un mes de 30 días"); 
            }else if(mes == 2) { //El único mes que tiene 28 es febrero, exceptuando los años bisiestos
                System.out.println(" es un mes de 28 días");
            }else { //El resto de meses tienen 31 días
                System.out.println(" es un mes de 31 días");
            }
        }
    }
}
