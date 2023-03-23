import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();
		
		pilha.push("Brenda");
		pilha.push("Guilherme");
		pilha.push("Michelle");
		pilha.push("Gabriel Lope");
		pilha.push("Katarina");
		
		
		for (var elementos : pilha)
			System.out.println(elementos);
		
		System.out.println("Retirar elemento: ");
		pilha.pop();
		System.out.println(pilha);
		
		pilha.add("Reinaldo");
		System.out.println(pilha);
		
		System.out.println(pilha.size());
		
		System.out.println(pilha.contains("Reinaldo"));
	}

}
