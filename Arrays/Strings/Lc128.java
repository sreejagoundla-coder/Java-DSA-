package Strings;
import java.util.HashSet;
public class Lc128 { 
    public static int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>(); 
        for(int num:nums){
            set.add(num);
        }
        int max = 1;
        for(int i=0;i<nums.length;i++){
        int num = nums[i];
        if(!set.contains(num-1)){
            int current = num;
            int count =1;
            while(set.contains(current+1)){
                current++;
                count++;
            }
            max = Math.max(max, count);
        }
    }
        return max;
}
   public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}

