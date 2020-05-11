import java.io.*;

public class SerialTest {
	public static void main(String... args) throws Exception {
		try (var objectOut = new ObjectOutputStream(new FileOutputStream("myObj"));) {
			var o = new MyObject("Erster Text", "Zweiter Text");
			objectOut.writeObject(o);
		}

		try (var objectIn = new ObjectInputStream(new FileInputStream("myObj"));) {
			var o = objectIn.readObject();

			System.out.println(o);
		}
	}
}
