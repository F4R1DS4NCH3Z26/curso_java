public class FuncionEsPar {
    static String esPar(int numero) {
        var numeroEsPar = numero % 2;
        String mensaje;
        if (numeroEsPar > 0) {
            mensaje = "El numero diligenciado es impar";
        } else {
            mensaje = "El numero diligenciado es par";
        }
        return  mensaje;
    }

    public static void main(String[] args) {
        var resultado = esPar(3);
        System.out.println(resultado);

    }
}
