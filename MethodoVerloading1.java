
package ProblemSolve96;

public class MethodoVerloading1 {
    
    //allow a class two or more same method different paramater list in same class
     void add(int a, int b, int c){
       System.out.println("Addition is:"+(a+b+c));
   }
    void add(double a, double b){
       System.out.println("Multiply  is:"+a*b);
   }
   
   void add(int a, int b){
       System.out.println("Division is:"+a/b);
   }
   
   
    
}
