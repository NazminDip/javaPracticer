
package Array;

import java.util.Arrays;

public class Array8SOrting {
    public static void main(String[] args) {
        int[]nums= {100, 200, 300, 400, 500};
        System.out.println("Ascending:");
        Arrays.sort(nums);
        for (int i = 0; i < 5; i++) {
            System.out.println(""+nums[i]);
        }
        System.out.println("");
        System.out.println("Decending:");
         for (int i = 4; i >=0; i--) {
            System.out.println(""+nums[i]);
        }
        
        
    }
}
