import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("*** DIA DE LA SEMANA ***");
        System.out.println("Digite un dia (Debe ser un numero entero)");
        var dia = Integer.parseInt(consola.nextLine());
        switch (dia) {
            case 1 -> System.out.println("Es Lunes");
            case 2 -> System.out.println("Es Martes");
            case 3 -> System.out.println("Es Miercoless");
            case 4 -> System.out.println("Es Jueves");
            case 5 -> System.out.println("Es Viernes");
            case 6 -> System.out.println("Es Sabado");
            case 7 -> System.out.println("Es Domingo");
            default -> System.out.println("No es un dia valido");
        }
    }
}
