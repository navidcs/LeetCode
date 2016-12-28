package y419.BattleshipsinaBoard;

public class Solution {

	public int countBattleships(char[][] bsa) {
		int numberOfB = 0;
		for (int i = 0; i < bsa.length; ++i) {
			for (int j = 0; j < bsa[0].length; ++j) {
				if (bsa[i][j] == 'X') {
					if (j + 1 < bsa[0].length && bsa[i][j+1] == 'X') {
						while (++j < bsa[0].length && bsa[i][j] == 'X') {

						}
					} else {
						int tempi= i;
						while (++tempi < bsa.length && bsa[tempi][j] == 'X') {
							bsa[tempi][j] = '.';
						}
						
					}

					++numberOfB;
				}
			}
		}
		return numberOfB;
	}


	public static void main(String[] args) {
		char[][] a  = {{'X','.','X'},{'.','.','X'},{'.','.','X'}};
		System.out.println(new Solution().countBattleships(a));
	}

}
