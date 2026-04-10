/*
for num = 4 -> 4*2 line pattern 

*      *
**    **
***  ***
********
********
***  ***
**    ** 
*      *

*/

import java.util.Scanner;

public class ButterflyPattern {
    public static void ButterflyPatterns(int num){
        // num=4
        // space for i=1 6  2*3= 2(4-1)
        // space for i=2 4  2*2= 2(4-2)
        // stars (i) -> spaces() -> stars (i)

        for (int i=1;i<=num;i++){
            // stars
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            // spaces
            for (int s=1;s<=2*(num-i);s++){
                System.out.print(" ");
            }
            // stars
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=num;i>0;i--){
            // stars
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            // spaces
            for (int s=1;s<=2*(num-i);s++){
                System.out.print(" ");
            }
            // stars
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
        ButterflyPatterns(num);
        sc.close();
    }
}
