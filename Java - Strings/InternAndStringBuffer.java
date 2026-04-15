public class InternAndStringBuffer{
    public static void Intern(){
        String s1 = new String("Hello");
        String s2 = "Hello";
        System.out.println("before Interning : "+(s1 == s2));
        // comparison with reference ==  false as object has different memory address
        s1 = s1.intern();
        // intern look for duplicate if exist assign the reference that makes == true.
        System.out.println("after Interning : "+(s1==s2));

    }
    public static void stringBuffer(){
        // Mutable   StringBuffer can be 
        // 1.append() 
        // 2.insert(idx,str_to_add)
        // 3.delete(start_index , end_index) 
        // 4.reverse()
        // 5.replacing 
        StringBuffer str = new StringBuffer("Hello World");

        // replace(start,end,string to add);
        str.replace(1,4,"son");
        System.out.println(str);

        // Inserting(index , string to add);
        str.insert(5,"gojo");
        System.out.println(str);

        // Deleting(start_index , end_index);
        str.delete(5,10);
        System.out.println(str);

        // append(char)  at last;
        str.append(20);
        System.out.println(str);

        // reversing()
        System.out.println(str.reverse());
    }
    public static void main(String[] args) {
        Intern();
        // use intern we not want duplicate values in memory 
        stringBuffer();
        // use stringBuffer if want to change the string (modify : inserting , append , reverse , replace , )
    }
}