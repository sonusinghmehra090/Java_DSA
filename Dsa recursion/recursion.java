import java.util.*;
public class recursion{
    public static void DecNum(int num){
        if (num==1){
            System.out.println(num);
            return; // pass
        }
        System.out.print(num+ " ");
        DecNum(num-1);

    }
    public static void IncNum(int num){
        if (num==10){
            System.out.println(num);
            return;
        }
        System.out.print(num + " ");
        IncNum(num+1);
    }
    public static void IncOrder(int num){
        if (num ==1){
            System.out.print(num + " ");
            return;
        }
        IncOrder(num-1);
        System.out.print(num + " ");
    }

    public static void EvenNum(int num){
        // defining the base case
        if (num ==20){
            System.out.println(num);
            return;
        }
        if (num%2==0){
            System.out.print(num + " ");
            EvenNum(num+2);
        }
        if (num%2!=0){
            EvenNum(num+1);
        }
    }
    public static void OddNum(int num){
        // base case define 
        if (num == 11){
            System.out.println(num);
            return;
        }
        if (num%2!=0){
            System.out.print(num + " ");
            OddNum(num+2);
        }
        else if (num%2==0){
            OddNum(num+1);
        }
    }
    public static int Fact(int num){
        
        // base case
        if (num==1){
            return 1;
        }
        return num * Fact(num-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        // DecNum(10); 
        // IncNum(1);
        // EvenNum(3);
        // OddNum(1);
        // System.out.print(Fact(num));
        IncOrder(num);
        sc.close();
    }
}
