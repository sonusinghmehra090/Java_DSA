public class QuickSort{
    public static void PrintArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void quickSorting(int arr[],int si,int ei){
        // base case
        if (si>=ei){
            return;
        }
        int i = si-1;
        int pivot = arr[ei];
        for (int j=si;j<=ei;j++){
            if (arr[j]<=pivot){
                i++;
                // swapping 
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        quickSorting(arr,si,i-1);
        quickSorting(arr,i+1,ei);
    }
    public static void main(String[] args) {
        int arr[] = {6,2,3,5,9,8,5,-1};
        quickSorting(arr,0,arr.length-1);
        PrintArr(arr);
    }
}