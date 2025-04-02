public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println(" *** Operadores Unarios *** ");
        int a = 3, b = -2, resultado;
        System.out.println("Oprador de positivo");

        resultado = +a;
        System.out.println("resultado +a= " + resultado);

        resultado = ++a;
        System.out.println("resultado ++a= " + resultado);

        resultado = a++;
        System.out.println("resultado a++ = " + resultado);
        resultado = a + 2;
        System.out.println("resultado a++ incrementado = " + resultado);


        //Decremento

        resultado = -a;
        System.out.println("resultado -a = " + resultado);

        resultado = --b;
        System.out.println("resultado = " + resultado);

        resultado = b--;
        System.out.println("resultado b-- = " + resultado);
        resultado = b - 1;
        System.out.println("resultado b-- decrementado = " + resultado);



    }
}
