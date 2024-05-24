package ejercicio001.main001;

import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        double ventas[] = new double[30];
        Scanner sc = new Scanner(System.in);

        System.out.println("        Ingrese las 30 ventas del mes: ");

        for(int i = 0; i<ventas.length; i++){
            System.out.println("Ingrese el valor " + (i+1) + "-->  ");
            ventas[i] = sc.nextDouble();
        }

        int count = 0;
        for (int i = 0; i<ventas.length; i++){
            if(ventas[i] > 2000){
                System.out.println("La venta No. " + (i+1) + " es mayor a $2000");
                count++;
            }
        }

        System.out.println("Se hicieron un total de ventas mayores a $2000 de: " + count);
    }
}
