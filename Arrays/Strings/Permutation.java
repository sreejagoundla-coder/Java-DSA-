package Strings;

public class Permutation {    // lc 567
    public static boolean checkInclusion(String s1, String s2) {
        int[] s1freq = new int[26];
        int[] s2freq = new int[26];
        for(int i=0;i<s1.length();i++){
            s1freq[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s1.length();i++){
            s2freq[s2.charAt(i)-'a']++;
        }
        for(int left=0,right=s1.length();right<s2.length();left++,right++){
            for(int i=0;i<26;i++){
                if(s1freq[i]!=s2freq[i]){
             s2freq[s2.charAt(left)-'a']--;
            s2freq[s2.charAt(right)-'a']++;
            }
        }
        return true;
        }
      public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidabooo";
        System.out.println(checkInclusion(s1, s2));  
        }
    }