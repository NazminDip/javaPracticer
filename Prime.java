
package home;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int sum=0;
        
        System.out.print("Enter a Number:");
        int num=input.nextInt();
        for(int i=num; i>=1; i--){
            if(i%2==0){
             sum++;
            }
            
        }
        if(sum==2){
            System.out.println("It is prime number");
        }else{
            System.out.println("It is not prime number");
        }
    }
    
}
