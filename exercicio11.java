import java.util.LinkedList;

public class exercicio11 {
    public static void main(String[] args) {
        LinkedList<String> fila = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
        	fila.addLast("João " + (i + 1));
        }
        System.out.println("Fila inicial: " + fila);
        for (int i = 0; i < 2; i++) {
        	fila.removeFirst();
        }
        for (int i = 0; i < 2; i++) {
        	fila.addFirst("Maria " + (i + 1));
        }
        System.out.print("Fila final: " + fila);
    }
}
