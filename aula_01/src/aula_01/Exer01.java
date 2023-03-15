package aula_01;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner leia = new  Scanner (System.in);
		
		float salario, abono;
		
		System.out.println("Digite o Salário");
		salario = leia.nextFloat();
				               
        System.out.println("Digite o Abono");
        abono = leia.nextFloat();
				
		System.out.println("Novo Salário: " + (salario + abono));
		leia.close();

	}

}
