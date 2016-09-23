package permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	List<List<Integer>> lol;
	List<Integer> list;
	List<Integer> pList;
	int[] nums;
	int[] p;

	Solution(int[] nums) {
		lol = new ArrayList<List<Integer>>();
		list = new ArrayList<Integer>();
		p = new int[nums.length];
		pList = new ArrayList<Integer>();
	}

	public List<List<Integer>> permute(int[] nums2) {
		nums = nums2;
//		int[] p = new int[nums.length];
		for (int i = 0; i < nums.length; ++i)
			p[i] = nums[i];
		func(0,p);
		return lol;
	}

	public void func( int depth, int[] pattern) {	

		System.out.println("depth = "+ depth);
		if (depth >= pattern.length) {
			System.out.println("return bcs depth = "+ depth);
			return;
		}

		System.out.println("pattern before loop = "+Arrays.toString(pattern));
		for (int k = 0; k < pattern.length && pattern[k] != -1; ++k) {
			System.out.println("k = "+k);
			list.add(pattern[k]);
			
			System.out.println("pattern inside loop = "+Arrays.toString(pattern));
			pattern[k] = -1;
			func(depth + 1, pattern);
			pattern[k] = nums[k];
			if (depth == nums.length - 1){
				System.out.println("added: " + list);
				lol.add(list);
			}
			if (!list.isEmpty())
				list.remove(list.size() - 1);
			
		}
	}


	public void f2(int depth, int[] patArray) {
		System.out.println("depth = "+ depth);
		if (depth < 0){
			System.out.println("return bcs depth = "+ depth);
			return;
		}
		if (depth >= nums.length) {
			System.out.println("return bcs depth = "+ depth);
			return;
		}

		System.out.println("DpatArray = "+Arrays.toString(patArray));
		for (int k = 0; k < nums.length && patArray[k] != -1; ++k) {

			System.out.println("KpatArray = "+Arrays.toString(patArray));
			System.out.println("k = "+k);
			list.add(patArray[k]);
			System.out.println("patArray["+k+"] = " + patArray[k]);
			System.out.println("item "+ patArray[k] + " is added to " + list);
			patArray[k] = -1;
			System.out.println("patArray = "+Arrays.toString(patArray));
			f(nums, depth + 1, patArray);
			patArray[k] = nums[k];
			if (depth == nums.length - 1){
				System.out.println("added: " + list);
				lol.add(list);
			}
			if (!list.isEmpty())
				list.remove(list.size() - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,11 ,12,13};
		Solution solution = new Solution(a);
//		List<List<Integer>> llList = (solution).permute(a);
//		for(List<Integer> aList :solution.lol){
//			for(Integer integer : aList)
//				System.out.println(integer);
//		}
		solution.nums = a;
		solution.permute(a);		
		
	}


	public void f(int[] nums, int depth, int[] patArray) {
		System.out.println("depth = "+ depth);
		if (depth < 0){
			System.out.println("return bcs depth = "+ depth);
			return;
		}
		
		if (depth >= nums.length) {
			System.out.println("return bcs depth = "+ depth);
			return;
		}

		System.out.println("DpatArray = "+Arrays.toString(patArray));
		for (int k = 0; k < nums.length && patArray[k] != -1; ++k) {

			System.out.println("KpatArray = "+Arrays.toString(patArray));
			System.out.println("k = "+k);
			list.add(patArray[k]);
			System.out.println("patArray["+k+"] = " + patArray[k]);
			System.out.println("item "+ patArray[k] + " is added to " + list);
			patArray[k] = -1;
			System.out.println("patArray = "+Arrays.toString(patArray));
			f(nums, depth + 1, patArray);
			patArray[k] = nums[k];
			if (depth == nums.length - 1){
				System.out.println("added: " + list);
				lol.add(list);
			}
			if (!list.isEmpty())
				list.remove(list.size() - 1);
		}
	}

}
