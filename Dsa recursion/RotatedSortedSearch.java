public class RotatedSortedSearch{
    public static int RotatedSearch(int arr[],int tar,int si,int ei){
        // base case 
        if (si>ei){
            return -1;
        }
        int mid = si+(ei-si)/2;
        if (arr[mid]==tar){
            return mid;
        }
        // mid in line 1
        if (arr[si]<=arr[mid]){
            // case 1 : tar is left side
            if (arr[si]<=tar && tar<arr[mid-1]){
                return RotatedSearch(arr,tar,si,mid-1);
            }
            // case 2 : tar is right side of line 1 + line 2
            else{
                return RotatedSearch(arr,tar,mid+1,ei);
            }
        }
        else{
            // case 3 : tar is right side of line 2 
            if (arr[mid+1]<=tar && tar<=arr[ei]){
                return RotatedSearch(arr,tar,mid+1,ei);
            }
            // case 4 : tar is left side of line 2+ line 1
            else{
                return RotatedSearch(arr,tar,si,mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,9,0,1,2};
        int target = 0;
        int tarIdx = RotatedSearch(arr,target,0,arr.length-1);
        System.out.print(target + " found on index "+tarIdx);
    }
}