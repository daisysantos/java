import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
	
		
	Scanner leia = new Scanner(System.in);
	
	int numero;
	
	System.out.println("Mostre a tabuada do número: ");
	numero = leia.nextInt();
	
	
	for(int contador = 1; contador <= 10; contador ++) {
		System.out.println(numero + " x " + contador + " = " + (numero * contador));
		
	}	
	System.out.println("Taboada dos números pares: ");
		
	for(int contador = 1; contador <= 10; contador ++) {
		if(contador%2 == 0)
	System.out.println(numero + " x " + contador + " = " + (numero * contador));
		
	
	}	
		}

}

//1 é onde eu vou começar a contar e depois do ; a condicação se o contador for <= x ele para ; depois ele adiciona ++ para somar depois do 1 vira 2, 3 etc//