// Objective same : To find the the subarray maximum sum 

// After BruteForce --> Prefix Sum 
// Things get interesting from here ==> Time Complexity Reduction 
// From O(n^3) --> O(n^2) 

// prefix sum : 
//    1.instead of using 3 loops --> 2 loops only 
//    2.Creating a Prefix array contains sum of subarray
//    3.sum = prefix_arr[end of subarray]-prefix_arr[start of subarray-1]
//    4.eg. sum of subarray -2,6,-1 => 3   
//                   prefix_arr=[1,-1,5,4,7] , pa[end] = 4 and pa[st-1] = 1
//                    sum(3) = 4-1 = 3

public class Prefix_Sum {
    public static void PrefixSum(int arr[]){
        // making a prefix_arr
        int pref_arr[] = new int[arr.length];
        int maxsum = Integer.MIN_VALUE;
        int sum=0;
        pref_arr[0]=arr[0];
        for (int i=1;i<arr.length;i++){
            pref_arr[i]=pref_arr[i-1]+arr[i];
        }
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){

                sum = i==0? pref_arr[j]:pref_arr[j]-pref_arr[i-1];
                if (maxsum<sum){
                    maxsum=sum;
                }
            }
        }
        System.out.print("max sum : "+ maxsum);
        
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        PrefixSum(arr);
    }
}

// Created a pre fix array contains previous sums
// relation between subarrays sum vs prefix arr
// i.e   subarray sum = prefix[end of subarray index] - prefix[start of subarray index -1]