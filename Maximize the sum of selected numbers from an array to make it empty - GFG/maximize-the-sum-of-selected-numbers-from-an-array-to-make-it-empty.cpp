//{ Driver Code Starts
#include <bits/stdc++.h> 
using namespace std; 
  

// } Driver Code Ends
class Solution{
    public:
    int maximizeSum(int a[], int n) 
    {
        // Complete the function
        int ans =0;
        unordered_map<int,int> freq;
        
        for(int i=0;i<n;i++)
        freq[a[i]]++;
        
        for(int i=n-1;i>=0;i--){
            if(freq[a[i]]>0){
                if(freq[a[i]-1]>0)
                 freq[a[i]-1]--;
                 
                 ans+=a[i];
                 freq[a[i]]--;
            }
        }
        return ans;
    }

};


//{ Driver Code Starts.



int main()
{
    
    int t;cin>> t;
    while(t--)
    {
        int n;
        cin >> n;
        int arr[n];
        
        for(int i=0;i<n;i++)
            cin>>arr[i];
        sort(arr, arr+n);
        Solution ob;
        
        cout << ob.maximizeSum(arr, n) << endl;
        
        
    }

}


// } Driver Code Ends