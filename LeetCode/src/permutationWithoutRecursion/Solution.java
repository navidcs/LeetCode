package permutationWithoutRecursion;

import java.util.List;
import java.util.ArrayList;

public class Solution {
	
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> lol = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		lol.add(list);
		for (int i : nums) {
			int sum = lol.size();
			System.out.println("sum = "+sum);
			for (; sum > 0; --sum) {
				List<Integer> grab = lol.get(0);
				lol.remove(0);
				for (int k = 0; k <= grab.size(); k++) {
					ArrayList<Integer> copy = new ArrayList<Integer>(grab);
					copy.add(k,i);
					lol.add(copy);
				}
			}
		
			
		}
		System.out.println(lol.size());
		return lol;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hi");
		int[] ar = {10,11,12,13};
		List<List<Integer>> loList = permute(ar);
		for (List<Integer> list : loList) {
			System.out.println(list);
//			for(int i: list){
//				System.out.print(i + " ");
//			}
		}

	}

}
