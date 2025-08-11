import java.util.TreeMap;
import java.util.Map;

public class exercicio22 {
    public static void main(String[] args) {
        TreeMap<String, Double> notas = new TreeMap<>();
        notas.put("B", 4.0);
        notas.put("C", 2.0);
        notas.put("E", 3.0);
        notas.put("A", 5.0);
        notas.put("D", 1.0);
        for (Map.Entry<String, Double> entry : notas.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
