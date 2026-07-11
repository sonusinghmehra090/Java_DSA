// problem : "aba" substring => ab,a,ba,aa,a,aba
// print those substring which are palindrome  : aba,a,aa,a


public class contigousSubSequence {
    public static void contiguousSequence(String str,int idx,String newString){
        // base case 
        if (idx == str.length()){
            if (newString.length()==1){
                System.out.print(newString+" ");
                return;
            }else{
                boolean isPalindrome = true;
                // whether the substring is a palindrome or not eg. "abba" 4  4-i-1   4-1-1 = 2
                for (int i=0;i<newString.length()/2;i++){
                    if (newString.charAt(i)!=newString.charAt(newString.length()-i-1)){
                        isPalindrome = false;
                        return;
                    }
                }
                if (isPalindrome){
                    System.out.print(newString+" ");
                    return;
                }
            }
        }
        char currChar = str.charAt(idx);
        contiguousSequence(str,idx+1,newString+currChar);
        contiguousSequence(str,idx+1,newString);
    }
    public static void main(String args[]){
        contiguousSequence("aba",0,"");
    }
}
