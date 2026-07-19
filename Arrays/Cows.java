import java.util.Arrays;

public class Cows {

    public static boolean isPossible(int[] stalls, int cows, int mid) {

        int count = 1;
        int lastPlaced = stalls[0];

        for (int i = 1; i < stalls.length; i++) {

            if (stalls[i] - lastPlaced >= mid) {
                count++;
                lastPlaced = stalls[i];
            }
        }

        return count >= cows;
    }

    public static int aggressiveCows(int[] stalls, int cows) {

        Arrays.sort(stalls);

        int left = 1;
        int right = stalls[stalls.length - 1] - stalls[0];

        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (isPossible(stalls, cows, mid)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] stalls = {1, 2, 4, 8, 9};
        int cows = 3;

        System.out.println(aggressiveCows(stalls, cows));
    }
}
