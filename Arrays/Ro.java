import java.util.*;
public class Ro

int left=0;
int right=arr.length-1;
while(left<=right){
    int mid=(left+right)/2;
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
