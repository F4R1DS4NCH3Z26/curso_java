public class TipoVar {
    public static void main(String[] args) {
        System.out.println("----------- Uso de var en Java -----------");

        String nombre1 = "Farid";
        System.out.println("nombre1 = " + nombre1);

        var nombre2 = "Nathalie";
        System.out.println("nombre2 = " + nombre2);

        var edad = 23;
        System.out.println("edad = " + edad);

        var sueldo = 2500.50F;
        System.out.println("sueldo = " + sueldo);

        var esCasado = true;
        System.out.println("esCasado = " + esCasado);
        // esCasado = "No"; ERROR

        // NO HACER:
        //var precio; ERROR
        //precio = 2500; ERROR
        //var apellido = null; ERROR

    }
}
