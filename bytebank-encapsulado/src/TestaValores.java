
public class TestaValores {
	public static void main(String[] args) {
		conta conta = new conta(1337, 24226);
		
		conta.deposita(200);
		
		System.out.println(conta.getSaldo());
		
		conta.setAgencia(570);
		
		System.out.println(conta.getAgencia());
		
		System.out.println(" o total de contas e : " + conta.getTotal());
		
		
		
	}
}
