import java.util.*;

public class AccountMap {
	public static void main(String... args) {
		Comparator<String> comp = (a,b) ->  {                                                                                                                                           var ar = a.split(" ");                                                                                                                                                             var br = b.split(" ");                                                                                                                                                                                                                                                                                                                                                System.out.println("a[" + a + "] compared to b[" + b + "] = " + ar[ar.length - 1].compareTo(br[br.length - 1]));                                                                                                                                                                                                                                                      return ar[ar.length - 1].compareTo(br[br.length - 1]);                                                                                                                     };

		var map = new TreeMap<String, Double>(comp.thenComparing((a,b) -> a.compareTo(b)));
		
		map.put("Peter Arbeitsloser", 30.);
		map.put("Rubeen Vitt", 333.);
		map.put("Alisa Vitt", 10000.);
		map.put("Anne Annemarie", 10.);
		map.put("Arnold Peter", 11.);
		map.put("Alisa Amendt", 4444.);

		for(var entry : map.entrySet())
			System.out.println(entry);
	}
}
