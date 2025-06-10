import java.util.Scanner;

public class AplicacionCjeroAutomatico {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;
        while (!salir) {
            System.out.print("""
                    *** Aplicacion de cajero automatico ***
                    1. Depositar
                    2. Retirar
                    3. Consultar
                    4. Salir
                    Escoge un opcion:\n
                    """);
            var opcion = consola.nextInt();
            var monto_inicial = 1000000;

            switch (opcion) {
                case 1 -> {
                    System.out.print("Valor a depositar: ");
                    var monto_depositar = consola.nextDouble();
                    monto_inicial += monto_depositar;
                    System.out.println("monto_nuevo = " + monto_inicial);
                }
                case 2 -> {
                    System.out.print("Valor a retirar: ");
                    var monto_retirar = consola.nextDouble();
                    if (monto_retirar > monto_inicial) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        monto_inicial -= monto_retirar;
                        System.out.println("monto_nuevo = " + monto_inicial);
                    }
                }
                case 3 -> {
                    System.out.println("Su monto = " + monto_inicial);
                }
                case 4 -> {
                    System.out.println("Saliendo de la aplicacion. Hasta pronto!!");
                    salir = true;
                }
                default -> System.out.println("Escoger una opcion valida");
            }
        }
    }
}
