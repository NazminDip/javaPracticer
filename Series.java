
package FoorLoop;

import java.util.Scanner;


public class Series {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter the last number:");
        int m=d.nextInt();
        for(int i=1; i<=m; i++){
            System.out.println(""+i);
        sum=sum+i;
        }
        System.out.println(""+sum);
    }
}
