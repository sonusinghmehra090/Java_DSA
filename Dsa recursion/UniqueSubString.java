// --------- Problem : Unique print Sub strings ----------- //

// eg . "aba"  printing the substring ==> "aba","ab","a","ba","b","a"

// but twist is we have to print the unique strings therefore answer should be ==> "aba","ab","a","ba","b"

// hint : using a HashSet data structure from java.util.HashSet    set ==> stores unique values 

// we going to store every substring and apply a condition whether the set contains that substring or not if yes if simply return else store in set

import java.util.HashSet;


public class UniqueSubString{
    public static void PrintUniqueSubString(String str,int idx,String newString,HashSet<String> set){
        // base case 
        if (idx==str.length()){
            if (set.contains(newString)){
                return;
            }else{
                System.out.print(newString+" ");
                set.add(newString);
                return;
            }
        }

        // calling substring
        char currChar = str.charAt(idx);  // "abc"  currChar = a  newstring = ""+"a" = "a"  "ab" "ab"+currchar"c" ="abc"
        PrintUniqueSubString(str,idx+1,newString+currChar,set);
        PrintUniqueSubString(str,idx+1,newString,set);

        
    }
    public static void main(String args[]){
        HashSet<String> set = new HashSet<>();
        String str = "aba";
        PrintUniqueSubString(str,0,"",set);
    }
}