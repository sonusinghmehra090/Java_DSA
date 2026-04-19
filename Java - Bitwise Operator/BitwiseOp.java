import java.util.Scanner;

public class BitwiseOp{

    // ---------------  Question 1  check whether number is even or odd ------------- //

    public static void isEven(int num){
        // checking the bits LSB(least significant bit)
        int BitMask = 1;
        int value = BitMask & num;
        // for 4(even) = 100  lsb = 0 
        // for 3(odd) = 011 lsb = 1
        if (value == 0){
            System.out.print(num + " is even");
        }
        else {
            System.out.print(num + " is odd");

        }
    }

    // --------------- Question 2  check whether number is power of 2 or not ----------- //

    public static void IsPowerOfTwo(int num){
        // for pow 2  4-(100) 3-(011)  4 & 3 = always 0;  same if num & num-1 == 0 power of 2 else not 
        if ((num & num-1)==0){
            System.out.print(num+" is power of 2 ");
        }
        else {
            System.out.print(num + " is not power of 2 ");
        }
    }

    // --------------- Quesetion 3 Count number of sets(1) in bits ------------- // 

    public static int Countsets(int num){
        // eg 1010 count = 2   1110  count = 3 
        // running iteration log2(n)+1 times 
        int count = 0 ;
        int BitMask = 1;
        while(num>0){
            if ((num & BitMask)==1){
                count++;
            }
            num = num>>1;
        }
        return count;
    }
    
    // -------------- Question 4 Fast Exponention ----------------- // 

    // time complexity = O(logn) 
    public static int FastExpo(int a , int b){
        // a ^ b 
        int value = 1;
        while (b>0){
            // b = 5   i.e = 101
            if ((b & 1)!=0){
                // 101 & 1 !=0 true;
                // value = 1*3
                value *=a;
            }
            // a = 3*3
            a = a*a;
            // b
            b=b>>1;
        }
        return value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number : ");
        // int num = sc.nextInt();
        // isEven(num);
        // IsPowerOfTwo(num);
        // System.out.print(Countsets(num));
        System.out.print(FastExpo(5,4));
        sc.close();
    }
}