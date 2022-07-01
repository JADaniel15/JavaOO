
public class TesteSaqueNegativo {
	public static void main(String[] args) {
		conta conta = new conta();
		conta.deposita(100);
		System.out.println(conta.saque(200));
		 
		conta.saque(101);
		System.out.println(conta.getSaldo());
	}

}
