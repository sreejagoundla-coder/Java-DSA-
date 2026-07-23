package BinarySearch;
import java.util.*;
public class Rotated {     // Lc 81. Search in Rotated Sorted Array II
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int target=0;
        System.out.println(search(arr,target));
    }
    public static boolean search(int[] arr,int target){
int left=0;
int right=arr.length-1;
while(left<=right){
    int mid=left+(right-left)/2;
    if(arr[mid]==target){
        return true;
    }
    if(arr[mid]==arr[left] && arr[mid]==arr[right]){
        left++;
        right--;
    } else if(arr[left]<=arr[mid]){
        if(target>=arr[left] && target<arr[mid]){
            right=mid-1;
        } else {
            left=mid+1;
        }
    }
    else {
        if(target>arr[mid] && target<=arr[right]){
            left=mid+1;
        } else {
            right=mid-1;
        }
    }
}
return false;
    }
}
