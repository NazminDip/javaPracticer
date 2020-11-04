/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoorLoop;

import java.util.Scanner;

public class Series3 {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        int sum=1;
        //gun korbo tai 1 rakhlam 0 dile man zero ber hobe zero dbo na
        System.out.print("Enter last number");
        int n=d.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.println(""+i);
            sum=sum*i;
            
        }
        System.out.println(""+sum);
    }
    
}
