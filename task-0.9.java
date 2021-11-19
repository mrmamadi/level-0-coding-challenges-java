class Find {
	static String vowels(String sentence) {
		String[] allVowels = {"a","e","i","o","u"};
		String containedVowels = "";

		for (String i:allVowels){
			for (String j:sentence.toLowerCase().split("")) {
				if (i.equals(j)) {
					containedVowels += i;
				}
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