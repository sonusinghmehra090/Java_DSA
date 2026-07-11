public class KeypadCombination {
    public static String keypad[] = {" ","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void Keypad(String str,int idx,String combination){

        // base case 
        if (idx==str.length()){
            System.out.print(combination+" ");
            return;
        }
        char currChar = str.charAt(idx);
        String value = keypad[currChar-'0'];
        for (int i=0;i<value.length();i++){
            char keyvalue = value.charAt(i);
            Keypad(str,idx+1,combination+keyvalue);
        }
    }
    public static void main(String args[]){
        Keypad("24",0,"");

    }
}
