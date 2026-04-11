// eg. [2,4,6,8,10,12,14,16]  search the index of key = 10 

import java.util.*;

public class LinearSearch{
    public static int LinearSearches(int array[] , int key){
        for (int i=0;i<array.length;i++){
            if (array[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10,12,14,16};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key : ");
        int key = sc.nextInt();
        int value = LinearSearches(array,key);
        System.out.print(key + " found at index " + (value) );
        sc.close();
    }
}

// NOTE : 
// Linear Search is the algorithm with Time Complexity  O(n)
// Where n-total times the loop run to Execute (in Worst case senario)
// In case of Linear Search n = array.length  O(8)
// another Search algorithm --> BinarySearch  O(n/2^k) Time complexity
// O (log n) 

