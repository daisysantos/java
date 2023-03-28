import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double largura  = sc.nextDouble();
		double comprimento = sc.nextDouble();;
		double mQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * mQuadrado;
		
		System.out.printf("Area: %.2f%n", area);
		System.out.printf("Preço: %.2f%n", preco);
		
		
		sc.close();
		
		
	}


}
