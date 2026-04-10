/*
for num = 4  -> 2*4 line pattern 

   *
  ***
 *****
*******
*******
 *****
  ***
   *  

*/

import java.util.Scanner;

public class DiamondPattern {
    public static void DiamondPatterns(int num){
        // spaces (num-i) --> stars (2i-1) odd numbers
        
        for (int i=1;i<=num;i++){
            // spaces (num-i)
            for (int s=1;s<=num-i;s++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=num;i>0;i--){
            // spaces (num-i)
            for (int s=1;s<=num-i;s++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        DiamondPatterns(num);
        sc.close();
    }
}
