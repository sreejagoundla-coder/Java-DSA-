package BinarySearch;
import java.util.*;
public class ShipCapacity{
public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
public static int sum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
}
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
int left=max(weights);
int right=sum(weights);
int ans=Integer.MAX_VALUE;
while(left<=right){
    int mid=(left+right)/2;
    int Load=0;
    int Days=1;
    int D=5;
    for(int i=0;i<weights.length;i++){
        if(Load+weights[i]<=mid){
            Load+=weights[i];
        }
        else{
            Days++;
            Load=weights[i];
        }
    }
    if(Days<=D){
        ans=mid;
        right=mid-1;
    }
    else{
        left=mid+1;
    }
}
System.out.println(ans);
    }
}
