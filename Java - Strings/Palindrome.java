import java.util.*;

public class Palindrome{

    // ************** Method 1 ****************** //
    
    public static void IsPalindrome(String word){
        char ch[] = new char[word.length()];
        for (int i=0;i<word.length();i++){
            ch[i] = word.charAt(i);
        }
        int j=word.length()-1;
        int isTrue = 0;
        for (int i=0;i<ch.length;i++){
            if (ch[i]==ch[j]){
                isTrue++;
                j--;
            }
        }
        if (isTrue == word.length()){
            System.out.print(word + " it is a Palindrome");
        }
        else {
            System.out.print(word + " not a palindrome");
        }
    }

    // ************** Method 2 ****************** //

    public static boolean isPalindrome(String word){
        for (int i=0;i<word.length()/2;i++){
            int n=word.length();
            if (word.charAt(i)!=word.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word : ");
        String word = sc.next();
        // IsPalindrome(word);
        boolean value = isPalindrome(word);
        System.out.print(value);
        sc.close();
    }
}