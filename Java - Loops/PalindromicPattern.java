/*
for num = 5 (lines)
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5

*/

import java.util.Scanner;

public class PalindromicPattern {
    public static void PalindromicPatterns(int num){
        // spaces (num-i) --> n n-- then n++ 
        // next line  
        int n=1;
        for (int i=1;i<=num;i++){
            // spaces (num-i)
            for (int s=1;s<=num-i;s++){
                System.out.print("  ");
            }
            // numbers 
            for (int j=1;j<=i;j++){
                System.out.print(n+" ");
                n--;
            }
            n++;
            for (int k=1;k<=i-1;k++){
                n++;
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
        PalindromicPatterns(num);
        sc.close();

    }
}
