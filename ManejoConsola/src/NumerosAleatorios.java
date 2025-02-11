import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {

        var random = new Random();

        var numeroAleatorio = random.nextInt(10);
        System.out.println("numeroAleatorio del 0 al 9 = " + numeroAleatorio);

        numeroAleatorio = random.nextInt(10) + 1;
        System.out.println("numeroAleatorio del 1 al 10 = " + numeroAleatorio);

        var flotanteAleatorio = random.nextFloat();
        System.out.println("flotanteAleatorio de 0.1 al 1.0 = " + flotanteAleatorio);

        numeroAleatorio = random.nextInt(6) + 1;
        System.out.println("Dados = " + numeroAleatorio);
    }
}
