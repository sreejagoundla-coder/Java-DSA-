package BinarySearch;
import java.util.*;
public class Ballbasket {
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] Basket = {1,2,3,4,7};
        int m=3;
        int k=1;
        int left=1;
        int right=max(Basket)-min(Basket);
        int ans=-1;
        if((long)m * k > Basket.length){
            System.out.println(-1);
            return;
        }
        while(left<=right){
          int mid=left+(right-left)/2;
            int lastPlaced = Basket[0];
            int ballsPlaced = 1;

            for(int i=1; i<Basket.length; i++){
                if(Basket[i] - lastPlaced >= mid){
                    ballsPlaced++;
                    lastPlaced = Basket[i];
                }
            }
            if(ballsPlaced>=m){
                ans=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        System.out.println(ans);
    }
}
