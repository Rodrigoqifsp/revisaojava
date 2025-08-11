public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    public double getRaio() { return raio; }
    public double setRaio(double raio) {
    	if (raio <= 0) {
            throw new IllegalArgumentException("Raio deve ser positivo");
        }
    	this.raio = raio;
    }

    public double calcularArea() {
    	return Math.PI * (this.raio) * (this.raio);
    }
}
