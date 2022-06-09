package basic_java_concepts;

import java.util.Scanner;

// Class to test While

/* Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta � o valor 2002.*/


public class StructureWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha para acessar o sistema:");
		
		int pass = sc.nextInt();
		
		//Repetition Structure
		
			while (pass!=123) {
				System.out.println("Senha Inv�lida");
				pass = sc.nextInt();
			}
		
			System.out.println("Acesso Permitido");
		
		sc.close();
		

	}

}
