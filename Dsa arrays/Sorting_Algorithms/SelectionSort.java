package Sorting_Algorithms;
// selection sort : Algorithm to sort the array in increasing and decreasing 

// 1.take the minimum index from Inner loop
// 2.In outer loop : Swap the value arr[i]
// 3.The outer loop will go from arr.length-2 as we don't want 
// comparison with last as it will already be in increasing order 

public class SelectionSort {
    public static void SelectionSorting(int arr[]){
        // taking the minimum
        for (int i=0;i<arr.length-1;i++){
            int MinPos=i;
            // taking out the minimum arr value index
            for (int j=i+1;j<arr.length;j++){
                if (arr[MinPos]>arr[j]){
                    MinPos = j;
                    // after getting the minimum index
                    // eg. [3,2,1,5,0] 
                    // minpos=0 j=1 arr[0]>arr[1] minpos=1
                    // minpos=1 j=2 arr[1]>arr[2]  mispos = 2
                    // minpos=2 j=3 arr[2]>arr[3] false minpos remain 2 
                    // minpos=2 j=4 arr[2]>arr[4] true minpos = 4
                    //****** Then after loop ****
                    // swap the j index with arr of [i] from start to end 
                }
                // MinPos = 4
                // swapping the values 
                int temp=arr[MinPos];// minimum value
                arr[MinPos] = arr[i]; // at arr[4] = arr[0] arr[4] where 0 was there now 3
                arr[i] = temp; // arr[0] = 0(min)
            }

        }
        
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        SelectionSorting(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       
    }
}
// In SelectionSort we have to do less swapping as compared to Bubble sort
// this like grab the minimum put it in arr[i]