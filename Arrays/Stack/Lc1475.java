package Stack;
import java.util.*;
public class Lc1475 {
    public static int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[prices.length];
        for(int i=prices.length-1;i>=0;i--){
            int current = prices[i];
            while(!stack.isEmpty() && stack.peek()>current){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=current;
            }else{
                ans[i]=current-stack.peek();
            }
            stack.push(current);
        }
        return ans;       
        }
        public static void main(String[] args){
            int[] prices = {8,4,6,2,3};
            int[] ans = finalPrices(prices);
            for(int i=0;i<ans.length;i++){
                System.out.print(ans[i]+" ");
            }
        }
        
}
