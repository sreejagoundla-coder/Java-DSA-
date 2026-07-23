package BinarySearch;
class BinarySq{
    public static int BinarySq(int x) {
        if (x == 0){ 
            return 0;
        }
       int left = 1;
         int right = x;
          int ans = -1;
          while(left <= right){
           int mid = left + (right - left) / 2;
           if(mid <= x / mid){
               ans = mid;
               left = mid + 1;
           }else{
                right = mid - 1;
           }
    }
    return ans;
}
    public static void main(String[] args) {
        int x = 10;
        int result = BinarySq(x);
        System.out.println(result);
    }
}
