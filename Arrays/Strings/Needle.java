package Strings;

public class Needle {     // lc 28
    public static int strStr(String haystack, String needle) {
        for(int i=0;i<=haystack.length()-needle.length();i++){
            for(int j=0;j<needle.length();j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }
                if(j == needle.length()-1){
                    return i;
                }
            }
        }
        return -1;
}
    public static void main(String[] args){
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack,needle));
    }
}
