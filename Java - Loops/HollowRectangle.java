/*
 -------- if rows= 4 and cols = 5 -----

* * * * *
*       *
*       *
* * * * *

*/

import java.util.Scanner;
public class HollowRectangle{
    public static void Hollowrectangles(int rows , int cols){
        for (int i=1;i<=rows;i++){
            for (int j=1;j<=cols;j++){
                // Want stars where rows = 1 or rows  or cols = 1 or cols
                if (i==1|| i==rows || j==1|| j==cols){
                    System.out.print("* ");
                }
                else{
                    // else We want spaces
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        Hollowrectangles(rows , cols);
        sc.close();
    }
}