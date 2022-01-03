class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }

        Set<Integer> intersection = new HashSet<>();
        for(int i:nums2){
            if(set.contains(i)){
                    intersection.add(i);
                }
        }
        int[] result=new int[intersection.size()];
        int index=0;
        for(int i:intersection){
            result[index++]=i;
        }
     return result;
        
    }
}