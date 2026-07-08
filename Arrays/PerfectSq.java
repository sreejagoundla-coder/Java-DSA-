class PerfectSq{
    public static boolean PerfectSq(int num){
        if(num==0){
            return true;
        }
        int left = 1;
        int right = num;
        while(left<=right){
            int mid=left+(right-left)/2;
            long square = (long) mid * mid;
            if(square == num){
                return true;
            }
            else if(square < num){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int x=20;
        boolean result=PerfectSq(x);
        System.out.println(result);
    }
}