import java.util.*;

public class MyArrays {
	public static void main(String... args) {
		var is = new int[30];
		Arrays.fill(is, 33);
		for(var i : is)
			System.out.print(i);
		System.out.println();
	}
}
