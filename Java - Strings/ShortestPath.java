import java.util.*;

public class ShortestPath{
    public static int ShortestDistance(String path){
        int x = 0 , y=0;
        for (int i=0;i<path.length();i++){
            if (path.charAt(i)=='E'){
                x++;
            }
            if (path.charAt(i)=='W'){
                x--;
            }
            if (path.charAt(i)=='N'){
                y++;
            }
            if (path.charAt(i)=='S'){
                y--;
            }
            System.out.print("["+x+","+y+"] ");
        }
        return (int) Math.sqrt(x*x + y*y);


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your path directions eg. ENWS: ");
        String path = sc.next();
        int value = ShortestDistance(path);
        System.out.print("Shortest path : "+ value);
        sc.close();
    }
}