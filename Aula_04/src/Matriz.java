import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[][] matrizInteiros = { { 10, 15, 35 }, { 70, 120, 140 }, { 50, 100, 150 } };
		float numero;

		float matrizFloat[][] = new float[2][3];

		for (int indiceLinha = 0; indiceLinha < matrizInteiros.length; indiceLinha++) {
			for (int indiceColuna = 0; indiceColuna < matrizInteiros.length; indiceColuna++) {
				System.out.println(matrizInteiros[indiceLinha][indiceColuna]);
			}
		}
		for (int indiceLinha = 0; indiceLinha < matrizFloat.length; indiceLinha++) {
			for (int indiceColuna = 0; indiceColuna < matrizFloat[indiceLinha].length; indiceColuna++) {
				System.out.println("Digite um número: ");
				matrizFloat[indiceLinha][indiceColuna] = leia.nextFloat();

			}
		}
		for (int indiceLinha = 0; indiceLinha < matrizFloat.length; indiceLinha++) {
			for (int indiceColuna = 0; indiceColuna < matrizFloat[indiceLinha].length; indiceColuna++) {
				System.out.println(matrizFloat[indiceLinha][indiceColuna]);
			}
		}
		leia.close();
	}
}
