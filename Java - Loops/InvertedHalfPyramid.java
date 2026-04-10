/*
if num = 5

12345
1234
123
12
1

*/

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void InvertedHalfPyramids(int num){
        // inverted numbers 
        for (int i=num;i>=0;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        InvertedHalfPyramids(num);
        sc.close();
    }
}
