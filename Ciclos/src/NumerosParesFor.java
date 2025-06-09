public class NumerosParesFor {
    public static void main(String[] args) {
        System.out.println(" *** Ciclo For Numeros Pares *** " );
        for (int contador = 0; contador <= 20; contador++) {
            if (contador % 2 == 0) {
                System.out.println("contador = " + contador);
            }
        }
    }
}
