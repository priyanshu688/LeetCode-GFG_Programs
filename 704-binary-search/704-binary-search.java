class Solution {
    public int search(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length;
        int middleIndex = 1000;
    	while (leftIndex < rightIndex) {
            if (middleIndex == (leftIndex + rightIndex)/2){
                return -1;
            } else {
               middleIndex = (leftIndex + rightIndex)/2;
            }
    		if (target >= nums[middleIndex]) {
    			leftIndex = middleIndex;
    		}
    		if (target <= nums[middleIndex]) {
    			rightIndex = middleIndex;
    		}
    	}
    	if (nums[leftIndex] == target) {
    		return leftIndex;
    	}
    	return -1;
    }
}