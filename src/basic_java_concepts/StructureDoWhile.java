package basic_java_concepts;

import java.util.Scanner;

//Class to test Do While

// Fazer um programa para converter Celsius para Fahrenheit

public class StructureDoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		char resp;
		
		// structure DoWhile
		do {
			System.out.println("Insira a Temperatura em Celsius:");
			double temp = sc.nextDouble();
			temp = (9*temp/5)+32;
			System.out.println("Temperatura em Fahrenheit: "+temp);
			System.out.println("Deseja continuar? (s/n): ");
			resp = sc.next().charAt(0);
			
		} while(resp != 'n');
		
		sc.close();
		

	}

}
