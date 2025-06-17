public class Arreglos {
    public static void main(String[] args) {
        System.out.println("*** Arreglos ***");

        //int[] enteros = {100, 200, 300, 400};
        var enteros = new int[]{100, 200, 300, 400};

        for (int i = 0; i < enteros.length; i++) {
            System.out.println("Valor del indice: " + i + " = " + enteros[i]);
        }
    }
}
