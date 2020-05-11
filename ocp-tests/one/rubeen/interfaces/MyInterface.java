package one.rubeen.interfaces;

public interface MyInterface {
       	void sayHello();

	default void newHello() {
		System.out.println("Muss noch implementiert werden...");
	}
}
