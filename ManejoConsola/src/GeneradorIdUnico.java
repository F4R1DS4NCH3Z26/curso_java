import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class GeneradorIdUnico {
    public static void main(String[] args) {
        System.out.println("**** Sistema de ID Unico ****");

        var consola = new Scanner(System.in);
        var ramdom = new Random();

        System.out.print("Nombre: ");
        var nombre = consola.nextLine().toUpperCase();

        System.out.print("Apellido: ");
        var apellido = consola.nextLine().toUpperCase();

        System.out.print("Año de nacimiento: ");
        var año = consola.nextLine();

        var numberRandom = ramdom.nextInt(9999) + 1;
        var nombreIniciales = nombre.trim().substring(0, 2);
        var apellidoIniciales = apellido.trim().substring(0, 2);
        var añoI = año.trim().substring(2);
        var iniciales = nombreIniciales + "" + apellidoIniciales + "" + añoI + "" + String.format("%04d",numberRandom);


                var mensaje = """
                Hola, %s %s
                Su codigo: %s
                
                """.formatted(
                nombre,
                apellido,
                iniciales
        );

        System.out.println("mensaje = " + mensaje);
    }
}
