package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class Wrapper {

	public static void main(String[] args) {
		  Integer idadeRef = 29;
		 // int primitivo = new Integer(21);
		  
		  List<Integer> lista = new ArrayList<>();
	        lista.add(idadeRef); //ok
	       // lista.add(primitivo); //autoboxing
	        
	        int i1 = lista.get(0);  //unboxing
	        Integer i2 = lista.get(1);  //ok

	        System.out.println(i1);  //29
	        System.out.println(i2); //21
	        
	        Integer valorRef = Integer.valueOf(33); // delegando a cria��o para m�todo valueOf
	        int valorPri = valorRef.intValue(); //desembrulhando, pegando o valor primitivo do objeto wrapper

	        System.out.println(valorPri); //33
	        
	        Integer iParseado1 = Integer.valueOf("42"); //parseando e devolvendo referencia
	        int iParseado2 = Integer.parseInt("44");  //parseando e devolvendo primitivo

	        System.out.println(iParseado1); //42
	        System.out.println(iParseado2); //44
	        


	}

}
