import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		
		int idade,sexo,categoria = 0,backend = 0,frontend = 0,mobile = 0,fullstack = 0,contador = 0;
		char continua = 'S';
		
		while(continua =='S') {
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
		
		System.out.println("Digite o seu sexo (1-F/2-M/3-Outros): ");
		sexo = leia.nextInt();
		
		System.out.println("Digite a sua categoria (1–Backend/2–Frontend/3–Mobile/4–FullStack: ");
		categoria = leia.nextInt();
		
		contador ++;
		
		if(categoria == 1)
			backend ++;
		
		if(sexo == 1 && categoria == 2)
			frontend ++;
		
		if(sexo == 2 && categoria ==3 && idade >40 )
			mobile ++;
		
		if(sexo == 1 && categoria ==4 && idade <30 )
			fullstack ++;
		
		System.out.println("Deseja continuar (S/N)? ");
		continua = leia.next().toUpperCase().charAt(0);
		}
		
		System.out.println("O número de pessoas desenvolvedoras Backend: " + backend);
		System.out.println("O número de mulheres desenvolvedoras Frontend: " + frontend);
		System.out.println("O número de homens desenvolvedores Mobile maiores de 40 anos: " + mobile);
		System.out.println("O número de mulheres desenvolvedoras FullStack menores de 30 anos: " + fullstack);

	}

}