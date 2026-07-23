package BinarySearch;
import java.util.*;
public class FindMin {     // Lc 153. Find Minimum in Rotated Sorted Array
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(MinSorted(arr));
    }
    public static int MinSorted(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
    if(arr[mid]>arr[right]){
        left=mid+1;
    } else {
        right=mid;
    }
}
    return arr[left];
}
}
