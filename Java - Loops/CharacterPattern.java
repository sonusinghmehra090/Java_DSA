/*
if num = 4

A
BC
DEF
GHIJ

*/

import java.util.Scanner;

public class CharacterPattern {
    public static void CharacterShift(int num){
        char ch='A';
        for (int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        CharacterShift(num);
        sc.close();
    }
}
