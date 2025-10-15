public class Matrices {
    public static void main(String[] args) {
        //Definimos una matriz
        //int[][] matriz = new int[2][3];

        //final var COLUMNAS = 3;
        //final var FILAS = 2;
        var matriz = new int[][]{
                {100,200,300},
                {400,500,600}
        };

        //matriz[0][0] = 100;
        //matriz[0][1] = 200;
        //matriz[0][2] = 300;
        //matriz[1][0] = 400;
        //matriz[1][1] = 500;
        //matriz[1][2] = 600;

        for (var fil = 0; fil < matriz.length; fil++) {
            for (var col = 0; col < matriz[fil].length; col++) {
                System.out.println("Valor [" + fil + "][" + fil + "] = " + matriz [fil][col]);
            }
        }

    }
}
