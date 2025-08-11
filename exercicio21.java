import java.util.LinkedHashMap;
import java.util.Map;

public class exercicio21 {
    public static void main(String[] args) {
    	LinkedHashMap<Integer, String> produtos = new LinkedHashMap<>();
    	produtos.put(4, "B");
    	produtos.put(2, "C");
    	produtos.put(3, "E");
    	produtos.put(5, "A");
    	produtos.put(1, "D");
        for (Map.Entry<Integer, String> entry : produtos.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
