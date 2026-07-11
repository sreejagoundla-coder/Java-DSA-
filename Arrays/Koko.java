import java.util.*;
public class Koko{       //LC 875
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
int [] piles={3,6,7,11};
int left=1;
int right=max(piles);
int h=8;
int ans=Integer.MAX_VALUE;
while(left<=right){
    int mid=left+(right-left)/2;
    int hours=0;
    for(int i=0;i<piles.length;i++){
         hours += (piles[i] + mid - 1) / mid;

    }
    if(hours<=h){
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