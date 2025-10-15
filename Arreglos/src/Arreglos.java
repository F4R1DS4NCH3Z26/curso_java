import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("*** Arreglos ***");
        System.out.println("Proporciona el largo del arreglo: ");

        var largoArreglo = Integer.parseInt(consola.nextLine());

        var enteros = new int[largoArreglo];

        for (int i = 0; i < largoArreglo; i++) {
            System.out.print("Proporciona enteros[" + i + "] =");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }

        //Imprimir los valares del arreglos
        for (int i = 0; i < largoArreglo; i++) {
            System.out.println("Valor del indice: " + i + " = " + enteros[i]);
        }


        //int[] enteros = {100, 200, 300, 400};
        //var enteros = new int[]{100, 200, 300, 400};

        //for (int i = 0; i < enteros.length; i++) {
        //    System.out.println("Valor del indice: " + i + " = " + enteros[i]);
        //}


    }
}
