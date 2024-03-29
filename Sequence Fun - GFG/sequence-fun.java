//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.NthTerm(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int NthTerm(int n)
    {
        // code here
        double a =2;
        
        if(n ==1){
            return (int)a;
        }
        
        for(int i=2; i<=n; i++){
            a = (a%(Math.pow(10,9)+7)*i%(Math.pow(10,9)+7))+1;
        }
        return (int)a;
        
    }
}