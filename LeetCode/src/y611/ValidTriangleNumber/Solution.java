package y611.ValidTriangleNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class Solution {
	public int triangleNumber(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		for (int j = 1; j < nums.length - 1; j++) {
			int i = 0;
			for (int k = j + 1; k < nums.length; k++) {
				if (i == j)
					break;
				while (i < j && nums[i] + nums[j] <= nums[k]) {
					++i;
				}
				sum += j - i;
			}
		}

		return sum;
	}

	public int triangleNumber3(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if (nums[i] + nums[j] > nums[k]) {
						++sum;
					} else {
						break;
					}
				}
			}
		}
		return sum;
	}

	public int triangleNumber2(int[] nums) {
		int sum = 0;
		TreeMap<Integer, Integer> treeMap = new TreeMap<>();
		for (int i : nums) {
			if (treeMap.containsKey(i)) {
				treeMap.put(i, treeMap.get(i) + 1);
			} else {
				treeMap.put(i, 1);
			}
		}
		ArrayList<Integer> keys = new ArrayList<>();
		ArrayList<Integer> values = new ArrayList<>();
		for (int key : treeMap.keySet()) {
			if (key == 0) {
				continue;
			}
			keys.add(key);
			values.add(treeMap.get(key));
		}
		for (int i = 0; i < keys.size() - 2; i++) {
			for (int j = i + 1; j < keys.size() - 1; j++) {
				int a = keys.get(i);
				int b = keys.get(j);
				int k = j + 1;

				while (k < keys.size() && a + b > keys.get(k)) {
					sum += values.get(i) * values.get(j) * values.get(k);
					++k;
				}
			}
		}
//		for (int i = 0; i < values.size(); i++) {
//			System.out.println("i = " + i);
//			System.out.println("key = " + keys.get(i));
//			System.out.println("v = " + values.get(i));
//			System.out.println();
//		}

		for (int i = 0; i < keys.size(); i++) {
			// for (int j = i+1; j < keys.size(); j++) {
			if (values.get(i) == 1) {
				continue;
			}
			int a = keys.get(i);

			// int b = keys.get(j);
			int k = 0;
			while (k < keys.size() && a + a > keys.get(k)) {
				if (k == i) {
					++k;
					continue;
				}
				// System.out.println(" a = "+a);
				// System.out.println("kk = "+keys.get(k));
				// System.out.println("i "+i);
				// System.out.println("k "+k);
				int r = values.get(i);
				sum += r * (r - 1) / 2 * values.get(k);
				// System.out.println("sum = "+sum);
				++k;
			}
		}

		for (int i = 0; i < keys.size(); i++) {
			if (values.get(i) >= 3) {
				int r = values.get(i);
				sum += r * (r - 1) * (r - 2) / 6;
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		// int[] array = { 82, 15, 23, 82, 67, 0, 3, 92, 11 };
		int[] array = { 66, 99, 36, 44, 26, 99, 32, 64, 19, 69 };
		// int[] array = { 66,99,99,69 };
		System.out.println(new Solution().triangleNumber2(array));

	}

}
