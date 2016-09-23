public class sortColors2 {
	public static void sortColors(int[] A) {
		int notRedFromHeadFinder = -1;
		int redFromEndFinder = A.length - 1;
		// int temp;
		while (notRedFromHeadFinder < redFromEndFinder) {

			++notRedFromHeadFinder;
			if (A[notRedFromHeadFinder] != 0) {
				while (redFromEndFinder >= 0 && A[redFromEndFinder] != 0) {
					--redFromEndFinder;

				}

				if (notRedFromHeadFinder < redFromEndFinder) {
					A[redFromEndFinder] = A[notRedFromHeadFinder];
					A[notRedFromHeadFinder] = 0;
				}
			}

		}

		int notWhiteFromHeadFinder = notRedFromHeadFinder - 1;
		int whiteFromEndFinder = A.length - 1;
		while (notWhiteFromHeadFinder < whiteFromEndFinder) {
			++notWhiteFromHeadFinder;
			if (A[notWhiteFromHeadFinder] != 1) {
				while (whiteFromEndFinder >= 0 && A[whiteFromEndFinder] != 1) {
					--whiteFromEndFinder;
				}
				
				if (notWhiteFromHeadFinder < whiteFromEndFinder) {
					A[whiteFromEndFinder] =2;
					A[notWhiteFromHeadFinder] = 1;
					
				}
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {2,1 };

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
