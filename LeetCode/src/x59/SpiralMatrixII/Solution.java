package x59.SpiralMatrixII;

public class Solution {
	public class Matrix {
		int dim;
		int round;
		int cn; // current Number
		int[][] m;
		int x;
		int y;

		public Matrix(int n) {
			dim = n;
			round = 0;
			cn = 1;
			m = new int[dim][dim];
			x = 0;
			y = 0;
		}

		public int[][] makeMatrix() {
			while (cn <= dim * dim && round < dim) {
				fillMatrix();
				++round;
			}
			print();
			return m;
		}

		public void fillMatrix() {
			right();
			down();
			left();
			up();
		}

		public void right() {
			x = round;
			y = round;
			while (y < dim - round) {
				m[x][y] = cn++;
				System.out.println("mat["+x+"]["+y+"]="+m[x][y]);
				++y;
//				System.out.println("mat["+x+"]["+y+"]="+m[x][y]);
			}
			--y;
		}

		public void down() {
			while (x < dim - round - 1) {
				++x;
				m[x][y] = cn++;

				System.out.println("mat["+x+"]["+(y)+"]="+m[x][y]);
			}
//			--y;
		}

		public void left() {
			while (y > round ) {
				m[x][--y] = cn++;

				System.out.println("mat["+x+"]["+(y)+"]="+m[x][y]);
			}
//			++x;
		}

		public void up() {
			while (x > round + 1) {
				m[--x][y] = cn++;

				System.out.println("mat["+x+"]["+(y)+"]="+m[x][y]);
			}
//			++y;
		}

		public void print() {
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[0].length; j++) {
					System.out.printf("%3s ",m[i][j]);
				}
				System.out.println();
			}
		}

	}

	public int[][] generateMatrix(int n) {
		if (n <= 0)
			return new int[0][0];
		Matrix mat = new Matrix(n);
		return mat.makeMatrix();
	}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s2 = new Solution();
		s2.generateMatrix(4);
		
	//	System.out.println(mat);

	}

}
