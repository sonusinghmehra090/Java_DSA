// --------- Problem : sub strings ------- // 

// eg. "abc" : "a","ab","abc","b","bc","c"
// eg. "abca": "a","ab","abc","abca","b","bc","bca","c,"ca","a"


public class SubSequenceString {
    public static void printSubSequence(String str,int idx,String newString){

        // base case 
        if(idx==str.length()){
            System.out.print(newString+" ");
            return;
        }
        char currString = str.charAt(idx);

        // lena h aage wala
        printSubSequence(str,idx+1, newString+currString);
        // nhi lena h aage wala
        printSubSequence(str,idx+1,newString);
    }
    public static void main(String args[]){
        printSubSequence("aba",0,"");
    }
}
