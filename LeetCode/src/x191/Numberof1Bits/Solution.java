package x191.Numberof1Bits;

public class Solution {

	public static int hammingWeight(int n) {
		int count = 0;
		while (n > 0) {
			if ((n  & 1) == 1)
				++count;
			n = n >>> 1;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingWeight(11));
		System.out.println(-3>>1);

	}

}
