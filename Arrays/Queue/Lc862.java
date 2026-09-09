import java.util.*;
public class Lc862 {
    public int shortestSubarray(int[] nums,int k){
        int n=nums.length;
        long[] prefix=new long[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        Deque<Integer> dq = new LinkedList<>();
        int ans=n+1;
        for(int j=0;j<=n;j++){
            while(!dq.isEmpty() && prefix[j]-prefix[dq.peekFirst()]>k){
                ans=Math.min(ans,j-dq.pollFirst());
            }
            while(!dq.isEmpty() && prefix[j]<=prefix[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(j);
        }
        return ans==n+1?-1:ans;
    }
    public static void main(String[] args){
        Lc862 lc862 = new Lc862();
        int[] nums = {1, 2};
        int k = 4;
        int result = lc862.shortestSubarray(nums, k);
        System.out.println(result);
    }
    
}

