/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author Dipty
 */
public class UserInput2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double []nums= new double[5];
        double sum=0;
        System.out.print("Enter Five Numbers:");
        for (int i = 0; i < 5; i++) {
            nums[i]=input.nextDouble();
            System.out.println("Arrays input:"+"\n "+nums[i]);
        }
        
        for(int i=0; i<5; i++){
         sum=sum+nums[i];
        }
        System.out.println("Sum is:"+sum);
    
        
    }
    
}
