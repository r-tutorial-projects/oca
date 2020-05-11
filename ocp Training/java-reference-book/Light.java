class Light {
	public static void main(String... args) {
		long days;
		long distance;
		final int lightspeed = 299792;

		days = 10000;
		
		distance = lightspeed * (days * 24 * 60 * 60);

		System.out.println("The light will travel about " + distance + " kilometers in " + days + " days.");
	}

}
