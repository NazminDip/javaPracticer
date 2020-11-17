
package Array;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer>num= new ArrayList<Integer>();
        ArrayList<Integer>num1= new ArrayList<Integer>();
        ArrayList<Integer>num2= new ArrayList<Integer>();
        ArrayList<Integer>num3= new ArrayList<Integer>();
        
        num.add(100);
        num.add(600);
        num.add(500);
        num.add(5000);
        boolean check= num.isEmpty();
        System.out.println("Is ArrayList Empty?"+" "+check);
        System.out.println("ArrayList contains:"+ num);
        boolean contains= num.contains(500);
        System.out.println("500 contains?"+" "+contains);
        System.out.println("");
      int position=  num.indexOf(600);
        System.out.println("Index of 600 is"+" "+position );
        //replace
        num.set(2, 900);
        System.out.println("After setting:"+num);
         //getting a koto index e ki ase
        int ge= num.get(0);
        System.out.println(" "+ge);
         System.out.println(" "+num.size());
       num1.add(50);
       num1.add(100);
       num1.add(160);
        System.out.println(" "+num1);
       num2.add(90);
       num2.add(190);
        System.out.println(""+num2);
     num3.addAll(num1);
        System.out.println(""+num3);
       boolean result= num1.equals(num3);
        System.out.println(""+result);
    
     
     
     
     
    };
    
}
