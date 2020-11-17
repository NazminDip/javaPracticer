
package Array;

import java.util.Scanner;

public class TwoDiimensional2 {
    public static void main(String[] args) {
          int[][] A=new int[2][3];
          int[][] B=new int[2][3];
          Scanner d= new Scanner(System.in);
          System.out.println("Enter A Matrix Number:");
          //Getting input for A Matrix
          for(int row=0; row<2; row++){
              for (int col = 0; col < 3; col++) {
                    System.out.printf("A [%d][%d]=",row,col);
                  A[row][col]=d.nextInt();  
               
              }
              System.out.println("");
          }
             //printing  A matrix 
             System.out.println("A:=");
        for (int row=0; row< 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t"+A[row][col]);
            }
            System.out.println(" ");
        }
        
        //getting Elemenrs for B
          System.out.println("Enter B Matrix Number:");
         for(int row=0; row<2; row++){
              for (int col = 0; col < 3; col++) {
                  System.out.printf("B [%d][%d]=",row,col);
                  B[row][col]=d.nextInt();  
              }
               System.out.println("");
          }
        
          //printing  B matrix 
          System.out.println("B:=");
        for (int row=0; row< 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t"+B[row][col]);
            }
             System.out.println("");
        }
        
        //Addition two array
        System.out.println("A+B=:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" \t"+(A[row][col]+B[row][col]));
            }
        }
        
          
    }
    
}
