package br.com.bytebank.banco.modelo;

public  abstract class Conta{
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private  static int total = 0;
	

	
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("o total de contas sao " + conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("criando uma nova conta "  +  this.numero);
	}
	
	 public  abstract void deposita(double valor);
	 
	public void saque(double valor) throws SaldoInsuficienteException{
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor );
		}
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino)  throws SaldoInsuficienteException{
		this.saque(valor); 
			destino.deposita(valor);
		
	}
	public double getSaldo() {
		return this.saldo;
	}
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero){
		if(numero <=0) {
			System.out.println("Nao pode valor menor <= 0 ");
			return;
		}
		this.numero = numero;
	}
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Nao pode valor menor a 0 ");
			return;
		}
		this.agencia = agencia;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public  int getTotal() {
		return Conta.total;
	}
	public  int setTotal() {
		return total; 
	}
}