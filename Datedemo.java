/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Dipty
 */
public class Datedemo {
    public static void main(String[] args) {
        Date dd= new Date();
        System.out.println(dd);
        DateFormat df= new SimpleDateFormat("dd/MM/YYYY");
     String kk=   df.format(dd);
        System.out.println(""+kk);
    }
    
}
