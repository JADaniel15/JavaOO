package br.com.bytebank.banco.teste.util;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		Integer idadeRef =  Integer.valueOf(29);// autoboxing
		System.out.println(idadeRef.intValue()); //unboxing
		
		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());
		
		Boolean bRef = Boolean.TRUE;
		System.out.println(bRef.booleanValue());

	}

}
