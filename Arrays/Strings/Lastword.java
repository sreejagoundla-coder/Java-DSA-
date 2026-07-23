package strings;

public class Lastword {    //lc 58
    public static int lengthOfLastWord(String s){
        int length=0;
        int right=s.length()-1;
        while(right >= 0 && s.charAt(right) == ' '){
            right--;
        }
        while(right >= 0 && s.charAt(right) != ' '){
            length++;
            right--;
        }
        return length;
    }
    public static void main(String[] args){
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
    }
