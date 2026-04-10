import java.util.*;
// assignment questions 
    public class JavaBasic{



    // **********  question 1  ***********//


    public static boolean isTwice(int arr[]){
        // nested loop
        int n = arr.length;
        for (int i=0 ; i<n;i++){
            for (int j=i+1 ; j<n ;j++){
                if (arr[i]==arr[j]){
                    return true;
                }
            }
        }return false;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,1};
        boolean value = isTwice(arr);
        System.out.print(value);

    }


    //********* question 2 *********** */



    // find the index of a targeted value from a given array

    public static int IndexAt(int arr[],int target){
        int idx=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                idx=i;
                return idx;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,35,7,3,53};
        Scanner sc = new Scanner(System.in);
        System.out.print("enter target value : ");
        int target = sc.nextInt();
        int value = IndexAt(arr,target);
        System.out.println(value);
        sc.close();
        
    }



    //********* Question 3 ******** */



    // finding the maximum profit from stock price- DSA question 

    public static int StockProfit(int price[]){
        int CostPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;
        for (int i=0; i<price.length;i++){
            if (CostPrice < price[i]){
                int profit = price[i]-CostPrice;
                MaxProfit = (int)Math.max(profit , MaxProfit);
            }
            else {
                CostPrice = price[i];
            }
        }
        return MaxProfit;

    }
    public static void main(String[] args) {
        int price[] = {7,1,5,4,3,20};
        int profit = StockProfit(price);
        System.out.println("your maximum profit : "+ profit);
    }


    /***********  Question - 4 ***********/



    // Trap water - DSA question 

    public static int Trap_Water(int height[]){
        int n = height.length;
        // leftmax and rightmax
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];
        int WaterLevel = 0;
        int width = 1;
        int count = 0;
        // for left max
        leftmax[0] = height[0];
        for (int i=1;i<n;i++){
            leftmax[i] = (int) Math.max(leftmax[i-1],height[i]);
        }
        // for rightmax 
        rightmax[n-1]=height[n-1];
        for (int j=n-2;j>=0;j--){
            rightmax[j] = (int) Math.max(height[j],rightmax[j+1]);
        }
        // minimum of the left and right max  -> waterlevel
        for (int i=0;i<n ;i++){
            WaterLevel = Math.min(leftmax[i],rightmax[i]);
            int Trap_water = (WaterLevel - height[i])*width;
            count+=Trap_water;
        }
        return count;
    }
    public static void main(String[] args) {
        int bar_height[] = {4,2,0,3,2,5};
        int value = Trap_Water(bar_height);
        System.out.println("max trap water : "+ value);
    }



    /*********** Question 5 ***********/



    public static void AllTriplet(int nums[]){
        int n = nums.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                for (int k=j+1;k<n;k++){
                    if (i!=j && i!=k && j!=k){
                        if (nums[i]+nums[j]+nums[k]==0){
                            System.out.println("["+nums[i]+","+nums[j]+","+nums[k]+"]");
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        AllTriplet(nums);

    }
}
    