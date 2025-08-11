import java.util.TreeSet;
import java.util.Set;

public class exercicio16 {
	public static void main(String[] args) {
        Set<String> nomes = new TreeSet<>();
        nomes.add("E");
        nomes.add("A");
        nomes.add("D");
        nomes.add("B");
        nomes.add("C");
        for(String nome: nomes) {
        	System.out.println(nome);
        }
    }
}