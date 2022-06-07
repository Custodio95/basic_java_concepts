package basic_java_concepts;

import java.util.Scanner;

// Class to test Ternary Condition

public class TernaryCondition {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Produtos com valor abaixo de 20 reais desconto de 10%, acima de 20 reais 5%");
		System.out.println("Insira o valor do produto");
		
		double value = sc.nextDouble();
		
		//Ternary Condition
		double discount = (value < 20.0) ? value * 0.1 : value * 0.05;
		
		double finalvalue = value - discount;
		
		System.out.println("Desconto = " + discount);
		System.out.println("Valor Final = " + finalvalue);
		
		sc.close();
		

	}

}
