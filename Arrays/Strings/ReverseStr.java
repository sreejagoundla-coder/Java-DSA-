package strings;
public class ReverseStr {    //lc 344
    public static void reverseString(char[] s){
        int left=0;
        int right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args){
        char[] s={'h','e','l','l','o'};
        ReverseStr.reverseString(s);
        for(char c : s){
            System.out.print(c);
        }
        }
    }







// for leetcode 

    /*package strings;
public class ReverseStr {
    public void reverseString(char[] s){
        int left=0;
        int right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args){
        char[] s={'h','e','l','l','o'};
        ReverseStr obj=new ReverseStr();
        obj.reverseString(s);
        System.out.println(s);
    }
}
 */
