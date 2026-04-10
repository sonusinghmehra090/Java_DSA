/* -------
if n = 5 
*****
****
***
**
*

-----------*/

import java.util.*;

public class InvertedStar {
    public static void InvertedStars(int num){
        for (int i=1;i<=num;i++){
            for (int j=1;j<=num-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        InvertedStars(num);
        sc.close();
    }
}
