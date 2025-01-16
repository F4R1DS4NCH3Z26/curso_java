public class GeneradorEmail {
    public static void main(String[] args) {

        var nombre_completo = "Farid Andres Sanchez Orozco";
        var empresa = "faso 2000";
        var extension = "com.co";
        
        var email = nombre_completo.replace(" ", ".").toLowerCase().concat("@").concat(empresa.replace(" ", "")).concat(".").concat(extension);
        System.out.println("email = " + email);
    }
}
