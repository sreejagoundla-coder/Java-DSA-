package Strings;
import java.util.HashMap;
public class Lc219 {
    public static boolean containsDuplicate(int[] nums, int k){
        if(nums.length==0){
            return false;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int distance = i-map.get(nums[i]);
                if(distance<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 3;
        System.out.println(containsDuplicate(nums,k));
    }
}
