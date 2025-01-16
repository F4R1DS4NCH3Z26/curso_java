public class MasConcatenacionCadenas {
    public static void main(String[] args) {

        var  cadena1 = "Hola";
        var  cadena2 = "Mundo";

        var cadena3 = cadena1 + "  " + cadena2;
        System.out.println("cadena3 usando + = " + cadena3);

        cadena3 = cadena1.concat("  ").concat("Mundo");
        System.out.println("cadena3 usando concat = " + cadena3);

        var constructorCadenas = new StringBuilder();
        //constructorCadenas.append(cadena1);
        //constructorCadenas.append(" ");
        //constructorCadenas.append(cadena2);
        constructorCadenas.append(cadena1).append(" ").append(cadena2);
        var resultados = constructorCadenas.toString();
        System.out.println("resultados = " + resultados);
        
        
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        System.out.println("stringBuffer = " + stringBuffer);
        
        var resultado = String.join(cadena1,  " ", cadena2);
        System.out.println("resultado = " + resultado);
    }
}
