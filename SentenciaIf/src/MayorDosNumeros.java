import java.util.Scanner;

public class MayorDosNumeros {
    public static void main(String[] args) {
        System.out.println("*** El mayor de dos numeros ***");
         var consola = new Scanner(System.in);

        System.out.print("Digite el primer numero: ");
        var nuemero1 = Integer.parseInt(consola.nextLine());

        System.out.print("Digite el segundo numero: ");
        var nuemero2 = Integer.parseInt(consola.nextLine());

        var numero = (nuemero1 > nuemero2) ? "El numero mayor es: " + nuemero1 : (nuemero1 < nuemero2) ? "El numero mayor es: " + nuemero2 : "Los numeros son iguales";

        System.out.println(numero);
        /*if (nuemero1 > nuemero2) {
            System.out.println("El numero mayor es" + nuemero1);
        } else if (nuemero1 < nuemero2){
            System.out.println("El numero mayor es" + nuemero2);
        } else {
            System.out.println("Los numeros son iguales");
        }*/
    }
}
