
package Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Integer>num=new ArrayList<Integer>();
        num.add(20);
        num.add(-30);
        num.add(14);
        num.add(2);
        System.out.println("before Sorting");
        Collections.sort(num);
        System.out.println("After sorting Ascending:"+num);
        Collections.reverse(num);
        System.out.println("Sorting Decending:"+num);
    }
  
}
