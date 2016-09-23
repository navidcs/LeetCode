package x202.HappyNumber;

import java.util.HashSet;

public class Solution {

	public boolean isHappy(int  n){
		if(n < 1)
			return false;
		HashSet<Integer> hs = new HashSet<Integer>();
		while(n != 1){
		hs.add(n);
	n = convert(n);
		
	if(hs.contains(n))
			return false;
		
		}
		return true;
		
	}

	public int convert(int n) {
		int sum = 0;
		while (n > 0) {
			sum += (int) Math.pow((n % 10), 2);
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Solution solution= new Solution();
		System.out.println(solution.isHappy(16));

	}

}
