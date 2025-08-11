import java.util.Scanner;
import java.util.HashMap;

public class exercicio18 {
    public static void main(String[] args) {
    	Scanner leitor = new Scanner(System.in);
        HashMap<String, String> dicionario = new HashMap<>();
        dicionario.put("chave", "key");
        dicionario.put("ambiente", "environment");
        dicionario.put("deveras", "indeed");
        dicionario.put("faísca", "spark");
        dicionario.put("cicatriz", "scar");
        System.out.print("Digite uma palavra em português: ");
        String palavra = leitor.nextLine().toLowerCase();
        if (dicionario.containsKey(palavra)) {
            System.out.print("Tradução em inglês: " + dicionario.get(palavra));
        } else {
            System.out.print("Essa palavra não está no dicionário.");
        }
        leitor.close();
    }
}
