public class pow {

	public static double pow(double x, int n) {

		
		if (n == 0)
			return 1;
		if (x == 0)
			return 0;
		if (n < 0) {
			x = 1 / x;
			n = -n;
		}
		double result = 1;
		double partialResult = x;
		int actualPow = 0;
		int partialPow = 1;
		int partialN = n;
		while (actualPow != n) {

			while (partialPow * 2 <= partialN) {
				partialResult *= partialResult;
				partialPow *= 2;
			}
			result *= partialResult;
			actualPow += partialPow;
			partialN -= partialPow;
			partialPow = 1;
			partialResult = x;

		}

		return result;
	}

	public static void main(String[] args) {
		double i = 0.01;
		int j = 114748360;
		System.out.println(pow(i, j));
		System.out.println(Math.pow(i, j));

	}

}
