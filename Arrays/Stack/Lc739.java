package Stack;
import java.util.*;
public class Lc739 {
    public static int[] dailyTemperatures(int[] temperatures) {
    int[] ans=new int[temperatures.length];
    Stack<Integer> stack = new Stack<>();
    for(int i=0;i<temperatures.length;i++){
        while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
            int prev = stack.pop();
            ans[prev] = i-prev;
        }
        stack.push(i);
    }
    return ans; 
}
public static void main(String[] args){
    int[] temperatures = {73,74,75,71,69,72,76,73};
    int[] ans = dailyTemperatures(temperatures);
    for(int i=0;i<ans.length;i++){
        System.out.print(ans[i]+" ");
    }
}
}
