package Sorting_Algorithms;
//Bubble sort : 
        // sorting the array in increasing format eg.1,3,4,5,...
        // data structure : comparing arr[i] with arr[i+1] 
        //                   if value more -> swap  else no swap
          
public class BubbleSort{
    public static void BubbleSorting(int arr[]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    // swap 
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                else {
                    // no swap just continue
                    continue;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,6,2,1,8,2,93,29,3};
        BubbleSorting(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
// [6,2,1,8,9]  i=0  j<num.length-1-0
// [2,1,6,8,9]  i=1  j<num.length-1-1
// [1,2,6,8,9]  i=2  j<num.length-1-2
