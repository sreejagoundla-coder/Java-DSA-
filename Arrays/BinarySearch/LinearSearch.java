package BinarySearch;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
int[] arr={1, 2, 3, 4, 5};
int target=6;
int index=-1;
for(int i=0;i<arr.length;i++){
    if(arr[i]==target){
       System.out.println("Element found at index: "+i);
        break;
    }
}
System.out.println("Element not found at index: "+index);

    }
}