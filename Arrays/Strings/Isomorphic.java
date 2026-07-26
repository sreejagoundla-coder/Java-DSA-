package Strings;
import java.util.HashMap;
public class Isomorphic {     // lc 205
    public static boolean isIsomorphic(String s,String t){
        HashMap<Character,Character> map = new HashMap<>();
      for(int i=0;i<s.length();i++){
        char charS = s.charAt(i);
        char charT = t.charAt(i);
        if(map.containsKey(charS)){
            if(map.get(charS) != charT){
                return false;
            }
        }else{
            if(map.containsValue(charT)){
                return false;
            }
            map.put(charS, charT);
        }
      }  
      return true;
    }
    public static void main(String[] args) {
            String s = "egg";
            String t = "add";
            System.out.println(isIsomorphic(s,t));
        }
}
