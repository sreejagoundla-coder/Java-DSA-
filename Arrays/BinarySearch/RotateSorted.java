package BinarySearch;
public class RotateSorted {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,0,1}; //LC 81
        int target = 0;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                System.out.println(mid);
                return;
            }
            if(nums[left] == nums[mid] && nums[mid] == nums[right]){
        left++;
        right--;
    }
            else if(nums[left]<=nums[mid]){
                if(nums[left]<=target && target<nums[mid]){
                   right=mid-1; 
                }
                else{
                left = mid + 1;  
            }
        }
        else{
                if(nums[mid]<target && target<=nums[right]){                if(nums[left]<=target && target<nums[mid]){
                   right=mid-1; 
                }
                else{
                left = mid + 1;  
            }
        }
        else{
                if(nums[mid]<target && target<=nums[right]){
                    left=mid+1;

            }
        }
    }
}
