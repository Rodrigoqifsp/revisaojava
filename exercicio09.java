import java.util.ArrayList;
import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
    	ArrayList<String> tarefas = new ArrayList<>();
    	Scanner leitor = new Scanner(System.in);
    	int escolha = 0;
    	while(escolha != 4) {
    		System.out.println("\nDigite:");
            System.out.println("1 para adicionar tarefa");
            System.out.println("2 para remover tarefa por índice");
            System.out.println("3 para listar tarefas");
            System.out.println("4 para encerrar o programa");
            System.out.print("Sua escolha: ");
            escolha = leitor.nextInt();
            leitor.nextLine();
            switch (escolha) {
            	case 1:
            		System.out.print("Digite a tarefa a ser adicionada: ");
                    String tarefa = leitor.nextLine();
                    tarefas.add(tarefa);
                    System.out.printf("Tarefa adicionada com índice %d\n", tarefas.size());
            		break;
            	case 2:
            		System.out.print("Digite o índice da tarefa a ser removida: ");
                    int indice = leitor.nextInt();
                    if (indice > 0 && indice <= tarefas.size()) {
                        tarefas.remove(indice - 1);
                        System.out.printf("Tarefa %d removida com sucesso!\n", indice);
                    } else {
                        System.out.println("Índice inválido!");
                    }
            		break;
            	case 3:
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa registrada");
                    } else {
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.printf("%d. %s\n", i + 1, tarefas.get(i));
                        }
                    }
            		break;
            	case 4:
            		System.out.println("Programa encerrado.");
            		break;
            	default:
            		System.out.println("Entrada inválida!");
            }
    	}
    	leitor.close();
    }
}
