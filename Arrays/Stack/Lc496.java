package Strings;
import java.util.Stack;
import java.util.HashMap;
public class Lc496 {
   Stack<Integer> stack = new Stack<>();
   HashMap<Integer, Integer> map = new HashMap<>();
   public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    for(int i=0;i<nums2.length;i++){
        while(!stack.isEmpty() && nums2[i]>stack.peek()){
            map.put(stack.pop(),nums2[i]);
        }
        stack.push(nums2[i]);
    }
    while(!stack.isEmpty()){
        map.put(stack.pop(),-1);
    }
    int[] ans = new int[nums1.length];
    for(int i=0;i<nums1.length;i++){
        ans[i]= map.get(nums1[i]);
    }
    return ans;
}
public static void main(String[] args){
    Lc496 obj = new Lc496();
    int[] nums1 = {4,1,2};
    int[] nums2 = {1,3,4,2};
    int[] ans = obj.nextGreaterElement(nums1, nums2);
    for(int i=0;i<ans.length;i++){
        System.out.print(ans[i]+" ");
    }
}
}      


       
