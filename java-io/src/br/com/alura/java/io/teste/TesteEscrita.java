package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		//fluxo de entrada com arquivo
		
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osr = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osr);
		
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.write("id est laborum");
		
		bw.close();
	}

}
