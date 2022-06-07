package desafio2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculos {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite um numero ["+i+"]:");
			int n = readInt();
			
		}
		
		
	}
	
	public static String readString() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		} catch (IOException e) {
			throw new RuntimeException("Erro ao ler o dado do teclado");
		}
	}
	public static int readInt() {
		String str = readString();
		
		try {
			return Integer.parseInt(str);
		} catch(NumberFormatException e) {
			throw new RuntimeException(str + " nao é um int válido");
		}
	}
}
