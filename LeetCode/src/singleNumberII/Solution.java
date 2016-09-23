package singleNumberII;

import java.util.HashMap;

public class Solution {
	public int singleNumber(int[] A) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i : A) {
			if (hm.containsKey(i)) {
				hm.put(i, hm.get(i) + 1);
			} else {
				hm.put(i, 1);
			}
		}
		for (int i : hm.keySet()) {
			if (hm.get(i)!= 3) {
				return i;
			}
		}
		System.out.println("never reaches if input is valid.");
		return 0;

	}	
	public int singleNumber2(int[] A) {
		int sum = 0;
		for (int i: A){
			sum = sum ^ i;
		}
		for (int i : A){
			if((sum ^ i) == i){
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] test = {1,1,1, 5};
		System.out.println((new Solution()).singleNumber2(test));
		

	}

}
