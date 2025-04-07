public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println(" *** Operador Ternario *** ");
        var numero = 2;
        var resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("El numero " + numero + " es " + resultado);

        var edad = 18;
        var mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println("Tu edad es " + edad + " " + mensaje);

        var valor = -5;
        resultado = (valor > 0) ? "Positivo" : (valor < 0) ? "Negativo" : "Cero";
        System.out.println("Sua valor es " + resultado);
    }
}
