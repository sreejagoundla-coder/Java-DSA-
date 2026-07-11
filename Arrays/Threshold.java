import java.util.*;
public class Threshold{    //LC 1283
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
int [] nums={1,2,5,9};
int left=1;
int right=max(nums);
int threshold=5;
int ans=Integer.MAX_VALUE;
while(left<=right){
    int mid=left+(right-left)/2;
    int sum=0;
    for(int i=0;i < nums.length;i++){
         sum += (nums[i] + mid - 1) / mid;

    }
    if(sum<=threshold){
        ans=mid;
        right=mid-1;
    }
    else{
        left=mid+1;
    }
}
System.out.println(ans);
    }
}