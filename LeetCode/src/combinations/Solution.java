package combinations;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static List<List<Integer>> combination(int n, int k) {
		if (k <= 0)
			return null;
		List<List<Integer>> listOfList = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		return magic(n, k, 1, listOfList, list);

	}

	public static List<List<Integer>> magic(int n, int k, int j,
			List<List<Integer>> listOfList, List<Integer> list) {
		if (j > k) {
			listOfList.add(list);
			System.out.println(list + " is added0");
			return listOfList;
		}
		for (int i = j; i <= n - k + j; ++i) {
			List<Integer> l2 = new ArrayList<Integer>();
			list.add(i);
			listOfList = magic(n, k, j + 1, listOfList, list);
//			System.out.println("listoflist isout1");
//			System.out.println(listOfList );
//			listOfList.add(list);
//			System.out.println(list + " is addedout2");
			list.remove(list.size() - 1);
		}
		System.out.println("listoflist is:3");
		System.out.println(listOfList );
		return listOfList;
	}

	public static void main(String[] args) {

		List<List<Integer>> listOfList = combination(4, 2);
		System.out.println(listOfList);
	}

}
