// array   [3,4,5,20,29,49,1]

// reverse [1,49,29,20,5,4,3]

public class ReverseArray {
    public static void ReversingArray(int arr[]){
        int first = 0 , last  = arr.length-1;
        while(first<last){
            int temp = arr[first];
            arr[first] =arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        
    }
    public static void main(String[] args) {
        int array[] = {3,4,5,20,29,49,1};
        ReversingArray(array);
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
// a = 10 , b = 5
// temp = a  temp = 10
// a= b    a=5
// b = temp   b=10
