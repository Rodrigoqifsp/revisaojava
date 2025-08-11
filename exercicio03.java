import java.util.Scanner;
import java.util.Random;

public class exercicio03 {
    public static void main(String[] args) {
    	int numero_adivinhado = 0;
    	int numero_aleatorio = 0;
    	Scanner leitor = new Scanner(System.in);
    	Random random = new Random();
    	numero_aleatorio = random.nextInt(100) + 1;
    	System.out.print("Adivinhe um número de 1 a 100");
    	while(numero_adivinhado != numero_aleatorio) {
    		System.out.print("\nAdivinhe o número: ");
    		numero_adivinhado = leitor.nextInt();
    		if(numero_adivinhado > numero_aleatorio) {
    			System.out.print("Muito alto");
    		}
    		else if (numero_adivinhado < numero_aleatorio){
    			System.out.print("Muito baixo");
    		}
    	}
    	System.out.print("Você acertou!");
    	leitor.close();
    }
}
