class IfSample {
	public static void main(String... args) {
		
//		int _ = 11;
		int $ = 13;
		int _$ = 12;
		int $_ = 14;

		System.out.println("_ = "/* + _ */+ "; $ = " + $ + "; _$ = " + _$ + "; $_ = " + $_);  

		
		int x, y;
		x = 10;
		y = 20;

		if (x < y)
			System.out.println("x is smaller than y");
		x *= 2;
		if (x == y)
			System.out.println("x is equal to y");
		x *= 2;
		if (x > y)
			System.out.println("x is greater than y");

		if (x == y)
			System.out.println("x=" + x + "==" + y);
	}
}
