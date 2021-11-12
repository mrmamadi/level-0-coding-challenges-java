class Coversion {
	static double celsiusToFahrenheit(double temp) {
		double convertedTemp = temp * 9.0 / 5 + 32;
		return convertedTemp;
	};
	static double farhenheitToCelsius(double temp) {
		double convertedTemp = (temp - 32) * 5.0 / 9;
		return convertedTemp;
	};
	public static void main(String[] args) {
		double convertedCelsius = celsiusToFahrenheit(45.3);
		double convertedFahrenheit = farhenheitToCelsius(10);
		System.out.println(convertedCelsius);
		System.out.println(convertedFahrenheit);
	}
}