import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exer_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String cor ;
		ArrayList <String> cores = new ArrayList<String>();

			
			for(int c = 1;c < 6; c ++) {
				
			System.out.println("Digite a "+c+ " cor: ");
			cor = leia.next();
			cores.add(cor);
			
			}
			
			for(int c = 1;c < 6;c ++) {
				
				System.out.println("------------------");
				System.out.println("Lista de cores");
				System.out.println("------------------");
				System.out.println(cores);
				
				break;
			}
			
			Collections.sort(cores);
			System.out.println("\nOrdenar cores");
			
			for (String cCor : cores) {
	            System.out.println(cCor);
			}
			
			
		leia.close();
			
	
	
	
	
}

}