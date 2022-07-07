package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencia {

	public static void main(String[] args) {
		
		Object[] referencia= new Object[5];
		
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencia[0] =cc1;
		
		ContaPoupanca cc2 = new  ContaPoupanca(22, 22);
		referencia[1] =cc2;
		
		//Cliente cliente = new  Cliente();
		//referencia[2] = cliente;
		
		
		//System.out.println(cc2.getNumero());
		
		//Object referenciaGenerica = contas[1];
		
		//System.out.println(referenciaGenerica.getNumero());
		
		ContaPoupanca ref =(ContaPoupanca) referencia[1];
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
		
	}

}
