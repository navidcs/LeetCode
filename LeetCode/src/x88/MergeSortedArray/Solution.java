package x88.MergeSortedArray;

import java.util.Arrays;

public class Solution {
	public static int[] merge(int[] nums1, int n, int[] nums2, int m){
		--n;--m;
		while (n> -1 && m >-1){
			if(nums1[n] > nums2[m])
				nums1[n+m+1] = nums1[n--];
			else
				nums1[n+m+1] = nums2[m--];
		}

		while (m >-1){
			nums1[m] = nums2[m--];
		}
		
		return nums1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 12,40,0 };
		int[] b = { 10 };
		System.out.println(Arrays.toString(merge(a, 2, b, 1)));

	}

}
