import java.util.*;
public class PeakIndex{      // Lc 852. Peak Index in a Mountain Array
    public static void main(String[] args) {
        int[] arr = {0, 10, 5, 2};
        System.out.println(findPeakIndex(arr));
    }

    public static int findPeakIndex(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
    int mid=left+(right-left)/2;
    if(arr[mid]<arr[mid+1]){
        left=mid+1;
    }else{
        right=mid;
    }
}
return left;
    }
}
