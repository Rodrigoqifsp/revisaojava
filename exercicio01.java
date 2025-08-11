import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
    	float media = 0;
        Scanner leitor = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
        	System.out.printf("Nota da Prova %d: ", i+1);
            media += leitor.nextInt();
        }
        media /= 3;
        if(media >= 7) {
            System.out.printf("Aprovado");
        }
        else if(media >= 5 && media < 7) {
        	System.out.printf("Recuperação");
        }
        else if(media < 5) {
        	System.out.printf("Reprovado");
        }
        leitor.close(); 
    }
}
