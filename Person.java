
package EncapsulationTest;

public class Person {
    
    //packaging variable and method in a single unit is Encapsulation
     private  String name,address;
      int age;
        void setprint(String name){
            this.name=name;
            
        }
        public String getName(){
        
        return name;
        }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
        
    
    
}
