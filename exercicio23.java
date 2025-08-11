import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
    	HashMap<String, String> agenda = new HashMap<>();
    	Scanner leitor = new Scanner(System.in);
    	int escolha = 0;
    	while(escolha != 4) {
    		System.out.println("\nDigite:");
            System.out.println("1 para adicionar contato");
            System.out.println("2 para buscar telefone por nome");
            System.out.println("3 para listar todos os contatos");
            System.out.println("4 para encerrar o programa");
            System.out.print("Sua escolha: ");
            escolha = leitor.nextInt();
            leitor.nextLine();
            switch(escolha) {
        	case 1:
        		System.out.print("Digite o nome do contato: ");
        		String nome = leitor.nextLine(); 
        		if(agenda.containsKey(nome)) {
        		    System.out.println("Esse nome já está na agenda!");
        		} else {
        		    System.out.print("Digite o número de telefone do contato: ");
        		    String telefone = leitor.nextLine();
        		    if(agenda.containsValue(telefone)) {
        		        System.out.println("Esse telefone já está cadastrado na agenda.");
        		    } else {
        		        agenda.put(nome, telefone);
        		        System.out.println("Contato adicionado com sucesso!");
        		    }
        		}
        		break;
        	case 2:
        		System.out.print("Digite o nome do contato a ser buscado: ");
                String nome_busca = leitor.nextLine();
                if(agenda.containsKey(nome_busca)) {
                    System.out.println("Telefone: " + agenda.get(nome_busca));
                } else {
                    System.out.println("Contato não encontrado.");
                }
        		break;
        	case 3:
                if(agenda.isEmpty()) {
                    System.out.println("Nenhum contato registrado.");
                } else {
                    for (Map.Entry<String, String> contato : agenda.entrySet()) {
                        System.out.println(contato.getKey() + " " + contato.getValue());
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
