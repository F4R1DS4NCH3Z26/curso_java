public class PalabraBreakContinue {
    public static void main(String[] args) {
        System.out.println("*** Break y continue ***");

        System.out.println("\nPalabra break: ");
        for (int numero = 1; numero < 10; numero++) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
                break;
            }

        }

        System.out.println("\nPalabra continue: ");
        for (int numero = 1; numero < 10; numero++) {

            if (numero % 2 == 1) {
                continue;
            }
            System.out.print(numero + " ");

        }

    }
}
