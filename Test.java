
package Inheritance;


public class Test {
    public static void main(String[] args) {
        Teacher t= new Teacher();
        Animal a= new Animal();
        Person p=new Person();
        
        System.out.println(a instanceof Animal);
        System.out.println(t instanceof Person);
        System.out.println(t instanceof Animal);
        System.out.println(p instanceof Animal);
        System.out.println(p instanceof Teacher);
      
    }
}
