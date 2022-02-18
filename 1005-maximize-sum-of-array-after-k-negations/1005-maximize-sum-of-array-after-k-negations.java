class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        var heap = new PriorityQueue<Integer>(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        
        while(k-- > 0) {
            heap.add(heap.remove() * -1);
        }
        
        return heap.stream().mapToInt(i -> i).sum();
    }
}