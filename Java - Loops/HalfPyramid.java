import java.util.Scanner;

/*
if num = 5

1
12
123
1234
12345

*/

public class HalfPyramid {
    public static void HalfPyramids(int num){
        for (int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        HalfPyramids(num);
        sc.close();
    }
}
