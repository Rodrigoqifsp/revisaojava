import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class exercicio10 {
	public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int numero_aleatorio = random.nextInt(100) + 1;
            numeros.add(numero_aleatorio);
        }
        Collections.sort(numeros);
        System.out.print(numeros);
    }
}
