package LeetCode_Questions;
import java.util.*;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.length - 1;

        while (lp < rp) {
            int ht = Math.min(height[lp], height[rp]);
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            // Update pointers
            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7}; // Use an array instead of ArrayList

        int result = maxArea(height);
        System.out.println("Maximum water that can be stored: " + result);
    }
}
