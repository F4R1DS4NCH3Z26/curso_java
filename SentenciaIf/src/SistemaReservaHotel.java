import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println(" *** Sistemas de reserva *** ");

        System.out.print("Nombre de Cliente:");
        var nombre_cliente = consola.nextLine();

        System.out.print("¿Cuantos dias de estadia?: ");
        var dias_estadia = Integer.parseInt(consola.nextLine());

        System.out.print("¿Cuarto con vista al mas? (true/false): ");
        var vista_mar = Boolean.parseBoolean(consola.nextLine());

        final var costo_cuarto = (vista_mar) ? 190.50 : 150.50;
        var costo_total_cuarto = dias_estadia * costo_cuarto;

        System.out.printf("""
                ---------RESERVACION---------------
                - Nombre del Cliente: %s          
                - Dias de estadia: %s             
                - ¿Cuarto con vista al mar? : %s  
                - Precio del cuarto: %.2f         
                -----------------------------------
                SALDO TOTAL : %.2f                
                -----------------------------------
                """, nombre_cliente, dias_estadia, vista_mar, costo_cuarto, costo_total_cuarto);




    }
}
