import java.util.LinkedList;
import java.util.Queue;

public class exercicio24 {
    public static void main(String[] args) {
        Queue<String> impressao = new LinkedList<>();
        impressao.add("Documento1.pdf");
        impressao.add("Foto.png");
        impressao.add("Imagem.jpg");
        impressao.add("Documento2.pdf");
        impressao.add("Contas.xlsx");
        while (!impressao.isEmpty()) {
            System.out.println(impressao.poll());
        }
    }
}