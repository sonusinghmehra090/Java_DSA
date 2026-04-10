import java.util.*;

public class Loops{

    // ------------ Question 1 ---------- //

    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            System.out.print(i + " ");
        }
    }

    // ------------ Question 2 ---------- //

    public static void main(String[] args) {
        for(int i=5;i>=0;i--){
            System.out.print(i + " ");
        }
    }

    // ------------ Question 3 ---------- // 
     
    // Nested loops
    public static void main(String[] args) {
        for (int i=1;i<=3;i++){
            for (int j=1;j<=2;j++){
                System.out.print("["+i+","+j+"] ");
            }
        }
    }

    // ------------- Question 4 ---------- // 

    // print sum of digits of numbers 
    public static int Sum(int num){
        // num = 312
        int sum =0;
        while (num>0){
            int lastdigit = num%10;
            // ld = 312 % 10 = 2 
            sum+=lastdigit;
            num/=10;
            // num = (int) 312/10 = 31
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int value = Sum(num);
        System.out.println("Sum of digit "+num+ " is " + value );
        sc.close();
    }

    // ----------- Question 5 ---------- //

    // Find the Factorial of any given number 

    public static long Factorial(long num){
        // 5! = 1*2*3*4*5
        long fact = 1;
        for (int i=1;i<=num;i++){
            fact *=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        long num = sc.nextInt();
        long value = Factorial(num);
        System.out.println(num+ "! = " + value);
        sc.close();
    }

    // ---------- Question 6 -----------//

    // multiplication 
    public static void main(String[] args) {
        // multiplication 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(num + " * " + i + " = "+ num*i);
        }
        sc.close();
    }
}