package factorialTrailingZeroes;

import java.util.HashMap;

public class Solution {
	
	HashMap<Integer, Integer> hm;
	public Solution() {
		hm = new HashMap<Integer,Integer>();
		hm.put(5, 1);
	}
	public static int trailingZeroes1(int n) {
		int count = 0;
		int base = 5;
		int temp = base;
		while (base <= n) {
			while (temp <= n) {
				++count;
				temp += 5;
			}
			base *= 5;
			temp = base;
		}
		return count;

	}
	
	public int trailingZeroes(int n) {
		if (n < 5)	
			return 0;
	//if (hm.contains(n))
		//	return hm.get(n);
	//return tzh(n, 1);
	return tzh(n, 5);

	}
	
	

	public int tzh(int n, int m5){
		if (n < 5){
			return 0;
		}
	if (hm.containsKey(n))
			return hm.get(n);
		if(n < m5) return tzh(n, m5/5);
		int count = hm.get(m5);
		if(n>=m5*5){
			if(!hm.containsKey(m5*5)){
				count *= 5;
				++count;
				hm.put(m5*5,count);
			}
			return  tzh(n %m5*5, m5) + tzh(n - (n % m5*5), m5*5) ;
		}
		if(n%m5 == 0)
			return tzh (n - m5 , m5) + tzh (m5, m5);
		return tzh (n%m5, m5/5) + tzh(n - (n % m5), m5) ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		System.out.println(solution.trailingZeroes(25));

	}

}
