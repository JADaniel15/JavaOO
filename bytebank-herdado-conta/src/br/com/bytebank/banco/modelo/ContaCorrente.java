package br.com.bytebank.banco.modelo;

import java.io.Serializable;

public class ContaCorrente extends Conta implements Tributavel, Serializable {
	
	public ContaCorrente(int agencia, int numero){
		super(agencia, numero);
	}
	@Override
	public void saque(double valor) throws SaldoInsuficienteException {
		double valorSacar = valor + 0.2;
		super.saque(valorSacar);
	}
	@Override
	public void deposita(double valor) {
		super.saldo += valor ;
		
	}
	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	@Override
	public String toString() {
		
		return "ContaCorrente," + super.toString();
	}
}
