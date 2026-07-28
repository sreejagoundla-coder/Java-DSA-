package Strings;
import java.util.ArrayList;
import java.util.List;
public class Allanagrams {   // lc 438
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if(s.length()<p.length()){
            return result;
        }
        int[] freq = new int[26];
        for(int i=0;i<p.length();i++){
            freq[p.charAt(i)-'a']++;
        }
        int left = 0;
        int right = 0;
        int count = p.length();
        while(right<s.length()){
            if(freq[s.charAt(right)-'a']>=1){
                count--;
            }
            freq[s.charAt(right)-'a']--;
            right++;
            if(count==0){
                result.add(left);
            }
            if(right-left==p.length()){
                if(freq[s.charAt(left)-'a']>=0){
                    count++;
                }
                freq[s.charAt(left)-'a']++;
                left++;
            }
        }
        return result;
    }
    public static void main(String[]args){
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s,p));
    }
}   



// output: [0, 6]