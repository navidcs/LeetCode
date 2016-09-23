package x318.MaximumProductofWordLengths;

import java.util.*;

public class Solution {

	public int maxLength(String[] words) {

		HashMap<Character,ArrayList<String>> hm = new HashMap <Character,ArrayList<String>>();
		int max = 0;
		for (char ch = 'a' ; ch <='z' ; ++ch){
	hm.put(ch, new ArrayList<String>());
	} 
	for(String s : words){
		for(char c : s.toCharArray()){
			hm.get(c).add(s);
		}
	}
	for(String s: words){
	HashSet<String> hs = new HashSet<String>();
	for(String s1 : words){
		hs.add(s1);
	}
		for(char c: s.toCharArray()){
			for(String s2 : hm.get(c)){
				hs.remove(s2);
			}
		}
		Iterator<String> it = hs.iterator();
		while(it.hasNext()){
			String s2 = it.next();
			if(s.length() * s2.length() > max)
				max = s.length() * s2.length();
			
		}
	}
	return max;

	}
	

public int maxLength2(String[] words){
	int[] bits = new int[words.length];
	int max = 0;
	for(int i = 0 ; i < words.length  ; ++i){
		for(char c : words[i].toCharArray()){
			bits[i]  |= 1<<(c-'a');
		}
	}
	for(int i = 0 ; i < words.length - 1; ++i){
		for(int k = i + 1 ; k < words.length ; ++k){
			if((bits[i] & bits[k]) == 0){
				if(words[i].length() * words[k].length() > max){
					max = words[i].length() * words[k].length();
				}
			}
		}
	}
	return max;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = { "abc", "adfg", "rd" };
		Solution solution = new Solution();
		int[] a = new int [5];

		System.out.println(solution.maxLength(s));
		System.out.println(solution.maxLength2(s));
		int b = 5;
		b  &= 7;
		System.out.println(5 & 1);

	}

}
