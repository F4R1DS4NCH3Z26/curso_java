import java.util.Scanner;

public class IdentificaEstacionAnio {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("*** Identifca la estacion del año con Switch ***");

        System.out.println("Porporciona un mes (Numero etero entre el 1 al 12): ");
        var mes = Integer.parseInt(consola.nextLine());

        switch (mes) {
            case 1, 2, 12 -> System.out.println("Es invierno");
            case 3, 4, 5 -> System.out.println("Es Primavera");
            case 6, 7, 8 -> System.out.println("Es verano");
            case 9, 10, 11 -> System.out.println("Es Otoño");
            default -> System.out.println("Por favor digite un mes valido");
        }
    }
}
