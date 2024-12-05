public class Cadenas {
    public static void main(String[] args) {
        System.out.println("*** Manejo de Cadenas en Jave ***");
        var cadena1 = "Yo soy Alphrius";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = new String(", y esto es una mentira");
        System.out.println("cadena2 = " + cadena2);
        var cadena3  = cadena1 + "" + cadena2;
        System.out.println("cadena3 = " + cadena3);
        var cadena4 = """
               
               Larga vida 
               al Emperador
                """;
        System.out.println("cadena4 = " + cadena4);
    }
}
