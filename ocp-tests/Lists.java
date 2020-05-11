import java.util.*;

public class Lists {
	public static void main(String... args) {
		var set = new LinkedList<String>();

		set.add("Hello");
		set.add("My");
		set.add("World");
		
		System.out.println(set);

		Collections.fill(set, "Banane");
		System.out.println(set);
		System.out.println(Collections.frequency(set, "Bana"));
	
		int i = 0;	
		System.out.println(Collections.nCopies(++i, ++i));
	}
}
