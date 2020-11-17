/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Dipty
 */
public class Array5 {
    public static void main(String[] args) {
        String[]persons={"Sanu", "Nibuja", "Maya", "Faria"};
//  
//         for(int i=0; i<persons.length; i++){
//               System.out.println(""+persons[i]);
//         }
//for each loop method 
         for(String easy:persons){
             System.out.println(easy);
         }
    }
    
}
