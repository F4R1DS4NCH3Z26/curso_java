public class CaracteresEspeciales {
    public static void main(String[] args) {
        //caracteres especiales
        // \n - imprime eun salto de linea
        var cadena1 = "Hola\nmundo";
        System.out.println("cadena1 = " + cadena1);

        // \t Tablador
        var cadena2 = "\tHola\tmundo";
        System.out.println("cadena2 = " + cadena2);

        // \' comilla simple
        var cadena3 = "Hola \' mundo";
        System.out.println("cadena3 = " + cadena3);

        // /" comillas dobles
        var cadena4 = "Hola \" mundo";
        System.out.println("cadena4 = " + cadena4);

        // // barra contraria
        var  cadena5 = "Hola \\ mundo";
        System.out.println("cadena5 = " + cadena5);
    }
}
