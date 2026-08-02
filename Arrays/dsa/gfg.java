package dsa;
import java.util.HashSet;
import java.util.HashMap;
public class gfg {
    /*public static int distinct(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,1,2};
        System.out.println(distinct(arr));
    }*/

/*public static boolean TwoSum(int[] arr,int target){
    HashSet<Integer> set = new HashSet<>();
    for(int i : arr){
        int rem=target-i;
        if(set.contains(rem)){
            return true;
        }
        set.add(i);
    }
    return false;
}
public static void main(String[] args){
    int[] arr = {1,2,3,4,5};
    int target = 9;
    System.out.println(TwoSum(arr,target));
} */


    public int Difference(int[] arr, int k){

        HashMap<Integer, Integer> set = new HashMap<>();
        int pairs= 0;
        for(int i : arr){
            pairs+=set.getOrDefault(i-k,0);
            pairs+=set.getOrDefault(i+k,0);
            set.put(i, set.getOrDefault(i,0)+1);
        }
        return pairs;
    }
    public static void main(String[] args){
        int[] arr = {1,2,1,4,5};
        int k=4;
        System.out.println(Difference(arr,k));
    }

}