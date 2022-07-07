package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Object;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorContas {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Object cc = new ContaCorrente(22, 11);
		guardador.adiciona(cc);
		
		Object cc2 = new ContaCorrente(22, 22);
		guardador.adiciona(cc2);
		
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Object  ref = guardador.getReferencia(1);
		System.out.println(ref.getNumero());
	}

}
