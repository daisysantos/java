import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero;
		int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		System.out.println("Digite um número: ");
		numero = leia.nextInt();

		for (int contador = 0; contador < vetorInteiros.length; contador ++) {
			if (vetorInteiros[contador] == numero)
				System.out.println("Posição [" + contador + "] = " + vetorInteiros[contador]);}

		if (numero > 10) {
			System.out.println("Numero " + numero + " não foi encontrado!");

		}
	}
}
