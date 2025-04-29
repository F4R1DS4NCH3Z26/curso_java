import java.util.Scanner;

public class IdentificaEstacionAño {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("*** Identifca la estacion del año ***");

        System.out.println("Porporciona un mes (Numero etero entre el 1 al 12): ");
        var mes = Integer.parseInt(consola.nextLine());

        if (mes == 1 || mes == 2 || mes == 12) {
            System.out.println("Es invierno");
        } else if (mes == 3 || mes == 4 || mes == 5) {
            System.out.println("Es Primavera");
        } else if (mes == 6 || mes == 7 || mes == 8) {
            System.out.println("Es verano");
        } else if (mes == 9 || mes == 10 || mes == 11) {
            System.out.println("Es Otoño");
        } else {
            System.out.println("Por favor digite un mes valido");
        }
    }
}
