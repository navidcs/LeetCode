package x242.ValidAnagram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Solution {

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); ++i) {
			if (hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
			} else
				hm.put(s.charAt(i), 1);

		}
		for (char ch : t.toCharArray()) {
			if (!hm.containsKey(ch))
				return false;
			hm.put(ch, hm.get(ch) - 1);
		}
		Iterator<Character> it = (hm.keySet().iterator());
		while (it.hasNext()) {
			char c = it.next();
			if (hm.get(c) != 0)
				return false;
		}
		return true;
	}

	public int[] singleNumbers(int[] nums) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int n : nums) {
			if (hs.contains(n)) {
				hs.remove(n);
			} else
				hs.add(n);
		}
		int[] result = new int[hs.size()];
		Iterator<Integer> it = hs.iterator();
		int i = 0;
		while (it.hasNext()) {
			result[i] = it.next();
			++i;
		}
		return result;
		// return hs.toArray();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
