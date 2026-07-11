import java.util.*;

public class recursionQuesPart2{
    // ----------- Question 1 -------- // 
    // Print all the indices of specific key  
    public static void PrintKeyIndices(int arr[],int idx,int key){
        if (idx==arr.length){
            return;
        }
        if (arr[idx]==key){
            System.out.print(idx+" ");
        }
        PrintKeyIndices(arr,idx+1,key);
    }
    // ----------- Question 2 -------- // 
    static String numbers[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void NumToString(int num ){
        //base case
        if (num==0){
            return;
        }
        int rem=num%10;
        num = num/10;
        NumToString(num);
        System.out.print(numbers[rem]+" ");
    }

    // --------- Question 3 --------- // 
    public static void StringLength(String str,int idx){
        if (idx == str.length()){
            System.out.print(idx);
            return;
        }
        StringLength(str,idx+1);
    }
    // --------- Question 4 --------- //

    // Tower of hanoi 
    public static void TowerOfHanoi(int n,String src,String helper,String dest){
        // base case 
        if (n==1){
            System.out.println(n + " transfer from "+src +" to " + dest);
            return;
        }
        TowerOfHanoi(n-1,src,dest,helper);
        System.out.println(n + " transfer from "+src +" to " + dest);
        TowerOfHanoi(n-1,helper,src,dest);

        // time complexity and space complexity ==> O(2^n-1) 
    }

    // --------- Question 5 --------- //

    // print a string in reverse   abcd => dcba
    public static void reverseString(String str,int idx){
        // base case 
        if (idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverseString(str,idx-1);
    }

    // -------- Question 6 -------- //

    static int first = -1;
    static int last = -1;
    public static void findOccurance(String str,int idx,char key){
        // base case 
        if (idx == str.length()){
            System.out.println("first occurace of "+key +" at index "+first);
            System.out.println("last occurace of "+key +" at index "+last);
            return;
        }
        // find the current character 
        char currchar = str.charAt(idx);
        if (currchar==key){
            if (first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        findOccurance(str,idx+1,key);
    }

    // ---------- Question 7 ---------- //

    // move all x to the end of string  axb = abx  axxb  = abxx
    static int Xcount = 0;
    public static void MoveX(String str,StringBuilder newString,int idx){
        // base case 
        if (idx==str.length()){
            for (int i=0;i<=Xcount;i++){
                newString.append("x");
            }
            System.out.print(newString);
            return;
        }
        char curr = str.charAt(idx);
        if (curr == 'x'){
            Xcount++;
        }
        else{
            newString.append(curr);
        }
        MoveX(str,newString,idx+1);
    } 
    
    public static void main(String args[]){
        // int arr[] = {3,2,4,5,6,2,7,2,2};
        // int key = 2;
        // PrintKeyIndices(arr,0,key);
        // NumToString(2010);
        // String str = new String("superman");
        // StringLength(str,1);
        // TowerOfHanoi(2,"A","B","C");
        // String str = "1213asjjgesiiasjsowoamfad";
        // reverseString(str,str.length()-1);
        // findOccurance(str,0,'a');
        MoveX("so",new StringBuilder(""),0);

    }
}