package LeetCode_Questions;
import java.util.*;
public class ContainerWithMostWater {
    public static int maxArea(ArrayList<Integer>height){
        int maxWater = 0 ;
        int lp = 0 ;
        int rp = height.size()-1;
        while (lp<rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp ;
            int currWater = ht*width ;
            maxWater = Math.max(maxWater, currWater);
            // update the pointer 
            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }    
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>(Arrays.asList(1,8,6,2,5,4,8,3,7));
        System.out.println(maxArea(height));

    }
}
