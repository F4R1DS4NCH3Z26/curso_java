public class SumaAcomulativa {
    public static void main(String[] args) {
        System.out.println(" *** Suma Acomulativa *** ");
        final var MAXIMO = 10;
        var acomuladorSuma = 0;

        var numero = 1;
        while (numero <= MAXIMO) {
            System.out.println("(acomuladorSuma + numero)  -> " + acomuladorSuma + " + " + numero);
            acomuladorSuma += numero++;
            System.out.println("Suma parcial acumulada = " + acomuladorSuma + "\n");
        }
        System.out.println("La suma de los numeros hasta: " + MAXIMO + " es de: " + acomuladorSuma);

    }
}
