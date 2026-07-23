package BinarySearch;
import java.util.*;
public class FindMin2 {     // Lc 154. Find Minimum in Rotated Sorted Array II

    public static void main(String[] args) {
        int[] arr = {1,1,1,0,1};
        System.out.println(MinSorted(arr));
    }

    public static int MinSorted(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if(arr[mid]==arr[left] && arr[mid]==arr[right]){
                left++;
                right--;
            } else if(arr[mid]>arr[right]){
                left=mid+1;
            } else {
                right=mid;
            }
        }
        return arr[left];
    }
}
