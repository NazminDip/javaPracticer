
package Inheritance;


public class Test {
    public static void main(String[] args) {
        Teacher tt= new Teacher();
        tt.address="Khulna";
        tt.age=28;
        tt.name="Akbar";
        tt.display();
        System.out.println("\n ");
        Teacher t2= new Teacher();
        t2.address="Barisal";
        t2.age=90;
        t2.name="Samir";
        t2.display();
        
        
    }
}
