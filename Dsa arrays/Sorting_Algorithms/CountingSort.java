package Sorting_Algorithms;

// NOTE : use counting sort algorithm where you have less range of numbers like for marks (0-100)
//  Generally for Non zero Integers 

// Time complexity of Counting Sort algo may can go Linear O( approx n+range)
// To do : 
      // 1.running a loop to take the largest number from the array 
      // 2.making a new array contains int[largest+1]  why? arr will contain 0 also and count the Frequency  
      // 3.sorting by running a loop while (frequency > 0)

public class CountingSort {
    public static void CountingSorting(int arr[]){
        // For largest 
        int largest = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;
            // count = [8] 
            // Initially  count = {0,0,0,0,0,0,0,0}
            // after loop count = {0,2,1,2,2,0,0,1}
        }
        // sorting 
        int j=0;
        for (int i=arr.length-1;i>=0;i--){
            while (count[i]>0){
                arr[j]=i;  // arr[0] =1 arr[1]
                j++;
                count[i]--; //if frequency 2->1->0 
            }
        }
    }
    public static void PrintArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        CountingSorting(arr);
        PrintArr(arr);
    }
}
