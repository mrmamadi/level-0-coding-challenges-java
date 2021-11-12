import java.lang.Math;

class Area {
	static double areaOfTriangle(int side1, int side2, int side3) {
		double semiPerimeter = (side1 + side2 + side3) / 2.0;
		double radicand = semiPerimeter * (semiPerimeter-side1) * (semiPerimeter-side2) * (semiPerimeter-side3);
		double area = Math.sqrt(radicand);
		return area;
	}
	public static void main(String[] args) {
		double testResult = areaOfTriangle(4,3,5);
		System.out.println(testResult);
	}

}