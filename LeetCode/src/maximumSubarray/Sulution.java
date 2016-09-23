package maximumSubarray;

public class Sulution {
	
    public static int maxSubArray(int[] A) {
         if (A == null)
             return 0;
//         int start;
//         int end;
         int max = Integer.MIN_VALUE;
         System.out.println(max);
         int sum;
         for (int i = 0 ; i < A.length ; ++i){
             sum = 0;
             for (int j = i ; j < A.length ; ++j){
                 sum += A[j];
             }
             if(sum > max){
                 max = sum;
             }
         }
         return max;
         
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {3,-2,-2, 2,3, -2,2, 1};
		int[] test2 = {3,1,-1, 1,4, 2,4, 5};
		System.out.println(maxSubArray(test));

	}

}
