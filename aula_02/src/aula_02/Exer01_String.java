package aula_02;

import java.util.Scanner;

public class Exer01_String {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		String result;
		int a = 1, b = 2, c = 3, d = 4, e =5, f = 6, pedido, quant;
				
			
		System.out.println("1- Cachorro Quente");
		System.out.println("2- X-Salada");
		System.out.println("3- X-Bacon");
		System.out.println("4- Bauru");
		System.out.println("5- Refrigerante");
		System.out.println("6- Suco de laranja");
		
		a = 10;
		b = 15;
		c = 18;
		d = 12;
		e = 8;
		f = 13;
		
			System.out.println("Insira o código do produto");
		pedido = leia.nextInt();
		
		System.out.println("Insira a quantidade do pedido");
		quant = leia.nextInt();
		
		
		switch (pedido) {
        case 1:
        	System.out.println("Cachorro - quente.\nTotal a pagar: " + (a * quant));
        	break;	
        case 2:
        	System.out.println("X-Salada.\nTotal a pagar: " + (b * quant));
            break;
        case 3:
        	System.out.println("X-Bacon.\nTotal a pagar:" + (c * quant));
        	break;
        case 4:
        	System.out.println("Bauru.\nTotal a pagar:" + (d * quant));
            break;
        case 5:
        	System.out.println("Refrigerante.\nTotal a pagar:" + (e * quant));
            break;
        case 6:
        	System.out.println("Suco de laranja.\nValor total:" + (f * quant));
            break;	
        default:
        	System.out.println("Produto não encontrado!");	
        
        
        	
        
		
	}

}}
