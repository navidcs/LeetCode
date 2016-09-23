package x53.MaximumSubarray;

public class Solution {

	public int maxSubArray(int[] nums) {
		// assumption: nums is not empty

		int max = nums[0];
		int sum;
		for (int i = 1; i < nums.length; ++i) {
			sum = nums[i] + nums[i - 1];
			nums[i] = (sum > nums[i]) ? sum:nums[i];
			max = max < nums[i] ? nums[i] : max;
		}
//		for (int num : nums)
//			if (max < num)
//				max = num;
		return max;
	}

	public static void main(String[] args) {
		int[] a = {-1, 3, -5, 1, 4, -2, 3};
		Solution solution = new Solution();
		System.out.println(solution.maxSubArray(a));
	}

}
