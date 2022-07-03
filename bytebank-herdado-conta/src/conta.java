class conta{
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private  static int total = 0;
	

	
	public conta(int agencia, int numero) {
		conta.total++;
		//System.out.println("o total de contas sao " + conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("criando uma nova conta "  +  this.numero);
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
		if(this.saque(valor)) {
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
		return conta.total;
	}
	public  int setTotal() {
		return total; 
	}
}