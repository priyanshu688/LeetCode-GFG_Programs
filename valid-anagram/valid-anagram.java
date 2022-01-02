class Solution {
    public boolean isAnagram(String s, String t) {
        boolean isAnagram= false;

        if(s.length() == t.length()){
            Map<Character,Integer> mapS = new HashMap<Character,Integer>();
            for (int j = 0; j < s.length(); j++) {
                Character c = s.charAt(j);
                Integer i = mapS.get(c);
                if(i !=null){
                    mapS.put(c,i+1);
                }else
                    mapS.put(c,1);
            }
            for (int i = 0; i < t.length() ; i++) {
                Character c = t.charAt(i);
                Integer val = mapS.get(c);
                if(val!=null && val>0){
                    if(val ==1){
                        mapS.remove(c);
                    }
                    else
                    mapS.put(c,val-1);
                } else{
                    isAnagram= false;
                }
            }
            if(mapS.isEmpty()) {
                isAnagram=true;
            }
        }
        return isAnagram;
    }
}