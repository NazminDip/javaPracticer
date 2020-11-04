
package home;

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        //factorial mane j number deya tar ager sob gunfol
        Scanner d=new Scanner(System.in);
        int sum=1, n;
        System.out.print("Enter any Positive Number:");
        n=d.nextInt();
        for(int i=n;  i>=1; i--){
        sum=sum*i;
        }
        System.out.println("Factorial of"+" "+n+"="+sum);
        
        
    }
    
}
