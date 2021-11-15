class Compare {
	static void commonCharacters(String word1, String word2) {
		String shorterString;
		String longerString; 
		if (word2.length() > word1.length()) {
			shorterString = word1;
			longerString = word2;
		} else {
			shorterString = word2;
			longerString = word1;
		};

		String commonCharacters = "";
		String[] rand = shorterString.split(""); 
		for (String i:rand) {
			if (longerString.indexOf(i) >= 0) {
				commonCharacters += i;
			};
		}

		String[] commonCharactersSplit = commonCharacters.split("");
		commonCharacters = String.join(", ",commonCharactersSplit);
		System.out.println(String.format("Common Letters: %s", commonCharacters));


	}
	public static void main(String[] args) {
		commonCharacters("house","computers");
	}
}