import java.util.*;
public class SearchRange {   //Lc 34
public int firstOccurence(int[] nums, int target) {
    int left=0;
    int right=nums.length-1;
    int ans=-1;
    while(left<=right){
        int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                right=mid-1;
            }
             else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
         }
        return ans; 
}
public int LastOccurence(int[] nums,int target){
    int left=0;;
    int right=nums.length-1;
    int ans=-1;
    while(left<=right){
        int mid=left+(right-left)/2;
        if(nums[mid]==target){
            ans=mid;
            left=mid+1;
        }
        else if(nums[mid]<target){
            left=mid+1;
        }
        else{
            right=mid-1;
        }
    }
    return ans;
}
public static void main(String[] args) {
    SearchRange sr=new SearchRange();
    int[] nums={5,7,7,8,8,10};
    int target=8;
    int first=sr.firstOccurence(nums,target);
    int last=sr.LastOccurence(nums,target);
    System.out.println(Arrays.toString(new int[]{first,last}));
}
}