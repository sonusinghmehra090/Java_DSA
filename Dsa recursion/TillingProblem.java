// --------- Tiling Problem : given 2*n metrics board and tile of metrics 2*1 

// eg. let n = 0 number of ways tiling is 1 i.e no tile to be place
// eg. let n = 1 board =>> 2*1 i.e 1 way => vertical 2*1
// eg. let n = 2 board =>> 2*2 ways => vertical tiles 2*1 space left 1 (n-1) => 1 way    horizontal tiles 1*2 space left 0 horizontal tile taking 2 spaces (n-2) => 1 ways 
                                                // total ways vertical ways + horizontal ways = 2

// eg. let n = 3 board =>> 2*3 ways => vertical 1 ways     horizontal 1*2 (n-2)+vertical  = 2 ways  total 2+1 = 3 ways


// t(3) 3!=0 or 1 fnm1 = t(2)  t(2) 2!=0 or 1 t(1) fnm1 = 1  n=2 ,fnm2 = t(2-2) = t(0) fn =   n=3 t(1) = 1 

public class TillingProblem {
    public static int Tilling(int n){
        // base case 
        if (n==0||n==1){
            return 1;
        }
        // vertical choice
        
        int fnm1 = Tilling(n-1);
        // horizontal choice 
        int fnm2 = Tilling(n-2);
        int fn = fnm1+fnm2;
        return fn;
    }
    public static void main(String[] args) {
        int value = Tilling(5);
        System.out.print(value);
    }
}
