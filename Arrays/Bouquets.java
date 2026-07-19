import java.util.*;         // Lc 1482. Minimum Number of Days to Make m Bouquets
public class Bouquets{
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
    int[] bloomDay = {1,10,3,10,2};
    int m=3;
    int k=1;
    int left=min(bloomDay);
    int right=max(bloomDay);
    int ans=-1;
        if((long)m * k > bloomDay.length){
    System.out.println(-1);
    return;
    }
    while(left<=right){
        int mid=left+(right-left)/2;
        int count=0;
        int bouquet=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                count++;
            }
            else{
                count=0;
            }
            if(count==k){
                bouquet++;
                count=0;
                }
            }
                if(bouquet>=m){
                    ans=mid;
                    right=mid-1;
                }else{
                    left=mid+1;
                }

            }
    System.out.println(ans);
}
}