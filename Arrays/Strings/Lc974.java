package Strings;
import java.util.HashMap;
public class Lc974 {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        int sum=0;
        map.put(0, 1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem =sum%k;
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        Lc974 obj = new Lc974();
        int [] nums = {4,5,0,-2,-3,1};
        int k = 5;
        System.out.println(obj.subarraysDivByK(nums,k));
    }
}
