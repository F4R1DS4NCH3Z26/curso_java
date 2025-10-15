import java.util.Scanner;

public class MatrizDinamica {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        int renglones, columnas;

        System.out.println("Proporciona los renglones: ");
        renglones = Integer.parseInt(consola.nextLine());

        System.out.println("Proporciona las columnas: ");
        columnas = Integer.parseInt(consola.nextLine());

        var matriz = new int[renglones][columnas];

        for (int ren = 0; ren < renglones; ren++) {
            for (int col = 0; col < columnas; col++) {
                System.out.println("Valor [" + ren + "][" + col + "]");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());

            }
        }

        for (int ren = 0; ren < renglones; ren++) {
            for (int col = 0; col < columnas; col++) {
                System.out.println("Valor [" + ren + "][" + col + "] = " + matriz [ren][col]);

            }
        }
    }
}
