class EvenOdd {
	static void evenOrOdd(int number) {
		if (number%2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
	public static void main(String[] args) {
		evenOrOdd(3);
		evenOrOdd(4);
	}
}