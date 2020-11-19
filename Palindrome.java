
package String;

public class Palindrome {
    public static void main(String[] args) {
        String ss= "Madam";
        // String ss= "121";
        StringBuffer bf= new StringBuffer(ss);
        String eq=bf.reverse().toString();
        if(ss.equals(eq)){
            System.out.println("Palindrome");
        }else{
        
            System.out.println("Not Palindrome");
        }
    }
    
}
