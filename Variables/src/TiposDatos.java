public class TiposDatos {
    public static void main(String[] args) {
        //Tipos de datos
        //Enteros
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321012345678L;
        System.out.println("tipoLong = " + tipoLong);

        //Punto flotante
        float  tipoFloat = 3.14F;
        System.out.println("tipoFloat = " + tipoFloat);

        double tipoDouble = 3.1416D; // Es opcional la "D"
        System.out.println("tipoDouble = " + tipoDouble);



        //Caracter
        char tipoChar = 'A';
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        //Boolean
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        //Tipos Object
        String nombre = null;
        System.out.println("nombre = " + nombre);
        nombre = "Juan";
        System.out.println("nombre = " + nombre);

    }
}
