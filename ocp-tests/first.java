public class first {
	public static void main(String[] args) {
		float value1 = 102;
		float value2 = (int) 102.0;
//		float value3 = 1f*0.0;
		float value4 = 1f*(short)0.0;
//		float value5 = 1f*(boolean)0.0;
//		System.out.println(value1);

		
		int x = 0;
		while (++x < 5) {x+=1;}
		String msg = x>5 ? "Greater than" : "Less than";
		System.out.println(msg+","+x);
	
	}
}
