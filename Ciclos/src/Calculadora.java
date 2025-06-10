import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        double operador1 = 0, operador2 = 0, resultado;
        var salir = false;

        while (!salir) {
            System.out.print("""
                    *** Calculadora en Java ***
                    Operacoiones que puedes realizar:
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Dividir
                    5. Salir
                    Escoge una opcion:\s
                    """);
            var opcion = consola.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.println("Primer valor: ");
                operador1 = consola.nextDouble();
                System.out.println("Segundo valor: ");
                operador2 = consola.nextDouble();
            }

            switch (opcion) {
                case 1 -> {
                    resultado = operador1 + operador2;
                    System.out.println("resultado = " + resultado);
                }
                case 2 -> {
                    resultado = operador1 - operador2;
                    System.out.println("resultado = " + resultado);
                }
                case 3 -> {
                    resultado = operador1 * operador2;
                    System.out.println("resultado = " + resultado);
                }
                case 4 -> {
                    resultado = operador1 / operador2;
                    System.out.println("resultado = " + resultado);
                }
                case 5 -> {
                    System.out.println("Saliendo del sistema. Hasta pronto!!");
                    salir = true;
                }
                default -> System.out.println("Escoja un valor valido, por favor");
            }
        }
    }
}
