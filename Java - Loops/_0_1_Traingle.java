/*
for num = 5 (lines)

(i=x,j=y | i+j = n if n%2==0 ==>print(1)  else print(0) )

1
01
101
0101
10101

*/

import java.util.Scanner;

public class _0_1_Traingle {
    public static void _0_1_Traingles(int num){
        // we want if i+j%2==0  1 else 0
        for (int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                if ((i+j)%2==0){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        _0_1_Traingles(num);
        sc.close();
    }
}
