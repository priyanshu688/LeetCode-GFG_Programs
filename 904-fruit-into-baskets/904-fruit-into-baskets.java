class Solution {
    public int totalFruit(int[] fruits) {
        int lastFruit = -1;
        int secLastFruit = -1;
        int lastCount = 0;
        int currCount = 0;
        int maxCount = 0;
        for(int fruit : fruits){
            if(fruit == lastFruit || fruit == secLastFruit){
                currCount++;
                if(fruit == lastFruit)
                    lastCount++;
                else{
                    secLastFruit = lastFruit;
                    lastFruit = fruit;
                    lastCount = 1;
                }
            }
            else{
                secLastFruit = lastFruit;
                lastFruit = fruit;
                currCount = lastCount + 1;
                lastCount = 1;
            }
            maxCount = Math.max(maxCount, currCount);
        }
    return maxCount;
    }
}