// eg. [1,2,3]
// 1,(1,2) , (1,2,3)
// 2,(2,3) 
// 3,

// and Printing the sum of each array 

public class SubArray{
    public static void SubArrays(int arr[]){
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                int sum=0;
                for (int k=i;k<=j;k++){
                    sum+=arr[k];
                    System.out.print("["+arr[k]+" ]");
                }
                System.out.print("\nSum :" + sum);
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        SubArrays(arr);
    }
}

// NOTE : Time complexity of Creating normal SubArray O(n^3):
