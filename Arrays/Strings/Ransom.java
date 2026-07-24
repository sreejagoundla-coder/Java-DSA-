package Strings;

public class Ransom {    // lc 383
    public static boolean canConstruct(String ransomNote, String magazine){
        int[] freq = new int[26];
        for(int i=0;i<magazine.length();i++){
            freq[magazine.charAt(i)-'a']++;
        }
        for(int j=0;j<ransomNote.length();j++){
            freq[ransomNote.charAt(j)-'a']--;
        if(freq[ransomNote.charAt(j)-'a']<0){
            return false;
        }
    }
        return true;
    }
    public static void main(String[] args){
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote,magazine));
    }
}
