package x46.Permutations;

import java.util.*;

public class Solution {
/*
	List<List<Integer>> lol;
	List<Integer> list;
	int[] arr;
	boolean[] b;

	public List<List<Integer>> permute(int[] nums) {
		arr = nums;
		b = new boolean[nums.length];
		lol = new ArrayList<List<Integer>>();
		list = new ArrayList<Integer>();
		List<List<Integer>> lol2 ;
		lol2 = p(0);
		
		for(List<Integer> al: lol2){
			System.out.println(al);
		}
		return lol2;
	}

	public List<List<Integer>>  p(int depth) {
		if (depth == arr.length) {
			lol.add(new ArrayList<Integer>(list));
			System.out.println(list + " is added");
			System.out.println("lol  is " + lol);
			return lol;
		}
		for (int i = 0; i < arr.length; ++i) {
			if (!b[i]) {
				b[i] = true;
				list.add(arr[i]);
				lol = p(depth + 1);
				b[i] = false;
				list.remove(list.size() - 1);
			}

		}
		System.out.println("length = " + lol.size());
		return lol;
	}

	*/

	List<List<Integer>> lol;
	List<Integer> list;
	int[] arr;
	boolean[] b;

	public List<List<Integer>> permute(int[] nums) {
		arr = nums;
		b = new boolean[nums.length];
		lol = new ArrayList<List<Integer>>();
		list = new ArrayList<Integer>();
		p(0);
		return lol;
	}

	public void p(int depth) {
		if (depth == arr.length) {
			lol.add(new ArrayList<Integer>(list));
			return;
		}
		for (int i = 0; i < arr.length; ++i) {
			if (!b[i]) {
				b[i] = true;
				list.add(arr[i]);
				p(depth + 1);
				b[i] = false;
				list.remove(list.size() - 1);
			}

		}

	}

			
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4 , 6, 5 , 99};
		Solution solution = new Solution();

		List<List<Integer>> lol2 ;
		lol2 = solution.permute(a);
		
		System.out.println(lol2.get(0).get(0));
//		lol2 = solution.lol;
		for(List<Integer> al: solution.lol){
			System.out.println(al);
		}
	}

}
