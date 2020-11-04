
package home;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int sum=0;
        
        System.out.print("Enter a Number:");
        int num=input.nextInt();
        for(int i=2; i<num; i++){
            if(num%i==0){
             sum++;
                break;
            }
            
        }
        if(sum==0){
            System.out.println("It is prime number");
        }else{
            System.out.println("It is not prime number");
        }
    }
    
}
