import java.util.Scanner;

public class CasaEspejos {
    public static void main(String[] args) {
        System.out.println(" *** Casa de Espejos *** ");
        var consola = new Scanner(System.in);

        System.out.print("Digite la edad: ");
        var edad = Integer.parseInt(consola.nextLine());

        System.out.print("Le teme a la oscuridad (true/false): ");
        var temorOscuridad = Boolean.parseBoolean(consola.nextLine());

        var valEdad = edad > 10;
        if (!valEdad && !temorOscuridad) {
            System.out.println("No puede entrar a la cas de espejos");
        } else {
            System.out.println("Puede entrar a la casa de espejos");
        }


    }
}
