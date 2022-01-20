class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int x : nums){
            map.put(x, 1 + map.getOrDefault(x, 0));
        }
        
        int next, max = 0;
        for(int key : map.keySet()){
            next = key + 1;
            if(map.containsKey(next)){
                max = Math.max(max, map.get(key) + map.get(next));    
            }
        }
            
        return max;
    }
}