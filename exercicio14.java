import java.util.HashSet;
import java.util.Set;

public class exercicio14 {
    public static void main(String[] args) {
        Set<String> emails = new HashSet<>();
        emails.add("1@1.com");
        for (int i = 0; i < 10; i++) {
        	emails.add("2@2.com");
        }
        System.out.println("E-mails registrados: " + emails);
        System.out.print("Total de e-mails: " + emails.size());
    }
}
