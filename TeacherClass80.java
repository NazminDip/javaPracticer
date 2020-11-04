
package home;
public class TeacherClass80 {
    String name, address; 
    int ph , age;
    //parameter method
    void setdata(String n, String ad, int p, int a){
        name=n;
        address=ad;
        age=a;
        ph=p;
    }
    
    void show(){
        System.out.println(" Teacher's name is:"+name);
        System.out.println(" Teacher's address is:"+address);
        System.out.println(" Teacher's age is:"+age);
        System.out.println(" Teacher's ph is:"+ph);
    }
    
}
