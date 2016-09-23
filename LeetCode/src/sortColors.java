public class sortColors {

	public static void sortColors(int[] A) {
		int whiteSearchStart = 0;
		int possibleRedToSub = 0;
		int temp;
		int searchingForNotRed;
		for (searchingForNotRed = 0; searchingForNotRed < A.length - 1; ++searchingForNotRed) {

			if (A[searchingForNotRed] == 0) {
				whiteSearchStart = searchingForNotRed + 1;
				continue;
			}

			if (possibleRedToSub <= searchingForNotRed)
				possibleRedToSub = searchingForNotRed + 1;

			for (; possibleRedToSub < A.length; ++possibleRedToSub) {
				if (A[possibleRedToSub] == 0) {
					temp = A[possibleRedToSub];
					A[possibleRedToSub] = A[searchingForNotRed];
					A[searchingForNotRed] = temp;
					whiteSearchStart = searchingForNotRed + 1;
					searchingForNotRed = possibleRedToSub;
					break;
				}

			}
			if (possibleRedToSub == A.length) {
				break;
			}
		}

		int possibleWhiteForSub = whiteSearchStart + 1;

		for (int whiteCounter = whiteSearchStart; whiteCounter < A.length - 1; ++whiteCounter) {

			if (A[whiteCounter] == 1) {
				whiteSearchStart = whiteCounter + 1;
				continue;
			}

			if (possibleWhiteForSub <= whiteCounter)
				possibleWhiteForSub = whiteCounter + 1;

			for (; possibleWhiteForSub < A.length; ++possibleWhiteForSub) {
				if (A[possibleWhiteForSub] == 1) {
					temp = A[possibleWhiteForSub];
					A[possibleWhiteForSub] = A[whiteCounter];
					A[whiteCounter] = temp;
					whiteSearchStart = whiteCounter + 1;
					whiteCounter = possibleWhiteForSub;
					break;
				}
			}

			if (possibleWhiteForSub == A.length) {
				break;
			}

		}

	}

	public static void main(String[] args) {
		int[] test = {  1, 0 ,0,2};
		for (int i = 0; i < test.length; i++) {
			System.out.println("test[" + i + "]  = " + test[i]);
		}
		sortColors(test);
		System.out.println();
		for (int i = 0; i < test.length; i++) {
			System.out.println("test[" + i + "]  = " + test[i]);
		}

	}

}
