import java.util.List;

import java.util.ArrayList;

public class PascalsTriangleTwo {
	
    public static List<Integer> getRow(int rowIndex) {
		if (rowIndex < 0)
			return null;

		List<Integer> secondList = new ArrayList<Integer>();
		secondList.add(1);
		if (rowIndex == 0)
			return secondList;

		secondList.add(1);
		if (rowIndex == 1)
			return secondList;

		List<Integer> firstList = new ArrayList<Integer>();

		for (int i = 1; i < rowIndex; ++i) {

			firstList = new ArrayList<Integer>(secondList);
			secondList.clear();
			secondList.add(1);
			for (int j = 0; j < i; ++j) {
				secondList.add(firstList.get(j) + firstList.get(j + 1));
			}
			secondList.add(1);

		}
		return secondList;
    }

	public static void main(String[] args) {
		System.out.println(getRow(7	));

	}

}
