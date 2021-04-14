//Code to https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len= nums.length;
		
		for(int i= 0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if((target-nums[i])==nums[j])
				{
                    return new int[] { i, j };
				}
			}
		}
        throw new IllegalArgumentException("No two sum solution");
    }
}
