import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int somaPrincipal = 0, somaSecundaria = 0;
		String diagonalPrincipal = "", diagonalSecundaria = "";

		for (int iLinha = 0; iLinha < matriz.length; iLinha++) {
			for (int iColuna = 0; iColuna < matriz.length; iColuna++) {

				System.out.println("Digite um número: ");
				matriz[iLinha][iColuna] = leia.nextInt();

			}
		}

		for (int iLinha = 0; iLinha < matriz.length; iLinha++) {

			diagonalPrincipal += matriz[iLinha][iLinha] + " ";
			somaPrincipal += matriz[iLinha][iLinha];

			diagonalSecundaria += matriz[iLinha][matriz.length - 1 - iLinha] + " ";
			somaSecundaria += matriz[iLinha][matriz.length - 1 - iLinha];

		}

		System.out.println("Elementos da Diagonal Principal:\n");
		System.out.println(diagonalPrincipal);

		System.out.println("\n\nElementos da Diagonal Secundária:\n");
		System.out.println(diagonalSecundaria);

		System.out.println("\n\nSoma de todos Elementos da Diagonal Principal:\n");
		System.out.println(somaPrincipal);

		System.out.println("\n\nSoma de todos Elementos da Diagonal Secundária:\n");
		System.out.println(somaSecundaria);

		leia.close();

	}

}