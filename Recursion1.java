
package home;

public class Recursion1 {
   
   int factm(int n){
    if(n==1){
     return 1;
    }else{
         return n*factm(n-1);
    }
   
  
   }
    public static void main(String[] args) {
       Recursion1 ob = new Recursion1();
       //int result=ob.factm(5);
        //System.out.println(""+result);
        System.out.println("Factorial is:"+ob.factm(5));
     
    }
  
}
