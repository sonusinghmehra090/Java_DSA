package Sorting_Algorithms;

// Insertion Sorting Algorithm : based on arranging Playing cards in order 
// eg .[5,4,6,3,1]
// selecting from i=1 to n-1
// prev = i-1
// curr = arr[i]
// selection 4 then analzying if arr[prev] > curr means is arr[0] > arr[1]  5>4 True
// therefore swap the position of 5 to 4 position means arr[prev+1] = arr[prev]  arr[1]=arr[0] arr[1] = 5
// now array is [5,5,4,6,3,1]
// we want to run inner loop in such times that prev >=0 means index should not be less than 0 and arr[prev] > curr
// if loops end at outer loop
// insertion by arr[prev + 1] why? in inner loop prev-- so prev change to -1 to make it back 0 prev + 1  



public class InsertionSort {    
    public static void InsertionSorting(int arr[]){
        for (int i=1;i<arr.length;i++){
            int prev = i-1;
            int curr = arr[i];
            while (prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];    
                prev--; // prev = -1
            }
            // insertion 
            arr[prev+1] = curr; 
        }
    }

    public static void main(String[] args) {
        int arr[]={5,2,7,1,3,4};
        InsertionSorting(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}

