package gameOfLife;

public class Solution {
	public void gameOfLife(int[][] board) {
		if (board.length == 0 || board[0].length == 0)
			return;
		int[][] temp = new int[board.length][board[0].length];
		for (int i = 0; i < board.length; ++i) {
			for (int k = 0; k < board[0].length; ++k) {
				if (board[i][k] == 0) {
					if (numberOfNeighbors(i, k, board) == 3){
						temp[i][k] = 1;
						System.out.println(i + " , " + k + " is alive!");
					}
					else
						temp[i][k] = 0;
				} else {
					if (numberOfNeighbors(i, k, board) == 2
							|| numberOfNeighbors(i, k, board) == 3) {
						temp[i][k] = 1;
					} else{
						temp[i][k] = 0;
						System.out.println(i + " , " + k + " is dead!");
					}

				}
			}
		}
		board = temp;
		show(board);
		System.out.println("temp[1][1] = "+ temp[0][0]);
		System.out.println("board[1][1] = "+ board[0][0]);
	}

	public int numberOfNeighborsOld(int i, int k, int[][] board) {
		int result = 0;
		int row = i - 1;
		int column = k - 1;
		for (int a = 0; a < 3; ++a) {
			if (row < 0)
				row += board.length;
			if (row >= board.length)
				row -= board.length;
			for (int b = 0; b < 3; ++b) {
				if (column < 0)
					column += board[0].length;
				if (column >= board[0].length)
					column -= board[0].length;
				if (board[row][column] == 1)
					++result;
				++column;
			}
			++row;
		}
		if (board[i][k] == 1)
			--result;
		return result;
	}


    public static int numberOfNeighbors(int i, int k, int[][] board){
	int result = 0;
	for(int row = Math.max(i-1,0); row <Math.min(board.length,3) ; ++row){
		
		
		for(int column =Math.max(k-1,0); column <Math.min(board[0].length,3); ++column){
			
			if(board[row][column] == 1) ++result;
			
		}
		
	}
	if(board[i][k]==1) --result;
	return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("f");

		Solution solution = new Solution();
		int[][] t = new int[5][3];
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[0].length; j++) {
				t[i][j] = 0;
			}
		}
		t[1][1] = 1;
		t[2][1] = 1;
		t[3][1] = 1;
		solution.show(t);

		System.out.println("t1[1][1] = "+ t[1][1]);
		solution.gameOfLife(t);
		System.out.println();
		solution.show(t);

		System.out.println("t1[1][1] = "+ t[1][1]);
		
		int[][] t4 = new int[1][1];
		for (int i = 0; i < t4.length; i++) {
			for (int j = 0; j < t4[0].length; j++) {
				t4[i][j] = 1;
			}
		}
		solution.show(t4);
		solution.gameOfLife(t4);
		solution.show(t4);
	}
	public void show(int[][] t) {
		System.out.println("\nstart show");
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[0].length; j++) {
				if(t[i][j] == 1){
					System.out.println("t["+i+"]["+j+"] = 1");
				}
			}
		}

		System.out.println("end show\n");
	}
	
	public static void addOne(int a) {
		++a;
		System.out.println(" a is now: " + a);
	}

}
