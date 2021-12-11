class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 0 || nums == null) return;
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[idx++] = nums[i];
            }
        }
        while (idx < nums.length) {
            nums[idx++] = 0;
        }
        return;
    }
}