
public class ContaCorrente extends conta {
	
	public ContaCorrente(int agencia, int numero){
		super(agencia, numero);
	}
	@Override
	public boolean saque(double valor) {
		double valorSacar = valor + 0.2;
		return super.saque(valorSacar);
	}
	@Override
	public void deposita(double valor) {
		super.saldo += valor ;
		
	}
}
