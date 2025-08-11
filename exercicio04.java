public class exercicio04 {
    public static void main(String[] args) {
    	int[] numeros = {1, 2, 3, 7, 8, 9};
    	int soma_impares = 0;
        for (int numero : numeros) {
            if((numero % 2) == 1) {
            	soma_impares += numero;
            }
        }
        System.out.printf("%d", soma_impares);
    }
}
