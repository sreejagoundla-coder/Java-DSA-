package Stack;
import java.util.Stack;
public class Lc402{
    public static String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<num.length();i++){
            char c = num.charAt(i);
    while(!stack.isEmpty() && k>0 && stack.peek()>c){
        stack.pop();
        k--;
    }
    stack.push(c);
}
    while(k>0){
        stack.pop();
        k--;
    }
    for(char c : stack){
        sb.append(c);
    }
    int start = 0;

while (start < sb.length() && sb.charAt(start) == '0') {
    start++;
}

if (start == sb.length()) {
    return "0";
}

return sb.substring(start);
   
}
public static void main(String[] args){
    String num = "10200";
    int k=2;
    String ans=removeKdigits(num , k);
    System.out.println(ans);
}
}