package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer02 {

			public static void main(String[] args) {
			DecimalFormat df = new DecimalFormat("###,###,##0.0");	
			
			Scanner leia = new  Scanner (System.in);
			
			float nota1, nota2, nota3, nota4;
			
			System.out.println("Digite a Primeira Nota");
			nota1 = leia.nextFloat();
			
			System.out.println("Digite a Segunda Nota");
			nota2 = leia.nextFloat();
			
			System.out.println("Digite a Terceira Nota");
			nota3 = leia.nextFloat();
			
			System.out.println("Digite a Quarta Nota");
			nota4 = leia.nextFloat();
					               
	        					
			System.out.println("Média Final: " + df.format((nota1 + nota2 + nota3 + nota4)/4 ));
			leia.close();

	}

}

