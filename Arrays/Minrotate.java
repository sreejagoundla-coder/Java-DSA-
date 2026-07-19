public class Minrotate {          // Lc 153. Find Minimum in Rotated Sorted Array
        public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2};
        int ans = Integer.MAX_VALUE;
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[left] <= arr[right]){
             ans = Math.min(ans, arr[left]);
            break;
    }
            if(arr[left]<=arr[mid]){
                ans = Math.min(ans, arr[left]);
                left=mid+1;
            }
            else{
                ans = Math.min(ans, arr[mid]);
                right=mid-1;
            }
        }
        System.out.println(ans);
    }
}
