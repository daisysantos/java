import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,###,##0.0");

		Scanner leia = new Scanner(System.in);

		double[][] matrizInteiros = new double [10][4];
		double soma = 0, media = 0;
		double [] mediaAluno = new double [10];
		
		for (int iLinha = 0; iLinha < matrizInteiros.length; iLinha ++) {
			for (int iColuna = 0; iColuna < matrizInteiros[iLinha].length; iColuna++) {
						System.out.println("Digite um número ");
						matrizInteiros[iLinha][iColuna] = leia.nextDouble();
			}
			
		}	
		
		for (int iLinha = 0; iLinha < matrizInteiros.length; iLinha++) {
			for (int iColuna = 0; iColuna < matrizInteiros[iLinha].length; iColuna++) {
				soma = soma + matrizInteiros[iLinha][iColuna];
			}
			media = soma / 4;
			mediaAluno[iLinha] = media;
			soma = 0;
			media = 0;
			
		}
			for (int indice = 0; indice < mediaAluno.length; indice ++) {
				System.out.println("Aluno " + (indice + 1) + ": " + mediaAluno[indice]);
			
			}
			}
		}
