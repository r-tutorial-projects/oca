class Box {
	double height, width, depth;
	

	Box(double height, double width, double depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;

		System.out.println("Constructing: " + this);
	}
	
	double volume() {
		return height * width * depth;
	}
	
	@Override
	public String toString() {
		return "Box { height=" + height + "; width=" + width + "depth="+ depth  + "}";
	}
}

class BoxDemo {
	public static void main(String... args) {
		Box b = new Box(11, 12, 13);
		Box c = new Box(24, 23, 11);
		//b.height = 11; b.width = 13; b.depth = 55;
		//System.out.println(b);
	}
}
