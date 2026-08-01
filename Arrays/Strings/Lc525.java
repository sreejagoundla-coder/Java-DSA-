package Strings;
import java.util.HashMap;
public class Lc525 {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int max = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum--;
            }else{
                sum++;
            }
            if(map.containsKey(sum)){
                max=Math.max(max,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Lc525 obj = new Lc525();
        int [] nums = {0,1};
        System.out.println(obj.findMaxLength(nums));
    }
}
