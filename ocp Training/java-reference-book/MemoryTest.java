import java.util.LinkedList;

class Box {
	double height, width, depth;

	@Override
	public String toString() {
		return "Box { height=" + height + "; width=" + width + "depth="+ depth  + "}";
	}
}

class BoxDemo {
	public static void main(String... args) {
		var l = new LinkedList<Box>();
		Box b = new Box();
		for(;;) l.add(new Box());
//		b.height = 11; b.width = 13; b.depth = 55;
//		System.out.println(b);
	}
}
