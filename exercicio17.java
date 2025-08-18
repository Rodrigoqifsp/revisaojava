import java.util.TreeSet;

class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto outro) {
        if (this.preco > outro.preco) {
            return 1;
        } else if (this.preco == outro.preco) {
            return this.nome.compareTo(outro.nome);
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return nome + preco;
    }
}

class TesteProduto {
    public static void main(String[] args) {
        TreeSet<Produto> produtos = new TreeSet<>();
        produtos.add(new Produto("A", 1));
        produtos.add(new Produto("B", 3));
        produtos.add(new Produto("C", 3));
        produtos.add(new Produto("D", 2));
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}