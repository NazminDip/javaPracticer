
package Array;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer>num= new ArrayList<Integer>();
       
        //adding elements
        num.add(20);
        num.add(50);
        num.add(2, 55);
        num.add(100);
        System.out.println(""+num);
        //removing elements
        num.remove(2);
        System.out.println("After removing Array contain:"+num);
       //  System.out.println(" "+num.size());
//       for(int x:num){
//           System.out.println(""+x);
//       }
//        System.out.println("");

Iterator itr =num.iterator();
        while(itr.hasNext()){
            System.out.println(""+itr.next());
        }
        System.out.println(" "+num.size());
    }
}
