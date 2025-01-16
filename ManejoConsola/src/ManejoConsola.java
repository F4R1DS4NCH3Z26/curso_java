import java.util.Scanner;

public class ManejoConsola {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Introduzca algun texto");
        var linea = scanner.nextLine();
        System.out.println("La linea introducida: " + linea);
    }
}
