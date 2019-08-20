package exercicio;

public class Conta {
	private int numeroConta;
	private String titular;
	protected double saldo;
	private int menino = 0;
	
	public Conta() {
		
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void sacar(double valor) {
		this.saldo -= valor *0.05;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public String toString() {
		return  "Account " + getNumeroConta() + "," + "Holder: " + getTitular() + ", Balance: $" + getSaldo(); 
	}
	
	
}
