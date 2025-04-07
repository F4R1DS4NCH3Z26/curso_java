public class SentenciaIf {
    public static void main(String[] args) {
        System.out.println(" *** Sentencai If *** ");

        var edad = 17;

        if (edad >= 13) {
            System.out.println(" Es mayor de edad ");
        } else if (edad <= 13 && edad > 18) {
            System.out.println(" Eres un adolecente ");
        } else {
            System.out.println(" Es menor de edad ");
        }
    }
}
