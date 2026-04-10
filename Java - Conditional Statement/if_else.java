// Questions related to if-else  else-if  and switch-case

import java.util.*;

public class if_else{


    /************  Question 1  ***********/


    // positive or negative 
    public static void NumberIs(int number){
        if (number%2==0){
            // it is a even number 
            System.out.println(number + " is a Even number");
        }
        else {
            System.out.println(number + " is a Odd number");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int number = sc.nextInt();
        NumberIs(number);
        sc.close();
    }


    /************  Question 2  ************/
    

    // Temperature check 
    public static void IsFever(float temp){
        if (temp>100){
            System.out.println("You Have Fever !");
        }
        else {
            System.out.println("You Don't Have Fever");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your temperature in Celcius : ");
        float temp = sc.nextFloat();
        IsFever(temp);
        sc.close();
    }


    /************  QUestion 3  ***********/

    //  week check 
    public static void WeekIs(int week){
        switch (week) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid week number ");
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter week number (1-7) : ");
        int week = sc.nextInt();
        WeekIs(week);
        sc.close();
    }


    /********* Question 4 **********/


    // Ternary Statement  dtype var = condition ? true : false
    public static void main(String[] args) {
        int a = 39 , b = 19;
        boolean x = a>b? true : false;
        int y =b>a? a:b;
        System.out.println("x : " + x + " y : "+ y);
    }



    /********* Question 5 *********/

    // leap year check
    public static void IsLeapYear(int year){
        // leap year   1.for century eg. 2000 ,2100   2.non century eg.2025
        
        // for century 
        if (year%400==0){
            System.out.println(year + " it is Leap year");
        }
        if (year%100!=0){
            if (year%4==0){
                System.out.println(year + " it is Leap year");
            }
            else {
            System.out.println(year + " it is not a Leap year");
        }
        }
        else if(year%400!=0){
            System.out.println(year + " it is not a Leap year");
        }
        
    }
    // IsLeapYear
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = sc.nextInt();
        IsLeapYear(year);
        sc.close();
    }


}