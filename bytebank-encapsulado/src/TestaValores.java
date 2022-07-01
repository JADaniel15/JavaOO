
public class TestaValores {
	public static void main(String[] args) {
		conta conta = new conta(1337, 24226);
		
		conta.setAgencia(12313123);
		
		System.out.println(conta.getAgencia());
		
		System.out.println(conta.getTotal());
	}
}
