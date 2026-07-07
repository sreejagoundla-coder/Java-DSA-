public class UpperBound {
    public static void main(String[] args){

        int[] arr={1,2,3,4,4,7};
        int target=10;
        int left=0;
        int right=arr.length-1;
        int ans=arr.length;  //if target is greater than all elements in the array, then upperbound will be arr.length
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>target){  //upperbound = arr[mid]>target
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        System.out.println(ans + ": " + arr[ans]);
    }
    
}
