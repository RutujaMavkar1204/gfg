//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int m = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.nthRoot(n, m);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int nthRoot(int n, int m) {
        int start=0;
        int end=m;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(Math.pow(mid,n)==m){
                ans=mid;
                return ans;
            }
            else if(Math.pow(mid,n)>m){
                end=mid-1;
                
            }
            else{
                start=mid+1;
            }
        }return ans;
    }
}