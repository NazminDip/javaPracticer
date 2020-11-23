
package EncapsulationTest;


public class Teacher {
    public static void main(String[] args) {
        Person pp = new Person();
        pp.age=20;
        pp.setprint("jara");
        pp.setAddress("Dhaka");
        System.out.println("Name is:"+pp.getName());
        System.out.println("Address:"+pp.getAddress());
        System.out.println("Age is:"+pp.age);
    }
}
