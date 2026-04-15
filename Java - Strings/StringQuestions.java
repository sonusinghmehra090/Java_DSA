public class StringQuestions {
    // ****** Question 1 ****** //
    public static void lowercaseVowels(String str){
        int count = 0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='a'){
                count++;
            }
            if (str.charAt(i)=='e'){
                count++;
            }
            if (str.charAt(i)=='i'){
                count++;
            }
            if (str.charAt(i)=='o'){
                count++;
            }
            if (str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("Total lowercase vowels : "+ count);
    }

    //  *********** Question 2 ********* // 
    
    public static void Replacement(String str){
        String newStr = str.replace(" ","");
        System.out.println(newStr);
    }

    // ***********  Question 3 ********* //

    public static boolean Anagrams(String str1 , String str2){
        int count =0;
        if (str1.length()!=str2.length()){
            return false;
        }
        for (int i=0;i<str1.length();i++){
            for (int j=0;j<str2.length();j++){
                if (str1.charAt(i)==str2.charAt(j)){
                    count++;
                }
            }
        }
        if (count==str1.length()){
            return true;
        }
        return false;
    }
    

    public static void main(String[] args) {
        String str = "hello world";
        String str1 = "race";
        String str2 = "care";
        Replacement(str);
        // Anagrams(str1,str2);
        lowercaseVowels(str);
        System.out.println(Anagrams(str1,str2));
   }
}
