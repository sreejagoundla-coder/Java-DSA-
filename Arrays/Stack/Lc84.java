package Stack;
import java.util.Stack;
public class Lc84 {
   public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int MaxArea = 0;
        int width=0;
        for(int i =0;i<=heights.length;i++){
            int currentHeight;
          if(i==heights.length){
             currentHeight = 0;
          }else{
                currentHeight = heights[i];
          }
          while(!stack.isEmpty() && currentHeight<heights[stack.peek()]){
            int mid=stack.pop();
            if(stack.isEmpty()){
                 width = i;
            }else{
                 width = i-stack.peek()-1;
            }
            int area = heights[mid]*width;
            MaxArea = Math.max(MaxArea,area);
        }
        if(i<heights.length){
            stack.push(i);
        }
    }
        return MaxArea;
      }
      public static void main(String[] args){
        int[] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
      }
}
