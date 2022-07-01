class conta{
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	public conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("criando uma nova conta "  +  this.numero);
	}
	
	 public void deposita(double valor) {
		this.saldo += valor;
	}
	 
	public boolean saque(double valor){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} 
			return false;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero){
		if(numero <=0) {
			System.out.println("N�o pode valor menor <= 0 ");
			return;
		}
		this.numero = numero;
	}
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("N�o pode valor menor a 0 ");
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
	
}