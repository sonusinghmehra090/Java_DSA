/*
if num = 5

    *
   **
  ***
 ****
***** 

*/

import java.util.Scanner;

public class RotatedHalfPyramid {
    public static void RotatedHalfPyramids(int num){
        // spaces (num-i) -> stars (i)
        for (int i=1;i<=num;i++){
            // for spaces 
            for (int s=1;s<=num-i;s++){
                System.out.print(" ");
            }
            // for stars 
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        RotatedHalfPyramids(num);
        sc.close();
    }
}
