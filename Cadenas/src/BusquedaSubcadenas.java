public class BusquedaSubcadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola mundo";
        var indece1 = cadena1.indexOf("Hola");
        System.out.println("indece1 = " + indece1);
        var indece2 = cadena1.lastIndexOf("mundo");
        System.out.println("indece2 = " + indece2);
        
        var indice3 = cadena1.indexOf("java");
        System.out.println("indice3 = " + indice3);
    }
}
