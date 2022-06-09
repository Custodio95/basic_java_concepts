package basic_java_concepts;

import java.util.Scanner;

// Class to test For

/*Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o mostrar na tela N linhas,
come�ando de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o quadrado e o cubo do valor da linha*/

public class StructureFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		// Structure For
		for (int i=1;i<=n;i++) {
			System.out.println(i+" "+i*i+" "+i*i*i);	
		}
		
		sc.close();
		

	}

}
