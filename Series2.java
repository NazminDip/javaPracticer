
package FoorLoop;

import java.util.Scanner;


public class Series2 {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
  int sum=0;
        System.out.print("Enter the last number:");
    int m=d.nextInt();
        for(int i=1; i<=m; i=i+1){
            System.out.println("Suare is:"+i+"X"+i);
        sum=sum+i*i;
        }
        System.out.println(""+sum);
    }
}
