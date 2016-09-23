public class PlusOne {
	public static int[] plusOne(int[] digits) {

		if (digits[digits.length - 1] != 9) {
			++digits[digits.length - 1];
			return digits;
		}

		for (int i = digits.length - 2; i > 0; i--) {
			digits[i + 1] = 0;
			++digits[i];

			System.out.println("intro: digits[" + i + "] = " + digits[i]);
			if (digits[i] != 10) {
				return digits;
			}

		}
		if (digits.length > 1)
			digits[1] = 0;
		++digits[0];

		if (digits[0] != 10) {

			return digits;

		}
		
		int[] newArray = new int[digits.length + 1];
		newArray[0] = 1;
		for (int i = 1; i < newArray.length; ++i)
			newArray[i] = 0;

		return newArray;

	}

	public static void main(String args[]) {
		int[] test = { 9, 9 };
		int[] result = plusOne(test);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}
}