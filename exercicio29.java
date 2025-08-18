import java.util.LinkedList;

class HistoricoNavegador {
    private LinkedList<String> historico = new LinkedList<>();
    private int indice = -1;

    public void visitar(String url) {
        while (historico.size() > indice + 1) {
            historico.removeLast();
        }
        historico.add(url);
        indice++;
        System.out.println("Visitando: " + url);
    }
    public void voltar() {
        if (indice > 0) {
        	indice--;
            System.out.println("Voltando para: " + historico.get(indice));
        } else {
            System.out.println("Não é possível voltar mais.");
        }
    }
    public void avancar() {
        if (indice < historico.size() - 1) {
        	indice++;
            System.out.println("Avançando para: " + historico.get(indice));
        } else {
            System.out.println("Não é possível avançar mais.");
        }
    }
}