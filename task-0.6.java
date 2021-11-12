class Maximum {
	static int maximum(int... integers) {
		int highest = 0;
		for (int i:integers) {
			if (i > highest) {
				highest = i;
			}
		}
		return highest;	
		}
	public static void main(String[] args) {
		int testResult = maximum(1,22,3,2);
		System.out.println(testResult);
	}
}