package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		//fluxo de entrada com arquivo
		
		/*
		 * OutputStream fos = new FileOutputStream("lorem2.txt"); Writer osr = new
		 * OutputStreamWriter(fos); BufferedWriter bw = new BufferedWriter(osr);
		 */
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.write(System.lineSeparator());
		bw.write(System.lineSeparator());
		bw.write("id est laborum");
		
		bw.close();
	}

}
