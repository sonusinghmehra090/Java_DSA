// Binary Search algorithms helps to search for out key using Conditions
// Helps in reducing time complexity O(n/2)
// Prerequisite - sorted arrays 


// eg. [2,4,6,8,10,12,14]  key =12 
// we will applying the start end mid technique 

import java.util.Scanner;
public class BinarySearch{
    public static int BinarySearches(int array[],int key){
        int start = 0;
        int end = array.length-1;
        while (start<=end){
            int mid = (end+start)/2;
            if (array[mid]==key){
                return mid;
            }
            if (key>array[mid]){
                start = mid+1 ;
            }
            else{
                end = mid-1;
            }
        } 
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key : ");
        int key = sc.nextInt();
        int value = BinarySearches(arr,key);
        System.out.println(key + " found at index : "+ value);
        sc.close();
    
    }
}

// NOTE : Time Complexity of Binary Search < Linear Search 
// Means Binarysearch take less time to excute the task in Worst case Senario
// make Time complexity -> O(n/2^k)   till n/2^k becomes = 1
// number of iteration taken place in this examples was 4 
// For worst case senario : 

            // Till start <=end
             // 1.let key = 14  mid = 8  12 > 8  start_index = mid+1
             // 2.now array become from [10,12,14]  mid =12   12<14  start_index= mid+
             // 3.start=end  mid=key


// for : 8 idx --> 4 idx --> 2 idx --> 1 idx 


   //    n/2^0 --> n/2^1 --> n/2^2 --> n/2^3   O(n/2^k) till n/2^k = 1
   // n/2^k = 1  ==> n=2^k ==>  k=(log n)   therefore : 
                                                // O(log n)

