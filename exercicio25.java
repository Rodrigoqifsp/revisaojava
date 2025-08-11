import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args) {
        Deque<String> pilha = new ArrayDeque<>();
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Adicione um livro à pilha: ");
            pilha.push(leitor.nextLine());
        }
        System.out.println("Livro removido do topo: " + pilha.pop());
        System.out.println("Livro atualmente no topo: " + pilha.peek());
        leitor.close();
    }
}