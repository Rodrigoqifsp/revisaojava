public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
 
    public void depositar(double valor) {
    	 this.saldo += valor;
     }
    public void sacar(double valor) {
    	if(valor > this.saldo) {
    		throw new SaldoInsuficienteException("Saldo insuficiente");
    	}
    	else {
    		this.saldo -= valor;
    	}
    }
    public double getSaldo() { return saldo; }
}

public class TesteContaBancaria {
	public static void main(String[] args) {
	    ContaBancaria conta_teste = new ContaBancaria("Teste", 1);
	    try {
	    	conta_teste.sacar(2);
	    } catch (SaldoInsuficienteException e) {
	        System.out.println(e.getMessage());
	    }
	}
}