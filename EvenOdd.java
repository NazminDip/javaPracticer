
package home;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        //j kono kicu print korte System.out.println("");a line
        //Scanner class dye user theke input neya hoi
        Scanner d=new Scanner(System.in);
        int number;
       System.out.println("Enter a Number");
       number=d.nextInt();
        if(number%2==0){
            System.out.println("It is Even Number");
        }else{
            System.out.println("It is Odd number");
        
        }
    }
        
    
}
