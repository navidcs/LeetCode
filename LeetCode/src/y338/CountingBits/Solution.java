package y338.CountingBits;

public class Solution {

	public int[] countBits(int num) {
		int[] result = new int[num + 1];
		int p = 1;
		while (p <= num) {
			int base = p;
			while (base <= num) {
				int var = base;
				for (; var < base + p && var <= num; ++var) {
					++result[var];
				}
				base += 2 * p;
			}
			p *= 2;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] a = new Solution().countBits(5);
		for (int i : a) {
			System.out.println(i);
		}
	}

}
