
package home;

import java.util.Scanner;


public class NestedLoop {
    public static void main(String[] args) {
        int sum=1, m , n; 
        Scanner d=new Scanner(System.in);
        System.out.println("Enter initial Number");
        m=d.nextInt();
        System.out.println("Enter Final Number");
      n=d.nextInt();
      for(int i=m; i<=n; i++){
      for(int j=1; j<=10; j++){
      
          System.out.println(i+"X"+j+"="+i*j);
      }
          System.out.println("\n");
      }
    }
    
}
