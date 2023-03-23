import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exer_03 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>();
		
		byte opcao = 0;
		String nome;
		
		do {
				
			System.out.println("Digite uma das opções: ");
			System.out.println("1- Adicionar cliente na fila ");
			System.out.println("2- Listar todos os clientes da fila ");
			System.out.println("3- Chamar clientes da fila ");
			System.out.println("4- Finalizado");
			System.out.println("----------------------------");
			System.out.println("Entre com a opção desejada");
			
			opcao = entrada.nextByte();
			
			switch (opcao) {
				case 1:
					System.out.println("Digite o nome do cliente: ");
					entrada.nextLine();
					nome = entrada.nextLine();
					
					fila.add(nome);
										
					break;
				
				case 2:
					if (fila.isEmpty()) {
						System.out.println("Sem fila");
					}
					else {
						System.out.println("Clientes na fila: ");
						
						for (String elemento : fila) {
							System.out.println(elemento);
						}
						
					}
					
				
					break;
				
				case 3:
					if (fila.isEmpty()) {
						System.out.println("A fila está vazia!");
					}
					else {
						fila.poll();
						System.out.println("Cliente chamado com sucesso!\n\n");
					}
		
					break;
		
				default:
					if (opcao != 0) {
						System.out.println("Opção Inválida!");
					}
			}
			
		} while (opcao != 0);
		
		System.out.println("Programa finalizado!");
		
		entrada.close();

	}

}
