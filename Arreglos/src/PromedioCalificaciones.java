import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("Promedio de Calificaciones");
        var consola = new Scanner(System.in);

        System.out.print("Cuantas calificaciones quiere agregar: ");
        var cantidadCalifiaciones = Integer.parseInt(consola.nextLine());
        var calificaciones = new double[cantidadCalifiaciones];

        for (int i = 0; i < cantidadCalifiaciones; i++) {
            System.out.print("Proporciona la calificacion " + i + " = ");
            calificaciones[i] = Double.parseDouble(consola.nextLine());
        }
        double promedio = 0.0;

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Califiacion " + i + " = " + calificaciones[i]);
            promedio += calificaciones[i];

        }
        var sumaPromedio = promedio / cantidadCalifiaciones;
        System.out.println("Suma Promedio = " + sumaPromedio);



    }
}
