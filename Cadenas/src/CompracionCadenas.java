public class CompracionCadenas {
    public static void main(String[] args) {
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");
        System.out.print("cadena1 tiene la misma referencia de la cadena2: ");
        System.out.println(cadena1 == cadena2);

        System.out.print("cadena1 tiene la misma referencia de la cadena3: ");
        System.out.println(cadena1 == cadena3);

        System.out.print("cadena1 tiene el mismmo contenido de la cadena3: ");
        System.out.println(cadena1.equals(cadena3));
    }
}
