package Stack;
import java.util.Stack;
public class Lc42 {
public static int maxArea(int[] height){
    int water = 0;
    Stack<Integer> stack = new Stack<>();
    for(int i=0;i<height.length;i++){
       while(!stack.isEmpty() && height[i]>height[stack.peek()]){
        int mid=stack.pop();
        if(stack.isEmpty()){
            break;
        }
        int left=stack.peek();
        int width=i-left-1;
        int h=Math.min(height[left],height[i])-height[mid];
        water+=width*h;
    }
        stack.push(i);
    }
    return water;
}
public static void main(String[] args){
    int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
    System.out.println(maxArea(height));
}
}


