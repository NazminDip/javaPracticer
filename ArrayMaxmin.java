


package Array;

import java.util.Scanner;

public class ArrayMaxmin {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in); 
        int[]nums=new int[4];
        int sum=0;
        System.out.println("Enter Four Numbers:");
        for(int i=0; i<nums.length; i++){
         nums[i]=m.nextInt();
          System.out.println(""+nums[i]);
   
        }
       
        for (int i = 0; i < 4; i++) {
            sum=sum+nums[i];
            
        }
        System.out.println("Sum is:"+sum);
        int max=nums[0];
        int min=nums[0];
        for (int i = 1; i < 4; i++) {
            if(max<nums[i]){
            max=nums[i];
               
            }
            if(min>nums[i]){
            min=nums[i];
               
            } 
            
        }
         System.out.println("Maximum number is"+" "+max);
         System.out.println("Minimum number is"+"  "+min);
//            for (int i = 1; i < 4; i++) {
//            if(min>nums[i]){
//            min=nums[i];
//                System.out.println("Minimum number is"+min);
//            } 
//        }
        
    }
    
    
}
