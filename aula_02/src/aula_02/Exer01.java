package aula_02;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int na, nb, nc, Result;
		
		System.out.println("Digite o valor de A: ");
		na = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		nb = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		nc = leia.nextInt();
		
		Result = (na + nb);
		
		if (Result == nc)
			System.out.println("A soma de A e B é igual ao valor de C!");
		else if(Result < nc)			
			System.out.println("A soma de A e B é menor que C!");
		else if(Result > nc)			
			System.out.println("A soma de A e B é maior que C!");
		
		
			
		leia.close();
	}

}
