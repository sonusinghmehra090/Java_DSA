// --------- Problem : Remove Duplicate from String ----- //


// eg . "intelligent" after removing duplicate ==> intelg
// eg . "racecar" after removing duplicate ==> race


// hint => 'a'-'a' = 0    'b'-'a'= 1 'c'-'a'=2  'z'-'a'=25

public class removeDuplicate {
    public static void DuplicateRemove(String str,int idx,boolean stringArr[],StringBuilder newString){
        //base case 
        if (idx==str.length()){
            System.out.print(newString);
            return;
        }

        char curr = str.charAt(idx);
        int Arridx = curr-'a';
        if (stringArr[Arridx]==true){
            newString.append("");
        }
        else{
            newString.append(curr);
            stringArr[Arridx]=true;
        }
        DuplicateRemove(str,idx+1,stringArr,newString);
        
    }
    public static void main(String args[]){

        boolean stringArr[] = new boolean[26];
        // [false,false,false .....false] 
        DuplicateRemove("helloworld",0,stringArr,new StringBuilder(""));
    }
}
