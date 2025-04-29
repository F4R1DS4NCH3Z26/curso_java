import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("*** Sistemas de envio ***");

        final var COSTO_TARIFA_NACIONAL = 10;
        final var COSTO_TARIFA_INTERNACIONAL = 20;

        System.out.print("Cual es el destido del paquete? (Nacional o Internacional): ");
        var destino = consola.nextLine();

        System.out.print("Cual es el peso del paquete? (En kilos): ");
        var peso = Double.parseDouble(consola.nextLine());
        Double valorTotal = switch (destino) {
            case "nacional" -> peso * COSTO_TARIFA_NACIONAL;
            case "internacional" -> peso * COSTO_TARIFA_INTERNACIONAL;
            default -> {
                System.out.println("Destino invalido");
                yield null;
            }
        };

        System.out.println("valorTotal = " + valorTotal);
    }
}
