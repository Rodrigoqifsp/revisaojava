import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class exercicio27 {
	public static List<String> sortear(List<String> lista, int qtd_ganhadores) {
        Set<String> participantes_unicos = new HashSet<>(lista);
        List<String> lista_participantes_unicos = new ArrayList<>(participantes_unicos);
        Collections.shuffle(lista_participantes_unicos);
        return lista_participantes_unicos.subList(0, qtd_ganhadores);
    }
    public static void main(String[] args) {
        List<String> participantes = new ArrayList<>();
        participantes.add("A");
        participantes.add("B");
        participantes.add("A");
        participantes.add("C");
        participantes.add("C");
        participantes.add("D");
        participantes.add("E");
        List<String> ganhadores = sortear(participantes, 3);
        for (String participante : ganhadores) {
            System.out.println(participante);
        }
    }
}
