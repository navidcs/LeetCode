package bestTimeToBuyStock;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class BttbsO_n {
	public static void bttbsn(int[] data) {
		HashMap<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
		for (int i = 0; i < data.length; ++i) {
			hashtable.put(data[i], i);

		}
		for (int i = 0; i < data.length; i++) {

			System.out.println(hashtable.get(i) + " " + i);
		}
		System.out.println();
		for (int j : data) {
			System.out.println(j + " " + hashtable.get(j));

		}
	}

	public class Price implements Comparator<Price>, Comparable<Price> {
		public Integer currentPrice;
		public Integer day;

		public Price() {
			// TODO Auto-generated constructor stub
		}

		public Price(Integer c, Integer d) {
			currentPrice = c;
			day = d;
		}

		// Comparator<Price> Comparator = new Comparator<Price>() {
		// @Override
		// public int compare(Price o1, Price o2) {
		// return o1.currentPrice.compareTo(o2.currentPrice);
		// }
		// };
		// @Override
		public int compareTo(Price arg0) {
			return 0;
		}

		// @Override
		public int compare(Price o1, Price o2) {
			return o1.currentPrice.compareTo(o2.currentPrice);
		}
	}

	// public
	// ArrayList<bttbsO_n.Price> arrayList = new ArrayList<bttbsO_n.Price>();
	// for (int i = 0; i < data.length; i++) {
	// Price price = new bttbsO_n.Price(data[i], i);
	// arrayList.add(price);
	//
	// }

	public int withObject(int[] data) {
		if (data.length < 2) {
			return 0;

		}
		ArrayList<BttbsO_n.Price> arrayList = new ArrayList<BttbsO_n.Price>();
		for (int i = 0; i < data.length; i++) {
			arrayList.add(new BttbsO_n.Price(data[i], i));

		}

		// for (int i = 0; i < arrayList.size();i++){
		// System.out.println(arrayList.get(i).currentPrice+" "+
		// arrayList.get(i).day);
		// }
		//
		// System.out.println();
		// Collections.sort(arrayList);
		// for (int i = 0; i < arrayList.size();i++){
		// System.out.println(arrayList.get(i).currentPrice+" "+
		// arrayList.get(i).day);
		// }
		// System.out.println();
		Collections.sort(arrayList, new Price());
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).currentPrice + " "
					+ arrayList.get(i).day);
		}

		System.out.println();
		int min = 0;
		int max = arrayList.size() - 1;

		// System.out.println(arrayList.get(max).day +" "+
		// arrayList.get(min).day);
		if (arrayList.get(max).day > arrayList.get(min).day) {
			return arrayList.get(max).currentPrice
					- arrayList.get(min).currentPrice;
		}

		int maxProfit = 0;
		int tempMin = min;
		int tempMax = max;

		while ((arrayList.get(max).day < arrayList.get(tempMin).day && max > min)) {
			++tempMin;
			if (max <= tempMin) {
				--max;
				tempMin = min;
			}

		}
		if (max <= min) {
			return 0;
		}

		maxProfit = arrayList.get(max).currentPrice
				- arrayList.get(tempMin).currentPrice;

		System.out.println("\nmin = " + min + " tMin = " + tempMin);

		System.out.println("\nmax = " + max + " tMax = " + tempMax);

		System.out.println("maxProfit = " + maxProfit);
		min = 0;
		max = arrayList.size() - 1;

		while ((arrayList.get(min).day > arrayList.get(tempMax).day && max > min)) {
			--tempMax;
			if (min >= tempMax) {
				++min;
				tempMax = max;
			}
		}

		if (max <= min) {
			return 0;
		}

		if (maxProfit < arrayList.get(tempMax).currentPrice
				- arrayList.get(min).currentPrice) {
			maxProfit = arrayList.get(tempMax).currentPrice
					- arrayList.get(min).currentPrice;
		}

		System.out
				.println("arrayList.get(tempMax).day and arrayList.get(min).day \n"
						+ arrayList.get(tempMax).day
						+ " "
						+ arrayList.get(min).day);

		System.out.println("\nmin = " + min + " tMin = " + tempMin);

		System.out.println("\nmax = " + max + " tMax = " + tempMax);

		System.out.println("maxProfit = " + maxProfit);
		return maxProfit;

		// continue;

		// while (min<tempMax&&(arrayList.get(min).day <
		// arrayList.get(tempMax).day)) {
		// --tempMax;
		// }
		// if (min>=tempMax){

		// ++min ;
		// tempMax = max - 1;
		// continue;
		// }
		// maxProfit = Math.max()

	}

	public int maxProfit(int[] prices) {
		if (prices.length < 2)
			return 0;
		int min = prices[0];
		int maxProfit = 0;
		for (int i = 1; i < prices.length; ++i) {
			if (prices[i] < min) {

				min = prices[i];

			}

			else if (prices[i] - min > maxProfit) {
				maxProfit = prices[i] - min;

			}

		}
		return maxProfit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = { 223, 64, 52, 53, 29, 33, 3 };
		int[] test2 = { 213, 233, 42, 209, 4, 12, 23 };
		// bttbsn(test);
		BttbsO_n bttbsO_n = new BttbsO_n();
		System.out.println(bttbsO_n.withObject(test));
		System.out.println(bttbsO_n.withObject(test2));
		System.out.println(bttbsO_n.maxProfit(test));
		System.out.println(bttbsO_n.maxProfit(test2));

	}

}
