import java.util.ArrayList;
import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        cidades.add("Guarulhos");
        cidades.add("São Paulo");
        System.out.print("Digite o nome de uma cidade para buscar: ");
        String cidade_busca = leitor.nextLine();
        if (cidades.contains(cidade_busca)) {
            System.out.println("Índice na lista: " + cidades.indexOf(cidade_busca));
        } else {
            System.out.println("Cidade não encontrada!");
        }
        leitor.close();
    }
}