public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("--- Formateo de Cadenas ---");
        var nombre = "Nathalie";
        var edad = 24;
        var salario = 21000.50;
        var numeroEmpleado = 12;

        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f", nombre, edad, salario);
        System.out.println(mensaje);


        mensaje = """
                %nDetalle Persona:\s
                --------------------
                \tNombre: %s
                \tEdad: %d años
                \tNumero de Empleado: %04d
                \tSalario: $%.2f
                """.formatted(nombre, edad, numeroEmpleado,salario);

        System.out.println(mensaje);
    }
}
