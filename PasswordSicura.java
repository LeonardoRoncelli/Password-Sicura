import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Inserisci la password: ");
        String password=input.nextLine();
        boolean maiuscola=false;
        boolean minuscola= false;
        boolean cifra=false;
        boolean speciale=false;
        for (int i=0;i<password.length();i++){
            char carattere=password.charAt(i);
            if (Character.isUpperCase(carattere)){
                maiuscola=true;
            }else if (Character.isLowerCase(carattere)){
                minuscola = true;
            } else if (Character.isDigit(carattere)){
                cifra=true;
            } else {
                String specialCharacters= "!@#$%^&*()_+{}:\"<>?|[]\\;',./`~";
                if (specialCharacters.contains(Character.toString(carattere))) {
                    speciale=true;
                }
            }
        }
        if (maiuscola && minuscola && cifra && speciale) {
            System.out.println("La password è sicura");
        } else {
            System.out.println("La password non è sicura");
        }
    }
}
