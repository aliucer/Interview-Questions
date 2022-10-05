
public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		int x = 0;
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			x = x + nums[i];
			max = Integer.max(x, max);
			if (x < 0) {
				x = 0;
			}
		}
		return max;
	}
}
