import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Produto {
    private int codigo;
    public String nome;
    protected double preco;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    private double calcularImposto() {
        return preco * 0.1;
    }
}

class AnalisadorDeClasse {
    public static void inspecionar(Object obj) {
        if (obj == null) {
            System.out.println("Objeto nulo!");
            return;
        }
        Class<?> classe = obj.getClass();

        System.out.println("Classe: " + classe.getName());

        System.out.println("\nAtributos:");
        Field[] campos = classe.getDeclaredFields();
        for (Field campo : campos) {
            campo.setAccessible(true);
            System.out.println(campo.getName());
        }

        System.out.println("\nMétodos:");
        Method[] metodos = classe.getDeclaredMethods();
        for (Method metodo : metodos) {
            metodo.setAccessible(true);
            System.out.println(metodo.getName());
        }
    }
}

public class exercicio31 {
    public static void main(String[] args) {
        Produto p = new Produto(101, "Notebook Gamer", 8500.0);
        AnalisadorDeClasse.inspecionar(p);
    }
}