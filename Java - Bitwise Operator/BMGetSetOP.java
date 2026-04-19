public class BMGetSetOP{
    // get bit - 0 or 1 from ith position 
    public static int GetIthBit(int num , int i){
        int bitmask = 1<<i;
        if ((num & bitmask)==0){
            return 0;
        }
        else {
            return 1;
        }
    }
    // set bit - 1 to ith position
    public static int SetIthBit(int num , int i){
        int bitmask = 1<<i;
        return num|bitmask;
    }
    // clear bit - 0 to ith position
    public static int ClearIthBit(int num , int i){
        int bitmask = ~(1<<i);
        return num & bitmask;
    }
    // update bit 0 or 1 at ith position 
    public static void UpdateIthBit(int num , int i , int newbit){
        if (newbit==1){
            System.out.print(SetIthBit(num , i));
        }
        else {
            System.out.print(ClearIthBit(num , i));
        }
    }
    // Clear Ith last bit 
    public static int ClearIthLastBit(int num , int i ) {
        int bitmask = (~0)<<i;
        return num & bitmask;
    }
    // clear range 
    public static int ClearRange(int num , int i , int j){
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        int BitMask = a | b ;
        return num & BitMask;
    }
    public static void main(String args[]){
        // UpdateIthBit(10,3,0);
        // System.out.print(ClearIthLastBit(10,3));
        System.out.print(ClearRange(39,2,5));
    }
}