package BinarySearch;
public class Book {
   public static int max(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        return max;
    }
    public static  int sum(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums={7,2,5,10,8};
        int k=2;
        int left=max(nums);
        int right=sum(nums);
        while(left<=right){
            int mid=left+(right-left)/2;
            int count=1;
        int pages=0;
            for(int i=0;i<nums.length;i++){
                if(pages+nums[i]>mid){
                    count++;
                    pages=nums[i];
                }else{
                    pages+=nums[i];
                }
            }
            if(count<=k){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        System.out.println(left);
    }
}