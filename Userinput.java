
package Array;

import java.util.Scanner;


public class Userinput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       double[]nums =new double[5];
       double sum=0;
        System.out.println("Enter Five Numbers");
        nums[0]=input.nextDouble();
        nums[1]=input.nextDouble();
        nums[2]=input.nextDouble();
        nums[3]=input.nextDouble();
        nums[4]=input.nextDouble();
        
        sum=nums[0]+nums[1]+nums[2]+nums[3]+nums[4];
        System.out.println("Sum of Array is:"+sum);
    }
 
}
