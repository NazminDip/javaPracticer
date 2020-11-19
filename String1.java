
package String;

public class String1 {
    public static void main(String[] args) {
        String ss=new String("bangladesh"); ;
    String s1 = "Bangladesh";
    char[]cc={'a', 'b', 'c'};
    boolean mty=ss.isEmpty();
        System.out.println(""+mty);
   
    int len=cc.length;
        System.out.println(""+len);
     int lenss=ss.length();
        System.out.println(""+lenss);
          
    //==sign reference variable compare kore
    if(ss==s1){
        System.out.println("Equal");
    }else{
        System.out.println("Not Equal");
    }
    boolean eq1=ss.contains("D");
        System.out.println(" "+eq1);
    boolean eq=ss.equals(s1);
      System.out.println(""+eq);
      if(ss.equalsIgnoreCase(s1)){
      
          System.out.println("Equal");
      }else{
          System.out.println("No Equal");
      }
    }
    
}
