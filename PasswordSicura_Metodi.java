public class Main {
    public static void main(String[] args) {
        String password="PasswordSicura123";
        if (isSicura(password)) {
            System.out.println("La password è sicura");
        }
        else{
            System.out.println("La password non è sicura");
        }
    }
    public static boolean isSicura(String psw){
        if (psw.length() < 8){
            return false;
        }
        boolean contieneMinuscolo=false;
        boolean contieneMaiuscolo=false;
        boolean contieneNumero=false;
        for (char c : psw.toCharArray()) {
            if (Character.isLowerCase(c)) {
                contieneMinuscolo=true;
            } else if (Character.isUpperCase(c)) {
                contieneMaiuscolo=true;
            } else if (Character.isDigit(c)) {
                contieneNumero=true;
            }
        }
        return contieneMinuscolo && contieneMaiuscolo && contieneNumero;
    }
}