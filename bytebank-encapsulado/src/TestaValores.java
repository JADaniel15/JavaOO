
public class TestaValores {
	public static void main(String[] args) {
		conta conta = new conta(1337, 24226);
		
		conta.setAgencia(12313123);
		
		System.out.println(conta.getAgencia());
		
		conta conta2 = new conta(1337, 16549);
		conta conta3 = new conta(2112, 14660);
		
		System.out.println(conta.getTotal());
	}
}
