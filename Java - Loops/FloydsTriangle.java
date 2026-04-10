/*
if num = 5(lines)

1
2 3
4 5 6
6 7 8 9 10
11 12 13 14 15

*/

import java.util.Scanner;

public class FloydsTriangle {
    public static void FloydsTriangles(int num){
        int n=1;
        for (int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                System.out.print(n+ " ");
                n++;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        FloydsTriangles(num);
        sc.close();

    }
}
