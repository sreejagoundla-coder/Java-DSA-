import java.util.*;
public class RotateSort2 {     // Lc 154. Find Minimum in Rotated Sorted Array II
    public static void main(String[] args) {
int[] nums = {2,2,2,0,1,2};
int left=0;
int right=nums.length-1;
int ans=Integer.MAX_VALUE;
while(left<=right){
    int mid=left+(right-left)/2;
    if(nums[left]==nums[mid] && nums[mid]==nums[right]){
        ans = Math.min(ans, nums[left]);
        left++;
        right--;
    }
    else if(nums[left]<=nums[mid]){
        ans=Math.min(ans,nums[left]);
        left=mid+1;
    }
    else{
        ans=Math.min(ans,nums[mid]);
        right=mid-1;
    }
}
System.out.println(ans);
    }
}
