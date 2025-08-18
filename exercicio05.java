class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getano() { return ano; }

    public void exibirInfo() {
    	System.out.printf("Marca: %s\nModelo: %s\nAno: %d\n", this.marca, this.modelo, this.ano);
    }
}
