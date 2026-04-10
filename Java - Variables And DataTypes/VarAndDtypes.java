import java.util.*;

public class VarAndDtypes{

    /****************  Question 1 *************/
     
    public static float Average(int num1 , int num2 , int num3){
        int sum = num1 + num2 + num3;
        int average = sum/3;
        return average;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1 :");
        int a = sc.nextInt();
    
        System.out.print("enter num2 :");
        int b = sc.nextInt();
    
        System.out.print("enter num3 :");
        int c = sc.nextInt();
        float value = Average(a,b,c);
        System.out.println("average of "+ a +","+ b + "," + c +" : " + value);
        sc.close();
    }

    /*********** Question 2 ***********/
    public static float Area(float side){
        float area_sq = side*side;
        return area_sq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();
        float value = Area(side);
        System.out.println("area of square with side " + side + " is  "+ (float)value +" unit square");
        sc.close();
    }


    /*********  Question 3  ***********/


    public static void Bill(float pencil , float pen , float eraser){
        float sum = pencil + pen + eraser;
        System.out.println("cost of items :" + sum);
        float TotalBill = sum + sum*18/100;
        System.out.print("Total price after 18% GST : " + TotalBill);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        Bill(pencil,pen,eraser);

        sc.close();
    }


    /************ Question 4 ************/

    public static void main(String[] args) {
        int $ = 102;
        System.out.println($);
        // note -> dollor symbol can be used as variable 
    }

}