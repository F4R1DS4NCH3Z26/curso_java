public class MetodosCadenas {
    public static void main(String[] args) {
        
        var cadena1 = "Farid & Nathalie";
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);

        var nuevaCaadena = cadena1.replace("a", "4");
        System.out.println("nuevaCaadena = " + nuevaCaadena);

        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);
        
        var miniculas = cadena1.toLowerCase();
        System.out.println("miniculas = " + miniculas);

        var cadena2 = "             | Sabes, siento algo, pero no se que es. Y no es algo bueno  |               ";
        System.out.println("cadena2 con espacio = " + cadena2);
        System.out.println("cadena2 sin espacio = " + cadena2.trim());
    }
}
