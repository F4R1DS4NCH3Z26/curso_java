    import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Introduzca su edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);
        
        System.out.print("Introduzca su altura en centimetro: ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);
        consola.nextLine();

        System.out.print("Introduzca su nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        System.out.print("Introduzca un numero entero: ");
        //var enteroString = consola.nextLine();
        //var entero = Integer.parseInt(enteroString);
        var entero = Integer.parseInt(consola.nextLine());
        System.out.println("entero = " + entero);

        System.out.println("Introduzca un valor flotante: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);

    }
}
