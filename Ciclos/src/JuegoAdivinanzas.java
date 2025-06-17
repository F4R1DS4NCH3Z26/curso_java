import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) {
        System.out.println("*** Juego de adivinanzas ***");
        var random = new Random();
        var consola = new Scanner(System.in);
        var conteo = 0;
        var numeroRandom = random.nextInt(50) + 1;

        Integer numero;

        var validar = false;

        while (!validar) {
            System.out.print("Ingrese un numero para validar: ");
            numero = consola.nextInt();

            if (numero > numeroRandom) {
                System.out.println("Numero incorrecto, el numero es menor al que digitaste \n");

            } else if (numero < numeroRandom) {
                System.out.println("Numero incorrecto, el numero es mayor al que digitaste \n");

            } else {
                validar = true;

            }

            conteo++;
        }

        System.out.println("Numero correcto, tuviste " + conteo + " intentos");

    }
}
