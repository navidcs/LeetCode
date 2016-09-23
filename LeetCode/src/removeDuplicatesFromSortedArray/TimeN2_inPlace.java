package removeDuplicatesFromSortedArray;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.lang.*;

public class TimeN2_inPlace {
	public static int removeDuplicate(int[] A) {

		int count = 0;
		for (int i = 1; i < A.length - count; ++i) {
			if (A[i] == A[i - 1]) {
				for (int j = i + 1; j < A.length - count; ++j) {
					A[j - 1] = A[j];
				}
				++count;
				--i;
			}
		}
		return A.length - count;
	}

	public  int removeDuplicates_arrayList(int[] A) {
		if (A == null)
			return 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(A[0]);
		for (int i = 1; i < A.length; ++i) {
			if (A[i] != A[i - 1]) {
				al.add(A[i]);
			}
		}
		// A = al.toArrays(new int[al.size()];
		int[] B = new int[al.size()];
		for (int i = 0; i < al.size(); ++i) {
			B[i] = al.get(i);
		}
		A = B;
		return B.length;
	}

	public static int removeDuplicates_arrayList2(int[] A) {
		if (A == null)
			return 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(A[0]);
		for (int i = 1; i < A.length; ++i) {
			if (A[i] != A[i - 1]) {
				al.add(A[i]);
			}
		}
		// A = al.toArrays(new int[al.size()];
		// int[] B = new int[al.size()];
		for (int i = 0; i < al.size(); ++i) {
			A[i] = al.get(i);
		}
		// A = B;
		return al.size();
	}

	public  int timeN_Memory1(int[] A) {
		if (A == null || A.length == 0) {
			return 0;
		}
		int temp = 0;
		for (int i = 1; i < A.length; ++i) {
			if (A[i] != A[i - 1]) {
				A[++temp] = A[i];
				// ++temp;
			}
		}
		return temp + 1;
	}

	public static void print(int[] a) {
		for (int i : a)
			System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = { 2, 2, 4, 5, 5 };
		int[] test2 = { 1, 1, 1, 4};
//		test = test2;
		// test[3] = ;
		TimeN2_inPlace ti = new TimeN2_inPlace();
		print(test);
		System.out.println();
		System.out.println(ti.timeN_Memory1(test));
		System.out.println();
		print(test);
		System.out.println();
	}

}
