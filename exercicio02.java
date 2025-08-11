import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
    	System.out.print("Digite um número inteiro:");
        int numero = leitor.nextInt();
        for(int i = 1; i <= 10; i++) {
        	System.out.printf("%d x %d = %d\n", numero, i, numero*i);
        }
        leitor.close(); 
    }
}
