package Strings;
import java.util.HashSet;
public class Lc217 {
    public static boolean containsDuplicate(int[] nums) {
        if(nums.length==0){
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                return true;
            }else{
                set.add(num);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
