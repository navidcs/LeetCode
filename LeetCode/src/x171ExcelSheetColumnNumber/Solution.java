package x171ExcelSheetColumnNumber;

public class Solution {

	public static int titleToNumber(String s) {
		// not 100% sure:
		char[] ch = s.toCharArray();
		int sum = 0;
		for (int n = ch.length - 1; n >= 0; --n) {
			int base = (int) Math.pow(26, ch.length - 1 - n);
			sum += (base * (int) (ch[n] - 'A' + 1));
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(titleToNumber("ZZ"));

	}

}
