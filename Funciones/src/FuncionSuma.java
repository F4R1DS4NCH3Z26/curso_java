import java.util.Scanner;

public class FuncionSuma {

    static double suma(double numero1, double numero2) {
        var resultado = numero1 + numero2;
        return resultado;
    }

    public static void main(String[] args) {
        double arg1 = 3, arg2 = 8;
        var resultadoSuma = suma(arg1, arg2);
        System.out.println(resultadoSuma);
    }
}
