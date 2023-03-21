import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		 int numero, idade, sexo, genero = 0, esporte, contador = 0, futebolFeminino = 0, maiores18Volei = 0, gamesTNBF = 0;
	        char continua = 'S';

	        while (continua == 'S') {
	            System.out.println("Digite sua idade: ");
	            idade = leia.nextInt();
	            
	            do {

	            System.out.println("Digite o gênero (1-M/2-F/3-T/4-NB): ");
	            sexo = leia.nextInt();
	            
	            } while  (sexo <1 || sexo >4);

	            if (sexo == 3 || sexo == 4) {
	                System.out.println("Digite o gênero com o qual se identifica (1-M/2-F): ");
	                genero = leia.nextInt();
	            }

	            System.out.println("Digite seu esporte favorito (1-Futebol/2-Voleibol/3-Basquete/4-Games): ");
	            esporte = leia.nextInt();

	            contador++;

	            if (sexo == 2 && esporte == 1)
	                futebolFeminino++;

	            if (idade >= 18 && esporte == 2)
	                maiores18Volei++;

	            if ((sexo == 3 || sexo == 4) && genero == 2 && esporte == 3)
	                gamesTNBF++;

	            genero = 0;

	            System.out.println("Deseja continuar (S/N)? ");
	            continua = leia.next().toUpperCase().charAt(0);
	        }

	        System.out.println("Total de fichas preenchidas: " + contador);
	        System.out.println("Total de pessoas do sexo feminino que " + " gostam de futebol: " + futebolFeminino );
	        System.out.println("Total de pessoas maiores de 18 anos que " + " gostam de volei: " + maiores18Volei);
	        System.out.println("Total de pessoas Trans e não binárias que" + " se identificam com o gênero: " + gamesTNBF);

	}}