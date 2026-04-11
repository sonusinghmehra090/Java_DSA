// BruteForce --> PrefixSum --> Kadane's Algorithm 


// reduce time complexity from O(n^3)|| O(n^2) => O(n)
// means using only one loop to find the subarray's absolute maximum sum
// By rejecting negative sum and assinging current_sum = 0 

/* Work of KadanesAlgorithms: 
       1.taking current sum and maxsum parallely 
       2. eg. [1 , -2 , 6 , -1 , 3]
       if curr_sum[i] is negative = 0
        curr_sum[i'es] = arr[i]-arr[i-1] => [1,0,6,5,8]
        max_sum =  [1,1,6,6,8]
        taking only max_sum and print nth max_sum
*/

public class KadanesAlgorithm {
    public static void KadanesAlgo(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            cs = cs + arr[i];
            // update current sum if cs>0
            if (cs <0){
                cs = 0;
            }
            if (ms<cs){
                ms=cs;
            }
        }System.out.print("max sum :" + ms);
    }
    public static void main(String[] args) {
        // kadane's algorithms
        int arr[] = {1,-2,6,-1,3};
        KadanesAlgo(arr);

    }
}
