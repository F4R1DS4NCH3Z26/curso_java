import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        System.out.println(" *** Sistema de prestamo de Libros *** ");

        var consola = new Scanner(System.in);
        final var DISTANCA_KM = 3;

        System.out.print(" ¿Usted cuenta con credencial de la biblioteca? : ");
        var credencial = Boolean.parseBoolean(consola.nextLine());

        System.out.print(" ¿A que distancia vive usted de la biblioteca (En kilometros)? : ");
        var distancia = Double.parseDouble(consola.nextLine());

        var resultado = credencial || distancia <= DISTANCA_KM;
        System.out.print(" ¿Aplica para el prestamo de libros? :" + resultado);




    }
}
