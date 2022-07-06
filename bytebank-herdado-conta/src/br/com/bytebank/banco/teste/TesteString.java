package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		
		String vazio = " alura ";
		String outrovazio = vazio.trim();
		
		System.out.println(vazio.contains("Alu"));
		System.out.println(outrovazio);
		
		String nome = "Alura";// objeto literal
		//String outro = new String("Alura");
		
		
		
		System.out.println(nome.length());
		for(int i =0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		 //String sub = nome.substring(1);
		// System.out.println(sub);
		
		//int pos = nome.indexOf("ur");
		//System.out.println(pos);
		
		//char c = nome.charAt(2);
		//System.out.println(c);
		
		
		//char c = 'A';
		//char d = 'a';
		
		//String outra = nome.replace("A","a");
		//String nos = nome.replace(d,c);
		
		//String teste = nome.toLowerCase();
		//String testa = nome.toUpperCase();
		
		//System.out.println(nome);
		//System.out.println(outra);
		//System.out.println(teste);
		//System.out.println(testa);
		//System.out.println(nos);
		
		String texto = "Socorram";
		texto = texto.concat("-");
		texto = texto.concat("me");
		texto = texto.concat(", ");
		texto = texto.concat("subi ");
		texto = texto.concat("no ");
		texto = texto.concat("ônibus ");
		texto = texto.concat("em ");
		texto = texto.concat("Marrocos");
		System.out.println(texto); 
		
		
	}

}
