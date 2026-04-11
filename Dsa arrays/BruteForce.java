// To find the maximum subarray sum from the array 

// BruteForce 
// 1. making Subarray 
// 2. taking sum of all 
// 3. taking the maxSum out of all sum
public class BruteForce {
    public static void MaxSums(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                int sum=0;
                for (int k=i;k<=j;k++){
                    sum+=arr[k];
                    System.out.print(arr[k]+" ");
                }
                System.out.print("\nsum: "+sum);
                if (maxsum<sum){
                    maxsum=sum;
                }
                System.out.println();
            }
        }
        System.out.print("max sum : "+ maxsum);
        
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        MaxSums(arr);
        
    }
}


// NOTE : Time complexity of BruteForce (max subarray sum
//             alogrithm is O(n^3)  

// some more algorithms to find max subarray sum 
            // 1.Brute Force (current)
            // 2.Prefix Sum 
            // 3. Kadane's Algorithm (Important)