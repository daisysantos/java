import java.util.Scanner;
import java.util.Stack;

public class Exer_04 {

	public static void main(String[] args) {
		Stack<String> livros = new Stack<String>();
        Scanner leia = new Scanner(System.in);
        
        int opcao = -1;
        while (opcao != 0) {
        	System.out.println("**************");
            System.out.println("1: Adicionar um novo livro na pilha\n");
            System.out.println("2: Listar todos os livros da Pilha\n");
            System.out.println("3: Retirar um livro da pilha\n");
            System.out.println("0: O programa deve ser finalizado.\n");
            System.out.println("**************");
            System.out.print("\nDigite uma opção: ");
            opcao = leia.nextInt();
            leia.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome: ");
                    String nome = leia.nextLine();
                    livros.push(nome);
                    System.out.println("\nPilha:");
                    for (String livro : livros) {
                        System.out.println(livro);
                    }
                    System.out.println("\nLivro adicionado!");
                    break;
                case 2:
                    System.out.println("\nLista de Livros na Pilha:");
                    for (String livro : livros) {
                        System.out.println(livro);
                    }
                    break;
                case 3:
                    if (livros.empty()) {
                        System.out.println("\nA Pilha está vazia!");
                    } else {
                        livros.pop();
                        System.out.println("\nPilha:");
                        for (String livro : livros) {
                            System.out.println(livro);
                        }
                        System.out.println("\nUm Livro foi retirado da pilha!");
                    }
                    break;
                case 0:
                    System.out.println("\nPrograma Finalizado!");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
            }
        }
        
        leia.close();
	
}


}