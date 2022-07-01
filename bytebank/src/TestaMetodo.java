
public class TestaMetodo {
		public static void main(String[] args) {
			conta contaDoPaulo = new conta(); 
			contaDoPaulo.saldo = 100;
			
			contaDoPaulo.deposita(50);
			System.out.println(contaDoPaulo.saldo);
			
			boolean conseguiSacar = contaDoPaulo.saque(20);
			System.out.println(contaDoPaulo.saldo);
			System.out.println(conseguiSacar);
			
			conta contaDaMarcela = new conta();
			contaDaMarcela.deposita(1000);
			
			boolean resultadoTransferencia =
					contaDaMarcela.transfere(300, contaDoPaulo);
			
			if (resultadoTransferencia) {
				System.out.println("Transferencia feita com sucesso!");
			} else {
				System.out.println("Transferencia não realizada!");
			}
			System.out.println(contaDaMarcela.saldo);
			System.out.println(contaDoPaulo.saldo);
			
			contaDoPaulo.titular = "Paulo Silveira";
			System.out.println(contaDoPaulo.titular);
			
}
}
