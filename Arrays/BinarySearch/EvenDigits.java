package BinarySearch;
import java.util.*;
public class EvenDigits {
    public static void main(String[] args) {
        int[] arr={12, 345, 2, 6, 7896};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(even(arr[i])){
                count++;
            }
        }
        System.out.println("Count of numbers with even digits: "+count);
    }
public static boolean even(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count%2==0;
    }
}
