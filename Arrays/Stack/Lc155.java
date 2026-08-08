package Stack;
import java.util.Stack;
 class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public MinStack(){
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    public void push(int val){
        stack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }else{
            minStack.push(Math.min(val, minStack.peek()));
        }
    }
    public void pop(){
        if(!stack.isEmpty()){
            stack.pop();
        }
        if(!minStack.isEmpty()){
            minStack.pop();
        }
    }
    public int top(){
        if(!stack.isEmpty()){
            return stack.peek();
        }
        return -1;
    }
    public int getMin(){
        if(!minStack.isEmpty()){
            return minStack.peek();
        }
        return -1;
    }
 }
 public class Lc155{
     public static void main(String[] args){
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        System.out.println(minStack.getMin()); // return 3
        minStack.pop();
        System.out.println(minStack.top());    // return 3
        System.out.println(minStack.getMin()); // return 3
    }
}        
        