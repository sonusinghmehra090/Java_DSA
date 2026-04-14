package Sorting_Algorithms;

// Sorting using Sorting Algorithms: 
//      1.Bubble sort  2.Selection Sort 3.Insertion sort 4.Counting Sort

public class SortingQuestions {
    public static void BubbleSort(int arr[]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    // swap 
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void SelectionSort(int arr[]){
        // grab minimum put in front 
        for (int i=0;i<arr.length;i++){
            int MinPos = i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[MinPos]>arr[j]){
                    MinPos = j;
                }
            }
            // swap 
            int temp = arr[MinPos];
            arr[MinPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void InsertionSort(int arr[]){
        for (int i=1;i<arr.length;i++){
            int prev = i-1;
            int curr = arr[i];
            while (prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void CountingSort(int arr[]){
        // largest value+1  array -> frequency , sorting 
        int largest = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (largest<arr[i]){
                largest=arr[i];
            }
        }
        int count[] = new int[largest+1];
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        // sorting
        int j=0;
        for (int i=0;i<count.length;i++){
            while (count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }


    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        // BubbleSort(arr);
        // SelectionSort(arr);
        // InsertionSort(arr);
        CountingSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
