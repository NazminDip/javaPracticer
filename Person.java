
package Inheritance;

public class Person {
  String name, address;
  private String rank;
  
   void print(){
       System.out.println("Name is:"+name);
       System.out.println("Address is:"+address);
   }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
     
    
    
}
