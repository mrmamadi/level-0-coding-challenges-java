class Find {
	static String vowels(String sentence) {
		char[] allVowels = {'a','e','i','o','u'};
		String containedVowels = "";

		for (char i:allVowels) {
			if (sentence.toLowerCase().indexOf(i) > -1) {
				containedVowels += i;
			}
		}
		String[] vowelArray = containedVowels.split("");
		containedVowels = String.join(", ", vowelArray);

		String vowelString = String.format("Vowels: %s",containedVowels);
		return vowelString;
	}
	public static void main(String[] args) {
		String random = vowels("Umuzi");
		System.out.println(random);
	}
}