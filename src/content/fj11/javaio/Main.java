package content.fj11.javaio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		//CONFIGURA PARA ESCREVER NO ARQUIVO DE SAÍDA (cria um arquivo, e 'outputa' ela pra fora)
		Scanner scanner = new Scanner(System.in);
		OutputStream os = new FileOutputStream("saidaIO.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		String input = null;
		
		while (scanner.hasNextLine() && !(input = scanner.nextLine()).equals("exit")) {
			bw.write(input);
			bw.newLine();
		}
		scanner.close();
		bw.close();

		//CONFIGURA PARA LER ARQUIVO E IMPRIMIR (le um arquivo, e 'inputa' ele pra dentro)
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("saidaIO.txt")));
		while ((input = br.readLine()) != null) {
			System.out.println(input);
		}
		br.close();
	}
}