//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
       ArrayList<Long> arr=new ArrayList<Long>();
      factorial(1, arr, n, 1);
      return arr;
    }
     static void factorial(long start, ArrayList<Long> arr, long n, long ans){
        if(ans>n){
            return ;
        }
        arr.add(ans);
        factorial(start+1, arr, n, ans*(start+1));
    }
}