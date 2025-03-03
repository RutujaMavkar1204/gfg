//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.countFreq(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    int countFreq(int[] arr, int target) {
        int[] nums={0,0,0};
       
       count( nums, arr,target,true);
       count( nums, arr,target,false);
       int ans=(nums[1]-nums[0])+nums[2];
       
       return ans;
       
       
       
    }
    void count( int[] nums, int[] arr, int target, boolean direction){
        int start=0; 
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
           if(arr[mid]==target){
               nums[2]=1;
               if(direction){
                   end=mid-1;
                   nums[0]=mid;
               }
               else{
                   start=mid+1;
                   nums[1]=mid;
               }
               
           }
           else if(arr[mid]<target){
               start=mid+1;
           }
           else{
               end=mid-1;
           }
           
       } 
    }
    
    
    
}
