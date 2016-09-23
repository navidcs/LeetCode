package uglyNumber;

public class Solution {
	
	public boolean isUgly (int n){
//		if (n==1) return true;
		n = remove2factors(n);
		n = remove3factors(n);
		n = remove5factors(n);
		if (n != 1) return false;
		return true;
	}

	public int remove2factors (int n){
		while(n%2 != 0){
			n = n/2;
//			n/= 2;
		}
		return n;
	}



	public int remove3factors (int n){
		while(n%3 != 0){
			n = n/3;
//			n/= 2;
		}
		return n;
	}



	public int remove5factors (int n){
		while(n%5 != 0){
			n = n/5;
//			n/= 2;
		}
		return n;
	}






	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(4%2);
	}

}
