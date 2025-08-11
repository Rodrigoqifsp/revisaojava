import java.util.HashMap;
import java.util.Map;

public class exercicio19 {
    public static void main(String[] args) {
    	HashMap<String, Integer> frequencia = new HashMap<>();
    	String paragrafo = "palavra palavra, bla bla bla, e.";
        String[] palavras = paragrafo.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        for (String palavra : palavras) {
            if (!palavra.isEmpty()) {
                frequencia.put(palavra, frequencia.getOrDefault(palavra, 0) + 1);
            }
        }
        System.out.println("Frequência de cada palavra:");
        for (Map.Entry<String, Integer> entrada : frequencia.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
