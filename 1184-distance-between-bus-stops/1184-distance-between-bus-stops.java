class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
       int total =0;
        int sum1=0;
        for(int x: distance)
        total+=x;
        
        if(start<destination)
        {
        for(int i=start;i<destination;i++)
            sum1 = sum1 + distance[i];
        }
        else if(start==destination)
            return 0;
        else if(start>destination)
        {
            for(int i=start-1;i>=destination;i--)
            sum1 = sum1 + distance[i];
        }
        int sum2 = total-sum1;
        
        return Math.min(sum1,sum2);
        
    }
}