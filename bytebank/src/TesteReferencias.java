
public class TesteReferencias {
		
	public static void main(String[] args) {
		conta primeiraConta = new conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);
		
		conta segundaConta = primeiraConta;
		System.out.println("saldo da segunda conta:  " + segundaConta.saldo);
		segundaConta.saldo += 100;
		System.out.println("saldo da segunda conta:  " + segundaConta.saldo);
		
		System.out.println(primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("sao a mesma conta");
		}
		System.out.println(primeiraConta);
	}
}
