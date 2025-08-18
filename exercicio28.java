import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class exercicio28 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = leitor.nextLine();
        String[] palavras = frase.split("\\s+");
        Deque<String> pilha = new ArrayDeque<>();
        for (String palavra : palavras) {
            pilha.push(palavra);
        }
        for(String palavrase: pilha) {
        	System.out.print(palavrase + " ");
        }
        leitor.close();
    }
}
