import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumClosest {
	public static void main(String[] args) {
		int[] arr = {-1,0,1,2,-1,-4};
		System.out.println(threeSumClosest(arr,1));
	}
	public static int threeSumClosest(int[] nums, int target) {
		int min = nums[0] + nums[1] + nums[2];
		Arrays.sort(nums);
		int c = nums.length - 1;
		int difference = Math.abs(min-target);
		while(c>1) {
			int tempA = 0;
			int tempB = c-1;
			while(tempA<tempB) {
				if(difference>Math.abs(nums[tempA] + nums[tempB] + nums[c]-target)) {
					min = nums[tempA] + nums[tempB] +nums[c];
					difference=Math.abs(nums[tempA] + nums[tempB] + nums[c]-target);
				}
				if(nums[tempA] + nums[tempB] + nums[c] == target) {
					return nums[tempA] + nums[tempB] + nums[c];
					}
				else if(nums[tempA] + nums[tempB] + nums[c] < target) {
					while(tempA < nums.length - 1 && nums[tempA]==nums[tempA+1])
						tempA++;
					tempA++;
				}
				else {
					while(tempB > 0 && nums[tempB]==nums[tempB-1])
						tempB--;
					tempB--;
					}
					
				}
			while(c>0 && nums[c]==nums[c-1])
				c--;
			c--;
			}
		return min;
	}
}
