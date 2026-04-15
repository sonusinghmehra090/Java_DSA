import java.util.*;

public class LargestString {
    public static void LargestIs(String fruits[]){
        String largest = fruits[0];
        for (int i=1;i<fruits.length;i++){ 
            if (largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.print(largest+" is largest By lexicographically");
    }
    public static void main(String[] args) {
        String fruits[] = {"apple","mango","banana"};
        LargestIs(fruits);
    }
}
