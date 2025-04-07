import java.util.Scanner;

public class ValorPositivo {
    public static void main(String[] args) {
        System.out.println("*** Validar si es el numero es positivo ***");

        var consola = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        var numero = Double.parseDouble(consola.nextLine());

        if (numero > 0 ) {
            System.out.println("Es un numero positivo");
        } else if (numero < 0) {
            System.out.println("Es un numero negaivo");
        } else {
            System.out.println("El numero es cero");
        }
    }
}
