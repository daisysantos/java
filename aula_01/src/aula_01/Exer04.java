package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,###,##0");	
		
		Scanner leia = new  Scanner (System.in);
		
		float numero1, numero2, numero3, numero4;
		
		System.out.println("Digite Numero 1");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite Numero 2");
		numero2 = leia.nextFloat();
		
		System.out.println("Digite Numero 3");
		numero3 = leia.nextFloat();
		
		System.out.println("Digite Numero 4");
		numero4 = leia.nextFloat();
				               
        					
		System.out.println("Calculo: " + df.format((numero1 * numero2) - (numero3 * numero4)));
		leia.close();

		

	}

}
