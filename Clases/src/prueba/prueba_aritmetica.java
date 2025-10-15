package prueba;

import aritmetica.Aritmetica;

public class prueba_aritmetica {

    public static void main(String[] args) {
        System.out.println("*** Operaciones aritmeticas ***");
        var obj = new Aritmetica(3, 2);

        System.out.println("Suma");
        obj.sumar();
        System.out.println();

        System.out.println("Resta");
        obj.restar();
        System.out.println();

        System.out.println("Multiplicar");
        obj.multiplicar();
        System.out.println();
    }
}
