package basic_java_concepts;

import java.util.Scanner;

//Class to test Conditional Structure If in Java
public class ConditionalStructureIf {

	public static void main(String[] args) {
		
		//Software to Calculate Income Tax
		
		
		//Instance Object Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa. Em seguida, calcule e\r\n"
				+ "mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo. \n");
		
		System.out.println("Renda				Imposto de Renda            \n"
				+ "de 0 a R$ 2000,00      		isento \n"
				+ "de 2000,01 até 3000,00		8% \n"
				+ "de 3000.01 até 4500,00		18% \n"
				+ "acima de 4500,00		28% \n");
		
		//Variable Declaration
		System.out.println("Insira o Salario: ");
		double salario = sc.nextDouble();
		double imposto;
		
		
		// Conditional Structure to calculate Tax
		if (salario <= 2000.00) {
			System.out.println("Insento");
			
		} else if(salario <= 3000.00) {
			imposto = (salario - 2000.0) * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
			
		} else if(salario <= 4500.00) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
			
		} else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
			
		}
		
		//Close Object Scanner
		sc.close();

	}

}
