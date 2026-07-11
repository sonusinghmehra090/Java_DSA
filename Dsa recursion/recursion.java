import java.util.*;
public class recursion{

    //  ---------- Question 1 ---------- // 

    public static void DecNum(int num){
        if (num==1){
            System.out.println(num);
            return; // pass
        }
        System.out.print(num+ " ");
        DecNum(num-1);

    }

    //  ---------- Question 2 ---------- // 

    public static void IncNum(int num){
        if (num==10){
            System.out.println(num);
            return;
        }
        System.out.print(num + " ");
        IncNum(num+1);
    }

    //  ---------- Question 3 ---------- // 

    public static void IncOrder(int num){
        if (num ==1){
            System.out.print(num + " ");
            return;
        }
        IncOrder(num-1);
        System.out.print(num + " ");
    }

    //  ---------- Question 4 ---------- // 

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

    //  ---------- Question 5 ---------- // 

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

    //  ---------- Question 6 ---------- // 

    public static int Fact(int num){
        // base case
        if (num==1){
            return 1;
        }
        return num * Fact(num-1);
    }

    //  ---------- Question 7 ---------- // 

    public static int FibonacciNum(int n){
        // 0 1 1 2 3 5 8 13 ...
        if (n==1||n==0){
            return n;
        }
        int fibnm1=FibonacciNum(n-1);   // fib(5) --> fib(4) --> fib(3) --> fib(2) --> 1
        int fibnm2=FibonacciNum(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }

    //  ---------- Question 8 ---------- // 

    public static boolean isSorted(int arr[],int i){
        if (i==arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }

    //  ---------- Question 9 ---------- // 

    public static int FirstOccurance(int arr[],int key , int i){
        if (i==arr.length){
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
        return FirstOccurance(arr,key,i+1);
    }

    //  ---------- Question 10 ---------- // 

    public static int LastOccurace(int arr[],int key , int i){
        // going to last
        if (i==arr.length){
            return -1;
        }
        int value = LastOccurace(arr,key,i+1); // value = -1  i=arr.length-1
        if (value ==-1 && arr[i]==key){
            return i;
        }
        return value;
    }

    //  ---------- Question 11 ---------- //
    
    public static int power(int x , int n){
        // x=2 n=4   power(2,4) = 2*8 = 16  power(2,3) = 2*4=8   power(2,2) = 2*2 = 4 power(2,1) = 2*1 = 2
        if (n==0){
            return 1;
        }
        int pow = 2*power(x,n-1);
        return pow;
    }

    //  ---------- Question 12 ---------- //

    public static int OptimisedPower(int x , int n){
        // calling half powers
        if (n==0){
            return 1;
        }
        int halfPower = OptimisedPower(x,n/2);
        int OptimisedHalfPower = halfPower * halfPower;
        
        // if n id odd
        if (n%2!=0){
            OptimisedHalfPower = x * OptimisedHalfPower;
            return OptimisedHalfPower;
        }
        return OptimisedHalfPower;
    }

    public static int LoopedLastOccurance(int arr[],int key){
        for (int i=0;i<=arr.length-1;i++){
            if (arr[arr.length-1-i]==key){
                return arr.length-1-i;
            }
        }
        return -1;
    }

    //  ---------- Question 13 ---------- //
    
    public static int TilingProblem(int n){
        // base case 
        if (n==1||n==0){
            return 1;
        }
        // vertical choice 
        int vert = TilingProblem(n-1);

        // horizontal case
        int horiz = TilingProblem(n-2);

        // Total ways 
        int TotWays = vert + horiz;
        return TotWays;
    }

    //  ---------- Question 14 ---------- //
    
    public static void RemoveDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
        // base case 
        if (idx == str.length()){
            System.out.print(newStr);
            return;
        }
        char ch=str.charAt(idx);
        if (map[ch-'a']==true){
            RemoveDuplicate(str, idx+1,newStr,map);
        }
        else{
            map[ch-'a']=true;
            RemoveDuplicate(str, idx+1,newStr.append(ch),map);
        }
    }
    public static void LoopedRemovedDuplicate(String str,boolean arr[]){
        StringBuilder newStr = new StringBuilder("");
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (arr[ch-'a']==true){
                continue;
            }
            else{
                arr[ch-'a']=true;
                newStr.append(ch);
            }
        }
        System.out.println(newStr);
    }
    public static void BinaryString(int n,int lastplace,String str){
    //                              (2 , '0' , 0)
        // base case 
        if (n==0){
            System.out.println(str);
            return;
        }
        if (lastplace==0){ 
            BinaryString(n-1,0,str+"0");
            BinaryString(n-1,1,str+"1");
        }
        else{
            BinaryString(n-1,0,str+"0");     
        }
        // BinaryString(n-1,str+="0",0);
        // if (lastplace==0){
        //     BinaryString(n-1,str+="1",1);
        // }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number : ");
        // int num = sc.nextInt();
        // DecNum(10); 
        // IncNum(1);
        // EvenNum(3);
        // OddNum(1);
        // System.out.print(Fact(num));
        // IncOrder(num);
        // int value = FibonacciNum(num);
        int arr[] = {5,5,5,29,19,5};
        int key = 50;
        int x = 2;
        int n = 5;
        // boolean value = isSorted(arr,0);
        // int FirstValue = FirstOccurance(arr,key,0);
        // int LastValue = LastOccurace(arr,key,0);
        // System.out.println(FirstValue);
        // System.out.println(LastValue);
        // int value = power(x,n);
        // System.out.println(value);
        // int value = OptimisedPower(x,n);
        // System.out.println(value);
        // int value = LoopedLastOccurance(arr,key);
        // System.out.println(value);
        // int value = TilingProblem(n);
        // System.out.println(value);
        String str = "sonusingh";
        // RemoveDuplicate(str,0,new StringBuilder(""), new boolean[26]);
        // LoopedRemovedDuplicate(str,new boolean[26]);
        BinaryString(3,0,"");
        sc.close();
    }
}


// 0 1 n=3  000 001 010 100 101 