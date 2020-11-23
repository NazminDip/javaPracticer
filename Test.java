
package Inheritance;


public class Test {
    public static void main(String[] args) {
        Teacher tt= new Teacher();
        tt.address="Dhaka";
        tt.name="Sara";
        tt.setRank("Admin");
        tt.print();
        System.out.println("Rank is:"+tt.getRank());
        System.out.println("\n ");
      
    }
}
