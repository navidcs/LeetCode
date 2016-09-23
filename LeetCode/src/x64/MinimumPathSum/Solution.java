package x64.MinimumPathSum;

public class Solution {


	public static int findPath (int[][] nums){
		if(nums.length == 0)
			return -1;
		if(nums[0].length == 0)
			return -1;
		
		for (int i = 0 ; i < nums.length;++i){
			for (int k = 0 ; k < nums[0].length ; ++k){
//				System.out.println(i + " & " + k + " = " + nums[i][k] );
				System.out.print( nums[i][k] + "  " );
			}
			System.out.println();
		}
	
		for (int i = 1 ; i < nums.length;++i){
			nums[i][0] += nums[i-1][0];
		}
		for (int k = 1 ; k <nums[0].length;++k){
			nums[0][k] += nums[0][k-1];
		}
		
		for (int i = 1 ; i < nums.length;++i){
			for (int k = 1 ; k < nums[0].length ; ++k){
				nums[i][k] += Math.min(nums[i-1][k] , nums[i][k-1]);
			}
		}
		System.out.println();
		for (int i = 0 ; i < nums.length;++i){
			for (int k = 0 ; k < nums[0].length ; ++k){
//				System.out.println(i + " & " + k + " = " + nums[i][k] );
				System.out.print( nums[i][k] + "  " );
			}
			System.out.println();
		}
		return nums[nums.length - 1][nums[0].length-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] multi = new int[][]{
				  { 2, 4, 1, 7  },
				  { 3, 3, 4, 1  }
				};
		System.out.println(findPath(multi));

	}

}
