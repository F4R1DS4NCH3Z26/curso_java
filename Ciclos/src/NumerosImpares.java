public class NumerosImpares {
    public static void main(String[] args) {
        System.out.println("*** Numeros impares ***");
        var contador = 1;
        
        do {
            if (contador % 2 != 0) {
                System.out.println("contador : " + contador);
            }
            contador++;
        } while (contador <= 20);
    }
}
