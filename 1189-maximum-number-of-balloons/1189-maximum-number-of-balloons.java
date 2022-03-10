class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> m1=new HashMap<>();
         Map<Character,Integer> m2=new HashMap<>();
        for(char key: text.toCharArray()){
            m1.put(key,m1.getOrDefault(key,0)+1);
        }
         for(char key: "balloon".toCharArray()){
            m2.put(key,m2.getOrDefault(key,0)+1);
        }
        
        int min=text.length();
        for(char k:"balloon".toCharArray()){
            
            min=Math.min(min,m1.getOrDefault(k,0)/m2.getOrDefault(k,0));
        }
        
        return min;
    }
}