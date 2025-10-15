package aritmetica;

public class Aritmetica {
    int operador1;
    int operador2;

    public Aritmetica(int operador1, int operador2) {
        System.out.println("Ejecutando constructor");
        this.operador1 = operador1;
        this.operador2 = operador2;
    }

    public void sumar(){
        var resultado = this.operador1 + this.operador2;
        System.out.println("Resultado Suma: " + resultado);
    }

    public void restar(){
        var resultado = this.operador1 - this.operador2;
        System.out.println("Resultado Resta: " + resultado);
    }

    public void multiplicar(){
        var resultado = this.operador1 * this.operador2;
        System.out.println("Resultado Multiplicar: " + resultado);
    }


}
