package BinarySearch;
import java.util.*;
public class Splitarr{
    public boolean isPossible(int[] nums, int k, int mid){
        int count=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]>mid){
                count++;
                sum=nums[i];
            }else{
                sum+=nums[i];
            }
        }
        return count<=k;
    }
    public int splitArray(int[] nums, int k) {
int left=max(nums);
int right=sum(nums);
while(left<=right){
    int mid=left+(right-left)/2;
    if(isPossible(nums,k,mid)){
        right=mid-1;
    }else{
        left=mid+1;
}
}
return left;  
    }
    public int max(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        return max;
    }
    public int sum(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums={7,2,5,10,8};
        int k=2;
        Splitarr obj=new Splitarr();
        System.out.println(obj.splitArray(nums,k));
    }
}
