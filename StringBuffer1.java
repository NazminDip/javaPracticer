
package String;

public class StringBuffer1 {
    public static void main(String[] args) {
       StringBuffer bf= new StringBuffer("Maliha Jahid");
       bf.append("Faridpur");
//       
//       bf.setLength(5);
//        System.out.println(""+bf);
//        
        System.out.println(""+bf);
        bf.delete(3, 5);
        System.out.println(""+bf);
        bf.reverse();
        System.out.println(""+bf);
        bf.delete(3, 5);
        System.out.println(""+bf);
    }
    
}
