//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int a;
            a = Integer.parseInt(br.readLine());

            int b;
            b = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int[] ans = obj.lcmAndGcd(a, b);
            System.out.println(ans[0] + " " + ans[1]);
            System.out.println("~");
        }
    }
}


// } Driver Code Ends

// User function Template for Java

class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        int[] ans=new int[2];
        int gcd=1;
        int lcm=1;
        for(int i=2; i<=Math.min(a,b); i++){
            if(a%i==0 && b%i==0){
                gcd=i;
               
            }
            
        }
        lcm=(a*b)/gcd;
        
        ans[0]=lcm;
        ans[1]=gcd;
        
        return ans; 
    }
}

//{ Driver Code Starts.

// } Driver Code Ends