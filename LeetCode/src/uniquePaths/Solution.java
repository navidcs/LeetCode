package uniquePaths;

public class Solution {
	public static int uniquePaths(int m, int n) {

//		if (m < 1 || n < 1) {
//			return 0;
//		}
		int[][] a = new int[m][n];
		for (int i = 0; i < m; ++i) {
			for (int k = 0; k < n; ++k) {
				if (i == 0) {
					a[0][k] = 1;
					
				}
				else if (k == 0) {
					a[i][0] = 1;
					
				}
				else 
					a[i][k] = a[i - 1][k] + a[i][k - 1];
			}
		}

		return a[m - 1][n - 1];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniquePaths(1, 2));
	}

}
