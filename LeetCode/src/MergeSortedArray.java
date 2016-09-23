
public class MergeSortedArray {

	 public static void merge(int A[], int m, int B[], int n) {
	        int ACounter = 0;
	    	int BCounter = 0;
	    	int[] C = new int[m+n];
	    	int i;
	        for (i = 0; ACounter < m && BCounter < n ; i++) {
	        	if(A[ACounter]<B[BCounter]){
	        		C[i] = A[ACounter];
	        		++ACounter;
	        	}
	        	else{
	        		C[i] = B[BCounter];
	        		++BCounter;
	        	}
				
			}
	        System.out.println("BCounter = " + BCounter);
	        if (ACounter < m)
	        {
	        	while (ACounter <m) {
	        		C[i] = A[ACounter];
	        		
	        		++ACounter;
					++i;
				}
	        }
	        else {
				while (BCounter <n){
					C[i] = B[BCounter];
					System.out.println("C[" + i + "] = " + C[i]);
					++BCounter;
					++i;
				}
			}
	        
	        for (int j = 0; j < C.length; j++) {
				A[j] = C[j];
			}
	    }

	public static void main(String[] args) {
		int [] A = new int [12];
		A[0] = 1;
		A[1] = 3;
		A[2] = 5;
		A[3] = 8;
		A[4] = 12;
		int [] B = {2, 4, 7, 13, 15};
		merge(A, 5, B, 5);
		for (int i = 0; i < 5 + 5; i++) {
		System.out.println(A[i]);
		}

	}

}
