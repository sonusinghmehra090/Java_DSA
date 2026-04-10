/*
for num=5(lines)
 
    *****
   *****
  *****
 *****
*****  

5 stars each line
*/

import java.util.Scanner;

public class SolidRhombus{
    public static void SolidRhombuses(int num){
        // spaces (num-i) --> stars (5)
        
        for (int i=1;i<=num;i++){
            // spaces (num-i)
            for (int s=1;s<=num-i;s++){
                System.out.print(" ");
            }
            // stars (1-num)
            for (int j=1;j<=num;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        SolidRhombuses(num);
        sc.close();

    }
}
