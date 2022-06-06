package basic_java_concepts;

// import class Scanner
import java.util.Scanner;

public class InputDataScanner {

	public static void main(String[] args) {
		
		// Class to test Method Scanner
				
		// Instance Object
		Scanner sc = new Scanner(System.in);
				
		// How to use
		System.out.println("Programa de Soma");
		
		System.out.println("Insira o Primeiro Valor:");
		double valor1 = sc.nextDouble();
		
		System.out.println("Insira o Segundo Valor:");
		double valor2 = sc.nextDouble();
		
		double res = valor1 + valor2;

		System.out.println("O resultado é: " + res);
		
		sc.close();
		
	}

}
