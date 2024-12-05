public class DetalleProducto {
    public static void main(String[] args) {
        //Declaracion de variables
        String nombreProducto = "Naranja Japonesa";
        double precioProducto = 2500.50;
        int cantidadDisponible = 25;
        boolean isDisponible = true;

        //Impresion de las variables
        System.out.println("-------------- PRODUCTOS DE LA TIENDA --------------");
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("isDisponible = " + isDisponible);

        //Modificar variables
        nombreProducto = "Nranja Coreana";
        precioProducto = 2000.25;
        cantidadDisponible = 0;
        isDisponible = false;
        System.out.println("-----------------------------------------------------");

        System.out.println("");

        //Impresion de las variables modicadas
        System.out.println("------- ACTUALIZAC ION PRODUCTOS DE LA TIENDA -------");
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("isDisponible = " + isDisponible);
        System.out.println("-----------------------------------------------------");

    }
}
