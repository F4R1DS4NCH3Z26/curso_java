import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("*** Sistemas de calificaciones ***");

        System.out.print("Calificacion en numerica (0 - 10): ");
        var calificacion_numerica = Double.parseDouble(consola.nextLine());
        var calificacion = "";
        if (calificacion_numerica >= 9 && calificacion_numerica <= 10) {
            calificacion = "A";
        } else if (calificacion_numerica >= 8 && calificacion_numerica < 9) {
            calificacion = "B";
        } else if (calificacion_numerica >= 7 && calificacion_numerica < 8) {
            calificacion = "C";
        } else if (calificacion_numerica >= 6 && calificacion_numerica < 7) {
            calificacion = "D";
        } else if (calificacion_numerica >= 0 && calificacion_numerica < 6) {
            calificacion = "F";
        } else {
            calificacion = "Valor desconocido";
        }

        System.out.println("calificacion = " + calificacion);
    }
}
