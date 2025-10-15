import java.util.Scanner;

public class DiagonalMatriz {
    public static void main(String[] args) {
        System.out.println(" DIAGONAL MATRIZ ");

        int renglones, columnas;
        var consola = new Scanner(System.in);

        //Definimos matrices
        System.out.print("Digite los renglones: ");
        renglones = Integer.parseInt(consola.nextLine());

        System.out.print("Digite los columnas: ");
        columnas = Integer.parseInt(consola.nextLine());

        var matriz = new int[renglones][columnas];
        for (int ren = 0; ren < renglones; ren++) {
            for (int col = 0; col < columnas; col++) {
                System.out.println("Valor [" + ren + "][" + col + "]");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());

            }
        }

        System.out.println();
        var sumDiagonal = 0;
        for (int ren = 0; ren < renglones; ren++) {
            for (int col = 0; col < columnas; col++) {
                if (ren == col) {
                    sumDiagonal += matriz[ren][col];
                }
            }
        }
        System.out.println("sumDiagonal = " + sumDiagonal);
    }
}
