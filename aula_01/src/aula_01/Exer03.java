package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer03 {
		
		public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
			
		Scanner leia = new  Scanner (System.in);
		
		float salarioBruto, adicionalNoturno, horaExtras, descontos;
		
		System.out.println("Digite o Salário");
		salarioBruto = leia.nextFloat();
				               
        System.out.println("Digite Adicional Noturno");
        adicionalNoturno = leia.nextFloat();
        
        System.out.println("Digite Hora Extra");
        horaExtras = leia.nextFloat();
        
        System.out.println("Digite Desconto");
        descontos = leia.nextFloat();
				
         
        System.out.println("Salário Líquido: " + df.format((salarioBruto + adicionalNoturno + (horaExtras *5) - descontos)));
		leia.close();
		

	}

}
