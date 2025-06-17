import java.util.Scanner;

public class CreacionValidacionPassword {
    public static void main(String[] args) {
        System.out.println("*** Creacion y validacion de password ****");
        var consola = new Scanner(System.in);
        var cumple = false;
        while (!cumple) {

            System.out.println("Digite su correo electronico: ");
            var correo = consola.nextLine();
            System.out.print("Digite su password: ");
            var password = consola.nextLine();

            if (password.length() == 6) {
                System.out.println("Password valida");
                cumple = true;
            }

        }
    }
}
