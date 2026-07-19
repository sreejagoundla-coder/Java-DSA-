import java.util.*;
public class FindMin2 {     // Lc 154. Find Minimum in Rotated Sorted Array II

    public static void main(String[] args) {
        int[] nums = {1,1,1,0,1};
        System.out.println(MinSorted(nums));
    }

    public static int MinSorted(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid]==nums[left] && nums[mid]==nums[right]){
                left++;
                right--;
            } else if(nums[mid]>nums[right]){
                left=mid+1;
            } else {
                right=mid;
            }
        }
        return nums[left];
    }
}
