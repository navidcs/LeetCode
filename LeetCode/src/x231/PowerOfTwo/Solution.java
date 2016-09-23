package x231.PowerOfTwo;

public class Solution {
	
	public static boolean isPowerOfTwo(int n){
		int m = n - 1;
		System.out.println("m = "+m);
		if((n & m) == 0)
			return true;
		return false;
	}


	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(5));
	}

}
