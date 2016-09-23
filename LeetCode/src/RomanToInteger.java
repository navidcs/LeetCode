public class RomanToInteger {
	public static int romanToInt(String s) {
		int result5;
		char[] arrayOfChars2 = new char[s.length()];
		int result2;
		char[] arrayOfChars22 = new char[s.length()];
		int result3;
		char[] arrayOfChars23 = new char[s.length()];

		int result;
		char[] arrayOfChars = new char[s.length()];

		arrayOfChars = s.toCharArray();

		result = 0;
		for (int i = 0; i < arrayOfChars.length; ++i) {
			switch (arrayOfChars[i]) {
			case 'M':
				result += 1000;
				break;
			case 'D':
				result += 500;
				break;
			case 'C':
				result += 100;
				if (i + 1 < arrayOfChars.length) {
					if ((arrayOfChars[i + 1] == 'D')
							|| arrayOfChars[i + 1] == 'M')
						result -= 200;
				}
				break;
			case 'L':
				result += 50;
				break;
			case 'X':
				result += 10;
				if (i + 1 < arrayOfChars.length) {
					if (arrayOfChars[i + 1] == 'L'
							|| arrayOfChars[i + 1] == 'C')
						result -= 20;

				}
				break;
			case 'V':
				result += 5;
				break;
			case 'I':
				result += 1;
				if (i + 1 < arrayOfChars.length) {
					if (arrayOfChars[i + 1] == 'V'
							|| arrayOfChars[i + 1] == 'X')
						result -= 2;
				}
				break;
			default:
				System.out.println("Invalid character!");
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("MCMLXXIV"));

	}

}
