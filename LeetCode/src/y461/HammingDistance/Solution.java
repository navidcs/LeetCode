package y461.HammingDistance;

public class Solution {

	public int hammingDistance(int x, int y) {
		int sum = 0;
		while (x > 0 || y > 0) {
			if (x % 2 != y % 2) {
				++sum;
			}
			x /= 2;
			y /= 2;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().hammingDistance(1, 4));
	}
}
