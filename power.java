

package LeetCode_Questions;
import java.util.*;

class power {
    public static double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n == -1) return 1/x;

        double half = myPow(x, n/2);
        double result = half * half;
        if (n % 2 == 1) {
            result *= x;
        } else if (n % 2 == -1) {
            result *= 1/x;
        }
        return result;
    }

    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;

        double result = myPow(x, n);
        System.out.println("Result: " + result);
    }
}