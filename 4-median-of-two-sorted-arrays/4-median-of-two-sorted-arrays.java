class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int nums1Index = 0;
        int nums2Index = 0;
        double med1 = 0;
        double med2 = 0;
        for(int index = 0; index <= (nums1.length + nums2.length)/2; index++){
            med1 = med2;
            if (nums1Index == nums1.length || nums2Index == nums2.length)
                med2 = (nums1Index == nums1.length)? nums2[nums2Index++]: nums1[nums1Index++];
            else
                med2 = (nums1[nums1Index] < nums2[nums2Index])? nums1[nums1Index++]: nums2[nums2Index++];
        }
        return ((nums1.length + nums2.length) % 2 == 0)? (med1+med2)/2: med2;
    }
}