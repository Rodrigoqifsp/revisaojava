import java.util.LinkedHashSet;
import java.util.Set;

public class exercicio15 {
    public static void main(String[] args) {
        Set<String> semana = new LinkedHashSet<>();
        semana.add("Quarta");
        semana.add("Segunda");
        semana.add("Sexta");
        semana.add("Domingo");
        semana.add("Quinta");
        semana.add("Terça");
        semana.add("Sábado");
        for(String dia : semana) {
        	System.out.println(dia);
        }
    }
}