package y604.DesignCompressedStringIterator;

import java.util.ArrayList;

public class StringIterator {

	int index;
	int count;
	char current;
	ArrayList<Character> characters;
	ArrayList<Integer> repetition;

	public StringIterator(String compressedString) {
		characters = new ArrayList<>();
		repetition = new ArrayList<>();
		for (int i = 0; i < compressedString.length();) {
			char ch = compressedString.charAt(i);
			characters.add(ch);
			++i;
			int num = 0;
			while (i< compressedString.length() && compressedString.charAt(i) >= '0' && compressedString.charAt(i) <= '9') {
				num *=10;
				num += compressedString.charAt(i) - '0';
				++i;
			} 
			repetition.add(num);
			num = 0;
		}
		current = characters.size()==0 ? ' ' : characters.get(0);
		
	}

	public char next() {
		if (current == ' ') {
			return current;
		}
		char ch = current;
		if (++count == repetition.get(index)) {
			++index;
			count = 0;
			current = index >= repetition.size() ? ' ' : characters.get(index);
		}
		return ch;
	}

	public boolean hasNext() {
		return current != ' ';
	}

	public static void main(String[] args) {
		StringIterator obj = new StringIterator("L1e2t1C1o1d1e1");
		 char param_1 = obj.next();
		 boolean param_2 = obj.hasNext();

	}
}

/**
 * Your StringIterator object will be instantiated and called as such:
 * StringIterator obj = new StringIterator(compressedString);
 * char param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */

/*
public StringIterator2(String compressedString) {
	characters = new ArrayList<>();
	counts = new ArrayList<>();
	StringBuilder numbers = new StringBuilder();
	for (int i = 0; i < compressedString.length(); i++) {
		char ch = compressedString.charAt(i);
		
		if (ch >= '0' && ch <= '9') {
			numbers.append(ch);
		} else {
			if (numbers.length() > 0) {
				counts.add(Integer.valueOf(numbers.toString()));
				numbers = new StringBuilder();
			}
			characters.add(ch);
		}

		if (numbers.length() > 0) {
			counts.add(Integer.valueOf(numbers.toString()));
			numbers = new StringBuilder();
		}
	}
	index = 0;
	count = 0;
	if (characters.size() > 0) {
		current = characters.get(0);
		// System.out.println("c "+current);
	} else {
		current = ' ';
	}
}
*/