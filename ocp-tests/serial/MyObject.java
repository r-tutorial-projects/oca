import java.io.*;


class MyObject implements Serializable {
	String s;
	transient String t;

	MyObject(String s, String t) {
		this.s = s;
		this.t = t;
	}

	public String toString() {
		return "MyObject: {s=" + this.s + ", t=" + this.t + "}";
	}
}
