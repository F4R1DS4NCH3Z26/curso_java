public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println(" *** Operaaciones de asignacion *** ");
        var numero1 = 10;
        int miNumero;
        numero1 = 15;

        System.out.println("Asignacion simple = " + numero1);

        numero1 += 2;
        System.out.println("Asignacion inclremental por suma = " + numero1);

        numero1 *= 2;
        System.out.println("Asignacion inclremental por multiplicacion = " + numero1);


        int a = 2, b = 3, c = 4;
        System.out.printf("a = %d, b = %d, c = %d", a, b, c);

    }
}
