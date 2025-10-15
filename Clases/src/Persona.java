public class Persona {
    String nombre;
    String apellido;

    void mostrarPersona() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellido = " + apellido);
    }

    public static void main(String[] args) {
        System.out.println("*** Creacion de clase y objeto Persona ***");
        var objeto1 = new Persona();
        objeto1.nombre = "Farid";
        objeto1.apellido = "Sanchez";
        objeto1.mostrarPersona();

        //Segunda persona
        var objeto2 = new Persona();
        objeto2.nombre = "Nathalie";
        objeto2.apellido = "Pelaez";
        objeto2.mostrarPersona();


    }
}
