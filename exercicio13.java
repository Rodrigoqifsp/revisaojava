import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class exercicio13 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        for (int i = 0; i < 10; i++) {
        	numeros.add(2);
        }
        for (int i = 0; i < 3; i++) {
        	numeros.add(3);
        }
        System.out.println("Lista original: " + numeros);
        Set<Integer> sem_duplicatas = new HashSet<>(numeros);
        System.out.print("Lista sem duplicatas: " + sem_duplicatas);
    }
}
