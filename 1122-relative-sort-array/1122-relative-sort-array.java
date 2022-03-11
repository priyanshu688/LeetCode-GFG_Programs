class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap();
        List<Integer> list = new ArrayList();
        for(int num : arr2){
            map.put(num,0);
        }
        
        for(int num : arr1){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                list.add(num);
            }
        }
        int index = 0;
        for(int num : arr2){
            while(map.get(num) > 0){
                arr1[index++] = num;
                 map.put(num,map.get(num)-1);
            }
        }
        
        Integer[] arr = new Integer[list.size()];
        arr = list.toArray(arr);
         
        
        Arrays.sort(arr);
        
        for(int num : arr){
            arr1[index++] = num;
        }
        
        return arr1;
    }
}