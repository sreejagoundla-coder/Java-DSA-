package Strings;

import java.util.HashSet;

public class Lc202 {

    public static int squareSum(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    public static boolean isHappy(int n) {

        HashSet<Integer> seen = new HashSet<>();

        while (n != 1) {

            if (seen.contains(n)) {
                return false;
            }

            seen.add(n);

            n = squareSum(n);
        }

        return true;
    }

    public static void main(String[] args) {

        int n = 20;

        System.out.println(isHappy(n));
    }
}