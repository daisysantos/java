import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		
		Set<String> setFrutas = new HashSet<String>();
		
		setFrutas.add("Banana");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		setFrutas.add("Maçã");
		setFrutas.add("Morango");
		setFrutas.add("Pêra");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		setFrutas.add("KIWI");
		
		Iterator<String> isetFrutas = setFrutas.iterator();
				while (isetFrutas.hasNext()) {
					System.out.println(isetFrutas.next());
					
				}
		for(var fruta : setFrutas)
			System.out.println(isetFrutas.hashCode());
		System.out.println("Existe a fruta manda? " + setFrutas.contains("manda"));
		
		setFrutas.remove("Kiwi");
		
		for(var fruta : setFrutas)
			System.out.println(fruta);
			
		
	}

}
