import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

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
        } else if (this.preco < outro.preco) {
    	return -1;
        }
    }

    @Override
    public String toString() {
        return nome + preco;
    }
}

class CatalogoDeProdutos {
	private Map<String, List<Produto>> catalogo;
	
	public CatalogoDeProdutos() {
        this.catalogo = new HashMap<>();
    }
	
	public void adicionarProduto(String categoria, Produto produto) {
        if (!catalogo.containsKey(categoria)) {
        	catalogo.put(categoria, new ArrayList<>());
        }
        catalogo.get(categoria).add(produto);
    }
	public void listarProdutosPorCategoria(String categoria) {
        List<Produto> produtos = catalogo.get(categoria);
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}

class TesteCatalogo {
    public static void main(String[] args) {
    	CatalogoDeProdutos catalogo = new CatalogoDeProdutos();
        catalogo.adicionarProduto("A", new Produto("Aa", 6));
        catalogo.adicionarProduto("A", new Produto("Ab", 2));
        catalogo.adicionarProduto("B", new Produto("Ba", 5));
        catalogo.adicionarProduto("B", new Produto("Ba", 1));
        catalogo.listarProdutosPorCategoria("A");
    }
}