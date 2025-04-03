public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println(" *** Operacion de comparacion *** ");
        int a = 3, b = 2;

        // Igualdad ==
        var resultado = a == b;
        System.out.println("resultado  a == b : " + resultado);

        // Dsitinto !=
        resultado = a !=b;
        System.out.println("resultado  a != b : " + resultado);

        // Mayor que >
        resultado = a > b;
        System.out.println("resultado  a > b : " + resultado);

        // Mayor igual
        resultado = a >= b;
        System.out.println("resultado  a >= b : " + resultado);

        // Menor que
        resultado = a < b;
        System.out.println("resultado  a < b : " + resultado);

        // Menor igual
        resultado = a <= b;
        System.out.println("resultado  a <= b : " + resultado);
    }
}
