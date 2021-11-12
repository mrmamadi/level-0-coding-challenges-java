class ConvertTime {
	static String convertTime(int time) {
		String hours = Integer.toString(time/60);
		if (hours.equals("1")) {
			hours = String.format("%s hour,",hours);
		} else {
			hours = String.format("%s hours,",hours);
		}

		String minutes = Integer.toString(time%60);
		if (minutes.equals("1")) {
			minutes = String.format("%s minute.", minutes);
		} else {
			minutes = String.format("%s minutes.", minutes);
		}

		String convertedTime = String.format("%s %s",hours, minutes);
		return convertedTime;
	}
	public static void main(String[] args) {
		String convertedTime = convertTime(71);
		System.out.println(convertedTime);
	}
}