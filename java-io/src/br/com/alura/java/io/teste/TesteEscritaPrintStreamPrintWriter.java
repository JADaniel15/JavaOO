package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		//fluxo de entrada com arquivo
		
		/*
		 * OutputStream fos = new FileOutputStream("lorem2.txt"); Writer osr = new
		 * OutputStreamWriter(fos); BufferedWriter bw = new BufferedWriter(osr);
		 */
		
		//BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		//PrintStream ps = new PrintStream("lorem2.txt");//new PrintStream(new File("lorem2.txt");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println("id est laborum");
		
		ps.close();
	}



}
