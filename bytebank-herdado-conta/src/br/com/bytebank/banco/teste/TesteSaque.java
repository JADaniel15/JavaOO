package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteSaque {
	public static void main(String[] args) {
		ContaCorrente conta  = new ContaCorrente(123, 321);
		
		conta.deposita(200.0);
		try {
			conta.saque(210.0);
		}catch(SaldoInsuficienteException ex) {
			System.out.println("Valor invalido " + ex.getMessage());
		}
		
		
		System.out.println(conta.getSaldo());
	}
}
