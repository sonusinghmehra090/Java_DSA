public class StringCompression {
    public static String StringBuilderCompression(String str){
        StringBuilder sb = new StringBuilder("");
        for (int i=0;i<str.length();i++){
            Integer count = 1; // as we have to make it string
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            sb.append(count.toString());
        }
        return sb.toString();
    }
    public static String stringCompression(String str){
        String newStr = "";
        for (int i=0;i<str.length();i++){
            Integer count = 1;
            while (str.charAt(i)==str.charAt(i+1) && i<str.length()-1){
                count++;
                i++;
            }
            newStr +=str.charAt(i);
            newStr +=count.toString();
        }
        return newStr;
    }
    public static void main(String[] args) {
       String str = "aaabbcccdd"; 
    //    System.out.println(StringBuilderCompression(str));
       System.out.println(stringCompression(str)); 
    }
    

}
