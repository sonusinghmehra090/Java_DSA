/*
for num = 5 (lines)

    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5    

*/

import java.util.Scanner;

public class NumberPyramid {
    public static void NumberPyramids(int num){
        // n=1  n++ with every i++
        int n=1;
        for (int i=1;i<=num;i++){
            // spaces 
            for (int s=1;s<=num-i;s++){
                System.out.print(" ");
            }
            // numbers
            for (int j=1;j<=i;j++){
                System.out.print(n+" ");
            }
            n++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        NumberPyramids(num);
        sc.close();
    }
}
