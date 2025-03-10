package LeetCode_Questions;

import java.util.*;
public class TrappingRainWater {
    public static int trap(int[] height) {
            int ans=0;
            int n = height.length;
            int l=0, r=n-1;
            int lm = height[l], rm = height[r];
            while(l<r){
                if(lm<rm){
                    l++;
                    lm = Math.max(lm, height[l]);
                    ans += lm-height[l];
                }else{
                    r--;
                    rm = Math.max(rm, height[r]);
                    ans += rm-height[r];
                }
            }
            return ans;
        }
        public static void main(String[] args) {
            
            int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
            System.out.println(trap(height));
    }
}