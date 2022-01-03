class Solution {
    public int missingNumber(int[] nums) {
        // Scan the array and check the difference
        Arrays.sort(nums);
        if (nums[0] != 0) {
            return 0;
        } else if (nums[nums.length - 1] != nums.length)  {
            return nums.length;
        }       
            for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i+1] - nums[i] != 1) {
                return nums[i]+1;
            }
        }
        return -1;
    }
}