package BinarySearch;
import java.util.*;
public class Ballbasket {     //Lc 1552. Magnetic Force Between Two Balls
    public static int min(int[] position) {
        int min = position[0];
        for (int i = 1; i < position.length; i++) {
            if (position[i] < min) {
                min = position[i];
            }
        }
        return min;
    }
    public static int max(int[] position) {
        int max = position[0];
        for (int i = 1; i < position.length; i++) {
            if (position[i] > max) {
                max = position[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] position = {1,2,3,4,7};
        int m=3;
        int k=1;
        int left=1;
        int right=max(position)-min(position);
        int ans=-1;
        if((long)m * k > position.length){
            System.out.println(-1);
            return;
        }
        while(left<=right){
          int mid=left+(right-left)/2;
            int lastPlaced = position[0];
            int ballsPlaced = 1;

            for(int i=1; i<position.length; i++){
                if(position[i] - lastPlaced >= mid){
                    ballsPlaced++;
                    lastPlaced = position[i];
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
