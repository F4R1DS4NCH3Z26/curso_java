import java.util.Scanner;

public class SistemasEmpleados {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Esbriba su nombre: ");
        var nombre_empleado = consola.nextLine();

        System.out.print("Esbriba su edad: ");
        var edad = Integer.parseInt(consola.nextLine());

        System.out.print("Esbriba su salario: ");
        var salario = Double.parseDouble(consola.nextLine());

        System.out.print("Esbriba es jefe de departamento: : ");
        var jefe_departamento =  Boolean.parseBoolean(consola.nextLine());
        System.out.println("");
        System.out.println("INFORMACION DEL EMPLEADO:");
        System.out.println("");
        System.out.println("- Nombre Empleado = " + nombre_empleado);
        System.out.println("- Edad = " + edad);
        System.out.println("- Salario = $%.2f".formatted(salario    ));
        System.out.println("- Jefe Departamento = " + jefe_departamento);



    }
}
