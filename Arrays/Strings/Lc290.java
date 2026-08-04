package Strings;
import java.util.*;
public class Lc290{
    public static boolean wordPattern(String pattern, String words){
        String[] wordsArray = words.split(" ");
        if(pattern.length()!=wordsArray.length){
            return false;
        }
        HashMap<String,Character> charToWord = new HashMap<>();
        HashMap<Character,String> wordToChar = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String word = wordsArray[i];
            if(charToWord.containsKey(ch)){
                if(!charToWord.get(ch).equals(word)){
                    return false;
                }
        }else{
            charToWord.put(ch,word);
        }
        if(wordToChar.containsKey(word)){
            if(!wordToChar.get(word).equals(ch)){
                return false;
            }else{
                wordToChar.put(word,ch);
            }
        }
    }
}
}

