/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

public class WrapperClass {
    public static void main(String[] args) {
        //primitive to wrapper autoboxing
        int z=10;
    Integer d=z;
        System.out.println(""+d);
        //wrapper to primitive unboxing
        Double e= 10.5;
        System.out.println(""+e);
        double dm=e.doubleValue();
        System.out.println(""+dm);
    }
}
